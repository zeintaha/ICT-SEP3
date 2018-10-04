package model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import headquarterServer.HeadquarterInterface;

public class RemoteCustomerList extends UnicastRemoteObject
      implements HeadquarterInterface
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   public ArrayList<Customer> customers = new ArrayList<Customer>();
   private Account account;

   public RemoteCustomerList() throws RemoteException
   {

   }

   public void removeCustomer(RemoteCustomer customer) throws RemoteException
   {
      customers.remove(customer);

   }

   public RemoteCustomer getCustomerByCpr(String cpr) throws RemoteException
   {
      RemoteCustomer customer = null;
      for (int i = 0; i < customers.size(); i++)
      {
         if (customers.get(i).getCpr().equals(cpr))
         {
            customer = (RemoteCustomer) customers.get(i);
         }

      }
      return customer;

   }

   public ArrayList<Customer> getAllCustomers() throws RemoteException
   {
      return customers;
   }

   public void showAllCustomers() throws RemoteException
   {
      for (int i = 0; i < customers.size(); i++)
      {
         System.out.println(customers.get(i));
      }

   }

   @Override
   public void SayHi() throws RemoteException
   {
     System.out.println(" Hi feom the remote customer list ");

   }

   @Override
   public Customer registerCustomer(String name, String cpr, String address,
         Account account) throws RemoteException
   {
      RemoteCustomer customer = new RemoteCustomer(name, cpr, address, account);
      customers.add(customer);
      return customer;
   }

   @Override
   public void withdraw(double amount, String currency) throws RemoteException
   {
      account.withdraw(amount, currency);

   }

   @Override
   public void transfer(RemoteCustomer toCustomer, double amount,
         String currency) throws RemoteException
   {
      account.transfer(toCustomer, amount, currency);

   }

   @Override
   public void deposite(double amount, String currency) throws RemoteException
   {
      account.deposite(amount, currency);

   }

}
