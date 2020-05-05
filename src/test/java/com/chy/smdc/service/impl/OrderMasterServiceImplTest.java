package com.chy.smdc.service.impl;

import com.chy.smdc.bean.OrderMaster;
import com.chy.smdc.dao.OrderMasterDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterServiceImplTest {
    @Autowired
    OrderMasterDao orderMasterDao;

    @Test
    public void findAll() {
        List<OrderMaster> all = orderMasterDao.findAll();
        System.out.println(all);
    }
}