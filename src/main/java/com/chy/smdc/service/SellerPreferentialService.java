package com.chy.smdc.service;

import com.chy.smdc.bean.SellerPreferential;

import java.util.List;

public interface SellerPreferentialService {
    List<SellerPreferential> findOne(int id);
}
