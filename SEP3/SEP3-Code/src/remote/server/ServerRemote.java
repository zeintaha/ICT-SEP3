package remote.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import MovieDAO.MovieDAO;
import dao.customerDao.CustomerDAO;
import dao.ticketDao.TicketDAO;
import dao.user.Dao.UserDAO;



public interface ServerRemote extends Remote
{
   CustomerDAO getCustomerDAO() throws RemoteException;
   MovieDAO getMovieDAO() throws RemoteException;
   UserDAO getUserDAO() throws RemoteException;
   TicketDAO getTicketDAO() throws RemoteException;

}
