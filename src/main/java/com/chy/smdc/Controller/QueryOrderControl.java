package com.chy.smdc.Controller;

import com.chy.smdc.bean.OrderDetail;
import com.chy.smdc.service.impl.OrderDetailServiceImpl;
import com.chy.smdc.util.Result;
import com.chy.smdc.util.messageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/order")
public class QueryOrderControl {

    @Autowired
    OrderDetailServiceImpl orderDetailService;

    @RequestMapping("/queryorder")
    public String queryordertoIndex() {
        return "order/queryorder";
    }

    @RequestMapping("/queryorderdetail")
    @ResponseBody
    public Result queryorderdetail(){
        List<OrderDetail> all = orderDetailService.findAll();
        return messageResult.houtaisuccess(all);
    }


    @RequestMapping("/queryorderstatus")
    public String queryordertoindex() {
        return "order/queryOrderStatus";
    }
}
