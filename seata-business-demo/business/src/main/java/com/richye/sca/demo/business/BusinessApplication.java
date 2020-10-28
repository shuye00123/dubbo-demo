package com.richye.sca.demo.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author: Shuye
 * Date: 2020/10/28 11:53
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BusinessApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessApplication.class, args);
    }

}
