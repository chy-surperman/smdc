package com.chy.smdc.Controller;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/smdc/system")
public class PermissionController {
    @RequestMapping("/getMenu")
    @ResponseBody
    public String getMenu() {
        System.out.println("正在请求获取菜单");
        return "正在请求获取菜单";
    }
}
