package com.chy.smdc.service;

import com.chy.smdc.bean.ProductCategory;

import java.util.List;

public interface ProductCategoryService  {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory>  findAll();

    List<ProductCategory>   findByCategoryTypeIn(List<Integer> categoryTyprList);

    ProductCategory save(ProductCategory productCategory);
 }
