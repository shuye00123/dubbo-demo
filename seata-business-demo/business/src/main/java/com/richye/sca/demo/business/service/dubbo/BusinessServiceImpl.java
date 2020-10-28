package com.richye.sca.demo.business.service.dubbo;

import com.richye.sca.common.api.BusinessService;
import com.richye.sca.common.api.OrderService;
import com.richye.sca.common.api.StorageService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Author: Shuye
 * Date: 2020/10/28 14:06
 */
@Component
@Service
public class BusinessServiceImpl implements BusinessService {
    @Reference
    private StorageService storageService;
    @Reference
    private OrderService orderService;
    @Override
    public void purchase(String userId, String commodityCode, int orderCount) {
        storageService.deduct(commodityCode, orderCount);

        orderService.create(userId, commodityCode, orderCount);
    }
}
