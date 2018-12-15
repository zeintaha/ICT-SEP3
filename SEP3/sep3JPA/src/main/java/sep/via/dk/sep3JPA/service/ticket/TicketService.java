package sep.via.dk.sep3JPA.service.ticket;

import java.rmi.RemoteException;

import sep.via.dk.sep3JPA.domain.Ticket;

public interface TicketService {
	void addTicket(Ticket ticket)throws RemoteException;

}
