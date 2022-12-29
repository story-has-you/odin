package com.storyhasyou.odin.driver.entity;

import com.storyhasyou.kratos.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author fangxi created by 2022/12/29
 */

/**
 * 钱包表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Wallet extends BaseEntity {
    /**
     * 司机ID
     */
    private Long driverId;

    /**
     * 钱包金额
     */
    private BigDecimal balance;

    /**
     * 支付密码，如果为空，不能支付，提示用户设置支付密码
     */
    private String password;
}
