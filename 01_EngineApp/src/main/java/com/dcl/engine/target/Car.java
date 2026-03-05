package com.dcl.engine.target;

import com.dcl.engine.IEngine;

public class Car {

	private IEngine engine;
	
	public Car(IEngine engine) {
		this.engine=engine;
		System.out.println("Car-Param-Constructor");
	}
	
	public Car() {
		System.out.println("Car-0-Param-Constructor");
	}
	
	public void setEngine(IEngine eng){
		this.engine=eng;
		System.out.println("setter called");
	}
	
	public void move() {
		boolean status=engine.start();
		if(status) {
			System.out.println("Car is moving");
		}
		else {
			System.out.println("Failure in engine");
		}
	}
	
	
}
