package com.richye.sca.demo.provider.service.dubbo;

import com.richye.sca.api.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * Author: Shuye
 * Date: 2020/10/22 11:41
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
