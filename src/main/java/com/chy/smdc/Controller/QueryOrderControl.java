package com.chy.smdc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class QueryOrderControl {
    @RequestMapping("/queryorder")
    public String queryorder() {
        return "order/queryorder";
    }
}
