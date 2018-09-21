package branche1;

import java.net.MalformedURLException;
import java.rmi.AccessException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import headquarterServer.HeadquarterInterface;
import model.RemoteCustomerList;

public class Client
{

   public static void main(String[] args) throws AccessException,
         RemoteException, MalformedURLException, NotBoundException
   {
      
      HeadquarterInterface server = new RemoteCustomerList();

      server = (HeadquarterInterface) Naming
            .lookup("rmi://localhost:1097/branchServer");
      System.out.println(" client is ready");
     
   }
   
   
}
