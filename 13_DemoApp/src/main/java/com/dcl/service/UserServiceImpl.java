package com.dcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.entity.User;
import com.dcl.iservice.UserService;
import com.dcl.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo urepo;

	@Override
	public User createUser(User u) {
		return urepo.save(u);
	}

	@Override
	public User getUser(Integer userId) {
		return urepo.findById(userId).orElse(null);
	}

}
