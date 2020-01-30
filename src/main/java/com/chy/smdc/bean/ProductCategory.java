package com.chy.smdc.bean;

import org.hibernate.annotations.DynamicUpdate;
import org.omg.CORBA.PRIVATE_MEMBER;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_category")
@DynamicUpdate
public class ProductCategory {
    @Id
    @GeneratedValue
    private int CategoryId;
    private String CategoryName;
    private int CategoryType;

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public int getCategoryType() {
        return CategoryType;
    }

    public void setCategoryType(int categoryType) {
        CategoryType = categoryType;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "CategoryId=" + CategoryId +
                ", CategoryName='" + CategoryName + '\'' +
                ", CategoryType=" + CategoryType +
                '}';
    }
}
