package com.dcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dcl.repo.TicketRepo;
import com.dcl.request.TicketRequest;
import com.dcl.response.TicketResponse;
import com.dcl.service.TicketService;

@RestController
@RequestMapping("/irctc")
public class TicketController {

	
	@Autowired
	private TicketService tservice;


	@PostMapping("/book")
	public ResponseEntity<?> bookTicket(@RequestBody TicketRequest request){
		TicketResponse response=tservice.bookTicket(request);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/get/{ticketId}")
	public ResponseEntity<?> getTicket(@PathVariable Integer ticketId){
		TicketResponse response=tservice.getTicket(ticketId);
	  //return new ResponseEntity<TicketResponse>(response, HttpStatus.OK);
		return ResponseEntity.ok(response);
	}
	
}
