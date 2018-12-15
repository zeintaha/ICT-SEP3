package sep.via.dk.sep3JPA.service.movieService;

import java.rmi.RemoteException;
import java.util.List;

import sep.via.dk.sep3JPA.domain.movie.Movie;

public interface MovieService {
	public void AddMovie(Movie movie)throws RemoteException;

	public List<Movie> getListOfMovies()throws RemoteException;

	public Movie getMovieById(int id)throws RemoteException;

	public void deletMovie(int movieId)throws RemoteException;

	void updateMovie(Movie movie)throws RemoteException;

	List<Movie> getMovieByTitle(String title)throws RemoteException;

}
