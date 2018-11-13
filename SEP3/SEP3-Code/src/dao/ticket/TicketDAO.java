package dao.ticket;

import java.rmi.Remote;
import java.rmi.RemoteException;

import model.customer.Customer;
import model.movie.AbstractMovie;
import model.ticket.Ticket;

public interface TicketDAO extends Remote {
	public Ticket create(String ticketNumber, String customerName, String movieName) throws RemoteException;

	public Ticket read(String ticketNumber) throws RemoteException;

	public void delete(Ticket ticket) throws RemoteException;





}
