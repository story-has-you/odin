package com.storyhasyou.odin.driver.mapper;

import com.storyhasyou.odin.driver.pojo.entity.WalletIncome;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangxi created by 2022/12/29
 */
@Mapper
public interface WalletIncomeMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WalletIncome record);

    WalletIncome selectByPrimaryKey(Long id);
}
