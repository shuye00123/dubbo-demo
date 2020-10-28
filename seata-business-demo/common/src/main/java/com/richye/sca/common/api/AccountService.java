package com.richye.sca.common.api;

/**
 * Author: Shuye
 * Date: 2020/10/28 10:27
 */
public interface AccountService {
    void debit(String userId, int money);
}
