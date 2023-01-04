package com.storyhasyou.odin.driver.service;

import com.storyhasyou.kratos.utils.JacksonUtils;
import com.storyhasyou.odin.driver.pojo.model.CurrentDriver;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;

/**
 * @author fangxi created by 2023/1/4
 */
@Service
@RequiredArgsConstructor
public class DriverRedisService {

    private static final String DRIVER_PREFIX = "odin:driver:";
    private final RedisTemplate<String, Object> redisTemplate;

    public void driverLogin(CurrentDriver currentDriver) {
        redisTemplate.opsForValue().set(DRIVER_PREFIX + currentDriver.openId(), currentDriver, Duration.ofDays(7L));
    }

    public CurrentDriver getCurrentDriver(String openId) {
        Object o = redisTemplate.opsForValue().get(DRIVER_PREFIX + openId);
        return JacksonUtils.convertValue(o, CurrentDriver.class);
    }

}
