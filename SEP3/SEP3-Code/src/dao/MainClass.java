package dao;

import MovieDAO.MovieDAO;
import MovieDAO.MovieDAOService;
import model.movie.AbstractMovie;
import model.movie.CrimeMovie;
import model.movie.DramaMovie;
import model.ticket.Ticket;

public class MainClass
{
  

   public static void main(String[] args) throws Exception
   {
	   final String JDBC_URL = "jdbc:sqlserver://dbserversep3.database.windows.net:1433;database=moviedb;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
	      final String USERNAME = "dbserveradmin@dbserversep3";
	      final String PASSWORD = "n5*SFSVSSG&1!x";
   
//   CustomerDAO cust = new CustomerDAOService(JDBC_URL, USERNAME, PASSWORD);
//   cust.create("012544", "fadi", "Horsens");
//   System.out.println(" done");
      
      MovieDAO cust= new MovieDAOService(JDBC_URL, USERNAME, PASSWORD);
      AbstractMovie movie= new CrimeMovie("Once Upon Fadi version", "Nadeem","Nice movie","2 hours","www.imdb.com","www.azure.com","http://imdb.com");
    //  cust.create(movie);
//       cust.delete(movie);
     // System.out.println(" done");
      
      TicketDAO  ticket = new TicketDAOService(JDBC_URL, USERNAME, PASSWORD);
      Ticket tic = new Ticket("54", "Balkis", "NEW GIRL");
      ticket.create("54", "Balkis", "NEW GIRL");
      System.out.println(" done");
    
   }

}
