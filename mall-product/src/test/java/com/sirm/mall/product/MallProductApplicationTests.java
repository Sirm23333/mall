package com.sirm.mall.product;

import com.sirm.mall.product.entity.BrandEntity;
import com.sirm.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("test");
        brandEntity.setFirstLetter("a");
        brandService.save(brandEntity);
    }

}
