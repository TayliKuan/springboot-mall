package com.tayli.springbootmall.dao;

import com.tayli.springbootmall.model.Product;

public interface ProductDao {

	Product getProductById(Integer productId);
}
