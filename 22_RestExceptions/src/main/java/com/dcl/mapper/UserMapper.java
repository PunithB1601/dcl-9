package com.dcl.mapper;

import com.dcl.entity.User;
import com.dcl.request.UserRequest;

public class UserMapper {

	public User toEntity(UserRequest request)
	{
		User u=new User();
		u.setUserId(request.getUserId());
		u.setUserName(request.getUserName());
		u.setUserMail(request.getUserMail());
		return u;
	}
	
	public UserRequest toDto(User u){
		UserRequest request=new UserRequest();
		request.setUserId(u.getUserId());
		request.setUserName(u.getUserName());
		request.setUserMail(u.getUserMail());
		return request;
		
	}

}
