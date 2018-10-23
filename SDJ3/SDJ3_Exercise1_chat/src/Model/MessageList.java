package Model;
import java.util.ArrayList;

public class MessageList {
	private Message msg;
	private Client client;
	private ArrayList<Message> messages;
	private ArrayList<Client> clients;

	public MessageList( String clientName, String message) {
		this.messages = new ArrayList<Message>();
		this.msg = new Message(message);
		this.client = new Client(clientName);
		this.clients = new ArrayList<Client>();
	}

	public void addMessage(Client client, Message msg ) {
		messages.add(msg);
		addClient(client);

	}

	public void addClient(Client client) {
		clients.add(client);

	}

	public void getTheLastIndex() {
		System.out.println(clients.get(clients.size()-3).getName() + ": " + (messages.get(messages.size() - 3)).getMessage());
	}

}