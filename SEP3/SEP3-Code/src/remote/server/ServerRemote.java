package remote.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import MovieDAO.MovieDAO;
import dao.customer.CustomerDAO;
import dao.ticket.TicketDAO;
import dao.user.UserDAO;



public interface ServerRemote extends Remote
{
   CustomerDAO getCustomerDAO() throws RemoteException;
   MovieDAO getMovieDAO() throws RemoteException;
   UserDAO getUserDAO() throws RemoteException;
   TicketDAO getTicketDAO() throws RemoteException;

}
