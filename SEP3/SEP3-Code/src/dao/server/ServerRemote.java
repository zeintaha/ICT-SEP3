package dao.server;

import java.rmi.Remote; 
import java.rmi.RemoteException;

import MovieDAO.MovieDAO;
import dao.CustomerDAO;
import dao.TicketDAO;
import dao.UserDAO;
import model.movie.AbstractMovie;



public interface ServerRemote extends Remote
{
   CustomerDAO getCustomerDAO() throws RemoteException;
   MovieDAO getMovieDAO() throws RemoteException;
   UserDAO getUserDAO() throws RemoteException;
   TicketDAO getTicketDAO() throws RemoteException;

}
