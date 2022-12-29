package com.storyhasyou.odin.driver.emums.wallet;

import cn.hutool.core.lang.Pair;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author fangxi created by 2022/12/29
 * 1未支付，2已支付，3已到账
 */
@Getter
@AllArgsConstructor
public enum WalletIncomeStatusEnum {

    UNPAID(1, "未支付"),
    PAID(2, "已支付"),
    ARRIVED(3, "已到账"),
    ;

    private final Integer code;

    private final String message;

    public static String getMessage(Integer code) {
        for (WalletIncomeStatusEnum value : WalletIncomeStatusEnum.values()) {
            if (value.code.equals(code)) {
                return value.message;
            }
        }
        throw new IllegalArgumentException("找不到枚举值");
    }

    public static WalletIncomeStatusEnum get(Integer code) {
        for (WalletIncomeStatusEnum value : WalletIncomeStatusEnum.values()) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        throw new IllegalArgumentException("找不到枚举");
    }

    public static List<Pair<Integer, String>> toPair() {
        return Stream.of(WalletIncomeStatusEnum.values())
                .map(value -> Pair.of(value.getCode(), value.getMessage()))
                .collect(Collectors.toList());
    }
}
