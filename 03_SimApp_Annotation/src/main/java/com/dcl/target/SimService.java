package com.dcl.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dcl.dependent.ISim;

@Service
public class SimService {

	
	private ISim sim;
	
	public SimService() {
		System.out.println("0-param-constructor");
	}
	
	
	public void setSim(ISim sim) {
		this.sim=sim;
		System.out.println("setter called");
	}
	
	@Autowired
	public SimService(ISim sim) {
		this.sim=sim;
		System.out.println("Param");
	}

	public void call() {
		boolean status=sim.activate();
		if(status) {
			System.out.println("Calling....");
		}
		else {
			System.out.println("Network issue");
		}
	}
}
