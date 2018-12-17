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
	public void AddMovie(Movie movie)  {
		rmiClient.addMovie(movie);

	}

	@Override
	public List<Movie> getListOfMovies()  {

		return rmiClient.getListOfMovies();

	}

	@Override
	public Movie getMovieById(int id)  {
		return rmiClient.getMovieById(id);
	}

	@Override
	public void deletMovie(int movieId)  {
		rmiClient.deletMovie(movieId);

	}

	@Override
	public void updateMovie(Movie movie)  {
		rmiClient.updateMovie(movie);

	}

	@Override
	public List<Movie> getMovieByTitle(String title)  {

		return rmiClient.getMovieByTitle(title);
	}

}
