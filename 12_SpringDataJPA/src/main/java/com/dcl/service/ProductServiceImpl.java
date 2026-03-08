package com.dcl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dcl.entity.Product;
import com.dcl.iservice.ProductService;
import com.dcl.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository prepo;
	
	@Override
	public Product saveProduct(Product p) {
		return prepo.save(p);
	}

	@Override
	public List<Product> getAllProduct() {
		return prepo.findAll();
	}

	@Override
	public Product getProductById(Integer productId) {
		return prepo.findById(productId).orElse(null);
	}

	@Override
	public List<Product> getAllProduct(String colName,String orderFormat) {
		Sort s = null;
		switch(orderFormat) {
		case "Asc" :
			s=Sort.by(colName).ascending();
		case "Desc":
			s=Sort.by(colName).descending();
		}
		return prepo.findAll(s);
	}

	@Override
	public List<Product> getAllProduct(Integer sizePerPage, Integer pageNum) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
