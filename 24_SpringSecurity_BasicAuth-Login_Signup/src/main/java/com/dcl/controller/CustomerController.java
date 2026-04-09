package com.dcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dcl.entity.Customer;
import com.dcl.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService cservice;
	
	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncode;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveCustomer(@RequestBody Customer c){
		Customer savedCustomer=cservice.saveCustomer(c);
		if(savedCustomer==null) {
			return new ResponseEntity<>("Failure",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else {
			return new ResponseEntity<>("Success",HttpStatus.OK);
		}
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Customer c){
		
		UsernamePasswordAuthenticationToken token=new UsernamePasswordAuthenticationToken(c.getMailId(),c.getPassword());
		Authentication auth=authManager.authenticate(token);
		boolean status=auth.isAuthenticated();
		
		if(status) {
			return new ResponseEntity<>("Login success",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Failed to login",HttpStatus.BAD_REQUEST);
		}
	}
	
}
