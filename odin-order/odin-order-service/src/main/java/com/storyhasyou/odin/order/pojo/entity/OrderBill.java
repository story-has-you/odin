package com.storyhasyou.odin.order.pojo.entity;

import com.storyhasyou.kratos.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author fangxi created by 2023/1/5
 * 订单账单表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderBill extends BaseEntity {
    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 总金额
     */
    private BigDecimal total;

    /**
     * 实付款金额
     */
    private BigDecimal realPay;

    /**
     * 里程费
     */
    private BigDecimal mileageFee;

    /**
     * 通话费
     */
    private BigDecimal telFee;

    /**
     * 等时费用
     */
    private BigDecimal waitingFee;

    /**
     * 路桥费
     */
    private BigDecimal tollFee;

    /**
     * 停车费
     */
    private BigDecimal parkingFee;

    /**
     * 其他费用
     */
    private BigDecimal otherFee;

    /**
     * 返程费
     */
    private BigDecimal returnFee;

    /**
     * 顾客好处费
     */
    private BigDecimal favourFee;

    /**
     * 系统奖励费
     */
    private BigDecimal incentiveFee;

    /**
     * 代金券面额
     */
    private BigDecimal voucherFee;

    /**
     * 详情
     */
    private String detail;

    /**
     * 基础里程（公里）
     */
    private Integer baseMileage;

    /**
     * 基础里程价格
     */
    private BigDecimal baseMileagePrice;

    /**
     * 超出基础里程的价格
     */
    private BigDecimal exceedMileagePrice;

    /**
     * 基础分钟
     */
    private Integer baseMinute;

    /**
     * 超出基础分钟的价格
     */
    private BigDecimal exceedMinutePrice;

    /**
     * 基础返程里程（公里）
     */
    private Integer baseReturnMileage;

    /**
     * 超出基础返程里程的价格
     */
    private BigDecimal exceedReturnPrice;
}
