package com.dcl.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Car {

	@Autowired
	private Engine engine;
	
	
	public Car() {
		System.out.println("0-param");
	}
	
	public Car(Engine engine) {
		this.engine=engine;
	}

	public void move() {
		boolean status=engine.start();
		if(status) {
			System.out.println("Car moved");
		}
	}
}
