package com.chy.smdc.dao;

import com.chy.smdc.bean.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface alipayDao extends JpaRepository<OrderDetail,String> {

}
