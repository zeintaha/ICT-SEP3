//package sep.via.dk.sep3JPA.rmi;
//
//import java.rmi.RemoteException;
//import java.rmi.server.UnicastRemoteObject;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import sep.via.dk.sep3JPA.dao.CustomerRepository;
//import sep.via.dk.sep3JPA.dao.CustomerRepositoryImplementation;
//
//
//
//public class RmiServer extends UnicastRemoteObject implements RemoteServer
//{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	@Autowired
//	private CustomerRepository customerRepository;
//	
//	protected RmiServer() throws RemoteException {
//		customerRepository = new CustomerRepositoryImplementation();
//	
//	}
//
//	@Override
//	public CustomerRepository getCustomerDAO() throws RemoteException {
//		
//		return customerRepository;
//	}
//	
//
//}
