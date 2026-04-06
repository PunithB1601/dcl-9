package com.dcl.response;

import org.springframework.http.HttpStatus;

import com.dcl.entity.User;

import lombok.Data;

@Data
public class ApiResponse<T> {

	private String message;
	
	private HttpStatus status;
	
	private T t;
}
