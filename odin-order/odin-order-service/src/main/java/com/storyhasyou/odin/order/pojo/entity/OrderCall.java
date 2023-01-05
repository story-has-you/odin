package com.storyhasyou.odin.order.pojo.entity;

import com.storyhasyou.kratos.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author fangxi created by 2023/1/5
 * 订单通话记录表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderCall extends BaseEntity {
    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 通话分钟数
     */
    private Integer minute;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 通话费
     */
    private BigDecimal fee;

    /**
     * 日期
     */
    private LocalDate date;
}
