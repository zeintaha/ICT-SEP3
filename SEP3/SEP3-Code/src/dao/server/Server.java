package dao.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

import MovieDAO.MovieDAO;
import MovieDAO.MovieDAOService;
import dao.CustomerDAO;
import dao.CustomerDAOService;
import dao.TicketDAO;
import dao.TicketDAOService;
import dao.UserDAO;
import dao.UserDAOService;
import model.movie.AbstractMovie;

public class Server extends UnicastRemoteObject implements ServerRemote {

	private static final long serialVersionUID = 1L;
	final String JDBC_URL = "jdbc:sqlserver://dbserversep3.database.windows.net:1433;database=moviedb;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
	final String USERNAME = "dbserveradmin@dbserversep3";
	final String PASSWORD = "n5*SFSVSSG&1!x";

	private CustomerDAOService customerDAO;
	private MovieDAOService movieDAO;
	private UserDAOService userDAO;
	private TicketDAOService ticketDAO;

	public Server() throws RemoteException, SQLException {
		customerDAO = new CustomerDAOService();
		movieDAO = new MovieDAOService(JDBC_URL, USERNAME, PASSWORD);
		userDAO = new UserDAOService();
	    ticketDAO = new TicketDAOService(JDBC_URL, USERNAME, PASSWORD);
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
