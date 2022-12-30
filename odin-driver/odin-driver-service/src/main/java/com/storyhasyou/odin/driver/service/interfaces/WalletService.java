package com.storyhasyou.odin.driver.service.interfaces;

import com.storyhasyou.odin.driver.pojo.entity.Wallet;

/**
 * @author fangxi created by 2022/12/29
 */
public interface WalletService {

    long insertSelective(Wallet wallet);

}
