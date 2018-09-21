package branche1;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import model.Account;
import model.Customer;
import model.RemoteCustomer;

public interface Branche1Interface extends Remote
{

   void removeCustomer(RemoteCustomer customer) throws RemoteException;

   Customer getCustomerByCpr(String cpr) throws RemoteException;

   ArrayList<Customer> getAllCustomers() throws RemoteException;

   void showAllCustomers() throws RemoteException;

   public void SayHi() throws RemoteException;

   Customer registerCustomer(String name, String cpr, String address,
         Account account) throws RemoteException;

}
