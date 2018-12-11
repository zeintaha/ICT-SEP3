package sep.via.dk.sep3JPA.service.customerService;

import java.rmi.RemoteException;
import java.util.List;

import sep.via.dk.sep3JPA.domain.Customer;

public interface CustomerService {

	boolean addCustomer(Customer customer) throws RemoteException;

	Customer getCustomerById(int id) throws RemoteException;

	Customer getCustomerByUsername(String username);

	

}
