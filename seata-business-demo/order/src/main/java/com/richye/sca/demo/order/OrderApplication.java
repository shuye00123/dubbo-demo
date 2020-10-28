package com.richye.sca.demo.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author: Shuye
 * Date: 2020/10/28 11:54
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.richye.sca.demo.order.dao")
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}
