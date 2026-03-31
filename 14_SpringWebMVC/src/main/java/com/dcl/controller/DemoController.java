package com.dcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@GetMapping("/welcome")
	public String welcome(@RequestParam("s") String name) {
		return name+", Welcome to the world of SpringBoot";
	}
	
	@GetMapping("/shreyas/{name}/dcl/sagar")
	public String demo(@PathVariable String name) {
		return name+", Thank you";
	}
	
}
