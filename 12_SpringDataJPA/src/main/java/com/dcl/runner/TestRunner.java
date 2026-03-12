package com.dcl.runner;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

import com.dcl.entity.Product;
import com.dcl.iservice.ProductService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private ProductService pservice;
	
	@Override
	public void run(String... args) throws Exception {
		//Scanner sc=new Scanner(System.in);
		
		/*
		 * System.out.println("Enter the col-name"); String colName=sc.next();
		 * System.out.println("Enter the order-format:"); String format=sc.next();
		 * pservice.getAllProduct(colName, format).forEach(System.out::println);
		 */
		
		/*
		 * System.out.println("Enter the Page number"); Integer pageNum=sc.nextInt();
		 * System.out.println("Enter the data per page:"); Integer
		 * sizePerPage=sc.nextInt(); pservice.getAllProduct(sizePerPage,
		 * pageNum).forEach(System.out::println);
		 */
		//pservice.getAllProduct().forEach(System.out::println);
		
		Product p=new Product();
		p.setPName("Shoes");
		p.setPBrand("Puma");
		p.setPrice(1000.0);
		pservice.saveProduct(p);
		
	
	}

}
