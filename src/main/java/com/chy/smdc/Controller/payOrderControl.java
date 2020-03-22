package com.chy.smdc.Controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.alipay.api.response.AlipayTradeWapPayResponse;
import com.chy.smdc.bean.alipay;
import com.chy.smdc.util.Result;
import com.chy.smdc.util.messageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/buyer/orderpay", method = RequestMethod.GET)
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
    public static String format ;
    // 支付宝公钥
    @Value("${application.publickey}")
    private String publickey ;
    // 日志记录目录
    @Value("${application.log_path}")
    private String log_path ;
    // RSA2
    @Value("${application.signtype}")
    public static String signtype ;


    @GetMapping("/pay")
    public Result payOrderMeth(String price, String place, String name, String iphone, HttpServletResponse response) throws AlipayApiException, IOException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        System.out.println(place + "共计花费" + price + "-" + name + "-" + iphone);
        AlipayClient client = new DefaultAlipayClient(url,appid, privatekey, format, charset, publickey, signtype);
        AlipayTradeWapPayRequest alipay_request=new AlipayTradeWapPayRequest();
        // 封装请求支付信息
        AlipayTradeWapPayModel model=new AlipayTradeWapPayModel();
        model.setBody("我是测试数据");
        model.setSubject("App支付测试Java");
        model.setOutTradeNo("2013033");
        model.setTimeoutExpress("30m");
        model.setTotalAmount("0.01");
        model.setProductCode("QUICK_WAP_WAY");
        alipay_request.setBizModel(model);
        // 设置异步通知地址
        alipay_request.setNotifyUrl(notify_url);
        // 设置同步地址
        alipay_request.setReturnUrl(return_url);
        // form表单生产
        String form = "";
        try {
            // 调用SDK生成表单
            form = client.pageExecute(alipay_request).getBody();
        } catch (AlipayApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//        response.setContentType("text/html;charset=" + charset);
//        response.getWriter().write(form);//直接将完整的表单html输出到页面
//        response.getWriter().flush();
//        response.getWriter().close();

        Map<String,String> map=new HashMap<>();
        map.put("payUrl",form);
        System.out.println(messageResult.success(map));
      return messageResult.success(map);
    }

}
