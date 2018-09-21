package headquarterServer;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import model.Customer;
import model.CustomerList;

public class HeahquarterRemoteObject extends UnicastRemoteObject
      implements HeadquarterInterface
{
   private CustomerList list;

   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public HeahquarterRemoteObject() throws RemoteException
   {
      super();
      list = new CustomerList();

   }

   public static void main(String[] args)
   {
      try
      {
         LocateRegistry.createRegistry(1099);

         HeadquarterInterface hqServer = new HeahquarterRemoteObject();

         Naming.rebind("headquarter", hqServer);
         System.out.println("the headquarter server is ready ... ");
      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      }

   }

   @Override
   public void addCustomer(Customer customer) throws RemoteException
   {
      list.addCustomer(customer);
      System.out.println(" customer has been added");
   }

   @Override
   public void removeCustomre(Customer customer) throws RemoteException
   {
      list.removeCustomer(customer);
      
   }

   @Override
   public ArrayList<Customer> getAllCustomers()
   {
      return list.getAllCustomers();
   }

   @Override
   public void sayHi() throws RemoteException
   {
      System.out.println(" Hi from the Headquater remote object ");

   }

   @Override
   public void printClientMessage(String message, Object obj)
         throws RemoteException
   {

      System.out.println(
            "the message from " + obj.getClass().getName() + " is :" + message);
   }

}
