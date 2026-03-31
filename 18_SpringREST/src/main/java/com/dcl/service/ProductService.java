package com.dcl.service;

import java.util.List;

import com.dcl.entity.Product;
import com.dcl.request.ProductSaveRequest;

public interface ProductService {

	Product saveProduct(ProductSaveRequest request);
	
	Product getProduct(Integer productId);
	
	List<Product> getAllProduct();
	
	Product updateProduct(Integer productId,ProductSaveRequest request);
	
	void deleteProduct(Integer productId);
}
