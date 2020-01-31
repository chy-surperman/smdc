package com.chy.smdc.Controller;

import com.chy.smdc.bean.ProductInfo;
import com.chy.smdc.service.ProductInfoService;
import com.chy.smdc.service.impl.ProductInfoServiceImpl;
import com.chy.smdc.util.ProductInfoResult;
import com.chy.smdc.util.ProductResult;
import com.chy.smdc.util.Result;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    ProductInfoService productInfoService;
    
    @GetMapping("/list")
    public Result list() {

        List<ProductInfo> upAll = productInfoService.findUpAll();

        Result result = new Result();
        ProductResult productResult = new ProductResult();
        ProductInfoResult productInfoResult = new ProductInfoResult();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(Arrays.asList(productResult));
        productResult.setProductInfoResultList(Arrays.asList(productInfoResult));
        return result;
    }
}
