package com.richye.sca.demo.storage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Author: Shuye
 * Date: 2020/10/28 11:54
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.richye.sca.demo.storage.dao")
public class StorageApplication {
    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class, args);
    }
}
