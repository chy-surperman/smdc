package com.chy.smdc.dao;

import com.chy.smdc.bean.SellerInfo;
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
public class SellerInfoDaoTest {

    @Autowired
    SellerInfoDao sellerInfoDao;

    @Test
    public void sellerInfoDaoTest(){
        SellerInfo bySellerId = sellerInfoDao.findBySellerId(1);
        Assert.assertNotNull(bySellerId);
    }

}