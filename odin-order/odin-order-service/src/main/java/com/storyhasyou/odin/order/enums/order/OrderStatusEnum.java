package com.storyhasyou.odin.order.enums.order;

import cn.hutool.core.lang.Pair;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author fangxi created by 2023/1/5
 * 1等待接单，2已接单，3司机已到达，4开始代驾，5结束代驾，6未付款，7已付款，8订单已结束，9顾客撤单，10司机撤单，11事故关闭，12其他
 */
@Getter
@AllArgsConstructor
public enum OrderStatusEnum {

    WAITING(1, "等待接单"),
    ACCEPTED(2, "已接单"),
    ARRIVED(3, "司机已到达"),
    STARTED(4, "开始代驾"),
    FINISHED(5, "结束代驾"),
    UNPAID(6, "未付款"),
    PAID(7, "已付款"),
    CLOSED(8, "订单已结束"),
    CUSTOMER_CANCEL(9, "顾客撤单"),
    DRIVER_CANCEL(10, "司机撤单"),
    ACCIDENT_CLOSE(11, "事故关闭"),
    OTHER(12, "其他"),
    ;

    private final Integer code;

    private final String message;

    public static String getMessage(Integer code) {
        for (OrderStatusEnum value : OrderStatusEnum.values()) {
            if (value.code.equals(code)) {
                return value.message;
            }
        }
        throw new IllegalArgumentException("找不到枚举值");
    }

    public static OrderStatusEnum get(Integer code) {
        for (OrderStatusEnum value : OrderStatusEnum.values()) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        throw new IllegalArgumentException("找不到枚举");
    }

    public static List<Pair<Integer, String>> toPair() {
        return Stream.of(OrderStatusEnum.values())
                .map(value -> Pair.of(value.getCode(), value.getMessage()))
                .collect(Collectors.toList());
    }

    public static List<Integer> effective() {
        return Stream.of(FINISHED, UNPAID, PAID, CLOSED)
                .map(OrderStatusEnum::getCode)
                .collect(Collectors.toList());
    }
}
