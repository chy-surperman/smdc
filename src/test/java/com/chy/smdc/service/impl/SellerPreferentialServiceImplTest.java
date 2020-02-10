package com.chy.smdc.service.impl;

import com.chy.smdc.bean.SellerPreferential;
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
public class SellerPreferentialServiceImplTest {
    @Autowired
     SellerPreferentialServiceImpl sellerPreferentialService;
    @Test
    public void findOne() {
        List<SellerPreferential> one = sellerPreferentialService.findOne(1);
        Assert.assertNotNull(one);
    }
}