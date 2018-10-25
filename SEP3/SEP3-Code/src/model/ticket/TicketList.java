package model.ticket;

import java.io.Serializable;
import java.util.ArrayList;

public class TicketList implements Serializable
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   ArrayList<Tickt> tickets;

   public TicketList()
   {
      tickets = new ArrayList<>();
   }

   public void addTicket(Tickt ticket)
   {
      tickets.add(ticket);
   }

   public void removeTicket(Tickt ticket)
   {
      tickets.remove(ticket);
   }

   public Tickt getTicketNumber(Tickt ticket)
   {
      Tickt temp = null;

      for (int i = 0; i < tickets.size(); i++)
      {
         if (ticket.getTicketNumber().equals(tickets.get(i).getTicketNumber()))
         {
            temp = tickets.get(i);
         }
      }

      return temp;

   }

}
