package com.dcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dcl.entity.Product;
import com.dcl.enums.Category;
import com.dcl.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService pservice;
	
	@GetMapping("/add")
	public String index(Model m) {
		m.addAttribute("product",new Product());
		m.addAttribute("category", Category.values());
		return "addProduct";
	}
	
	@PostMapping("/save")
	public String addProduct(@ModelAttribute Product product,Model m) {
		pservice.createProduct(product);
		m.addAttribute("success","Product added");
		return "addProduct";
	}
	
	@GetMapping("/view")
	public String viewProduct(@RequestParam(required = false) Category c, Model m) {
	    
	    List<Product> products;

	    if (c == null || c.equals("ALL")) {
	        products = pservice.getAllProduct();
	    } else {
	        products = pservice.getProductByCategory(c);
	    }


	    m.addAttribute("products", products);
	    m.addAttribute("categories", Category.values()); 

	    return "viewProduct";
	}
	
}
