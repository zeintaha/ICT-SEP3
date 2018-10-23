package Message;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private static ServerSocket welcomingSocket;

	public Server(int port) {
		try {
			welcomingSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		do {
			System.out.println("Waiting for a client...");
			getRequest();
		} while (true);

	}

	public static void main(String args[]) throws IOException {
		final int PORT = 6789;
		System.out.println("Starting Server...");

		Server CS = new Server(PORT);
		CS.getRequest();
	}



	public byte[] getRequest() {
		Socket connSocket = null;
		while (true) { // run until you terminate the program
			try {
				// Block until a connection is made.
				connSocket = welcomingSocket.accept();
				System.out.println("Socket: " + connSocket);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void sendReply(byte[] reply, InetAddress clientHost, int clientPort) {
	}
}
