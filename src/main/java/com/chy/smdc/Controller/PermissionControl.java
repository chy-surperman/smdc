package com.chy.smdc.Controller;

import com.chy.smdc.bean.Permission;
import com.chy.smdc.service.impl.PermissionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/system")
public class PermissionControl {

    @Autowired
    PermissionServiceImpl permissionServiceImpl;

    @RequestMapping("/permissionList")
    public String permissionList() {
        return "system/permission/permissionList";
    }

    /**
     * 获取所有的权限和菜单
     *
     * @return
     */
    @GetMapping("getPermission")
    @ResponseBody
    public List<Permission> getPermission() {
        return permissionServiceImpl.getPermission();
    }
}


