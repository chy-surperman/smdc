package com.chy.smdc.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductInfoResult {
    @JsonProperty("id")
    private  String productId;
    @JsonProperty("name")
    private  String productName;
    @JsonProperty("price")
    private BigDecimal productPrice;
    @JsonProperty("description")
    private  String productDescription;
    @JsonProperty("icon")
    private  String productIcon;
    @JsonProperty("sellCount")
    private Integer productSellcount;
    @JsonProperty("oldPrice")
    private BigDecimal productOldprice;
    @JsonProperty("rating")
    private Integer productRating;
    @JsonProperty("info")
    private String productInformation;
    @JsonProperty("image")
    private String productImage;


}
