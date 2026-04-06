package com.dcl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.entity.Passenger;
import com.dcl.feign.IrctcFeign;
import com.dcl.repo.PassengerRepo;
import com.dcl.request.PassengerRequest;
import com.dcl.request.TicketRequest;
import com.dcl.response.TicketResponse;
import com.dcl.service.PassengerService;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerRepo prepo;
	
	@Autowired
	private IrctcFeign ifeign;

	@Override
	public TicketResponse bookTicket(PassengerRequest request) {
		
		Passenger p=new Passenger(); 
		p.setPassengerName(request.getPassengerName());
		p.setPhone(request.getPhone());
		p.setMail(request.getMail());
		p=prepo.save(p);
		
		TicketRequest ticket=new TicketRequest();
		ticket.setPassengerId(p.getPassengerId());
		ticket.setPassengerName(p.getPassengerName());
		ticket.setFrom(request.getFrom());
		ticket.setTo(request.getTo());
		ticket.setJourneyDate(request.getJourneyDate());
		ticket.setTrainNum(request.getTrainNum());
		ticket.setAmount(request.getAmount());
		
		return ifeign.bookTicket(ticket);
	}

	@Override
	public TicketResponse getTicket(Integer ticketId) {
		return ifeign.getTicket(ticketId);
	}

}
