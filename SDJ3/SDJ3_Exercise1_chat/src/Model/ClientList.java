package Model;
import java.util.ArrayList;

public class ClientList {
	ArrayList<Client> clients;
	private Client client;

	public ClientList() {
		clients = new ArrayList<Client>();
		client = new Client("Taha");

	}

	public void addClinet(Client client) {
		clients.add(client);
	}

	public void removeClient(Client client) {
		clients.remove(client);
	}

	public int getNumberOfClients() {
		return clients.size();
	}
	
	public String toString() {
		

		return clients.toString();
		
		
	}
	public void getAllClients() {
		for (int i = 0; i < clients.size(); i++) {
			System.out.println(clients.get(i).getName());
		}
	}
}
