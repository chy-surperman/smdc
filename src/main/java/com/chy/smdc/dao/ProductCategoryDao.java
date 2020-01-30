package com.chy.smdc.dao;

import com.chy.smdc.bean.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer> {

}
