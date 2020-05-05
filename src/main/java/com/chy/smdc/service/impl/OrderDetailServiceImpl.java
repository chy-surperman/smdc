package com.chy.smdc.service.impl;

import com.chy.smdc.bean.OrderDetail;
import com.chy.smdc.dao.OrderDetailDao;
import com.chy.smdc.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    OrderDetailDao orderDetaildao;

    @Override
    public List<OrderDetail> findAll() {
        return orderDetaildao.findAll();
    }
}
