import java.rmi.RemoteException;

import dao.CustomerDAOService;
import dao.server.Server;
import model.customer.Customer;

public class TestMain
{
public static void main(String[] args) throws RemoteException
{
   Server server = new Server();
  CustomerDAOService customer = (CustomerDAOService) server.getCustomerDAO();
 
//  customer.create("010101", "fidodido", "Horsens3");
 
Customer custom = customer.read("1234567890");
  System.out.println("done");
  System.out.println(custom.toString());
}

}
