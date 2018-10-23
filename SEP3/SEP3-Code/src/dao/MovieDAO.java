package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import model.movie.AbstractMovie;

public interface MovieDAO extends Remote{
	public AbstractMovie create(String name, String director, String description, String duration, String urlTrailer,
			String urlFullMovie, String urlImage)  throws RemoteException;

	   public AbstractMovie read(String name) throws RemoteException;

	   public void delete(AbstractMovie movie) throws RemoteException;

	   public void update(AbstractMovie movie) throws RemoteException;

}
