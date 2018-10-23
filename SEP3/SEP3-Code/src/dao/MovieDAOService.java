package dao.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dao.DatabaseHelper;
import dao.MovieDAO;
import model.movie.AbstractMovie;

public class MovieDAOService extends UnicastRemoteObject implements MovieDAO {

	private static final long serialVersionUID = 1L;
	private DatabaseHelper<AbstractMovie> helper;

	public MovieDAOService(String jdbcURL, String username, String password) throws RemoteException {
		this.helper = new DatabaseHelper<>(jdbcURL, username, password);
	}

	@Override
	public AbstractMovie create(String name, String director, String description, String duration, String urlTrailer,
			String urlFullMovie, String urlImage) throws RemoteException {
		return null;
	}

	@Override
	public AbstractMovie read(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(AbstractMovie movie) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(AbstractMovie movie) throws RemoteException {
		// TODO Auto-generated method stub

	}

}
