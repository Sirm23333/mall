package com.sirm.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sirm.common.utils.PageUtils;
import com.sirm.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author sirm
 * @email sunyuping2018@163.com
 * @date 2020-12-22 17:08:48
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

