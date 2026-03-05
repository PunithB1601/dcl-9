package com.dcl.java;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Petrol implements Engine {

	public Petrol() {
		System.out.println("Petrol constructor");
	}

	@Override
	public boolean start() {
		System.out.println("Petrol engine started");
		return true;
	}

}
