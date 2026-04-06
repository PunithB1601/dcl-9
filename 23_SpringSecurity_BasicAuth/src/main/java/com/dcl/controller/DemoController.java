package com.dcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/welcome")
	public String welcome() {                        //private
		return "Welcome to Spring classes";   
	}
	
	@GetMapping("/thank")
	public String thank() {                          //private
		return "Thank you";
	}

	@GetMapping("/dhee")
	public String dcl() {
		return "Dhee Coding Lab";                   //public 
	}
}
