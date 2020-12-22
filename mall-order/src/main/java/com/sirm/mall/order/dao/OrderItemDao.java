package com.sirm.mall.order.dao;

import com.sirm.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author sirm
 * @email sunyuping2018@163.com
 * @date 2020-12-22 17:04:50
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
