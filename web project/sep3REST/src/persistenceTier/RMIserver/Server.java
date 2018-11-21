package persistenceTier.RMIserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

import persistenceTier.dao.customerDao.CustomerDAO;
import persistenceTier.dao.customerDao.CustomerDAOService;
import persistenceTier.dao.movieDao.MovieDAO;
import persistenceTier.dao.movieDao.MovieDAOService;
import persistenceTier.dao.ticketDao.TicketDAO;
import persistenceTier.dao.ticketDao.TicketDAOService;
import persistenceTier.dao.userDao.UserDAO;
import persistenceTier.dao.userDao.UserDAOService;





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

	
	public MovieDAO getMovieDAO() throws RemoteException {
		return movieDAO;
	}

   
   public UserDAO getUserDAO() throws RemoteException
   {
      return userDAO;
   }


public TicketDAO getTicketDAO() throws RemoteException {
	
	return ticketDAO;
}
}
