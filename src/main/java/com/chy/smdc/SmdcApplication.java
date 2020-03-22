package com.chy.smdc;

import com.chy.smdc.bean.alipay;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({alipay.class})
@SpringBootApplication
public class SmdcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmdcApplication.class, args);
    }

}
