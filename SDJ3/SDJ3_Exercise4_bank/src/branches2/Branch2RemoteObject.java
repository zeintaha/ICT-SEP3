package branches2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import headquarterServer.HeadquarterInterface;
import model.Account;
import model.Customer;
import model.RemoteCustomer;
import model.RemoteCustomerList;

public class Branch2RemoteObject extends UnicastRemoteObject
      implements Branch2Interface

{
   HeadquarterInterface server;
   /**
   * 
   */
   private static final long serialVersionUID = 1L;

   public Branch2RemoteObject()
         throws RemoteException, MalformedURLException, NotBoundException

   {
     

   }

   @Override
   public void removeCustomer(RemoteCustomer customer) throws RemoteException
   {
      server.removeCustomer(customer);

   }

   @Override
   public Customer getCustomerByCpr(String cpr) throws RemoteException
   {

      return server.getCustomerByCpr(cpr);
   }

   @Override
   public ArrayList<Customer> getAllCustomers() throws RemoteException
   {

      return server.getAllCustomers();
   }

   @Override
   public void showAllCustomers() throws RemoteException
   {
      server.showAllCustomers();
   }

   @Override
   public void SayHi() throws RemoteException
   {
      server.SayHi();
      System.out.println(" this hi is from the branch server");
   }

   @Override
   public Customer registerCustomer(String name, String cpr, String address,
         Account account) throws RemoteException
   {

      return server.registerCustomer(name, cpr, address, account);
   }

   public void runTheServer() throws RemoteException
   {
      Registry reg = LocateRegistry.createRegistry(1097);
      reg.rebind("branch1", this);
      System.out.println(" branch 2 server is ready ... ");

   }

   public void connectToTheHeadquarter() throws RemoteException
   {
      server = new RemoteCustomerList();
      try
      {
         server = (HeadquarterInterface) Naming
               .lookup("rmi://localhost:1099/headquarter");
      }
      catch (MalformedURLException | NotBoundException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      System.out
            .println("  branch 2 is connected to the headquarter server");

      Account account = new Account("DKK", 1000, 123456789);

      server.registerCustomer("Fadi", " 0109991234", " Horsens ", account);
      server.showAllCustomers();

   }

}
