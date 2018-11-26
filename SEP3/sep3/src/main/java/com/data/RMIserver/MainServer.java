package com.data.RMIserver;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.web.BrokerClient;





public class MainServer {
	@SuppressWarnings("unchecked")
	private static<T extends Remote> T bind(Registry registry, String URI, T remoteObject) throws RemoteException {
		registry.rebind(URI, remoteObject);
		try {
			return (T) registry.lookup(URI);
		} catch (NotBoundException e) {
			throw new RemoteException(e.getMessage(), e);
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		
		Registry reg = LocateRegistry.createRegistry(1099);
		ServerRemote sr=bind(reg,"SR",new Server());
		System.out.println("the server is ready and waiting for the client");
		BrokerClient cus = new BrokerClient();
		
	}

}
