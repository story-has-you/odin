package com.storyhasyou.odin.oss.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author fangxi created by 2022/12/30
 */
@RequiredArgsConstructor
@SpringBootConfiguration
@EnableConfigurationProperties(OssConfigProperties.class)
public class OssConfig {

    private final OssConfigProperties ossConfigProperties;

    @Bean
    public OSS ossClient() {
        return new OSSClientBuilder().build(ossConfigProperties.getEndpoint(), ossConfigProperties.getAccessKeyId(), ossConfigProperties.getAccessKeySecret());
    }

}
