package com.dcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	
	@GetMapping("/demo")
	public String displayMessage() {
		return "Welcome to the world of SpringBoot";
	}
}
