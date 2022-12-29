package com.storyhasyou.odin.driver.service.impl;

import com.storyhasyou.odin.driver.mapper.DriverMapper;
import com.storyhasyou.odin.driver.service.interfaces.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author fangxi created by 2022/12/29
 */
@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {

    private final DriverMapper driverMapper;

}
