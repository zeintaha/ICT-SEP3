package dao;

import model.movie.AbstractMovie;
import model.movie.CrimeMovie;
import model.movie.DramaMovie;

public class MainClass
{
  

   public static void main(String[] args) throws Exception
   {
      final String JDBC_URL = "jdbc:postgresql://localhost:5432/postgres?currentSchema=bank";
      final String USERNAME = "postgres";
      final String PASSWORD = "0940";
   
//   CustomerDAO cust = new CustomerDAOService(JDBC_URL, USERNAME, PASSWORD);
//   cust.create("012544", "fadi", "Horsens");
//   System.out.println(" done");
      
      MovieDAO cust= new MovieDAOService(JDBC_URL, USERNAME, PASSWORD);
      AbstractMovie movie= new CrimeMovie("Once Upon", "Nadeem","Nice movie","2 hours","www.imdb.com","www.azure.com","http://imdb.com");
      cust.create(movie);
      System.out.println(" done");
    
   }

}
