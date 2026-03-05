package com.dcl.request;

import lombok.Data;

@Data
public class CreateUserRequest {

	private Integer id;
	private String name;
	private String email;

}
