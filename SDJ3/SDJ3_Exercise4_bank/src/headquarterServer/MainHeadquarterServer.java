package headquarterServer;

import java.io.IOException;
import java.rmi.RemoteException;

public class MainHeadquarterServer
{
public static void main (String[] args) throws ClassNotFoundException, IOException {
   HeadquarterInterface server = new HeadquarterServer();
   System.out.println(" done ");
}

}
