package com.richye.sca.demo.storage.dao;

import com.richye.sca.common.domain.StorageTbl;
import com.richye.sca.common.domain.StorageTblExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorageTblMapper {
    long countByExample(StorageTblExample example);

    int deleteByExample(StorageTblExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StorageTbl record);

    int insertSelective(StorageTbl record);

    List<StorageTbl> selectByExample(StorageTblExample example);

    StorageTbl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StorageTbl record, @Param("example") StorageTblExample example);

    int updateByExample(@Param("record") StorageTbl record, @Param("example") StorageTblExample example);

    int updateByPrimaryKeySelective(StorageTbl record);

    int updateByPrimaryKey(StorageTbl record);

    int deduct(String commodityCode, Integer count);
}