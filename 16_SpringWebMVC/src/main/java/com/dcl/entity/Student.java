package com.dcl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Student {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	
	private String name;
	
	private String branch;
	
}
