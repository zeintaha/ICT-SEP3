package branche1;

import java.net.MalformedURLException;
import java.rmi.AccessException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import headquarterServer.HeadquarterInterface;
import headquarterServer.HeadquarterServer;
import model.Account;
import model.Customer;
import model.RemoteCustomer;
import model.RemoteCustomerList;

public class Branche1RemoteObject extends UnicastRemoteObject
      implements Branche1Interface

{
   HeadquarterInterface server;
   /**
   * 
   */
   private static final long serialVersionUID = 1L;

   public Branche1RemoteObject()
         throws RemoteException, MalformedURLException, NotBoundException

   {
      server = new RemoteCustomerList();
      Registry reg = LocateRegistry.createRegistry(1098);
      reg.rebind("branch", this);
      System.out.println("the branch server is ready ... ");

      server = (HeadquarterInterface) Naming
            .lookup("rmi://localhost:1099/headquarter");
      System.out.println(" client is ready");

      Account account = new Account("DKK", 1000, 123456789);

      server.registerCustomer("Fadi", " 0109991234", " Horsens ", account);
      server.showAllCustomers();

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

}
