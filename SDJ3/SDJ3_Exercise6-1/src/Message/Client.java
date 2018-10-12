package Message;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.rmi.server.RemoteRef;
import java.util.Scanner;

public class Client {
	private DataInputStream in;
	private DataOutputStream out;
	private Socket socket;
	private Scanner input;
	private Message message;
	private ByteConverter bc;
	public String msg = "hello world";

	public Client(String host, int port) throws UnknownHostException, IOException {
		Socket clientsocket = new Socket(host, port);
		in = new DataInputStream(clientsocket.getInputStream());
		out = new DataOutputStream(clientsocket.getOutputStream());

		close();
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		final int PORT = 6789;
		final String HOST = "localhost";

		Client mc = new Client(HOST, PORT);
//      mc.doOperation();

	}

	public byte[] doOperation (RemoteRef s, int operationId, byte[] arguments)

   {
      

      while (true)
      { // run until you terminate the program
         try
         {
        	 
           bc = new ByteConverter();
           byte[] byteMsg = bc.toByteArray(msg);
        	 
           message = new Message(0, 11112, s, 22221, byteMsg);
           

  

            // Send line to server
            System.out.println("Client> " + msg);
            out.

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

	private void close() {
		// Close connection.
		try {
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
