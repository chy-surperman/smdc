package com.chy.smdc.service.impl;

import com.chy.smdc.bean.user;
import com.chy.smdc.dao.userMapper;
import com.chy.smdc.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceimpl implements userService {
    @Autowired
    userMapper mapper;

    @Override
    public user selectByuserName(String username) {
        return mapper.selectByuserName(username);
    }
}
