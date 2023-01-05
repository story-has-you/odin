package com.storyhasyou.odin.order.pojo.entity;

import com.storyhasyou.kratos.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author fangxi created by 2023/1/5
 * 订单监控表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderMonitoring extends BaseEntity {
    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 录音文档云存储网址
     */
    private String recording;

    /**
     * 谈话文字内容
     */
    private String content;

    /**
     * 谈话内容的标签，比如辱骂、挑逗、开房、包养等
     */
    private String tag;
}
