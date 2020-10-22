package com.richye.sca.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author: Shuye
 * Date: 2020/10/22 11:46
 */
@EnableDiscoveryClient
@EnableAutoConfiguration
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class);
    }
}
