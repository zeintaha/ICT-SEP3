package sep.via.dk.sep3JPA.service.movieService;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sep.via.dk.sep3JPA.dao.movie.MovieDAO;
import sep.via.dk.sep3JPA.domain.movie.Movie;

@Service
public class MovieServiceImplementation implements MovieService {

	@Autowired
	private MovieDAO rmiClient;

	public MovieServiceImplementation() {

	}

	@Override
	public void AddMovie(Movie movie) throws RemoteException {
		rmiClient.addMovie(movie);

	}

	@Override
	public List<Movie> getListOfMovies() throws RemoteException {

		return rmiClient.getListOfMovies();

	}

	@Override
	public Movie getMovieById(int id) throws RemoteException {
		return rmiClient.getMovieById(id);
	}

	@Override
	public void deletMovie(int movieId) throws RemoteException {
		rmiClient.deletMovie(movieId);

	}

	@Override
	public void updateMovie(Movie movie) throws RemoteException {
		rmiClient.updateMovie(movie);

	}

	@Override
	public List<Movie> getMovieByTitle(String title) throws RemoteException {

		return rmiClient.getMovieByTitle(title);
	}

}
