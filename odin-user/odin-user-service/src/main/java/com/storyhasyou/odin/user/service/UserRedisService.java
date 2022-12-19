package com.storyhasyou.odin.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;

/**
 * @author fangxi created by 2022/12/19
 */
@Service
@RequiredArgsConstructor
public class UserRedisService {

    private static final String PREFIX = "user:";

    private final RedisTemplate<String, Object> redisTemplate;

    public void setCaptchaText(String text) {
        redisTemplate.opsForValue().set(PREFIX + "captcha:text", text, Duration.ofMinutes(5));
    }

}
