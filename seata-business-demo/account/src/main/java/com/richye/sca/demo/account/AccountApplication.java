package com.richye.sca.demo.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author: Shuye
 * Date: 2020/10/28 11:52
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.richye.sca.demo.account.dao")
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }

}
