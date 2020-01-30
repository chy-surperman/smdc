package com.chy.smdc.dao;

import com.chy.smdc.bean.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao productCategory;


    @Test
    public void findone(){
        ProductCategory one = productCategory.findOne(1);
        one.setCategoryType(4);
        productCategory.save(one);
    }


    @Test
    public void insertone(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("小清新");
        productCategory.setCategoryType(1);
        this.productCategory.save(productCategory);
    }




}