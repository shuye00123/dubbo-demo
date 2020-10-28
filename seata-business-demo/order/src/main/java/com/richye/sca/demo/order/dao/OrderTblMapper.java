package com.richye.sca.demo.order.dao;

import com.richye.sca.common.domain.OrderTbl;
import com.richye.sca.common.domain.OrderTblExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderTblMapper {
    long countByExample(OrderTblExample example);

    int deleteByExample(OrderTblExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderTbl record);

    int insertSelective(OrderTbl record);

    List<OrderTbl> selectByExample(OrderTblExample example);

    OrderTbl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderTbl record, @Param("example") OrderTblExample example);

    int updateByExample(@Param("record") OrderTbl record, @Param("example") OrderTblExample example);

    int updateByPrimaryKeySelective(OrderTbl record);

    int updateByPrimaryKey(OrderTbl record);
}