package com.chy.smdc.Controller;

import com.chy.smdc.bean.User;
import com.chy.smdc.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControlTest {
    @Autowired
    UserMapper userMapper;
    @Test
    public void userList() {
    }

    @Test
    public void queryAllUser() {
        List<User> users = userMapper.selectAll();
        for (User i:users ) {
            System.out.println(i.toString());
        }
    }
}