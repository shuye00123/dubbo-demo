package com.richye.sca.demo.business.controller;

import com.richye.sca.demo.business.service.dubbo.BusinessServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Shuye
 * Date: 2020/10/28 15:25
 */
@RestController
@RequestMapping("/business")
public class BusinessConroller {
    @Autowired
    private BusinessServiceImpl businessService;

    @GetMapping("/purchase")
    public String purchase(@RequestParam String userId, @RequestParam String code, @RequestParam Integer count) {
        businessService.purchase(userId, code, count);
        return "success";
    }
}
