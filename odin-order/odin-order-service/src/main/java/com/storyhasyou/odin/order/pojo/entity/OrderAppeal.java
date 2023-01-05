package com.storyhasyou.odin.order.pojo.entity;

import com.storyhasyou.kratos.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author fangxi created by 2023/1/5
 * 司机申诉表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderAppeal extends BaseEntity {
    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 司机ID
     */
    private Long driverId;

    /**
     * 申诉内容
     */
    private String detail;

    /**
     * 处理结果
     */
    private String result;

    /**
     * 申诉状态，1申诉中，2申诉成功，3申诉失败
     */
    private Integer status;
}
