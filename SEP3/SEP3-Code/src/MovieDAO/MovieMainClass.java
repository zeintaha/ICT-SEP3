package MovieDAO;

import MovieDAO.MovieDAO;
import MovieDAO.MovieDAOService;
import model.movie.AbstractMovie;
import model.movie.CrimeMovie;
import model.movie.DramaMovie;

public class MovieMainClass
{
  

   public static void main(String[] args) throws Exception
   {
	   final String JDBC_URL = "jdbc:sqlserver://dbserversep3.database.windows.net:1433;database=moviedb;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
	      final String USERNAME = "dbserveradmin@dbserversep3";
	      final String PASSWORD = "n5*SFSVSSG&1!x";
      
      MovieDAO cust= new MovieDAOService(JDBC_URL, USERNAME, PASSWORD);
      AbstractMovie movie= new CrimeMovie("Once Upon Fadi Version", "Nadeem","Nice movie","2 hours","www.imdb.com","www.azure.com","http://imdb.com");
      cust.create(movie);
      cust.read("Once Upon Fadi version");
//      cust.delete(movie);
      System.out.println(" done");
    
   }

}
