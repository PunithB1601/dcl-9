package com.dcl.engineimpl;

import com.dcl.engine.IEngine;

public class Diesel implements IEngine {

	public Diesel() {
		System.out.println("Diesel constructor");
	}
	
	@Override
	public boolean start() {
		System.out.println("Diesel engine started");
		return true;
	}

}
