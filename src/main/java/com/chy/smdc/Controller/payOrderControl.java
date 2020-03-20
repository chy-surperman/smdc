package com.chy.smdc.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/buyer/orderpay",method = RequestMethod.GET)
public class payOrderControl {
    @GetMapping("/pay")
    public void payOrderMeth(String price,String place,String name,String iphone){
        System.out.println(place+"共计花费"+price+"-"+name+"-"+iphone);
    }
}
