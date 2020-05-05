package com.chy.smdc.service.impl;

import com.chy.smdc.bean.OrderMaster;
import com.chy.smdc.dao.OrderMasterDao;
import com.chy.smdc.service.OrderDetailService;
import com.chy.smdc.service.OrderMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderMasterServiceImpl implements OrderMasterService {

    @Autowired
    OrderMasterDao orderMasterDao;

    @Override
    public List<OrderMaster> findAll() {
        return orderMasterDao.findAll();
    }
}
