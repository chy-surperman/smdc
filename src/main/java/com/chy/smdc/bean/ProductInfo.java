package com.chy.smdc.bean;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@DynamicUpdate
public class ProductInfo {
    @Id
    private String productId;

    private String productName;
    private BigDecimal productPrice;
    private Integer productStore;
    private Integer productStatus;
    private Integer productSellcount;
    private BigDecimal productOldprice;
    private Integer productRating;
    private String productInformation;
    private String productIcon;
    private String productImage;
    private String productDescription;
    private Integer categoryType;


}
