
package sep.via.dk.sep3JPA.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import sep.via.dk.sep3JPA.dao.customer.CustomerDAO;
import sep.via.dk.sep3JPA.dao.login.LoginDao;
import sep.via.dk.sep3JPA.dao.movie.MovieDAO;
import sep.via.dk.sep3JPA.dao.owner.OwnerDAO;
import sep.via.dk.sep3JPA.dao.ticket.TicketDAO;

public interface RemoteServer //extends Remote 
{

	CustomerDAO getCustomerDAO() throws RemoteException;

	TicketDAO getTicketDAO() throws RemoteException;

	OwnerDAO getOwnerDAO() throws RemoteException;

	MovieDAO getMovieDAO() throws RemoteException;

	LoginDao getLoginDAO() throws RemoteException;
	
	
	 public String sayHelloRmi(String msg);

}
