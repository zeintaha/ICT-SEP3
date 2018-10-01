package ClientTest;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import branche1.Branch1Interface;
import branche1.Branch1RemoteObject;
import model.Account;
import model.Customer;

public class Test
{

   public static void main(String[] args)
         throws MalformedURLException, RemoteException, NotBoundException
   {

      Branch1Interface branchClient = new Branch1RemoteObject();

      branchClient = (Branch1Interface) Naming
            .lookup("rmi://localhost:1098/branch1");
      System.out.println(" client is ready");

      Account account = new Account("kr", 100, 123456789);
      branchClient.registerCustomer("Fadi", "01112254", "Horsens", account);
//       branchClient.deposite(100, "kr");
      ArrayList<Customer> cust = new ArrayList<Customer>();
      cust = branchClient.getAllCustomers();
     
      System.out.println( cust.size());
      
   }

}
