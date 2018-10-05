package Message;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;



public class MessageClient
{
   private DataInputStream in;
   private DataOutputStream out;
   private Socket socket;
   private Scanner input;

   public MessageClient(String host, int port) throws UnknownHostException, IOException
   {
      Socket clientsocket = new Socket(host, port);
     in = new DataInputStream(clientsocket.getInputStream());
     out = new DataOutputStream(clientsocket.getOutputStream());


      execute();
      close();
   }

   public static void main(String[] args) throws UnknownHostException, IOException
   {
      final int PORT = 6789;
      final String HOST = "localhost";
      
      MessageClient mc = new MessageClient(HOST, PORT);
      mc.execute();
      

   }

   private void execute()

   {
      input = new Scanner(System.in);
      String msg;

      while (true)
      { // run until you terminate the program
         try
         {
            msg = input.nextLine();

           

  

            // Send line to server
            System.out.println("Client> " + msg);
            out.writeBytes(msg);

            // Read line from Server.
            byte serverReply = in.readByte()
            System.out.println("Server> " + serverReply);
            
            Message reply = gson.fromJson(serverReply, Message.class);
            System.out.println("Message: " + reply);

         }
         catch (IOException e)
         {
            e.printStackTrace();
         }
      }

   }

   private void close()
   {
      // Close connection.
      try
      {
         socket.close();
      }
      catch (IOException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }
}
