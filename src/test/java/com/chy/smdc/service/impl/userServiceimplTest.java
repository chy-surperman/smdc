package com.chy.smdc.service.impl;

import com.chy.smdc.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class userServiceimplTest {

    @Autowired
    UserServiceImpl UserServiceImpl;

    @Test
   public void selectByuserName() {
        User admin = UserServiceImpl.getUserByUsername("admin");
        System.out.println(admin.toString());
    }
}