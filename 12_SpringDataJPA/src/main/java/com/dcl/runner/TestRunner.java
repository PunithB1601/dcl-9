package com.dcl.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.dcl.entity.Product;
import com.dcl.iservice.ProductService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private ProductService pservice;
	
	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the col-name");
		String colName=sc.next();
		System.out.println("Enter the order-format:");
		String format=sc.next();
		pservice.getAllProduct(colName, format).forEach(System.out::println);
	
	}

}
