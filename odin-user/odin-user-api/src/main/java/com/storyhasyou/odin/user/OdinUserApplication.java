package com.storyhasyou.odin.user;

import com.storyhasyou.kratos.annotation.EnableBladesOfChaos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author fangxi created by 2022/11/30
 */
@EnableBladesOfChaos
@SpringBootApplication(scanBasePackages = "com.storyhasyou.odin")
public class OdinUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(OdinUserApplication.class, args);
    }

}
