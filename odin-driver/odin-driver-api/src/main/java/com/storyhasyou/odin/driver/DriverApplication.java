package com.storyhasyou.odin.driver;

import com.storyhasyou.kratos.annotation.EnableBladesOfChaos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author fangxi created by 2022/12/29
 */
@EnableBladesOfChaos
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.storyhasyou.odin")
public class DriverApplication {

    public static void main(String[] args) {
        SpringApplication.run(DriverApplication.class, args);
    }

}
