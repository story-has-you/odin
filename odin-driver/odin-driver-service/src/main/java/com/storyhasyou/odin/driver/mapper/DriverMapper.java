package com.storyhasyou.odin.driver.mapper;

import com.storyhasyou.odin.driver.pojo.entity.Driver;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangxi created by 2022/12/29
 */
@Mapper
public interface DriverMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(Driver record);

    Driver selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Driver record);

    boolean existsByOpenId(String openid);

}
