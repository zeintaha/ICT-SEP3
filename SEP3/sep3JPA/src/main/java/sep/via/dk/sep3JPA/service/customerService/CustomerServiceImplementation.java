package sep.via.dk.sep3JPA.service.customerService;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.net.server.Client;
import sep.via.dk.sep3JPA.dao.customer.CustomerDAO;
import sep.via.dk.sep3JPA.domain.Customer;
import sep.via.dk.sep3JPA.payment.MyPayment;

@Service
public class CustomerServiceImplementation implements CustomerService {

	@Autowired
	public CustomerDAO rmiClient;

	@Autowired
	public MyPayment myPayment;

	@Override
	public boolean addCustomer(Customer customer) throws RemoteException {
		boolean checkPayment = checkPayment();
		if(checkPayment!=true) {
			return false;
		}
			
		if (rmiClient.customerExist(customer.getUsername())&& (checkPayment==true) ) {
			return false;
		} else {
			rmiClient.addCustomer(customer);
			return true;
		}

	}

	@Override
	public Customer getCustomerById(int id) throws RemoteException {
		return rmiClient.getCustomerById(id);
	}

	@Override
	public Customer getCustomerByUsername(String username) throws RemoteException {

		return rmiClient.getCustomerByUsername(username);
	}

	@Override
	public boolean setExpiryDate(Customer customer) throws RemoteException {
		String expiryDate = customer.getExpiryDate();
		int expireAfter = 0;
		if (expiryDate != null) {
			switch (expiryDate) {
			case "1 Month":
				expireAfter = 1;
				break;
			case "3 Months":
				expireAfter = 3;
				break;

			case "12 Months":
				expireAfter = 12;
				break;

			default:
				expireAfter = 1;

				break;
			}
		} else if (expiryDate == null) {
			expireAfter = 1;
		}

		LocalDate date = LocalDate.now();
		LocalDate updatedDate = date.plusMonths(expireAfter);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		String updatedExpiryDate = updatedDate.format(formatter);
		customer.setExpiryDate(updatedExpiryDate);
		boolean exist = addCustomer(customer);
		return exist;

	}

	@Override
	public String getPaymentLink() {
		myPayment.createPaymentDetail();
		return myPayment.getHref();
	}

	@Override
	public boolean customerExist(String username) throws RemoteException {
	
		return rmiClient.customerExist(username);
	}

	@Override
	public boolean checkPayment() {
		String paymentString = myPayment.ExecutePayment();
		if (paymentString.equalsIgnoreCase("approved")){
			return true;
		}
		else
		
		return false;
	}

}
