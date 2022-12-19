package com.storyhasyou.odin.user.service;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.storyhasyou.odin.user.interfaces.LoginService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author fangxi created by 2022/12/19
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final DefaultKaptcha defaultKaptcha;
    private final UserRedisService userRedisService;

    @SneakyThrows(IOException.class)
    public void getCaptcha(HttpServletResponse response) {
        String text = defaultKaptcha.createText();
        log.info("验证码: {}", text);
        userRedisService.setCaptchaText(text);
        BufferedImage bufferedImage = defaultKaptcha.createImage(text);
        ImageIO.write(bufferedImage, "jpg", response.getOutputStream());
    }

}
