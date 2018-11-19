package remote.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

import dao.customerDao.CustomerDAO;
import dao.customerDao.CustomerDAOService;
import dao.movieDao.MovieDAO;
import dao.movieDao.MovieDAOService;
import dao.ticketDao.TicketDAO;
import dao.ticketDao.TicketDAOService;
import dao.userDao.UserDAO;
import dao.userDao.UserDAOService;

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
