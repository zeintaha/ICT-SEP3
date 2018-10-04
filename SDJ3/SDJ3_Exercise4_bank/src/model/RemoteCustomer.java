package model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteCustomer extends UnicastRemoteObject implements Customer
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private String name;
   private String cpr;
   private String address;
   private Account account;

   public RemoteCustomer(String name, String cpr, String address, Account account) throws RemoteException
   {
      
      this.name = name;
      this.cpr = cpr;
      this.address = address;
      this.account = account;
   }

   public String getName()throws RemoteException
   {
      return name;
   }

   public String getCpr()throws RemoteException
   {
      return cpr;
   }

   public void setCpr(String cpr)throws RemoteException
   {
      this.cpr = cpr;
   }

   public Account getAccount()throws RemoteException
   {
      return account;
   }

   public void setAccount(Account account)throws RemoteException
   {
      this.account = account;
   }

   public void setAddress(String address)throws RemoteException
   {
      this.address = address;
   }

   public String getAddress()throws RemoteException
   {
      return address;
   }

   public String toString1()throws RemoteException
   {
      return "Customer [Name =" + name + ", CPR=" + cpr + ", Account Details="
            + account.toString() + "]";
   }

}
