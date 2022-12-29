package com.storyhasyou.odin.driver.mapper;

import com.storyhasyou.odin.driver.entity.DriverLockdown;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangxi created by 2022/12/29
 */
@Mapper
public interface DriverLockdownMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(DriverLockdown record);

    DriverLockdown selectByPrimaryKey(Long id);
}