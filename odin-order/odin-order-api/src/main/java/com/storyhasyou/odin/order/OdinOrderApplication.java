package com.storyhasyou.odin.order;

import com.storyhasyou.kratos.annotation.EnableBladesOfChaos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author fangxi created by 2023/1/5
 */
@EnableFeignClients
@EnableBladesOfChaos
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.storyhasyou.odin")
public class OdinOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OdinOrderApplication.class, args);
    }

}
