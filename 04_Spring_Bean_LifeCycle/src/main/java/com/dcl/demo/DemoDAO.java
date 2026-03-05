package com.dcl.demo;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class DemoDAO{

	@PostConstruct //init
	public void m1() {
		System.out.println("Connection established");
	}
	
	@PreDestroy //destroy
	public void m2() {
		System.out.println("Connection closed");
	}
	
	public void dbLogic() {
		System.out.println("DB logic performed");
	}

	
	
}
