package ClientTest;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import org.junit.Before;
import org.junit.Test;

import branche1.Branch1Interface;
import branche1.Branch1RemoteObject;
import model.Account;

public class TestClient
{
   Branch1Interface branchClient;
   Account account;

   @Before
   public void setUp()
         throws RemoteException, NotBoundException, MalformedURLException
   {

      branchClient = new Branch1RemoteObject();

      branchClient = (Branch1Interface) Naming
            .lookup("rmi://localhost:1098/branch1");
      System.out.println(" client is ready");
       account = new Account("kr", 100, 123456789);
   }

   @Test
   public void testRegisterCar() throws RemoteException
   {
     
     
      branchClient.registerCustomer("Fadi", "01112254", "Horsens", account);

      assertEquals("Fadi", branchClient.getCustomerByCpr("01112254").getName());
     
   }

}
