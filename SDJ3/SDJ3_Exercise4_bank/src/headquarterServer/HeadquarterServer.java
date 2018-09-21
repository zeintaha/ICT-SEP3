package headquarterServer;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
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

   public HeadquarterServer() throws RemoteException
   {
      
   }

   public static void main(String[] args) throws RemoteException
   {
      HeadquarterInterface h = new HeadquarterServer();
      
      try
      {
         LocateRegistry.createRegistry(1099);

         HeadquarterInterface hqServer = new HeadquarterServer();

         Naming.rebind("headquarter", hqServer);
         System.out.println("the Headquarter server is ready ... ");
      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      }

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
