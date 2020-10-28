package com.richye.sca.demo.order.service.dubbo;

import com.richye.sca.common.api.AccountService;
import com.richye.sca.common.api.OrderService;
import com.richye.sca.common.domain.OrderTbl;
import com.richye.sca.demo.order.dao.OrderTblMapper;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Author: Shuye
 * Date: 2020/10/28 14:07
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderTblMapper orderTblMapper;
    @Reference
    private AccountService accountService;
    @Override
    public OrderTbl create(String userId, String commodityCode, int orderCount) {
        int orderMoney = orderCount * 100;

        accountService.debit(userId, orderMoney);

        OrderTbl order = new OrderTbl();
        order.setUserId(userId);
        order.setCommodityCode(commodityCode);
        order.setCount(orderCount);
        order.setMoney(orderMoney);

        // INSERT INTO orders ...
        int id = orderTblMapper.insert(order);
//        order.setId(id);
        return order;
    }
}
