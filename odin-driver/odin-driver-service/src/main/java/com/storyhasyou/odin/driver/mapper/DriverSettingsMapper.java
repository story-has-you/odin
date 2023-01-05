package com.storyhasyou.odin.driver.mapper;

import com.storyhasyou.odin.driver.pojo.entity.DriverSettings;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangxi created by 2022/12/29
 */
@Mapper
public interface DriverSettingsMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(DriverSettings record);

    DriverSettings selectByPrimaryKey(Long id);

    DriverSettings selectByDriverId(Long driverId);
}
