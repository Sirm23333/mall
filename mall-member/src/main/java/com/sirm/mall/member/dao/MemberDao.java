package com.sirm.mall.member.dao;

import com.sirm.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author sirm
 * @email sunyuping2018@163.com
 * @date 2020-12-22 17:08:48
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
