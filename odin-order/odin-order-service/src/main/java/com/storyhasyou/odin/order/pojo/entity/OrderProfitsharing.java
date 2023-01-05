package com.storyhasyou.odin.order.pojo.entity;

import com.storyhasyou.kratos.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author fangxi created by 2023/1/5
 * 订单分账表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderProfitsharing extends BaseEntity {
    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 规则ID
     */
    private Long ruleId;

    /**
     * 总费用
     */
    private BigDecimal amountFee;

    /**
     * 微信支付渠道费率
     */
    private BigDecimal paymentRate;

    /**
     * 微信支付渠道费
     */
    private BigDecimal paymentFee;

    /**
     * 为代驾司机代缴税率
     */
    private BigDecimal taxRate;

    /**
     * 税率支出
     */
    private BigDecimal taxFee;

    /**
     * 企业分账收入
     */
    private BigDecimal systemIncome;

    /**
     * 司机分账收入
     */
    private BigDecimal driverIncome;

    /**
     * 分账状态，1未分账，2已分账
     */
    private Integer status;
}
