package com.chy.smdc.bean;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@DynamicUpdate
@DynamicInsert
public class ProductInfo {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "product_id")
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
