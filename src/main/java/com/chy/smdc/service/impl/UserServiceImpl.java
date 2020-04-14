package com.chy.smdc.service.impl;

import com.chy.smdc.bean.User;
import com.chy.smdc.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;

    public User getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }

    public User getUserRole(Integer id) {
        return userMapper.getUserRoleById(id);
    }

}
