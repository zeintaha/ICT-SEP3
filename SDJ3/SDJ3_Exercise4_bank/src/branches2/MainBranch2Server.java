package branches2;

import java.net.MalformedURLException;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MainBranch2Server
{

   public static void main(String[] args) throws AccessException,
         RemoteException, MalformedURLException, NotBoundException{       
   @SuppressWarnings("unused")
   Branch2Interface branch = new Branch2RemoteObject();
      System.out.println(" done ");
      
     
   }
   
   
}
