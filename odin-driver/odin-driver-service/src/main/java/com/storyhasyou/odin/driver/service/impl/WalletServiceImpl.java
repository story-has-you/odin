package com.storyhasyou.odin.driver.service.impl;

import com.storyhasyou.odin.driver.mapper.WalletMapper;
import com.storyhasyou.odin.driver.pojo.entity.Wallet;
import com.storyhasyou.odin.driver.service.interfaces.WalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author fangxi created by 2022/12/29
 */
@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService {

    private final WalletMapper walletMapper;

    @Override
    public long insertSelective(Wallet wallet) {
        walletMapper.insertSelective(wallet);
        return wallet.getId();
    }

}
