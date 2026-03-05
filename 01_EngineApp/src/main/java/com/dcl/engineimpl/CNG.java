package com.dcl.engineimpl;

import com.dcl.engine.IEngine;

public class CNG implements IEngine {

	public CNG() {
		System.out.println("CNG constructor");
	}
	
	@Override
	public boolean start() {
		System.out.println("CNG engine started");
		return true;
	}

}
