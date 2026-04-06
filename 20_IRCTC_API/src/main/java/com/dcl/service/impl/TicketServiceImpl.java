package com.dcl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.entity.Ticket;
import com.dcl.repo.TicketRepo;
import com.dcl.request.TicketRequest;
import com.dcl.response.TicketResponse;
import com.dcl.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
	private TicketRepo trepo;
	
	@Override
	public TicketResponse bookTicket(TicketRequest request) {
		
		Ticket t=new Ticket(); //entity obj
		
		t.setPassengerId(request.getPassengerId());
		t.setPassengerName(request.getPassengerName());
		t.setSource(request.getFrom());
		t.setDestination(request.getTo());
		t.setJourneyDate(request.getJourneyDate());
		t.setTrainNum(request.getTrainNum());
		t.setAmount(request.getAmount());
		t.setStatus("CNFM");
		
		t=trepo.save(t);
		
		TicketResponse response=new TicketResponse();
		response.setTicketId(t.getTicketId());
		response.setPassengerId(t.getPassengerId());
		response.setPassengerName(t.getPassengerName());
		response.setFrom(t.getSource());
		response.setTo(t.getDestination());
		response.setJourneyDate(t.getJourneyDate());
		response.setAmount(t.getAmount());
		response.setTrainNum(t.getTrainNum());
		response.setStatus(t.getStatus());
		
		return response;
	}

	@Override
	public TicketResponse getTicket(Integer ticketId) {

		Ticket t=trepo.findById(ticketId).orElse(null);
	
		TicketResponse response=new TicketResponse();
		response.setTicketId(t.getTicketId());
		response.setPassengerId(t.getPassengerId());
		response.setPassengerName(t.getPassengerName());
		response.setFrom(t.getSource());
		response.setTo(t.getDestination());
		response.setJourneyDate(t.getJourneyDate());
		response.setAmount(t.getAmount());
		response.setTrainNum(t.getTrainNum());
		response.setStatus(t.getStatus());
		
		return response;
	}

	

}
