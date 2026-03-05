package com.dcl.dependent;

import org.springframework.stereotype.Component;

@Component
public class BSNL implements ISim {

	public BSNL() {
		System.out.println("BSNL constructor");
	}

	@Override
	public boolean activate() {
		System.out.println("BSNL sim activated");
		return true;
	}

}
