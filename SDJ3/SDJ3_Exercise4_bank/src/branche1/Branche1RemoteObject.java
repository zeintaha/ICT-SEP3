package branche1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import headquarterServer.HeadquarterInterface;
import headquarterServer.HeahquarterRemoteObject;
import model.Account;
import model.Customer;

public class Branche1RemoteObject extends UnicastRemoteObject
      implements Branche1Interface
{
  

   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public Branche1RemoteObject() throws RemoteException
   {
      super();

      // try
      // {
      //
      // headquarterInterface = (HeadquarterInterface) Naming
      // .lookup("rmi://localhost:1099/headquarter");
      //
      // }
      // catch (Exception ex)
      // {
      // ex.printStackTrace();
      // }

   }

   public static void main(String[] args) throws RemoteException
   {
      Branche1Interface branche1Server = new Branche1RemoteObject();
      
      try
      {

        

         LocateRegistry.createRegistry(1098);
         Naming.rebind("branche1", branche1Server);
         System.out.println("the branche1  server is ready ... ");
      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      }

      HeadquarterInterface headquarterInterface = new HeahquarterRemoteObject();
      try
      {

         headquarterInterface = (HeadquarterInterface) Naming
               .lookup("rmi://localhost:1099/headquarter");

      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      }
     
      headquarterInterface.sayHi();
     
      headquarterInterface.printClientMessage(
            " I am invoking this method from Branch1 class ", branche1Server);
      Account account = new Account("dkk", 100, 123456789);
      Customer customer1 = new Customer("Fadi", "0101011912", account);
      headquarterInterface.addCustomer(customer1);
      headquarterInterface.getAllCustomers();
   }

   @Override
   public void sayHi() throws RemoteException
   {
      System.out.println(" Hi from the Branche1 remote object ");

   }

   @Override
   public void printClientMessage(String message, Object obj)
         throws RemoteException
   {

//      System.out.println(
//            "the message from " + obj.getClass().getName() + " is :" + message);
   }

}
