package com.storyhasyou.odin.driver.emums.driver;

import cn.hutool.core.lang.Pair;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author fangxi created by 2022/12/29
 */
@Getter
@AllArgsConstructor
public enum DriverStatusEnum {

    NORMAL(1, "正常"),
    DISABLE(2, "禁用"),
    LOWER(3, "降低接单量"),
    ;

    private final Integer code;

    private final String message;

    public static String getMessage(Integer code) {
        for (DriverStatusEnum value : DriverStatusEnum.values()) {
            if (value.code.equals(code)) {
                return value.message;
            }
        }
        throw new IllegalArgumentException("找不到枚举值");
    }

    public static DriverStatusEnum get(Integer code) {
        for (DriverStatusEnum value : DriverStatusEnum.values()) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        throw new IllegalArgumentException("找不到枚举");
    }

    public static List<Pair<Integer, String>> toPair() {
        return Stream.of(DriverStatusEnum.values())
                .map(value -> Pair.of(value.getCode(), value.getMessage()))
                .collect(Collectors.toList());
    }
}
