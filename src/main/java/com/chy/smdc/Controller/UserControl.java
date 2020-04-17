package com.chy.smdc.Controller;

import com.chy.smdc.bean.User;
import com.chy.smdc.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@RequestMapping("/system")
public class UserControl {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/userList")
    public String userList() {
        return "/system/user/userList";
    }

    @RequestMapping("/queryUser")
    @ResponseBody
    public List<User> queryAllUser() {
        return userMapper.selectAll();
    }
}
