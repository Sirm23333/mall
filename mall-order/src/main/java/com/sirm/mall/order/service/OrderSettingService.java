package com.sirm.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sirm.common.utils.PageUtils;
import com.sirm.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author sirm
 * @email sunyuping2018@163.com
 * @date 2020-12-22 17:04:50
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

