package com.dcl.exception;


import org.springframework.http.HttpStatus;


import lombok.Data;



public class UserException extends RuntimeException{

	private HttpStatus status;
	
	public UserException(String message,HttpStatus status) {
		super(message);
		this.status=status;
		this.status=status!=null?status:status.INTERNAL_SERVER_ERROR;
	}
	
	public HttpStatus getHttpStatus() {
		return status;
	}

}
