package dao;

import MovieDAO.MovieDAO;
import MovieDAO.MovieDAOService;
import model.customer.Customer;
import model.movie.AbstractMovie;
import model.movie.CrimeMovie;
import model.movie.DramaMovie;

public class MainClass
{
  

   public static void main(String[] args) throws Exception
   {
	   final String JDBC_URL = "jdbc:sqlserver://dbserversep3.database.windows.net:1433;database=moviedb;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
	      final String USERNAME = "dbserveradmin@dbserversep3";
	      final String PASSWORD = "n5*SFSVSSG&1!x";
   

      TicketDAOService ticket= new TicketDAOService(JDBC_URL, USERNAME, PASSWORD);
    
      String numbeer = "wfds ";
    
      ticket.create(numbeer,"anyMoive","fadi" );
//    
      System.out.println(" done");
    
   }

}
