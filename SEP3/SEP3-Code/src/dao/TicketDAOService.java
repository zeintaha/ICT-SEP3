package dao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.customer.Customer;
import model.movie.AbstractMovie;
import model.ticket.Ticket;

public class TicketDAOService extends UnicastRemoteObject
implements TicketDAO{

	public TicketDAOService(String jdbcURL, String username, String password) throws RemoteException {
		 this.helper = new DatabaseHelper<>(jdbcURL, username, password);
		// TODO Auto-generated constructor stub
	}
	 private static class TicketMapper implements DataMapper<Ticket>
	   {
	      @Override
	      public Ticket create(ResultSet rs) throws SQLException
	      {
	         String ticketNumber = rs.getString("ticketNumber");
	         String movie = rs.getString("movieName");
	         String customer = rs.getString("customerName");
	         return new Ticket(ticketNumber, movie, customer);
	      }
	   }

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DatabaseHelper<Ticket> helper;

	@Override
	public Ticket create(String ticketNumber, String cutomerName, String movieName) throws RemoteException {
		 helper.executeUpdate("INSERT INTO Customer VALUES (?, ?, ?)", ticketNumber, cutomerName,movieName
		            );
		      return new Ticket(ticketNumber, movieName, cutomerName);
		// TODO Auto-generated method stub
	
	}




	@Override
	public Ticket read(String ticketNumber) throws RemoteException {
		TicketMapper mapper = new TicketMapper();
		Ticket ticket = helper.mapSingle(mapper, "SELECT * FROM Customer WHERE name = ?;", ticketNumber);
		return ticket;
	}





	@Override
	public void delete(Ticket ticket) throws RemoteException {
		 helper.executeUpdate("DELETE FROM Ticket WHERE ticketNumber = ?",
		            ticket.getTicketNumber());
		
	}

	
	

}
