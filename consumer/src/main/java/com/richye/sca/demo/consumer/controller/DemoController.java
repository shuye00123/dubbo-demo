package com.richye.sca.demo.consumer.controller;

import com.richye.sca.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Shuye
 * Date: 2020/10/22 11:52
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Reference
    private DemoService demoService;

    @GetMapping
    public String test() {
        return "OK";
    }

    @GetMapping("/{name}")
    public String sayHello(@PathVariable String name) {
        return demoService.sayHello(name);
    }
}
