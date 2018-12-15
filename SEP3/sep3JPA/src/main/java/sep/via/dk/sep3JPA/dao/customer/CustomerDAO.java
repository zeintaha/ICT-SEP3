package sep.via.dk.sep3JPA.dao.customer;

import java.rmi.Remote;
import java.rmi.RemoteException;

import sep.via.dk.sep3JPA.domain.Customer;

public interface CustomerDAO extends Remote {
	void addCustomer(Customer customer)throws RemoteException;

	boolean customerExist(String username)throws RemoteException;

	Customer getCustomerById(int id)throws RemoteException;

	Customer getCustomerByUsername(String username)throws RemoteException;

}
