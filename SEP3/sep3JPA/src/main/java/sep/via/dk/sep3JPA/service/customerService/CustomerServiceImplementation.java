package sep.via.dk.sep3JPA.service.customerService;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
			customerDAO.addCustomer(customer);
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

	@Override
	public boolean setExpiryDate(Customer customer) {
		String expiryDate = customer.getExpiryDate();
		int expireAfter = 0;
		switch (expiryDate) {
		case "1 Month":
			expireAfter = 1;
			break;
		case "3 Month":
			expireAfter = 3;
			break;

		case "12 Month":
			expireAfter = 12;
			break;

		default:
			expireAfter = 1;

			break;
		}
		LocalDate date = LocalDate.now();
		LocalDate updatedDate = date.plusMonths(expireAfter);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		String updatedExpiryDate = updatedDate.format(formatter);
		customer.setExpiryDate(updatedExpiryDate);
		boolean exist = addCustomer(customer);
		return exist;
		
	}

}
