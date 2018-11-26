package com.data.dao.movieDao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.data.connection.DataMapper;
import com.data.connection.DatabaseHelper;
import com.data.model.movie.AbstractMovie;
import com.data.model.movie.ActionMovie;
import com.data.model.movie.AdventureMovie;
import com.data.model.movie.ComedyMovie;
import com.data.model.movie.CrimeMovie;
import com.data.model.movie.DramaMovie;
import com.data.model.movie.HorrorMovie;

public class MovieDAOService extends UnicastRemoteObject implements MovieDAO {

	private static final String Action = "Action";
	private static final String Adventure = "Adventure";
	private static final String Comedy = "Comedy";
	private static final String Crime = "Crime";
	private static final String Drama = "Drama";
	private static final String Horror = "Horror";

	private static final long serialVersionUID = 1L;
	private DatabaseHelper<AbstractMovie> helper;

	public MovieDAOService() throws RemoteException, SQLException {
		this.helper = new DatabaseHelper<>();
	}

	private static class AbstractMovieMapper implements DataMapper<AbstractMovie> {
		@Override
		public AbstractMovie create(ResultSet rs) throws SQLException {
			String name = rs.getString("name");
			String director = rs.getString("director");
			String discription = rs.getString("discription");
			String duration = rs.getString("duration");
			String urlTrailer = rs.getString("urlTrailer");
			String urlFullMovie = rs.getString("urlFullMovie");
			String urlImage = rs.getString("urlImage");
			switch (rs.getString("category")) {
			case Action:
				return new ActionMovie(name, director, discription, duration, urlTrailer, urlFullMovie, urlImage);
			case Adventure:
				return new AdventureMovie(name, director, discription, duration, urlTrailer, urlFullMovie, urlImage);
			case Comedy:
				return new ComedyMovie(name, director, discription, duration, urlTrailer, urlFullMovie, urlImage);
			case Crime:
				return new CrimeMovie(name, director, discription, duration, urlTrailer, urlFullMovie, urlImage);
			case Drama:
				return new DramaMovie(name, director, discription, duration, urlTrailer, urlFullMovie, urlImage);
			case Horror:
				return new HorrorMovie(name, director, discription, duration, urlTrailer, urlFullMovie, urlImage);
			default:
				return null;
		}
		}
}
	@Override
	public void create(AbstractMovie movie) throws RemoteException {
		String category = "";
		if (movie instanceof ActionMovie) {
			category = "ActionMovie";
		} else if (movie instanceof AdventureMovie) {
			category = "AdventureMovie";
		} else if (movie instanceof ComedyMovie) {
			category = "ComedyMovie";
		} else if (movie instanceof CrimeMovie) {
			category = "CrimeMovie";
		} else if (movie instanceof DramaMovie) {
			category = "DramaMovie";
		} else if (movie instanceof DramaMovie) {
			category = "HorrorMovie";
		}

		helper.executeUpdate("INSERT INTO Movie(name, director, discription, category, duration, urlTrailer, urlFullMovie, urlImage) VALUES(?,?,?,?,?,?,?,?)", 
				movie.getName(), movie.getDirector(), movie.getDiscription(), category, movie.getDuration(), movie.getUrlTrailer(), movie.getUrlFullMovie(),
				movie.getUrlImage());
	}

	@Override
	public AbstractMovie read(String name) throws RemoteException{
		AbstractMovieMapper mapper = new AbstractMovieMapper();
		AbstractMovie mov=helper.getSingle(mapper, "SELECT * FROM Movie WHERE name = ?;", name);
		
		return mov;
	}

	@Override
	public void delete(AbstractMovie movie) throws RemoteException {
		helper.executeUpdate("DELETE FROM Movie WHERE name = ?",
            movie.getName());

	}

}