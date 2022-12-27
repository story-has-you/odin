package com.storyhasyou.odin.cloud;

import com.storyhasyou.kratos.annotation.EnableBladesOfChaos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author fangxi created by 2022/12/26
 */
@EnableBladesOfChaos
@SpringBootApplication(scanBasePackages = "com.storyhasyou.odin")
public class OdinCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(OdinCloudApplication.class, args);
    }

}
