package remote.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

import MovieDAO.MovieDAO;
import MovieDAO.MovieDAOService;
import dao.customer.CustomerDAO;
import dao.customer.CustomerDAOService;
import dao.ticket.TicketDAO;
import dao.ticket.TicketDAOService;
import dao.user.UserDAO;
import dao.user.UserDAOService;

public class Server extends UnicastRemoteObject implements ServerRemote {

	private static final long serialVersionUID = 1L;
	

	private CustomerDAOService customerDAO;
	private MovieDAOService movieDAO;
	private UserDAO userDAO;
	private TicketDAOService ticketDAO;

	public Server() throws RemoteException, SQLException {
		customerDAO = new CustomerDAOService();
		movieDAO = new MovieDAOService();
		userDAO = new UserDAOService();
	    ticketDAO = new TicketDAOService();
	}

	public CustomerDAO getCustomerDAO() throws RemoteException {
		return customerDAO;

	}

	@Override
	public MovieDAO getMovieDAO() throws RemoteException {
		return movieDAO;
	}

   @Override
   public UserDAO getUserDAO() throws RemoteException
   {
      return userDAO;
   }

@Override
public TicketDAO getTicketDAO() throws RemoteException {
	
	return ticketDAO;
}
}
