package com.storyhasyou.odin.order.pojo.dto;

import lombok.Data;

/**
 * @author fangxi created by 2023/1/5
 */
@Data
public class DriverSettingsDTO {

    private String orientation;
    private Boolean listenService;
    private Integer orderDistance;
    private Integer rangeDistance;
    private Boolean autoAccept;

}
