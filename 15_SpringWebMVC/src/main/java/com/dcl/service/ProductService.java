package com.dcl.service;

import java.util.List;

import com.dcl.entity.Product;
import com.dcl.enums.Category;

public interface ProductService {

	Product createProduct(Product p);
	
	Product updateProduct(Product p);
	
	void deleteProduct(Integer productId);
	
	Product getProduct(Integer productId);
	
	List<Product> getAllProduct();
	
	List<Product> getProductByCategory(Category category);
	
}
