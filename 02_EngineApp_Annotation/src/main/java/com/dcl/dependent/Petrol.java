package com.dcl.dependent;

import org.springframework.stereotype.Component;

@Component("petrol")
public class Petrol implements IEngine {

	public Petrol() {
		System.out.println("Petrol constructor");
	}
	@Override
	public boolean start() {
		System.out.println("Petrol engine started");
		return true;
	}

}
