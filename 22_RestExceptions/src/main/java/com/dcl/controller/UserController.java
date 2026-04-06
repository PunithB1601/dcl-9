package com.dcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dcl.Application;
import com.dcl.entity.User;
import com.dcl.exception.UserException;
import com.dcl.request.UserRequest;
import com.dcl.response.ApiResponse;
import com.dcl.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService uservice;

	@PostMapping("/save")
	public ResponseEntity<?> saveUser(@RequestBody UserRequest request){
		User u=uservice.saveUser(request);
		if(u==null) {
			throw new UserException("Saved data not available at the moment!",HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok(u);
	}
	
	@GetMapping("/get/{userId}")
	public ResponseEntity<?> getUserById(@PathVariable Integer userId){
		User u=uservice.getUserById(userId);
		if(u==null) {
			throw new UserException("User not found!",HttpStatus.NOT_FOUND);
		}
		return ResponseEntity.ok(u);
	}
	
	
	@GetMapping("/get")
	public ResponseEntity<?> getAllUser(){
		List<User> users=uservice.getAllUser();
		if(users==null||users.isEmpty()) {
			throw new UserException("User not Found!",HttpStatus.NOT_FOUND);
		}
		return ResponseEntity.ok(users);
	}
	
	
	

}
