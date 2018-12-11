package sep.via.dk.sep3JPA.service.customerService;

import java.rmi.RemoteException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sep.via.dk.sep3JPA.dao.customer.CustomerDAO;
import sep.via.dk.sep3JPA.domain.Customer;

@Service
public class CustomerServiceImplementation implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public boolean addCustomer(Customer customer) {
		if (customerDAO.customerExist(customer.getUsername())) {
			return false;
		} else {
			customerDAO.setExpiryDate(customer);
			return true;
		}

	}

	@Override
	public Customer getCustomerById(int id) throws RemoteException {
		return customerDAO.getCustomerById(id);
	}

	@Override
	public Customer getCustomerByUsername(String username) {

		return customerDAO.getCustomerByUsername(username);
	}

}
