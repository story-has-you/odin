package com.storyhasyou.odin.driver.pojo.model;

/**
 * @author fangxi created by 2023/1/4
 */
public record DriverSummary(Integer level, Integer totalOrder, Integer weekOrder,
                            Integer weekComment, Integer appeal) {

    public static DriverSummary init() {
        return new DriverSummary(0, 0, 0, 0, 0);
    }
}
