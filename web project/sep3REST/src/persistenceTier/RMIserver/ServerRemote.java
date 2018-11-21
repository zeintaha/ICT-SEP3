package persistenceTier.RMIserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

import persistenceTier.dao.customerDao.CustomerDAO;
import persistenceTier.dao.movieDao.MovieDAO;
import persistenceTier.dao.ticketDao.TicketDAO;
import persistenceTier.dao.userDao.UserDAO;



public interface ServerRemote extends Remote
{
   CustomerDAO getCustomerDAO() throws RemoteException;
   MovieDAO getMovieDAO() throws RemoteException;
   UserDAO getUserDAO() throws RemoteException;
   TicketDAO getTicketDAO() throws RemoteException;

}
