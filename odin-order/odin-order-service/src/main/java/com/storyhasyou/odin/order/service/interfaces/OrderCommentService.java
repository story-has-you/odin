package com.storyhasyou.odin.order.service.interfaces;

import com.storyhasyou.odin.order.pojo.entity.OrderComment;

/**
 * @author fangxi created by 2023/1/5
 */
public interface OrderCommentService {


    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderComment record);

    OrderComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderComment record);

}

