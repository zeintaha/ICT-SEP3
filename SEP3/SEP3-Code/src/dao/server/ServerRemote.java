package dao.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import dao.CustomerDAO;



public interface ServerRemote extends Remote
{
   CustomerDAO getCustomerDAO() throws RemoteException;

}
