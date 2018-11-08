package dao.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import MovieDAO.MovieDAO;
import MovieDAO.MovieDAOService;
import dao.CustomerDAO;
import dao.CustomerDAOService;
import model.movie.AbstractMovie;

public class Server extends UnicastRemoteObject implements ServerRemote {

	private static final long serialVersionUID = 1L;
	final String JDBC_URL = "jdbc:sqlserver://dbserversep3.database.windows.net:1433;database=moviedb;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
	final String USERNAME = "dbserveradmin@dbserversep3";
	final String PASSWORD = "n5*SFSVSSG&1!x";

	private CustomerDAOService customerDAO;
	private MovieDAOService movieDAO;

	public Server() throws RemoteException {
		customerDAO = new CustomerDAOService(JDBC_URL, USERNAME, PASSWORD);
		movieDAO = new MovieDAOService(JDBC_URL, USERNAME, PASSWORD);
	}

	public CustomerDAO getCustomerDAO() throws RemoteException {
		return customerDAO;

	}

	@Override
	public MovieDAO getMovieDAO() throws RemoteException {
		return movieDAO;
	}
}
