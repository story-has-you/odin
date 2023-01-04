package com.storyhasyou.odin.driver.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.IdcardUtil;
import com.storyhasyou.kratos.exceptions.BusinessException;
import com.storyhasyou.kratos.utils.JacksonUtils;
import com.storyhasyou.odin.driver.emums.driver.DriverRealAuthEnum;
import com.storyhasyou.odin.driver.emums.driver.DriverStatusEnum;
import com.storyhasyou.odin.driver.mapper.DriverMapper;
import com.storyhasyou.odin.driver.pojo.entity.Driver;
import com.storyhasyou.odin.driver.pojo.entity.Wallet;
import com.storyhasyou.odin.driver.pojo.model.CurrentDriver;
import com.storyhasyou.odin.driver.pojo.model.DriverSettings;
import com.storyhasyou.odin.driver.pojo.model.DriverSummary;
import com.storyhasyou.odin.driver.pojo.vo.request.RegisterDriverRequestVO;
import com.storyhasyou.odin.driver.pojo.vo.request.UpdateDriverRequestVO;
import com.storyhasyou.odin.driver.pojo.vo.response.DriverResponseVO;
import com.storyhasyou.odin.driver.service.DriverRedisService;
import com.storyhasyou.odin.driver.service.interfaces.DriverService;
import com.storyhasyou.odin.driver.service.interfaces.DriverSettingsService;
import com.storyhasyou.odin.driver.service.interfaces.WalletService;
import com.storyhasyou.odin.oss.service.OssService;
import com.storyhasyou.odin.weixin.service.WxService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

/**
 * @author fangxi created by 2022/12/29
 */
@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {

    private final DriverMapper driverMapper;
    private final WxService wxService;
    private final DriverSettingsService driverSettingsService;
    private final WalletService walletService;
    private final OssService ossService;
    private final DriverRedisService driverRedisService;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public String register(RegisterDriverRequestVO requestVO) {
        String openId = wxService.getOpenId(requestVO.getJsCode());
        Assert.isTrue(!driverMapper.existsByOpenId(openId), "该微信已注册");
        Driver driver = BeanUtil.toBean(requestVO, Driver.class);
        long driverId = IdUtil.getSnowflakeNextId();
        driver.setId(driverId);
        driver.setOpenId(openId);
        driver.setSummary(JacksonUtils.serialize(DriverSummary.init()));
        driverMapper.insertSelective(driver);
        // 初始化司机设置
        initDriverSettings(driverId);
        // 初始化钱包
        initWallet(driverId);
        return IdUtil.randomUUID();
    }

    @Override
    public String uploadDriverPhoto(byte[] content) {
        return ossService.upload(content);
    }

    @Override
    public boolean updateDriverInfo(UpdateDriverRequestVO requestVO) {
        Driver driver = BeanUtil.toBean(requestVO, Driver.class);
        LocalDate birthDate = IdcardUtil.getBirthDate(requestVO.getPid()).toLocalDateTime().toLocalDate();
        driver.setBirthday(birthDate);
        driver.setSex(IdcardUtil.getGenderByIdCard(requestVO.getPid()));
        driver.setStatus(DriverStatusEnum.NORMAL.getCode());
        driver.setRealAuth(DriverRealAuthEnum.AUDIT.getCode());
        return driverMapper.updateByPrimaryKeySelective(driver) > 0;
    }

    @Override
    public CurrentDriver login(String openId) {
        Driver driver = driverMapper.selectByOpenId(openId);
        Assert.notNull(driver, "该微信未注册");
        if (DriverStatusEnum.DISABLE.getCode().equals(driver.getStatus())) {
            throw new BusinessException("该账号已被禁用");
        }

        return Optional.ofNullable(driverRedisService.getCurrentDriver(openId))
                .orElseGet(() -> {
                    String token = IdUtil.simpleUUID();
                    CurrentDriver currentDriver = new CurrentDriver(driver.getId(), driver.getOpenId(), token);
                    driverRedisService.driverLogin(currentDriver);
                    return currentDriver;
                });

    }

    @Override
    public DriverResponseVO selectById(long driverId) {
        return Optional.ofNullable(driverMapper.selectByPrimaryKey(driverId))
                .map(driver -> {
                    DriverResponseVO driverResponseVO = BeanUtil.toBeanIgnoreError(driver, DriverResponseVO.class);
                    driverResponseVO.setSummary(JacksonUtils.parse(driver.getSummary(), DriverSummary.class));
                    return driverResponseVO;
                })
                .orElseThrow(() -> new BusinessException("司机不存在"));
    }

    private void initWallet(long driverId) {
        Wallet wallet = new Wallet();
        wallet.setId(IdUtil.getSnowflakeNextId());
        wallet.setDriverId(driverId);
        wallet.setBalance(BigDecimal.ZERO);
        walletService.insertSelective(wallet);
    }

    private void initDriverSettings(long driverId) {
        com.storyhasyou.odin.driver.pojo.entity.DriverSettings driverSettings = new com.storyhasyou.odin.driver.pojo.entity.DriverSettings();
        driverSettings.setId(IdUtil.getSnowflakeNextId());
        driverSettings.setDriverId(driverId);
        DriverSettings defaultSettings = new DriverSettings("", false, 0, 5, false);
        driverSettings.setSettings(JacksonUtils.serialize(defaultSettings));
        driverSettingsService.insertSelective(driverSettings);
    }
}
