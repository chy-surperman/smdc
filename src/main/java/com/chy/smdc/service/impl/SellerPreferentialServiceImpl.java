package com.chy.smdc.service.impl;

import com.chy.smdc.bean.SellerInfo;
import com.chy.smdc.bean.SellerPreferential;
import com.chy.smdc.dao.SellerPreferentialDao;
import com.chy.smdc.service.SellerInfoService;
import com.chy.smdc.service.SellerPreferentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SellerPreferentialServiceImpl implements SellerPreferentialService {

    @Autowired
    SellerPreferentialDao sellerPreferentialDao;

    @Override
    public List<SellerPreferential> findOne(int id) {
         return sellerPreferentialDao.findBySellerId(id);
    }
}
