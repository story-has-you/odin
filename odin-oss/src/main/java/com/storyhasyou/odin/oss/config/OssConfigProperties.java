package com.storyhasyou.odin.oss.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author fangxi created by 2022/12/30
 */
@Data
@ConfigurationProperties(prefix = "aliyun.oss")
public class OssConfigProperties {

    private String endpoint;
    private String accessKeyId;
    private String accessKeySecret;

}
