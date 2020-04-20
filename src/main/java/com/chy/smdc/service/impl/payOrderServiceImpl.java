package com.chy.smdc.service.impl;

import com.chy.smdc.DTO.OrderDetailDTO;
import com.chy.smdc.bean.OrderDetail;
import com.chy.smdc.dao.OrderDetailDao;
import com.chy.smdc.service.payOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class payOrderServiceImpl implements payOrderService {
    @Autowired
    OrderDetailDao orderDetailDao;


    @Override
    public String OrderNum() {
        SimpleDateFormat time = new SimpleDateFormat("yyyyMMddHHmmss");
        String format = time.format(new Date());
        return format;
    }

    @Override
    public void saveOrderDetailData(List<OrderDetailDTO> orderDetailDTOS, String OrderNum) {
        for (OrderDetailDTO i: orderDetailDTOS) {
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setOrderId(OrderNum);
            orderDetail.setProductIcon(i.getIcon());
            orderDetail.setProductName(i.getName());
            orderDetail.setProductPrice(new BigDecimal(i.getPrice()));
            orderDetail.setProductQuantity(i.getCount());
            orderDetail.setProductId(i.getId());
            orderDetailDao.save(orderDetail);
        }
    }
}
