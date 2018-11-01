package model.ticket;

import java.io.Serializable;

import model.customer.Customer;
import model.movie.AbstractMovie;

public class Ticket implements Serializable
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private String ticketNumber;
   private String movie;
   private String  customer ;
  
  
   public Ticket(String ticketNumber, String movie,String customer) {
      this.ticketNumber = ticketNumber;
      this.movie = movie;
      this.customer= customer;
   }

   public String getTicketNumber()
   {
      return ticketNumber;
   }
   
   public String  getMovieName()
   {
      return movie;
   }
   public String getCustoemr() {
      return customer;
   }

   @Override
   public String toString()
   {
      return "Tickt [ticketNumber=" + ticketNumber + ", movie=" + movie
            + ", customer=" + customer + "]";
   }

  
   

}
