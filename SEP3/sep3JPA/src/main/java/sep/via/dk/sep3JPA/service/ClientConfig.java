//package sep.via.dk.sep3JPA.service;
//
//import java.rmi.RemoteException;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import org.springframework.remoting.rmi.RmiProxyFactoryBean;
//
//import sep.via.dk.sep3JPA.domain.Customer;
//import sep.via.dk.sep3JPA.domain.Owner;
//import sep.via.dk.sep3JPA.domain.Ticket;
//import sep.via.dk.sep3JPA.domain.movie.Movie;
//import sep.via.dk.sep3JPA.rmi.RemoteServer;
//
//@Configuration
//
//@Import({RmiProxyFactoryBean.class})
//
//public class ClientConfig {
////
////	@Autowired
////	private RemoteServer server;
////	
//	@Autowired
//	RmiProxyFactoryBean rmiProxyFactoryBean;
//
//	@Bean
//	public  RemoteServer createBarServiceLink() {
////		RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
//		rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1099/helloworldrmi");
//		rmiProxyFactoryBean.setServiceInterface(RemoteServer.class);
//		rmiProxyFactoryBean.afterPropertiesSet();
//		System.out.println("client is running");
//		return (RemoteServer) rmiProxyFactoryBean.getObject();
//	}
//
//	
//	
////	
////	
////	
////	public void addCustomer(Customer customer) throws RemoteException {
////		server.getCustomerDAO().addCustomer(customer);
////
////	}
////
////	public boolean customerExist(String username) throws RemoteException {
////		return server.getCustomerDAO().customerExist(username);
////	}
////
////	public Customer getCustomerById(int id) throws RemoteException {
////		return server.getCustomerDAO().getCustomerById(id);
////	}
////
////	public Customer getCustomerByUsername(String username) throws RemoteException {
////		return server.getCustomerDAO().getCustomerByUsername(username);
////	}
////
////	public boolean customerAuthentication(String username, String password) throws RemoteException {
////		return server.getLoginDAO().customerAuthentication(username, password);
////	}
////
////	public boolean AuthenticateSubscription(String username) throws RemoteException {
////		return server.getLoginDAO().AuthenticateSubscription(username);
////	}
////
////	public boolean ownerAuthentication(String username, String password) throws RemoteException {
////		return server.getLoginDAO().ownerAuthentication(username, password);
////	}
////
////	public void addMovie(Movie movie) throws RemoteException {
////		server.getMovieDAO().addMovie(movie);
////	}
////
////	public List<Movie> getListOfMovies() throws RemoteException {
////
////		return server.getMovieDAO().getListOfMovies();
////	}
////
////	public Movie getMovieById(int id) throws RemoteException {
////		return server.getMovieDAO().getMovieById(id);
////	}
////
////	public void deletMovie(int movieId) throws RemoteException {
////		server.getMovieDAO().deletMovie(movieId);
////	}
////
////	public void updateMovie(Movie movie) throws RemoteException {
////		server.getMovieDAO().updateMovie(movie);
////	}
////
////	public List<Movie> getMovieByTitle(String titleS) throws RemoteException {
////		return server.getMovieDAO().getListOfMovies();
////	}
////
////	public boolean ownerExist(String username) throws RemoteException {
////		return server.getOwnerDAO().ownerExist(username);
////	}
////
////	public void addOwner(Owner owner) throws RemoteException {
////		server.getOwnerDAO().addOwner(owner);
////	}
////
////	public Owner getOwnerById(int id) throws RemoteException {
////		return server.getOwnerDAO().getOwnerById(id);
////	}
////
////	public void addTicket(Ticket ticket) throws RemoteException {
////		server.getTicketDAO().addTicket(ticket);
////	}
//
//}
