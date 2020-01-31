package com.chy.smdc.dao;

import com.chy.smdc.bean.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao productCategory;


    @Test
    public void findone(){
        System.out.println(productCategory.findAll().toString());
    }


    @Test
    public void insertone(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("小可爱");
        productCategory.setCategoryType(3);
        this.productCategory.save(productCategory);
    }



    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(1, 3, 4, 5);
        List<ProductCategory> byCategoryTypeIn = productCategory.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,byCategoryTypeIn.size());
    }



}