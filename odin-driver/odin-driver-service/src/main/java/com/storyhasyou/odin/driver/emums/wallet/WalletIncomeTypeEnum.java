package com.storyhasyou.odin.driver.emums.wallet;

import cn.hutool.core.lang.Pair;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author fangxi created by 2022/12/29
 * 1充值，2奖励，3补贴
 */
@Getter
@AllArgsConstructor
public enum WalletIncomeTypeEnum {

    RECHARGE(1, "充值"),
    REWARD(2, "奖励"),
    SUBSIDY(3, "补贴"),
    ;

    private final Integer code;

    private final String message;

    public static String getMessage(Integer code) {
        for (WalletIncomeTypeEnum value : WalletIncomeTypeEnum.values()) {
            if (value.code.equals(code)) {
                return value.message;
            }
        }
        throw new IllegalArgumentException("找不到枚举值");
    }

    public static WalletIncomeTypeEnum get(Integer code) {
        for (WalletIncomeTypeEnum value : WalletIncomeTypeEnum.values()) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        throw new IllegalArgumentException("找不到枚举");
    }

    public static List<Pair<Integer, String>> toPair() {
        return Stream.of(WalletIncomeTypeEnum.values())
                .map(value -> Pair.of(value.getCode(), value.getMessage()))
                .collect(Collectors.toList());
    }
}
