package com.dcl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	private Integer productId;
	
	private String pName;
	
	private String pBrand;
	
	private Double price;

}
