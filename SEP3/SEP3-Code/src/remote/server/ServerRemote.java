package remote.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import dao.customerDao.CustomerDAO;
import dao.movieDao.MovieDAO;
import dao.ticketDao.TicketDAO;
import dao.userDao.UserDAO;



public interface ServerRemote extends Remote
{
   CustomerDAO getCustomerDAO() throws RemoteException;
   MovieDAO getMovieDAO() throws RemoteException;
   UserDAO getUserDAO() throws RemoteException;
   TicketDAO getTicketDAO() throws RemoteException;

}
