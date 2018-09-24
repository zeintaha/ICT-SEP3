package ClientTest;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import branche1.Branch1Interface;
import branche1.Branch1RemoteObject;

public class Test
{public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException
{
   
   Branch1Interface branchClient = new Branch1RemoteObject();
   
         branchClient = (Branch1Interface) Naming
         .lookup("rmi://localhost:1098/branch1");
   System.out.println(" client is ready");
}

}
