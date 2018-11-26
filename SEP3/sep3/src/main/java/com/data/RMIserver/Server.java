package com.data.RMIserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

import com.data.dao.customerDao.CustomerDAO;
import com.data.dao.customerDao.CustomerDAOService;
import com.data.dao.movieDao.MovieDAO;
import com.data.dao.movieDao.MovieDAOService;
import com.data.dao.ticketDao.TicketDAO;
import com.data.dao.ticketDao.TicketDAOService;
import com.data.dao.userDao.UserDAO;
import com.data.dao.userDao.UserDAOService;

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

	public UserDAO getUserDAO() throws RemoteException {
		return userDAO;
	}

	public TicketDAO getTicketDAO() throws RemoteException {

		return ticketDAO;
	}
}
