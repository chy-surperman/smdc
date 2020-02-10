package com.chy.smdc.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class SellerInfoResult {

   @JsonProperty("id")
    private Integer sellerId;
    @JsonProperty("name")
    private String  sellerName;
    @JsonProperty("description")
    private String  sellerDescription;
    @JsonProperty("bulletin")
    private String  sellerBulletin;
    @JsonProperty("avatar")
    private String  sellerAvatar;

    @JsonProperty("supports")
    private List<SellerPreferentialResult> sellerPreferentialResultList;
}
