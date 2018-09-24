package branche1;

import java.net.MalformedURLException;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MainBranch1Server
{

   public static void main(String[] args) throws AccessException,
         RemoteException, MalformedURLException, NotBoundException{       
   @SuppressWarnings("unused")
   Branch1Interface branch = new Branch1RemoteObject();
      System.out.println(" done ");
      
     
   }
   
   
}
