package sep.via.dk.sep3JPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sep.via.dk.sep3JPA.domain.Ticket;
import sep.via.dk.sep3JPA.service.ticket.TicketService;

@RestController
@RequestMapping("/sep3")
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@PostMapping("/ticket")
	public ResponseEntity<Void> addTicket(@RequestBody Ticket ticket) {
		ticketService.addTicket(ticket);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);

	}

}
