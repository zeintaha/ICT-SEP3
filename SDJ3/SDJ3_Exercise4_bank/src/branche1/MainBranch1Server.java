package branche1;

import java.net.MalformedURLException;
import java.rmi.AccessException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MainBranch1Server
{

   public static void main(String[] args) throws AccessException,
         RemoteException, MalformedURLException, NotBoundException{       
   Branche1Interface branch = new Branche1RemoteObject();
      System.out.println(" done ");
      
     
   }
   
   
}
