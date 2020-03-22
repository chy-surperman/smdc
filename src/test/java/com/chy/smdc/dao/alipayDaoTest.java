package com.chy.smdc.dao;

import com.chy.smdc.bean.alipay;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class alipayDaoTest {
    @Autowired
    alipay alipay;
    @Test
    public  void tets(){
        String signtype = alipay.signtype;
        System.out.println(signtype);
    }
}