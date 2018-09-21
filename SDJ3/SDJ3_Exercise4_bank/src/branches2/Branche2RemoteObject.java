package branches2;


import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import headquarterServer.HeadquarterInterface;
import headquarterServer.HeahquarterRemoteObject;

public class Branche2RemoteObject extends UnicastRemoteObject
      implements Serializable, Branche2Interface, HeadquarterInterface
{
  

   private HeadquarterInterface headquarterInterface;
   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public Branche2RemoteObject() throws RemoteException
   {
      super();

      try
      {

         headquarterInterface = (HeadquarterInterface) Naming
               .lookup("rmi://localhost:1099/headquarter");

      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      }

   }

   public static void main(String[] args)
   {
      try
      {
         LocateRegistry.createRegistry(1097);

         Branche2Interface branche1Server = new Branche2RemoteObject();

         Naming.rebind("branche2", branche1Server);
         System.out.println("the branche2  server is ready ... ");
      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      }

      
      try
      {
         HeadquarterInterface headquarterServerInstance = new HeahquarterRemoteObject();
         headquarterServerInstance.sayHi();
          Branche2RemoteObject b = new Branche2RemoteObject();
         headquarterServerInstance.printClientMessage(" I am invoking this method from Branch2 class ", b);
      }
      catch (RemoteException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      
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

      System.out.println(
            "the message from " + obj.getClass().getName() + " is :" + message);
   }

}
