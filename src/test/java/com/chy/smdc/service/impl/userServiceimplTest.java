package com.chy.smdc.service.impl;

import com.chy.smdc.bean.user;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class userServiceimplTest {

    @Autowired
    userServiceimpl userServiceimpl;

    @Test
   public void selectByuserName() {
        user chy = userServiceimpl.selectByuserName("chy");
        System.out.println(chy.toString());
    }
}