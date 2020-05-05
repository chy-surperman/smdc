package com.chy.smdc.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;

@Data
public class OrderMaterResult {
    /** 订单id. */
    @JsonProperty("orderId")
    private String orderId;

    /** 买家名字. */
    @JsonProperty("buyerName")
    private String buyerName;

    /** 买家手机号. */
    @JsonProperty("buyerPhone")
    private String buyerPhone;

    /** 买家地址. */
    @JsonProperty("buyerAddress")
    private String buyerAddress;


    /** 订单总金额. */
    @JsonProperty("orderAmount")
    private BigDecimal orderAmount;

    /** 订单状态, 默认为0新下单. */
    @JsonProperty("orderStatus")
    private String orderStatus;

    /** 支付状态, 默认为0未支付. */
    @JsonProperty("payStatus")
    private String payStatus;
}
