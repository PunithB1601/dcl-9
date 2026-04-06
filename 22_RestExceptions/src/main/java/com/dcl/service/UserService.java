package com.dcl.service;

import java.util.List;

import com.dcl.entity.User;
import com.dcl.request.UserRequest;

public interface UserService {

	User saveUser(UserRequest request);
	
	User getUserById(Integer userId);
	
	List<User> getAllUser();
		
}
