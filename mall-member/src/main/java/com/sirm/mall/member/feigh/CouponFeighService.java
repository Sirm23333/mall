package com.sirm.mall.member.feigh;

import com.sirm.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient("mall-coupon")
public interface CouponFeighService {
    @RequestMapping("/coupon/coupon/info/{id}")
    R info(@PathVariable("id") Long id);
}
