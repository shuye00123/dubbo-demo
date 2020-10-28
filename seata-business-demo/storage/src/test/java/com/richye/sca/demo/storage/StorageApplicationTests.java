package com.richye.sca.demo.storage;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Author: Shuye
 * Date: 2020/10/28 15:44
 */
@SpringBootTest(classes = StorageApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
public class StorageApplicationTests {

    @ParameterizedTest
    void contextLoads() {
    }
}
