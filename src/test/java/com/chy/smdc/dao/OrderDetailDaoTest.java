package com.chy.smdc.dao;

import com.chy.smdc.bean.OrderDetail;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailDaoTest {
    @Autowired
    OrderDetailDao orderDetailDao;
   @Test
    public void insertone(){
       OrderDetail orderDetail = new OrderDetail();
       orderDetail.setOrderId("123456");
       orderDetail.setProductIcon("http://xxxx.png");
       orderDetail.setProductId("123");
       orderDetail.setProductName("龙虾");
       orderDetail.setProductPrice(new BigDecimal(10.2));
       orderDetailDao.save(orderDetail);
   }


   @Test
    public void findByOrderId(){
       List<OrderDetail> byOrderId = orderDetailDao.findByOrderId("123456");
       Assert.assertNotEquals(0,byOrderId.size());
   }



}