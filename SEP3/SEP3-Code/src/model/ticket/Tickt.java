package model.ticket;

import java.io.Serializable;

public class Tickt implements Serializable
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private String ticketNumber;
   private String movieName;
   
   public Tickt(String ticketNumber, String movieName) {
      this.ticketNumber = ticketNumber;
      this.movieName = movieName;
   }

   public String getTicketNumber()
   {
      return ticketNumber;
   }
   
   public String getMovieName()
   {
      return movieName;
   }

   @Override
   public String toString()
   {
      return "Tickt [ticketNumber=" + ticketNumber + "]";
   }
   

}
