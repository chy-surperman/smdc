package com.chy.smdc.service;

import com.chy.smdc.bean.Permission;

import java.util.List;

public interface PermissionService {
    List<Permission> getAllMenu();
    List<Permission> getPermission();
}
