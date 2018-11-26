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
import com.data.model.user.User;
import com.web.BrokerClient;

@RestController
@RequestMapping("/sep3/user")
public class UserController {
	private BrokerClient brokerClient;

	@Autowired
	public UserController(BrokerClient brokerClient) {

		this.brokerClient = brokerClient;

	}

	@GetMapping("/{cpr}")

	public User readUser(@PathVariable String cpr) throws RemoteException {

		User user = brokerClient.readUser(cpr);
		return user;

	}

	@PostMapping()
	public String createUser(@RequestBody String cpr, @RequestBody String name) {

		return "we have created " + cpr + "  " + name;

	}

	@DeleteMapping("/{cpr}")
	public User deleteUser(@PathVariable String cpr) throws RemoteException {

		User user = brokerClient.readUser(cpr);
		brokerClient.deleteUser(user);
		;
		return user;
	}

}
