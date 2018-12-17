//package sep.via.dk.sep3JPA.rmi;
//
//import java.rmi.RemoteException;
//import java.rmi.server.UnicastRemoteObject;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import sep.via.dk.sep3JPA.dao.customer.CustomerDAO;
//import sep.via.dk.sep3JPA.dao.login.LoginDao;
//import sep.via.dk.sep3JPA.dao.movie.MovieDAO;
//import sep.via.dk.sep3JPA.dao.owner.OwnerDAO;
//import sep.via.dk.sep3JPA.dao.ticket.TicketDAO;
//
//public class RmiServer // extends UnicastRemoteObject
//		implements RemoteServer {
//
//	@Autowired
//	private CustomerDAO customerDAO;
//
//	@Autowired
//	private TicketDAO ticketDAO;
//
//	@Autowired
//	private OwnerDAO ownerDAO;
//
//	@Autowired
//	private MovieDAO movieDAO;
//
//	@Autowired
//	private LoginDao loginDao;
//
//	public RmiServer()  
//	{
//
//	}
//
//	@Override
//	
//	public CustomerDAO getCustomerDAO() throws RemoteException {
//
//		return customerDAO;
//	}
//
//	@Override
//	public TicketDAO getTicketDAO() throws RemoteException {
//
//		return ticketDAO;
//	}
//
//	@Override
//	public OwnerDAO getOwnerDAO() throws RemoteException {
//
//		return ownerDAO;
//	}
//
//	@Override
//	public MovieDAO getMovieDAO() throws RemoteException {
//
//		return movieDAO;
//	}
//
//	@Override
//	public LoginDao getLoginDAO() throws RemoteException {
//
//		return loginDao;
//	}
//
//	@Override
//	public String sayHelloRmi(String msg) {
//		System.out.println("================Server Side ========================");
//		System.out.println("Inside Rmi IMPL - Incoming msg : " + msg);
//		return "Hello " + msg;
//	}
//
//}
