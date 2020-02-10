package com.chy.smdc.dao;

import com.chy.smdc.bean.ProductInfo;
import com.chy.smdc.bean.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SellerInfoDao extends JpaRepository<SellerInfo,Integer> {
    SellerInfo findBySellerId(int id);
}
