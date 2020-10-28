package com.richye.sca.demo.account.service.dubbo;

import com.richye.sca.common.api.AccountService;
import com.richye.sca.demo.account.dao.AccountTblMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Author: Shuye
 * Date: 2020/10/28 14:05
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountTblMapper accountTblMapper;

    @Override
    public void debit(String userId, int money) {
        int flag = accountTblMapper.debit(userId, money);
        if (flag != 1) throw new RuntimeException("余额不足");
    }
}
