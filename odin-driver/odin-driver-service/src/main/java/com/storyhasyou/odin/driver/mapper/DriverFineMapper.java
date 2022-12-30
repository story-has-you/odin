package com.storyhasyou.odin.driver.mapper;

import com.storyhasyou.odin.driver.pojo.entity.DriverFine;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangxi created by 2022/12/29
 */
@Mapper
public interface DriverFineMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(DriverFine record);

    DriverFine selectByPrimaryKey(Long id);
}
