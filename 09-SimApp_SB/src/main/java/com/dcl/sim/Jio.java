package com.dcl.sim;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim {

	public Jio() {
		System.out.println("Jio constructor");
	}

	@Override
	public boolean activate() {
		System.out.println("Jio activated");
		return true;
	}

}
