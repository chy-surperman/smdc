package com.chy.smdc.dao;

import com.chy.smdc.bean.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface OrderMasterDao extends JpaRepository<OrderMaster,String> {
    Page<OrderMaster> findByBuyerPhone(String buyerPhone, Pageable pageable);

    @Transactional
    @Modifying
    @Query("UPDATE OrderMaster SET payStatus=1 WHERE orderId=?1")
    void updatepaystatus(String outtrade);

}
