package com.chy.smdc.bean;

import lombok.Data;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "application")
public class alipay {

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

    public alipay() {
    }
}
