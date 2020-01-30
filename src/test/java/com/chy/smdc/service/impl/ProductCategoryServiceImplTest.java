package com.chy.smdc.service.impl;

import com.chy.smdc.bean.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {

    @Autowired
    ProductCategoryServiceImpl productCategoryServiceimpl;

    @Test
    public void findOne() {
        ProductCategory one = productCategoryServiceimpl.findOne(1);
        Assert.assertEquals(1, one.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> all = productCategoryServiceimpl.findAll();
        Assert.assertNotEquals(0, all.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> integers = Arrays.asList(2, 3, 5, 4);
        List<ProductCategory> byCategoryTypeIn = productCategoryServiceimpl.findByCategoryTypeIn(integers);
        Assert.assertNotEquals(0, byCategoryTypeIn);
    }

    @Test
    public void save() throws Exception{
        ProductCategory productCategory = new ProductCategory("时尚", 2);
        ProductCategory save = productCategoryServiceimpl.save(productCategory);
        Assert.assertNotNull(save);
    }
}