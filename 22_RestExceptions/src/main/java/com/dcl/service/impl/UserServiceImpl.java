package com.dcl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.dcl.entity.User;
import com.dcl.exception.UserException;
import com.dcl.mapper.UserMapper;
import com.dcl.repo.UserRepo;
import com.dcl.request.UserRequest;
import com.dcl.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper umapper;
	
	@Autowired
	private UserRepo urepo;
	
	@Override
	public User saveUser(UserRequest request) {
		return urepo.save(umapper.toEntity(request));
	}

	@Override
	public User getUserById(Integer userId) {
		
		return urepo.findById(userId).orElse(null);
	}

	@Override
	public List<User> getAllUser() {
		
		return urepo.findAll();
	}

}
