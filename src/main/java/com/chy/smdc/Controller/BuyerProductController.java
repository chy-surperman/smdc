package com.chy.smdc.Controller;

import com.chy.smdc.bean.ProductCategory;
import com.chy.smdc.bean.ProductInfo;
import com.chy.smdc.service.ProductCategoryService;
import com.chy.smdc.service.ProductInfoService;
import com.chy.smdc.service.impl.ProductInfoServiceImpl;
import com.chy.smdc.util.ProductInfoResult;
import com.chy.smdc.util.ProductResult;
import com.chy.smdc.util.Result;
import com.chy.smdc.util.messageResult;
import lombok.Getter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/buyer/product",method = RequestMethod.GET)
public class BuyerProductController {


    @Autowired
    ProductInfoService productInfoService;

    @Autowired
    ProductCategoryService productCategoryService;
    
    @GetMapping("/list")
    public Result list(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
//        1.查找上架的商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();
//        2.查找类目的方法
        List<Integer> collect = productInfoList.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());
        List<ProductCategory> byCategoryTypeIn = productCategoryService.findByCategoryTypeIn(collect);
//        3.拼装

        List<ProductResult> productResults=new ArrayList<>();
        for (ProductCategory   productCategoryList:byCategoryTypeIn) {
            ProductResult productResult = new ProductResult();
            productResult.setCategoryName(productCategoryList.getCategoryName());
            productResult.setCategoryType(productCategoryList.getCategoryType());
           List<ProductInfoResult> productInfoResults=new ArrayList<>();
            for (ProductInfo productInfolist:productInfoList) {
                if (productInfolist.getCategoryType().equals(productCategoryList.getCategoryType())){
                    ProductInfoResult productInfoResult = new ProductInfoResult();
                    BeanUtils.copyProperties(productInfolist,productInfoResult);
                    productInfoResults.add(productInfoResult);
                }
            }
            productResult.setProductInfoResultList(productInfoResults);
            productResults.add(productResult);
        }
        return messageResult.success(productResults);
    }
}
