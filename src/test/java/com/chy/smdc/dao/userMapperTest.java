package com.chy.smdc.dao;

import com.chy.smdc.bean.SellerInfo;
import com.chy.smdc.bean.user;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class userMapperTest {
    @Autowired
    userMapper mapper;
    @Test
    public void usermapperTest(){
        user chy = mapper.selectByuserName("chy");
        System.out.println(chy);
    }
}