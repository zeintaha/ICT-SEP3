package dao.customer;

import java.rmi.Remote;
import java.rmi.RemoteException;

import model.customer.Customer;

public interface CustomerDAO extends Remote
{
   public Customer create(String cpr, String name, String address)
         throws RemoteException;

   public Customer read(String cpr) throws RemoteException;

   public void delete(Customer customer) throws RemoteException;

   public void update(Customer customer) throws RemoteException;

  

}
