package com.storyhasyou.odin.driver.entity;

import com.storyhasyou.kratos.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author fangxi created by 2022/12/29
 * 钱包收入表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WalletIncome extends BaseEntity {
    /**
     * uuid字符串
     */
    private String uuid;

    /**
     * 司机ID
     */
    private Long driverId;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 1充值，2奖励，3补贴
     */
    private Integer type;

    /**
     * 预支付订单ID
     */
    private String prepayId;

    /**
     * 1未支付，2已支付，3已到账
     */
    private Integer status;

    /**
     * 备注信息
     */
    private String remark;
}
