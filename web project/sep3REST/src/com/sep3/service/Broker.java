package com.sep3.service;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import persistenceTier.RMIserver.ServerRemote;
import persistenceTier.model.customer.Customer;


@Path("/sep3")
public class Broker extends UnicastRemoteObject {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


private ServerRemote server;

	public Broker() throws RemoteException, NotBoundException {
		super();
		this.server = server ;
		Registry registry = LocateRegistry.getRegistry(1099);
		server = (ServerRemote) registry.lookup("SR");
		System.out.println(" client is ready");
		System.out.println(server.getCustomerDAO().read("Me"));

	}

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)

	public Response readCustomer() throws RemoteException {

		try {
			Customer customer = server.getCustomerDAO().read("Me");
			return Response.status(200).entity(customer).build();
		} catch (NumberFormatException e) {
			return Response.status(400).build();
		} catch (IndexOutOfBoundsException e) {
			return Response.status(404).build();
		}

	}
	
	@GET
	@Path("{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response readUser(@PathParam("name") String name) throws IOException {
		try {
			Customer customer = server.getCustomerDAO().read(name);
			return Response.status(200).entity(customer).build();
		} catch (NumberFormatException e) {
			return Response.status(400).build();
		} catch (IndexOutOfBoundsException e) {
			return Response.status(404).build();
		}
	}
	
	@POST
	@Path("{createCustomer}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createUser(@PathParam("name") String name,@PathParam("cpr") String cpr,@PathParam("address") String address) throws RemoteException {
	Customer customer = new Customer(name, cpr, address);
		 server.getCustomerDAO().create(name, cpr, address);
		return Response.status(201).build();
	}

}