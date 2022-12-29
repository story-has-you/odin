package com.storyhasyou.odin.driver.entity;

import com.storyhasyou.kratos.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author fangxi created by 2022/12/29
 */

/**
 * 司机钱包付款表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WalletPayment extends BaseEntity {
    /**
     * 司机ID
     */
    private Long driverId;

    /**
     * 支付金额
     */
    private BigDecimal amount;

    /**
     * 1话费，2罚款，3抽奖，4缴费，5其他
     */
    private Integer type;

    /**
     * 备注
     */
    private String remark;
}
