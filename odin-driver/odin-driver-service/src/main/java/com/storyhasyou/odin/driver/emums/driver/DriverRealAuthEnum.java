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
public enum DriverRealAuthEnum {

    UNCERTIFIED(1, "未认证"),
    CERTIFIED(2, "已认证"),
    AUDIT(3, "审核中"),
    ;

    private final Integer code;

    private final String message;

    public static String getMessage(Integer code) {
        for (DriverRealAuthEnum value : DriverRealAuthEnum.values()) {
            if (value.code.equals(code)) {
                return value.message;
            }
        }
        throw new IllegalArgumentException("找不到枚举值");
    }

    public static DriverRealAuthEnum get(Integer code) {
        for (DriverRealAuthEnum value : DriverRealAuthEnum.values()) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        throw new IllegalArgumentException("找不到枚举");
    }

    public static List<Pair<Integer, String>> toPair() {
        return Stream.of(DriverRealAuthEnum.values())
                .map(value -> Pair.of(value.getCode(), value.getMessage()))
                .collect(Collectors.toList());
    }
}
