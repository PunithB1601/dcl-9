package com.dcl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.entity.Product;
import com.dcl.repo.ProductRepo;
import com.dcl.request.ProductSaveRequest;
import com.dcl.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo prepo;
	
	@Override
	public Product saveProduct(ProductSaveRequest request) {
		Product p=new Product();  //entity obj creation
		p.setPName(request.getName());
		p.setPrice(request.getPrice());
		return prepo.save(p);
	}

	@Override
	public Product getProduct(Integer productId) {
		return prepo.findById(productId).orElse(null);
	}

	@Override
	public List<Product> getAllProduct() {
		return prepo.findAll();
	}

	@Override
	public Product updateProduct(Integer productId,ProductSaveRequest update) {
		Product p=new Product();
		p.setProductId(productId);
		p.setPName(update.getName());
		p.setPrice(update.getPrice());
		return prepo.save(p);
	}

	@Override
	public void deleteProduct(Integer productId) {
		prepo.deleteById(productId);	
	}
	
	

}
