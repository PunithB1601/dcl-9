package com.dcl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dcl.config.AppConfig;
import com.dcl.target.Car;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
				context.getBean(Car.class).move(); 
				 
	}

}
