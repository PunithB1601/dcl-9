package com.dcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcl.request.PassengerRequest;
import com.dcl.response.TicketResponse;
import com.dcl.service.PassengerService;

@RestController
@RequestMapping("/mmt")
public class PassengerController {
	
	@Autowired
	private PassengerService pservice;

	@PostMapping("/book")
	public ResponseEntity<?> bookTicket(@RequestBody PassengerRequest request){
		TicketResponse response=pservice.bookTicket(request);
		return ResponseEntity.ok(response);
	}
	
	
	@GetMapping("/get/{ticketId}")
	public ResponseEntity<?> getTicket(@PathVariable Integer ticketId){
		TicketResponse response=pservice.getTicket(ticketId);
		return ResponseEntity.ok(response);
	}
	
}
