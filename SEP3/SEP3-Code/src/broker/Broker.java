package broker;

import java.rmi.RemoteException;

import dao.customerDao.CustomerDAO;
import dao.movieDao.MovieDAO;
import dao.ticketDao.TicketDAO;
import dao.user.Dao.UserDAO;
import remote.server.ServerRemote;

public class Broker implements ServerRemote {
	

	@Override
	public CustomerDAO getCustomerDAO() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MovieDAO getMovieDAO() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDAO getUserDAO() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TicketDAO getTicketDAO() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
