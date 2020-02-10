package com.chy.smdc.Controller;

import com.chy.smdc.bean.SellerInfo;
import com.chy.smdc.bean.SellerPreferential;
import com.chy.smdc.service.impl.SellerInfoServiceImpl;
import com.chy.smdc.service.impl.SellerPreferentialServiceImpl;
import com.chy.smdc.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(value = "/seller/info",method = RequestMethod.GET)
public class SellerInfoController {

    @Autowired
    SellerPreferentialServiceImpl sellerPreferentialService;

    @Autowired
    SellerInfoServiceImpl sellerInfoService;
    @GetMapping("/list")
    public Result list(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");

        SellerInfo one = sellerInfoService.findOne(1);
        List<SellerPreferential> SellerPreferentialone = sellerPreferentialService.findOne(one.getSellerId());
        System.out.println(one);
        System.out.println(SellerPreferentialone);

        return null;
    }


}
