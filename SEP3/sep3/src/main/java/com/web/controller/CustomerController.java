package com.web.controller;

import java.rmi.RemoteException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.data.model.customer.Customer;
import com.web.BrokerClient;

@RestController
@RequestMapping("/sep3/customer")
public class CustomerController {

	private BrokerClient brokerClient;

	@Autowired
	public CustomerController(BrokerClient brokerClient) {

		this.brokerClient = brokerClient;

	}

	@GetMapping("/{cpr}")

	public Customer readCustomer(@PathVariable String cpr) throws RemoteException {

		Customer customer = brokerClient.readCustomer(cpr);
		return customer;

	}

	@PostMapping()
	public String createUser(@RequestBody String cpr,@RequestBody String name,@RequestBody String address) {
		
		
		return "we have created " + cpr + "  " + name;

	}

	@DeleteMapping("/{cpr}")
	public Customer deleteUser(@PathVariable String cpr) throws RemoteException {

		Customer customer = brokerClient.readCustomer(cpr);
		brokerClient.deleteCustomer(customer);
		;
		return customer;
	}
	

}
