package com.chy.smdc.Controller;

import com.chy.smdc.bean.Permission;
import com.chy.smdc.service.impl.PermissionServiceImpl;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/smdc/system")
public class PermissionController {
    @Autowired
    PermissionServiceImpl permissionServiceimpl;


    @RequestMapping("/getMenu")
    @ResponseBody
    public List<Permission> getMenu() {
     return  permissionServiceimpl.getAllMenu();
    }
}
