package com.chy.smdc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/menu")
public class menuUploadController {
    @RequestMapping("/shangchuang")
    public String queryordertoindex() {
        return "menu/shangchuang";
    }
}
