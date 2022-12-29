package com.storyhasyou.odin.driver.mapper;

import com.storyhasyou.odin.driver.entity.DriverRecognition;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangxi created by 2022/12/29
 */
@Mapper
public interface DriverRecognitionMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(DriverRecognition record);

    DriverRecognition selectByPrimaryKey(Long id);
}