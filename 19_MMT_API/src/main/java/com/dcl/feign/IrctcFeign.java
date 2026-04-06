package com.dcl.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dcl.request.TicketRequest;
import com.dcl.response.TicketResponse;

@FeignClient(name = "irctc-api", url = "http://localhost:8085/irctc")
public interface IrctcFeign {

	@PostMapping("/book")
	TicketResponse bookTicket(@RequestBody TicketRequest request);
	
	@GetMapping("/get/{ticketId}")
	TicketResponse getTicket(@PathVariable Integer ticketId);

}
