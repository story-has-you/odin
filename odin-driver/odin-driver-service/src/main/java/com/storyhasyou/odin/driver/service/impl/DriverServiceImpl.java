package com.storyhasyou.odin.driver.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.IdUtil;
import com.storyhasyou.kratos.utils.JacksonUtils;
import com.storyhasyou.odin.driver.mapper.DriverMapper;
import com.storyhasyou.odin.driver.pojo.entity.Driver;
import com.storyhasyou.odin.driver.pojo.entity.DriverSettings;
import com.storyhasyou.odin.driver.pojo.entity.Wallet;
import com.storyhasyou.odin.driver.pojo.model.DriverSettingsModel;
import com.storyhasyou.odin.driver.pojo.vo.request.RegisterDriverRequestVO;
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


    @Override
    @Transactional(rollbackFor = Exception.class)
    public String register(RegisterDriverRequestVO requestVO) {
        String openId = wxService.getOpenId(requestVO.getJsCode());
        Assert.isTrue(!driverMapper.existsByOpenId(openId), "该微信已注册");
        Driver driver = BeanUtil.toBean(requestVO, Driver.class);
        long driverId = IdUtil.getSnowflakeNextId();
        driver.setId(driverId);
        driver.setOpenId(openId);

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

    private void initWallet(long driverId) {
        Wallet wallet = new Wallet();
        wallet.setId(IdUtil.getSnowflakeNextId());
        wallet.setDriverId(driverId);
        wallet.setBalance(BigDecimal.ZERO);
        walletService.insertSelective(wallet);
    }

    private void initDriverSettings(long driverId) {
        DriverSettings driverSettings = new DriverSettings();
        driverSettings.setId(IdUtil.getSnowflakeNextId());
        driverSettings.setDriverId(driverId);
        DriverSettingsModel defaultSettings = new DriverSettingsModel("", false, 0, 5, false);
        driverSettings.setSettings(JacksonUtils.serialize(defaultSettings));
        driverSettingsService.insertSelective(driverSettings);
    }
}
