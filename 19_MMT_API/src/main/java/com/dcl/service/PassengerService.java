package com.dcl.service;

import com.dcl.request.PassengerRequest;
import com.dcl.response.TicketResponse;

public interface PassengerService {

	TicketResponse bookTicket(PassengerRequest request);
	
	TicketResponse getTicket(Integer ticketId);
	
}
