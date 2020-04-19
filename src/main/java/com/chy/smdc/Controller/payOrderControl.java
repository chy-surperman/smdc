package com.chy.smdc.Controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.alipay.api.response.AlipayTradeWapPayResponse;
import com.chy.smdc.bean.alipay;
import com.chy.smdc.service.impl.payOrderServiceImpl;
import com.chy.smdc.util.Result;
import com.chy.smdc.util.messageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/buyer/orderpay")
public class payOrderControl {
    // 商户appid
    @Value("${application.appid}")
    private String appid;
    // 私钥 pkcs8格式的
    @Value("${application.privatekey}")
    private String privatekey ;
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    @Value("${application.notify_url}")
    private String notify_url;
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    @Value("${application.return_url}")
    private String return_url;
    // 请求网关地址
    @Value("${application.url}")
    private String url;
    // 编码
    @Value("${application.charset}")
    private String charset;
    // 返回格式
    @Value("${application.format}")
    public  String format ;
    // 支付宝公钥
    @Value("${application.publickey}")
    private String publickey ;
    // 日志记录目录
    @Value("${application.log_path}")
    private String logpath ;
    // RSA2
    @Value("${application.sign_type}")
    public  String sign_type ;

    @Value("${application.timeout_express}")
    public  String timeout_express ;

    @Value("${application.product_code}")
    public  String product_code ;

    @Autowired
    payOrderServiceImpl payOrderService;

    @GetMapping("/pay")
    public Result payOrderMeth(String price, String place, @RequestParam(value="selectFoods[]") String[] selectFoods, String name, String iphone, HttpServletResponse response) throws AlipayApiException, IOException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        for (String i: selectFoods ) {
            System.out.println(i.toString());
        }
        AlipayClient client = new DefaultAlipayClient(url,appid,privatekey,format,charset,publickey,sign_type);
        AlipayTradeWapPayRequest alipay_request=new AlipayTradeWapPayRequest();
        // 封装请求支付信息
        AlipayTradeWapPayModel model=new AlipayTradeWapPayModel();
        model.setBody("云店扫码自助点餐");
        model.setSubject("云店扫码支付");
        model.setOutTradeNo(payOrderService.OrderNum());
        System.out.println(payOrderService.OrderNum());
        System.out.println(payOrderService.OrderNum());
        model.setTimeoutExpress(timeout_express);
        model.setTotalAmount(price);
        model.setProductCode(product_code);
        alipay_request.setBizModel(model);
        // form表单生产
        String form = "";
        try {
            // 调用SDK生成表单
            form = client.pageExecute(alipay_request).getBody();
        } catch (AlipayApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Map<String,String> map=new HashMap<>();
        map.put("payUrl",form);
      return messageResult.success(map);
    }
}
