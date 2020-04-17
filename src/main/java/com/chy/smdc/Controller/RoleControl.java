package com.chy.smdc.Controller;

import com.chy.smdc.bean.Role;
import com.chy.smdc.bean.User;
import com.chy.smdc.service.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/system")
public class RoleControl {
    @Autowired
    RoleServiceImpl roleServiceimpl;

    @RequestMapping("/roleList")
    public String roleList() {
        return "/system/role/roleList";
    }

    @RequestMapping("/queryRole")
    @ResponseBody
    public List<Role> queryRole() {
        return roleServiceimpl.queryRole();
    }


}
