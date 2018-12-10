package sep.via.dk.sep3JPA.dao.customer;

import java.util.List;

import sep.via.dk.sep3JPA.domain.Customer;

public interface CustomerDAO {
	void addCustomer(Customer customer);

	boolean customerExist(String username);

	Customer getCustomerById(int id);

	List<Customer> getCustomerByUsername(String username);

}
