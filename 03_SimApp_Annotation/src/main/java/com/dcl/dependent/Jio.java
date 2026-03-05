package com.dcl.dependent;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements ISim {

	public Jio() {
		System.out.println("Jio constructor");
	}

	@Override
	public boolean activate() {
		System.out.println("Jio sim activated");
		return true;
	}

}
