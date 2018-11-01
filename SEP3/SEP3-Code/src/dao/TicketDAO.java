package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

import model.customer.Customer;
import model.movie.AbstractMovie;
import model.ticket.Ticket;

public interface TicketDAO extends Remote {
//	public Ticket create(String ticketNumber, AbstractMovie movie, Customer customer) throws RemoteException;

	public Ticket read(String ticketNumber) throws RemoteException;

	public void delete(Ticket ticket) throws RemoteException;

   Ticket create(String ticketNumber, String string, String string2)
         throws RemoteException;

//	public void update(Ticket ticket) throws RemoteException;



}
