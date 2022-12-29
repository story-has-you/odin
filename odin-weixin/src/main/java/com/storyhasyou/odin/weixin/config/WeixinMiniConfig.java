package com.storyhasyou.odin.weixin.config;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;
import cn.binarywang.wx.miniapp.config.WxMaConfig;
import cn.binarywang.wx.miniapp.config.impl.WxMaDefaultConfigImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author fangxi created by 2022/12/29
 */
@RequiredArgsConstructor
@SpringBootConfiguration
@EnableConfigurationProperties(WxMaProperties.class)
public class WeixinMiniConfig {

    private final WxMaProperties properties;

    @Bean
    public WxMaService wxMaService() {
        WxMaService wxMaService = new WxMaServiceImpl();
        Map<String, WxMaConfig> configMap = this.properties.getConfigs().stream()
                .map(a -> {
                    WxMaDefaultConfigImpl config = new WxMaDefaultConfigImpl();
                    config.setAppid(a.getAppid());
                    config.setSecret(a.getSecret());
                    config.setToken(a.getToken());
                    config.setAesKey(a.getAesKey());
                    config.setMsgDataFormat(a.getMsgDataFormat());
                    return config;
                }).collect(Collectors.toMap(WxMaDefaultConfigImpl::getAppid, Function.identity(), (o, n) -> n));
        wxMaService.setMultiConfigs(configMap);
        return wxMaService;
    }

}
