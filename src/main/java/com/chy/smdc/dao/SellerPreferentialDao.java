package com.chy.smdc.dao;

import com.chy.smdc.bean.SellerInfo;
import com.chy.smdc.bean.SellerPreferential;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SellerPreferentialDao extends JpaRepository<SellerPreferential,Integer> {

    List<SellerPreferential>  findBySellerId(int id);
}
