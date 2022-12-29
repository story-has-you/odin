package com.storyhasyou.odin.driver.mapper;

import com.storyhasyou.odin.driver.entity.Wallet;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangxi created by 2022/12/29
 */
@Mapper
public interface WalletMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(Wallet record);

    Wallet selectByPrimaryKey(Long id);
}