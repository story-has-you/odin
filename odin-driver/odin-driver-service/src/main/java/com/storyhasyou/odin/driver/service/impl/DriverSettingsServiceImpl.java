package com.storyhasyou.odin.driver.service.impl;

import com.storyhasyou.kratos.exceptions.BusinessException;
import com.storyhasyou.odin.driver.mapper.DriverSettingsMapper;
import com.storyhasyou.odin.driver.pojo.entity.DriverSettings;
import com.storyhasyou.odin.driver.service.interfaces.DriverSettingsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author fangxi created by 2022/12/29
 */
@Service
@RequiredArgsConstructor
public class DriverSettingsServiceImpl implements DriverSettingsService {

    private final DriverSettingsMapper driverSettingsMapper;

    @Override
    public long insertSelective(DriverSettings driverSettings) {
        driverSettingsMapper.insertSelective(driverSettings);
        return driverSettings.getId();
    }

    @Override
    public DriverSettings selectByDriverId(long driverId) {
        return Optional.ofNullable(driverSettingsMapper.selectByDriverId(driverId)).orElseThrow(() -> new BusinessException("未找到司机设置信息"));
    }

}
