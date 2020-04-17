package com.chy.smdc.service.impl;

import com.chy.smdc.bean.Role;
import com.chy.smdc.dao.RoleMapper;
import com.chy.smdc.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    public List<Role> queryRole() {
        return roleMapper.selectAllRole();
    }

}
