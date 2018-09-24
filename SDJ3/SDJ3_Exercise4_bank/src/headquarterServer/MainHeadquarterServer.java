package headquarterServer;

import java.io.IOException;


public class MainHeadquarterServer
{
public static void main (String[] args) throws ClassNotFoundException, IOException {
   @SuppressWarnings("unused")
   HeadquarterInterface server = new HeadquarterServer();
   System.out.println(" done ");
}

}
