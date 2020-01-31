package com.chy.smdc.dao;

import com.chy.smdc.bean.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoDaoTest {
    @Autowired
    ProductInfoDao productInfoDao;

    @Test
    public void findByProductStatusTest(){
     productInfoDao.findByProductStatus(0);
    }


    @Test
    public void saveTes(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductName("皮蛋");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStatus(0);
        productInfo.setProductStore(100);
        productInfo.setProductDescription("特别好吃");
        productInfo.setCategoryType(1);
        productInfo.setProductIcon("http://xxx.png");
        productInfo.setProductId("1");
        ProductInfo save = productInfoDao.save(productInfo);
        Assert.assertNotNull(save);
    }
}