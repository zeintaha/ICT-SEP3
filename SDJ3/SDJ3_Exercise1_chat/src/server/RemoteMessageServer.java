package server;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import Model.Client;
import Model.ClientList;
import Model.Message;
import Model.MessageList;

public class RemoteMessageServer extends UnicastRemoteObject implements RemoteMessageList {

	Client client = new Client ("client1");
	
	ClientList clientlist = new ClientList();
	
	Message message = new Message ("Message1");
	MessageList messagelist = new MessageList ("client1", "Message1");


public static void main(String[] args)
  {
     try
     {
        Registry reg = LocateRegistry.createRegistry(1099);
        RemoteMessageList chatserver = new RemoteMessageServer();
        Naming.rebind("ChatServer", chatserver);
        System.out.println("Starting server...");
        System.out.println("Server is started!");
     }
     catch (Exception ex)
     {
        ex.printStackTrace();
     }
  }
	public RemoteMessageServer() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void addClients(Client client) {
		clientlist.addClinet(client);
		
	}
	@Override
	public void addMessageToGeneralChat(Client who, String msg) {
		messagelist.addMessage(client, message);

	}
	@Override
	public void removeClientFromTheList(Client who) {

	clientlist.removeClient(who);
		
		
	}


}
