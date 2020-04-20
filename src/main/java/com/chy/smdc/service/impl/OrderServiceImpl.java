package com.chy.smdc.service.impl;

import com.chy.smdc.DTO.OrderDTO;
import com.chy.smdc.bean.OrderMaster;
import com.chy.smdc.dao.OrderMasterDao;
import com.chy.smdc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMasterDao orderMasterDao;
    @Override
    public OrderMaster create(OrderDTO orderDTO)  {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId(orderDTO.getOrderId());
        orderMaster.setBuyerName(orderDTO.getBuyerName());
        orderMaster.setBuyerAddress(orderDTO.getBuyerAddress());
        orderMaster.setOrderAmount(orderDTO.getOrderAmount());
        orderMaster.setBuyerPhone(orderDTO.getBuyerPhone());
        orderMaster.setCreateTime(new Date());
        orderMaster.setUpdateTime(new Date());
        return orderMasterDao.save(orderMaster);
    }


    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }


    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }


    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }


    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
