//package sep.via.dk.sep3JPA.rmiClient;
//
//import java.rmi.NotBoundException;
//import java.rmi.RemoteException;
//import java.rmi.registry.LocateRegistry;
//import java.rmi.registry.Registry;
//
//import java.rmi.server.UnicastRemoteObject;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import sep.via.dk.sep3JPA.domain.Customer;
//import sep.via.dk.sep3JPA.rmi.RemoteServer;
//
//public class RmiClient extends UnicastRemoteObject {
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	private RemoteServer server;
//
//	@Autowired
//	public RmiClient() throws RemoteException, NotBoundException {
//
//		Registry registry = LocateRegistry.getRegistry(1099);
//		this.server = (RemoteServer) registry.lookup("SR");
//		System.out.println(" client is ready");
//
//	}
//	
//	
//	
//	
//	public  void addCustomer(Customer customer) throws RemoteException {
//		 server.getCustomerDAO().addCustomer(customer);
//		 
//	 }
//	   
//	  public Customer getCustomerById(int id) throws RemoteException {
//			return server.getCustomerDAO().getCustomerById(id);
//	    	
//	    }
//}
