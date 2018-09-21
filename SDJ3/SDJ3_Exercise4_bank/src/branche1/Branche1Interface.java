package branche1;




import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Branche1Interface extends Remote
{
   public void sayHi() throws RemoteException; 
   public void printClientMessage(String message, Object obj) throws RemoteException;

}

