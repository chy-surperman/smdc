package com.chy.smdc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Column;

@Controller
public class homeController {


    @RequestMapping("/hi")
    public String home(){
        return "pay.html";
    }


}
