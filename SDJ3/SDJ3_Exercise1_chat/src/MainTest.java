import Model.Client;
import Model.ClientList;
import Model.Message;
import Model.MessageList;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message msg = new Message(" Hello from the message ");
		Client client = new Client("Taha");
		
		Message msg1 = new Message(" Hello from the message1 ");
		Client client1 = new Client("Fadi");
		
		Message msg2 = new Message(" Hello from the message2 ");
		Client client2 = new Client("Nadeem");
		
		MessageList msgList = new MessageList(client.clientName, msg.getMessage());
		// ClientList clientList = new ClientList();
		msgList.addMessage(client, msg);
		msgList.addMessage(client1,msg1);
		msgList.addMessage(client2, msg2);
		
		
		
		ClientList clientlist = new ClientList ();
		
		clientlist.addClinet(client);
		clientlist.addClinet(client1);
		clientlist.addClinet(client2);
		
		

		System.out.println();
		msgList.getTheLastIndex();
		clientlist.getAllClients();
		


	}

}
