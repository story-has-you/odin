package com.storyhasyou.odin.order.mapper;

import com.storyhasyou.odin.order.pojo.entity.OrderComment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangxi created by 2023/1/5
 */
@Mapper
public interface OrderCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderComment record);

    OrderComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderComment record);
}