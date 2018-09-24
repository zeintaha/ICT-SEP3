package branche1;

import java.net.MalformedURLException;
import java.rmi.AccessException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import headquarterServer.HeadquarterInterface;
import model.Account;
import model.RemoteCustomerList;

public class MainBranch1Server
{

   public static void main(String[] args) throws AccessException,
         RemoteException, MalformedURLException, NotBoundException
   {
      Branch1Interface branch = new Branch1RemoteObject();
      branch.runTheServer();
      branch.connectToTheHeadquarter();

   }

}
