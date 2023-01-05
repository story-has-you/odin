package com.storyhasyou.odin.order.pojo.vo.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author fangxi created by 2023/1/5
 */
@Data
public class WorkTableResponseVO {

    @Schema(description = "代驾时长")
    private Integer drivingDuration;
    @Schema(description = "今日收入")
    private BigDecimal todayIncome;
    @Schema(description = "今日订单数")
    private Integer todayOrderCount;
    @Schema(description = "取向")
    private String orientation;
    @Schema(description = "是否听单")
    private Boolean listenService;
    @Schema(description = "订单里程")
    private Integer orderDistance;
    @Schema(description = "订单范围")
    private Integer rangeDistance;
    @Schema(description = "自动接单")
    private Boolean autoAccept;
}
