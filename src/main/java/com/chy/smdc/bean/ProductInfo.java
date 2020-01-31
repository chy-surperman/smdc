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
    private String productIcon;
    private String productDescription;
    private Integer categoryType;
    private Integer productStatus;
    private Integer productStore;
}
