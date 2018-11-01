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
   private AbstractMovie movie;
   private Customer customer ;
   
   public Ticket(String ticketNumber, AbstractMovie movie,Customer customer) {
      this.ticketNumber = ticketNumber;
      this.movie = movie;
      this.customer= customer;
   }

   public String getTicketNumber()
   {
      return ticketNumber;
   }
   
   public AbstractMovie  getMovieName()
   {
      return movie;
   }
   public Customer getCustoemr() {
      return customer;
   }

   @Override
   public String toString()
   {
      return "Tickt [ticketNumber=" + ticketNumber + ", movie=" + movie
            + ", customer=" + customer + "]";
   }

  
   

}
