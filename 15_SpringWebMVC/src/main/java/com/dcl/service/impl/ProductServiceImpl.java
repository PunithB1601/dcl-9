package com.dcl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.entity.Product;
import com.dcl.enums.Category;
import com.dcl.repo.ProductRepo;
import com.dcl.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo prepo;
	
	@Override
	public Product createProduct(Product p) {
		return prepo.save(p);
	}

	@Override
	public Product updateProduct(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Integer productId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product getProduct(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		
		return prepo.findAll();
	}

	@Override
	public List<Product> getProductByCategory(Category category) {
		// TODO Auto-generated method stub
		return prepo.findByCategory(category);
	}

}
