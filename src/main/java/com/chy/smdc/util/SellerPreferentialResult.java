package com.chy.smdc.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SellerPreferentialResult {
    @JsonProperty("type")
    private  Integer sellerPreferentialtype;
    @JsonProperty("description")
    private String sellerPreferentialdescription;
}
