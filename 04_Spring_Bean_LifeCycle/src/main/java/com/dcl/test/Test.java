package com.dcl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dcl.config.AppConfig;
import com.dcl.demo.DemoDAO;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class); //spring bean object for Demo DAO and init()
		ConfigurableApplicationContext configure = (ConfigurableApplicationContext) context; //
		//ConfigurableApplicationCOntext -extends-> ApplicationCOntext
		configure.getBean(DemoDAO.class).dbLogic();	 //getting DemoDAO spring bean from IoC container
		configure.close(); //explicitly destroying spring bean before JVM terminates
		}
}
