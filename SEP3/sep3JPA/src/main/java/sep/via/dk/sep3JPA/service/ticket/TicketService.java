package sep.via.dk.sep3JPA.service.ticket;

import java.rmi.RemoteException;

import sep.via.dk.sep3JPA.domain.Ticket;

public interface TicketService {
	boolean addTicket(Ticket ticket);
	public boolean checkPayment();
	
	public String getPaymentLink();

}
