package com.chy.smdc.bean;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.omg.CORBA.PRIVATE_MEMBER;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "product_category")
@DynamicUpdate
@Data
public class ProductCategory {
    @Id
    @GeneratedValue
    private int categoryId;
    private String categoryName;
    private int categoryType;
    private Date createTime;
    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, int categoryType, Date createTime, Date updateTime) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
