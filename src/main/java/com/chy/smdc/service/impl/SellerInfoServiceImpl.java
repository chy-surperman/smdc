package com.chy.smdc.service.impl;

import com.chy.smdc.bean.SellerInfo;
import com.chy.smdc.dao.SellerInfoDao;
import com.chy.smdc.service.SellerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerInfoServiceImpl implements SellerInfoService {

    @Autowired
    SellerInfoDao sellerInfoDao;
    @Override
    public SellerInfo findOne(int id) {

        return sellerInfoDao.findBySellerId(id);
    }
}
