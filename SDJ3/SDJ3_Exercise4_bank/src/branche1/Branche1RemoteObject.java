package branche1;

import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import headquarterServer.HeadquarterInterface;
import headquarterServer.HeahquarterRemoteObject;

public class Branche1RemoteObject extends UnicastRemoteObject
      implements Serializable, Branche1Interface, HeadquarterInterface
{
  

   private HeadquarterInterface headquarterInterface;
   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public Branche1RemoteObject() throws RemoteException
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
         LocateRegistry.createRegistry(1098);

         Branche1Interface branche1Server = new Branche1RemoteObject();

         Naming.rebind("branche1", branche1Server);
         System.out.println("the branche1  server is ready ... ");
      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      }

      
      try
      {
         HeadquarterInterface headquarterServerInstance = new HeahquarterRemoteObject();
         headquarterServerInstance.sayHi();
          Branche1RemoteObject b = new Branche1RemoteObject();
         headquarterServerInstance.printClientMessage(" I am invoking this method from Branch1 class ", b);
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
