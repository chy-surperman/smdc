package com.chy.smdc.Controller;

import com.chy.smdc.bean.ProductInfo;
import com.chy.smdc.service.impl.ProductInfoServiceImpl;
import com.chy.smdc.util.Result;
import com.chy.smdc.util.messageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class DishesDetailsController {
    @Autowired
    ProductInfoServiceImpl productInfoServiceimpl;

    @RequestMapping("/querydishDetails")
    public String OrderDetailQueryToIndex(){
      return  "menu/querydishDetails";
    }


    @RequestMapping("/goodsDetails")
    @ResponseBody
    public Result menuDetails(){
        List<ProductInfo> upAll = productInfoServiceimpl.findUpAll();
        return messageResult.houtaisuccess(upAll);
    }



}
