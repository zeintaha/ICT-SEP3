package sep.via.dk.sep3JPA.service.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sep.via.dk.sep3JPA.dao.ticket.TicketDAO;
import sep.via.dk.sep3JPA.domain.Ticket;

@Service
public class TicketServiceImplementation implements TicketService {
	@Autowired
	private TicketDAO ownerDAO;

	@Override
	public void addTicket(Ticket ticket) {
		ownerDAO.addTicket(ticket);

	}

}
