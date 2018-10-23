package client;

import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.RemoteException;

import server.RemoteMessageList;

public class RmiClient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RemoteMessageList server;

	public RmiClient() throws RemoteException {
		super();
		try {
			server = (RemoteMessageList) Naming.lookup("rmi://localhost:1099/ChatServer");
			System.out.println("hello");

		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) throws RemoteException {
		RmiClient client = new RmiClient();

	}
}
