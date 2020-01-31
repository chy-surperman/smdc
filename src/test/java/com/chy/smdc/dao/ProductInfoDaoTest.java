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
    public void findByProductStatusTest() {
        productInfoDao.findByProductStatus(0);
    }


    @Test
    public void insertone() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductName("龙虾");
        productInfo.setProductPrice(new BigDecimal(100.2));
        productInfo.setProductStatus(0);
        productInfo.setProductStore(100);
        productInfo.setProductDescription("特别好吃");
        productInfo.setCategoryType(2);
        productInfo.setProductIcon("http://xxx.png");
        productInfo.setProductId("3");
        this.productInfoDao.save(productInfo);
    }
}