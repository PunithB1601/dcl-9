package com.dcl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dcl.mapper.UserMapper;

@Configuration
public class UserConfig {

	@Bean
	UserMapper createMapper(){
		UserMapper um=new UserMapper();
		return um;
	}
	
}
