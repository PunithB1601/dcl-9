package com.dcl.entity;

import com.dcl.enums.Category;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	
	private String pName;
	
	@Enumerated(EnumType.STRING)
	private Category category;
	
	private String brand;
	
	private Double price;
	
	private String imgUrl;
	
}
