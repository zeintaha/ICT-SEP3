package MovieDAO;

import java.rmi.Remote;
import java.rmi.RemoteException;

import model.movie.Movie;

public interface MovieDAO extends Remote {

	public void create(Movie movie) throws RemoteException;

	public Movie read(String name) throws RemoteException;

	public void delete(Movie movie) throws RemoteException;

}