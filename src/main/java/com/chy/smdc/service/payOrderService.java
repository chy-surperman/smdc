package com.chy.smdc.service;

import com.chy.smdc.DTO.OrderDetailDTO;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface payOrderService {
    String OrderNum();

    void saveOrderDetailData(List<OrderDetailDTO> orderDetailDTOS,String OrderNum);
}
