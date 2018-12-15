package sep.via.dk.sep3JPA.service.customerService;

import java.rmi.RemoteException;

import sep.via.dk.sep3JPA.domain.Customer;

public interface CustomerService {

	boolean addCustomer(Customer customer) throws RemoteException;

	Customer getCustomerById(int id) throws RemoteException;

	Customer getCustomerByUsername(String username) throws RemoteException;

	public boolean setExpiryDate(Customer customer) throws RemoteException;

	public String getPaymentLink();

	public boolean customerExist(String username) throws RemoteException;
	public boolean checkPayment() ;

}
