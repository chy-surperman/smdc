package com.chy.smdc.service.impl;

import com.chy.smdc.bean.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    ProductInfoServiceImpl productInfoService;

    @Test
    public void findOne() {
        productInfoService.findOne("1");
    }

    @Test
    public void findUpAll() {

        List<ProductInfo> upAll = productInfoService.findUpAll();
        Assert.assertNotEquals(0,upAll);
    }

    @Test
    public void findAll() {
        Page<ProductInfo> all = productInfoService.findAll(new PageRequest(0, 2));
        Assert.assertNotEquals(0,all);
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductName("皮蛋");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStatus(0);
        productInfo.setProductStore(100);
        productInfo.setProductDescription("特别好吃");
        productInfo.setCategoryType(1);
        productInfo.setProductIcon("http://xxx.png");
        productInfo.setProductId("1");
        ProductInfo save = productInfoService.save(productInfo);
        Assert.assertNotNull(save);
    }
}