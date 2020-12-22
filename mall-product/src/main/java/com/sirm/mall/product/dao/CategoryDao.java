package com.sirm.mall.product.dao;

import com.sirm.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author sirm
 * @email sunyuping2018@163.com
 * @date 2020-12-18 14:56:46
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
