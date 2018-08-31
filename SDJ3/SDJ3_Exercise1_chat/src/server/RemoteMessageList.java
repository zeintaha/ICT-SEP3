package server;


import java.rmi.Remote;
import java.rmi.RemoteException;

import Model.Client;




public interface RemoteMessageList extends Remote {

	public void addClients(Client client) throws RemoteException;

	public void addMessageToGeneralChat(Client who, String msg) throws RemoteException;

	public void removeClientFromTheList(Client who) throws RemoteException;
}
