package sep.via.dk.sep3JPA.service.login;

import java.rmi.RemoteException;

public interface LoginService {

	boolean customerAuthentication(String username,String password)throws RemoteException;

	boolean ownerAuthentication(String username, String password)throws RemoteException;
	
}
