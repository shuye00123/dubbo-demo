package com.richye.sca.common.api;

import com.richye.sca.common.domain.OrderTbl;

/**
 * Author: Shuye
 * Date: 2020/10/28 10:28
 */
public interface OrderService {
    OrderTbl create(String userId, String commodityCode, int orderCount);
}
