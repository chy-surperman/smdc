package com.chy.smdc.bean;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@DynamicUpdate
public class SellerPreferential {
    @Id
    private  Integer sellerPreferentialtype;
    private String sellerPreferentialdescription;
    private int sellerId;

}
