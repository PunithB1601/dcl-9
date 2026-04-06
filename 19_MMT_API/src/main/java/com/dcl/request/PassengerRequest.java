package com.dcl.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PassengerRequest {  // to collect data from passenger

	private String passengerName;
	
	private Long phone;
	
	private String mail;
	
	private String from;
	
	private String to;
	
	private String trainNum;
	
	private LocalDate journeyDate;
	
	private Double amount;

}
