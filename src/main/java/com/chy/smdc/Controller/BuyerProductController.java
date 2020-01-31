package com.chy.smdc.Controller;

import com.chy.smdc.bean.ProductCategory;
import com.chy.smdc.bean.ProductInfo;
import com.chy.smdc.service.ProductCategoryService;
import com.chy.smdc.service.ProductInfoService;
import com.chy.smdc.service.impl.ProductInfoServiceImpl;
import com.chy.smdc.util.ProductInfoResult;
import com.chy.smdc.util.ProductResult;
import com.chy.smdc.util.Result;
import lombok.Getter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    ProductInfoService productInfoService;

    @Autowired
    ProductCategoryService productCategoryService;
    
    @GetMapping("/list")
    public Result list() {

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
        Result result = new Result();
        result.setData(productResults);
        result.setCode(0);
        result.setMsg("成功！！");
        return result;
    }
}
