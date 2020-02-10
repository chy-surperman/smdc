package com.chy.smdc.bean;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@DynamicUpdate
public class SellerInfo {

    @Id
    private Integer sellerId;

    private String  sellerName;
    private String  sellerDescription;
    private String  sellerBulletin;
    private String  sellerAvatar;
}
