package com.sirm.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sirm.common.utils.PageUtils;
import com.sirm.mall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author sirm
 * @email sunyuping2018@163.com
 * @date 2020-12-22 16:55:01
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

