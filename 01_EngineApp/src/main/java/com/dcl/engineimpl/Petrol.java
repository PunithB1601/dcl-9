package com.dcl.engineimpl;

import com.dcl.engine.IEngine;

public class Petrol implements IEngine {

	public Petrol() {
		System.out.println("Petrol Constructor");
	}
	
	@Override
	public boolean start() {
		System.out.println("Petrol engine started");
		return true;
	}

}
