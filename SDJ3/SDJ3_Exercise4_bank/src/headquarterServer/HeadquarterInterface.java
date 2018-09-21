package headquarterServer;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import model.Customer;

public interface HeadquarterInterface extends Remote
{
   public void sayHi() throws RemoteException; 
   public void printClientMessage(String message, Object obj) throws RemoteException;
   public void addCustomer(Customer customer)throws RemoteException;
   public void removeCustomre(Customer customer)throws RemoteException ;
   public ArrayList<Customer> getAllCustomers() throws RemoteException  ;

}
