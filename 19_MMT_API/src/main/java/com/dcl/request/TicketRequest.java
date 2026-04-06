package com.dcl.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class TicketRequest {

	private Integer passengerId;
	
	private String passengerName;
	
	private String from;
	
	private String to;
	
	private String trainNum;
	
	private LocalDate journeyDate;
	
	private Double amount;

}
