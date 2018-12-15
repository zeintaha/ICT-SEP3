package sep.via.dk.sep3JPA.dao.movie;

import java.rmi.RemoteException;
import java.util.List;

import sep.via.dk.sep3JPA.domain.movie.Movie;

public interface MovieDAO {
	void addMovie(Movie movie)throws RemoteException;

	List<Movie> getListOfMovies()throws RemoteException;

	Movie getMovieById(int id)throws RemoteException;

	void deletMovie(int movieId)throws RemoteException;

	void updateMovie(Movie movie)throws RemoteException;

	public List<Movie> getMovieByTitle(String titleS)throws RemoteException;
}
