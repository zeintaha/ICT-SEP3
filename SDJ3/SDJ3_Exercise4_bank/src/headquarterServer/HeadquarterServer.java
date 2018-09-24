package headquarterServer;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import model.Account;
import model.Customer;
import model.RemoteCustomer;
import model.RemoteCustomerList;

public class HeadquarterServer extends UnicastRemoteObject
      implements HeadquarterInterface
{
   HeadquarterInterface list = new RemoteCustomerList();

   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public HeadquarterServer()
         throws RemoteException, IOException, ClassNotFoundException
   {

      Registry reg = LocateRegistry.createRegistry(1099);
      reg.rebind("headquarter", this);
      System.out.println("the Headquarter server is ready ... ");
   }

   @Override
   public void removeCustomer(RemoteCustomer customer) throws RemoteException
   {
      list.removeCustomer(customer);

   }

   @Override
   public ArrayList<Customer> getAllCustomers() throws RemoteException
   {

      return list.getAllCustomers();
   }

   @Override
   public void showAllCustomers() throws RemoteException
   {
      list.showAllCustomers();

   }

   @Override
   public RemoteCustomer getCustomerByCpr(String cpr) throws RemoteException
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void SayHi() throws RemoteException
   {
      System.out.println(" hi ");

   }

   @Override
   public Customer registerCustomer(String name, String cpr, String address,
         Account account) throws RemoteException
   {

      return list.registerCustomer(name, cpr, address, account);
   }

}
