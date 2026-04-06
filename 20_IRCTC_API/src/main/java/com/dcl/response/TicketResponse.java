package com.dcl.response;

import java.time.LocalDate;

import lombok.Data;

@Data 
public class TicketResponse {

	private Integer passengerId;
	
	private String passengerName;
	
	private String from;
	
	private String to;
	
	private String trainNum;
	
	private LocalDate journeyDate;
	
	private Double amount;
	
	private Integer ticketId;
	
	private String status;
}
