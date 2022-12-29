package com.storyhasyou.odin.driver.emums.wallet;

import cn.hutool.core.lang.Pair;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author fangxi created by 2022/12/29
 * 1话费，2罚款，3抽奖，4缴费，5其他
 */
@Getter
@AllArgsConstructor
public enum WalletPaymentTypeEnum {

    PHONE_BILL(1, "话费"),
    FINE(2, "罚款"),
    LOTTERY(3, "抽奖"),
    PAYMENT(4, "缴费"),
    OTHER(5, "其他"),
    ;

    private final Integer code;

    private final String message;

    public static String getMessage(Integer code) {
        for (WalletPaymentTypeEnum value : WalletPaymentTypeEnum.values()) {
            if (value.code.equals(code)) {
                return value.message;
            }
        }
        throw new IllegalArgumentException("找不到枚举值");
    }

    public static WalletPaymentTypeEnum get(Integer code) {
        for (WalletPaymentTypeEnum value : WalletPaymentTypeEnum.values()) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        throw new IllegalArgumentException("找不到枚举");
    }

    public static List<Pair<Integer, String>> toPair() {
        return Stream.of(WalletPaymentTypeEnum.values())
                .map(value -> Pair.of(value.getCode(), value.getMessage()))
                .collect(Collectors.toList());
    }
}
