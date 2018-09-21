package headquarterServer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HeadquarterInterface extends Remote
{
   public void sayHi() throws RemoteException; 
   public void printClientMessage(String message, Object obj) throws RemoteException;

}
