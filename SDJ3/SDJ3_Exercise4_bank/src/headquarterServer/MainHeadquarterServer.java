package headquarterServer;

import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class MainHeadquarterServer
{
public static void main (String[] args) throws ClassNotFoundException, IOException {
  
   HeadquarterInterface server = new HeadquarterServer();
   Registry reg = LocateRegistry.createRegistry(1099);
   reg.rebind("headquarter", server);
   System.out.println("the Headquarter server is ready ... ");
   System.out.println(" done ");
}

}
