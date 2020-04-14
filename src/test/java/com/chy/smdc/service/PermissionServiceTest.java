package com.chy.smdc.service;

import com.chy.smdc.bean.Permission;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.Permissions;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PermissionServiceTest {

    @Autowired
    PermissionService PermissionService;

    @Test
    public void test(){
        List<Permission> allMenu = PermissionService.getAllMenu();
        for (Permission i:allMenu) {
            System.out.println(i.toString());
        }
    }

}