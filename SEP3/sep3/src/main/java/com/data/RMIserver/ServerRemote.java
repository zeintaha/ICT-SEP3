package com.data.RMIserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.data.dao.customerDao.CustomerDAO;
import com.data.dao.movieDao.MovieDAO;
import com.data.dao.ticketDao.TicketDAO;
import com.data.dao.userDao.UserDAO;





public interface ServerRemote extends Remote
{
   CustomerDAO getCustomerDAO() throws RemoteException;
   MovieDAO getMovieDAO() throws RemoteException;
   UserDAO getUserDAO() throws RemoteException;
   TicketDAO getTicketDAO() throws RemoteException;

}
