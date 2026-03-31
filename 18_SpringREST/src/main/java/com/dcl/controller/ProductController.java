package com.dcl.controller;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcl.entity.Product;
import com.dcl.request.ProductSaveRequest;
import com.dcl.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService pservice;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveProduct(@RequestBody ProductSaveRequest request) {
		Product p=pservice.saveProduct(request);
		return new ResponseEntity<Product>(p, HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{productId}")
	public ResponseEntity<?> getProductById(@PathVariable Integer productId){
		Product p=pservice.getProduct(productId);
		if(p!=null) {
			return new ResponseEntity<Product>(p,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Product not available!",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> getAllProduct(){
		List<Product> products=pservice.getAllProduct();
		if(products!=null&&!products.isEmpty()) {
			return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No Products available!",HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/update/{productId}")
	public ResponseEntity<?> updateProduct(@PathVariable Integer productId,@RequestBody ProductSaveRequest update){
		Product p=pservice.getProduct(productId);
		if(p!=null) {
			
			p=pservice.updateProduct(productId, update);
			return new ResponseEntity<Product>(p,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Somethinh went wrong!",HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/delete/{productId}")
	public ResponseEntity<?> deleteProduct(@PathVariable Integer productId){
		pservice.deleteProduct(productId);
		return new ResponseEntity<String>("Product deleted successfully",HttpStatus.OK);
	}
	
	
	
	
}
