package com.richye.sca.demo.account.dao;

import com.richye.sca.common.domain.AccountTbl;
import com.richye.sca.common.domain.AccountTblExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountTblMapper {
    long countByExample(AccountTblExample example);

    int deleteByExample(AccountTblExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountTbl record);

    int insertSelective(AccountTbl record);

    List<AccountTbl> selectByExample(AccountTblExample example);

    AccountTbl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountTbl record, @Param("example") AccountTblExample example);

    int updateByExample(@Param("record") AccountTbl record, @Param("example") AccountTblExample example);

    int updateByPrimaryKeySelective(AccountTbl record);

    int updateByPrimaryKey(AccountTbl record);

    int debit(String userId, Integer money);
}