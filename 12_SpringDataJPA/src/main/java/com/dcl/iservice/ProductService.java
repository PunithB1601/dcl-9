package com.dcl.iservice;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import com.dcl.entity.Product;

public interface ProductService {

	Product saveProduct(Product p);
	
	List<Product> getAllProduct();
	
	Product getProductById(Integer productId);
	
	List<Product> getAllProduct(String colName,String orderFormat);
	
	List<Product> getAllProduct(Integer sizePerPage,Integer pageNum);
	
}
