package com.dcl.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ticketId;
	
	private Integer passengerId;
	
	private String passengerName;
	
	private String source;
	
	private String destination;
	
	private String trainNum;
	
	private String status;
	
	private Double amount;
	
	private LocalDate journeyDate;
	
	

}
