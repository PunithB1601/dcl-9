package com.dcl.service;

import com.dcl.request.TicketRequest;
import com.dcl.response.TicketResponse;

public interface TicketService {

	TicketResponse bookTicket(TicketRequest request);
	
	TicketResponse getTicket(Integer ticketId);
}
