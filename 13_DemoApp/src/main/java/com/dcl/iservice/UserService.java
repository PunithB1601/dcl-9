package com.dcl.iservice;

import com.dcl.entity.User;

public interface UserService {

	public User createUser(User u);
	
	public User getUser(Integer userId);
}
