package dao.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dao.CustomerDAO;
import dao.CustomerDAOService;
import dao.MovieDAOService;



public class Server extends UnicastRemoteObject implements ServerRemote
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/postgres?currentSchema=bank";
   private static final String USERNAME = "postgres";
   private static final String PASSWORD = "0940";
   
   private CustomerDAOService customerDAO;
   private MovieDAOService movieDAO;

	public Server() throws RemoteException {
		customerDAO = new CustomerDAOService(JDBC_URL, USERNAME, PASSWORD);
		movieDAO = new MovieDAOService(JDBC_URL, USERNAME, PASSWORD);
	}  
   
  public CustomerDAO getCustomerDAO() throws RemoteException{
   return customerDAO;
      
   }

   
}
