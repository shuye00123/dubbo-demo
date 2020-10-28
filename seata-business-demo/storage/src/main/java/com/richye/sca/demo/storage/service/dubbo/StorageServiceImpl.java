package com.richye.sca.demo.storage.service.dubbo;

import com.richye.sca.common.api.StorageService;
import com.richye.sca.demo.storage.dao.StorageTblMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Author: Shuye
 * Date: 2020/10/28 14:09
 */
@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageTblMapper storageTblMapper;

    @Override
    public void deduct(String commodityCode, int count) {
        int flag = storageTblMapper.deduct(commodityCode, count);
        if (flag != 1) throw new RuntimeException("库存不足");
    }
}
