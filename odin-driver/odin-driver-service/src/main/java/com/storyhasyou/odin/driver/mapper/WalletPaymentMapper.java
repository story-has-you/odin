package com.storyhasyou.odin.driver.mapper;

import com.storyhasyou.odin.driver.entity.WalletPayment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangxi created by 2022/12/29
 */
@Mapper
public interface WalletPaymentMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(WalletPayment record);

    WalletPayment selectByPrimaryKey(Long id);
}