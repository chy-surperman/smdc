package com.chy.smdc.service.impl;

import com.chy.smdc.bean.SellerInfo;
import com.chy.smdc.bean.SellerPreferential;
import com.chy.smdc.service.SellerInfoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerInfoServiceImplTest {
    @Autowired
    SellerInfoService sellerInfoService;


    @Test
    public void findOne() {
        SellerInfo one = sellerInfoService.findOne(1);
        Assert.assertNotNull(one);
    }
}