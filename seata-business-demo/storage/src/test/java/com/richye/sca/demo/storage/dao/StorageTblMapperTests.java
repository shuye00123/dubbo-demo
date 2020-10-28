package com.richye.sca.demo.storage.dao;

import com.richye.sca.common.domain.StorageTbl;
import com.richye.sca.demo.storage.StorageApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Author: Shuye
 * Date: 2020/10/28 15:46
 */
public class StorageTblMapperTests extends StorageApplicationTests {
    @Autowired
    private StorageTblMapper storageTblMapper;

    @Test
    public void testDeduct() {
//        StorageTbl storageTbl = new StorageTbl();
//        storageTbl.setCommodityCode("C01");
//        storageTbl.setCount(10);
//        storageTblMapper.insert(storageTbl);
        storageTblMapper.deduct("1", 1);
    }
}
