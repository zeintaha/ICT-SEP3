//package sep.via.dk.sep3JPA.socket;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.net.Socket;
//import java.net.SocketException;
//public class Client {
//private Socket socket = null;
//private ObjectInputStream inputStream = null;
//private ObjectOutputStream outputStream = null;
//private boolean isConnected = false;
//
//public Client() {
//
//}
//
//public void communicate() {
//
//while (!isConnected) {
//try {
//socket = new Socket("localHost", 8553);
//System.out.println("Connected");
//isConnected = true;
//outputStream = new ObjectOutputStream(socket.getOutputStream());
//FeedBack msg = new FeedBack();
//System.out.println("Object to be written = " + msg.toString());
//outputStream.writeObject(msg);
//
//} catch (SocketException se) {
//se.printStackTrace();
//// System.exit(0);
//} catch (IOException e) {
//e.printStackTrace();
//}
//}
//}}