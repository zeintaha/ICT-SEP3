package headquarterServer;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class HeahquarterRemoteObject extends UnicastRemoteObject implements HeadquarterInterface
{

   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public HeahquarterRemoteObject() throws RemoteException {
      super();
      
      
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
   public void sayHi() throws RemoteException
   {
      System.out.println(" Hi from the Headquater remote object ");
      
   }

   @Override
   public void printClientMessage(String message, Object obj) throws RemoteException
   {
      
      System.out.println("the message from " + obj.getClass().getName() + " is :" + message);
   }
   
   
   

}
