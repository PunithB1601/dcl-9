package com.dcl.engine.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dcl.engine.target.Car;

public class EngineTest {

	public static void main(String[] args) {
		
		//starting IOC container
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Car c1=context.getBean(Car.class);
		System.out.println(c1.hashCode());
		Car c2=context.getBean(Car.class);
		System.out.println(c2.hashCode());
		
		c1.move();
	}
}
