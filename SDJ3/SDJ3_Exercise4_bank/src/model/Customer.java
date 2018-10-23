package model;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Customer extends Remote
{
   String getName()throws RemoteException;
   String getCpr()throws RemoteException;
   void setCpr(String cpr)throws RemoteException;
   Account getAccount()throws RemoteException;
   void setAddress(String address)throws RemoteException;
   String getAddress()throws RemoteException;
   String toString1()throws RemoteException;

}
