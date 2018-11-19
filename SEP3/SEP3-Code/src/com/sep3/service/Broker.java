package com.sep3.service;

import java.awt.PageAttributes.MediaType;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


import javax.xml.ws.Response;

import model.customer.Customer;
import remote.server.ServerRemote;


public class Broker extends UnicastRemoteObject{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	


	private ServerRemote server= null;
	

	public Broker(ServerRemote server) throws RemoteException, NotBoundException {	
		super();
		this.server = server ;
		Registry registry = LocateRegistry.getRegistry(1099);
		server =  (ServerRemote) registry.lookup("SR");
		System.out.println(" client is ready");
		System.out.println(server.getCustomerDAO().read("Me"));
		

	}
	


	

	
}
