package com.dcl.dependent;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("diesel")
@Primary
public class Diesel implements IEngine {

	public Diesel() {
		System.out.println("Diesel Constructor");
	}

	@Override
	public boolean start() {
		System.out.println("Diesel engine started");
		return true;
	}

}
