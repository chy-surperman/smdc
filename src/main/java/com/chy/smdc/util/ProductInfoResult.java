package com.chy.smdc.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductInfoResult {
    @JsonProperty("id")
    private  String productId;
    @JsonProperty("name")
    private  String productName;
    @JsonProperty("price")
    private  String productPrice;
    @JsonProperty("description")
    private  String productDescription;
    @JsonProperty("icon")
    private  String productIcon;

}
