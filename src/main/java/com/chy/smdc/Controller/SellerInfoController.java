package com.chy.smdc.Controller;

import com.chy.smdc.bean.SellerInfo;
import com.chy.smdc.bean.SellerPreferential;
import com.chy.smdc.service.impl.SellerInfoServiceImpl;
import com.chy.smdc.service.impl.SellerPreferentialServiceImpl;
import com.chy.smdc.util.Result;
import com.chy.smdc.util.SellerInfoResult;
import com.chy.smdc.util.SellerPreferentialResult;
import com.chy.smdc.util.messageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/seller/info",method = RequestMethod.GET)
public class SellerInfoController {

    @Autowired
    SellerPreferentialServiceImpl sellerPreferentialService;

    @Autowired
    SellerInfoServiceImpl sellerInfoService;
    @GetMapping("/list")
    @ResponseBody
    public Result list(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        SellerInfo one = sellerInfoService.findOne(1);
        List<SellerPreferential> SellerPreferentialone = sellerPreferentialService.findOne(one.getSellerId());
        List<SellerPreferentialResult> list = new ArrayList<>();
        for (SellerPreferential SellerPreferentialearch:SellerPreferentialone) {
            SellerPreferentialResult sellerPreferentialResult = new SellerPreferentialResult();
            sellerPreferentialResult.setSellerPreferentialdescription(SellerPreferentialearch.getSellerPreferentialdescription());
            sellerPreferentialResult.setSellerPreferentialtype(SellerPreferentialearch.getSellerPreferentialtype());
            list.add(sellerPreferentialResult);
        }
        SellerInfoResult sellerInfoResult = new SellerInfoResult();
        sellerInfoResult.setSellerId(one.getSellerId());
        sellerInfoResult.setSellerName(one.getSellerName());
        sellerInfoResult.setSellerDescription(one.getSellerDescription());
        sellerInfoResult.setSellerBulletin(one.getSellerBulletin());
        sellerInfoResult.setSellerAvatar(one.getSellerAvatar());
        sellerInfoResult.setSellerPreferentialResultList(list);
        sellerInfoResult.setSellerMinprice(one.getSellerMinprice());
        return messageResult.success(sellerInfoResult);
    }
    @RequestMapping("/basic")
    public String userList() {
        return "/seller/sellerInfo";
    }

    @RequestMapping("/listTable")
    @ResponseBody
    public Result listTable(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        SellerInfo one = sellerInfoService.findOne(1);
        List<SellerPreferential> SellerPreferentialone = sellerPreferentialService.findOne(one.getSellerId());
        List list = new ArrayList<>();
        SellerInfoResult sellerInfoResult = new SellerInfoResult();
        sellerInfoResult.setSellerId(one.getSellerId());
        sellerInfoResult.setSellerName(one.getSellerName());
        sellerInfoResult.setSellerDescription(one.getSellerDescription());
        sellerInfoResult.setSellerBulletin(one.getSellerBulletin());
        sellerInfoResult.setSellerAvatar(one.getSellerAvatar());
        sellerInfoResult.setSellerMinprice(one.getSellerMinprice());
        list.add(sellerInfoResult);
        return messageResult.houtaisuccess(list);
    }

}
