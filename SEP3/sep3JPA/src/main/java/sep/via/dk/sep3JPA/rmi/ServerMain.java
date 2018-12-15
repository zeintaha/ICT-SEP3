//package sep.via.dk.sep3JPA.rmi;
//
//import java.rmi.NotBoundException;
//import java.rmi.Remote;
//import java.rmi.RemoteException;
//import java.rmi.registry.LocateRegistry;
//import java.rmi.registry.Registry;
//
//import sep.via.dk.sep3JPA.rmiClient.RmiClient;
//
//
//
//
//
//public class ServerMain {
//	@SuppressWarnings("unchecked")
//	private static<T extends Remote> T bind(Registry registry, String URI, T remoteObject) throws RemoteException {
//		registry.rebind(URI, remoteObject);
//		try {
//			return (T) registry.lookup(URI);
//		} catch (NotBoundException e) {
//			throw new RemoteException(e.getMessage(), e);
//		}
//	}
//	
//	
//	public static void main(String[] args) throws Exception {
//		
//		Registry reg = LocateRegistry.createRegistry(1099);
//		@SuppressWarnings("unused")
//		RemoteServer sr=bind(reg,"SR",new RmiServer());
//		System.out.println("the server is ready");
//	
//		@SuppressWarnings("unused")
//		RmiClient client = new RmiClient();
//		
//		
//	}
//
//
//}
