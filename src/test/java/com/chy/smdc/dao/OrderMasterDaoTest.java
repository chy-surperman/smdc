package com.chy.smdc.dao;

import com.chy.smdc.bean.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterDaoTest {
  @Autowired
  OrderMasterDao orderMasterDao;


    @Test
    public void insertone(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("110");
        orderMaster.setOrderStatus(1);
        orderMaster.setPayStatus(1);
        orderMaster.setBuyerName("陈海荣");
        orderMaster.setBuyerAddress("长沙");
        orderMaster.setBuyerOpenid("123456");
        orderMaster.setBuyerPhone("12345678910");
        orderMaster.setOrderAmount(new BigDecimal(10.0));
        orderMaster.setCreateTime(new Date());
        orderMaster.setUpdateTime(new Date());
        orderMasterDao.save(orderMaster);
    }


    @Test
    public void findByBuyerOpenid(){
        PageRequest pageRequest = new PageRequest(0,1);
        Page<OrderMaster> byBuyerOpenid = orderMasterDao.findByBuyerOpenid("123456", pageRequest);
        Assert.assertNotNull(byBuyerOpenid);
    }
}