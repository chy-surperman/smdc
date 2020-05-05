package com.chy.smdc.Controller;

import com.chy.smdc.bean.OrderMaster;
import com.chy.smdc.service.impl.OrderMasterServiceImpl;
import com.chy.smdc.util.OrderMaterResult;
import com.chy.smdc.util.Result;
import com.chy.smdc.util.messageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ordermaster")
public class QueryOrderMasterController {
    @Autowired
    OrderMasterServiceImpl orderMasterServiceimpl;

    @RequestMapping("queryordermaster")
    public String QueryOrderMasterToIndex(){
        return "order/queryordermaster";
    }

    @RequestMapping("queryordermasterall")
    @ResponseBody
    public Result queryordermasterall(){

        List<OrderMaster> all = orderMasterServiceimpl.findAll();
        ArrayList<OrderMaterResult> OrderMasteralls = new ArrayList<>();

        for (OrderMaster alls:all) {
            OrderMaterResult orderMaterResult = new OrderMaterResult();
            orderMaterResult.setOrderId(alls.getOrderId());
            orderMaterResult.setBuyerName(alls.getBuyerName());
            orderMaterResult.setBuyerPhone(alls.getBuyerPhone());
            orderMaterResult.setOrderAmount(alls.getOrderAmount());
            orderMaterResult.setBuyerAddress(alls.getBuyerAddress());
            orderMaterResult.setPayStatus(alls.getPayStatus().equals(0) ? "未支付":"已支付");
            OrderMasteralls.add(orderMaterResult);
        }
        return messageResult.houtaisuccess(OrderMasteralls);
    }



}
