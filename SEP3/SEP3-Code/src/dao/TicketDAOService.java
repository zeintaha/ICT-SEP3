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

	protected TicketDAOService(String jdbcURL, String username, String password) throws RemoteException {
		 this.helper = new DatabaseHelper<>(jdbcURL, username, password);
		// TODO Auto-generated constructor stub
	}
	 private static class TicketMapper implements DataMapper<Ticket>
	   {
	      @Override
	      public Ticket create(ResultSet rs) throws SQLException
	      {
	         String ticketNumber = rs.getString("ticketNumber");
	         AbstractMovie movie = (AbstractMovie) rs.getObject("movie");
	         Customer customer = (Customer) rs.getObject("customer");
	         return new Ticket(ticketNumber, movie, customer);
	      }
	   }

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DatabaseHelper<Ticket> helper;

	@Override
	public Ticket create(String ticketNumber, AbstractMovie movie, Customer customer) throws RemoteException {
		 helper.executeUpdate("INSERT INTO Customer VALUES (?, ?, ?)", ticketNumber, movie,
		            customer);
		      return new Ticket(ticketNumber, movie, customer);
		// TODO Auto-generated method stub
	
	}

	
	
	

//	@Override
//	public void update(Ticket ticket) throws RemoteException {
//		helper.executeUpdate(
//	            "UPDATE Ticket set ticketNumber = ?, movie = ? WHERE ticketNumber = ?",
////	            ticket.getTicketNumber(), ticket.getMovieName(), Customer.getCpr());
//		
//	}





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
