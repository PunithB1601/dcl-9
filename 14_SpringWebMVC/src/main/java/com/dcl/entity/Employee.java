package com.dcl.entity;

import java.time.LocalDate;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	
	@NotBlank(message = "Name cannot be null!")
	private String name;
	
	@Email(message = "Enter valid email ID!")
	@NotBlank(message = "Mail ID cannot be empty!")
	@Column(unique = true)
	private String mail;
	
	
	@NotBlank(message = "Password cannot be null")
	private String password;
	

	private LocalDate date;
	
}
