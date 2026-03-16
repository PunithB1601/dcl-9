package com.dcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.dcl.entity.Employee;
import com.dcl.iservice.EmployeeService;


@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService eservice;

	@GetMapping("/register")
	public String register(Model m) { //{the map where the data has to be returned}
		m.addAttribute("employee",new Employee());
		return "register"; //return to register.html {view-name}
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute Employee e, Model m) {
		e=eservice.register(e);
		m.addAttribute("success","Employee - "+e.getEid()+" added successfully!");
		return "register";
	}
	
	
}
