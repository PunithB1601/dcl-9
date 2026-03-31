package com.dcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dcl.entity.Employee;
import com.dcl.iservice.EmployeeService;

import jakarta.validation.Valid;


@Controller
@RequestMapping("/empapp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService eservice;

	@GetMapping("/register")
	public String register(Model m) { //{the map where the data has to be returned}
		m.addAttribute("employee",new Employee());
		return "register"; //return to register.html {view-name}
	}

	@PostMapping("/save")
	public String saveEmployee(@Validated  @ModelAttribute Employee e,BindingResult result ,Model m) {
		if(result.hasErrors()) {
			return "register";
		}
		
		e=eservice.register(e);
		m.addAttribute("success","Employee - "+e.getEid()+" added successfully!");
		return "register";
	}
	
	@GetMapping("/employees")
	public String getAllEmployees(Model m) {
		List<Employee> empList=eservice.getAllEmployees();
		m.addAttribute("empList",empList);
		return "viewEmployees";
	}
	
	@GetMapping("/getEmp/{eid}")
	public String getOneEmployee(@PathVariable Integer eid, Model m) {
		Employee e=eservice.getById(eid);
		m.addAttribute("emp",e);
		return "update";
	}
	
	@PostMapping("/update")
	public String updateEmployee(@ModelAttribute Employee e, Model m) {
	    eservice.updateEmployee(e);
	    m.addAttribute("success", "Record modified!");
	    return "redirect:/empapp/employees";
	}
	
	@GetMapping("/delete/{eid}")
	public String deleteEmployee(@PathVariable Integer eid, Model m) {
		eservice.deleteEmployee(eid);
		m.addAttribute("success","Employee deleted!");
		return "redirect:/empapp/employees";
	}
}
