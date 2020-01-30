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


    public ProductCategory() {
    }


    public ProductCategory(String categoryName, int categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                '}';
    }
}
