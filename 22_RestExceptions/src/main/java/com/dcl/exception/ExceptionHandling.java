package com.dcl.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dcl.response.ApiResponse;

@RestControllerAdvice
public class ExceptionHandling {

	@ExceptionHandler(value = UserException.class)
	public ResponseEntity<?> getUserException(UserException e) {
		
		Map<String, Object> errorResponse=new HashMap<>();
		errorResponse.put("status", "failure");
		errorResponse.put("type", "UserException");
		errorResponse.put("error", e.getMessage());
		errorResponse.put("LocalDateTime", LocalDateTime.now());
	
		
		return new ResponseEntity<>(errorResponse,e.getHttpStatus());
	}
}
