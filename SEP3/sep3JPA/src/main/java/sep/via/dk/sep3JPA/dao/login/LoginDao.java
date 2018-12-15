package sep.via.dk.sep3JPA.dao.login;

import java.rmi.RemoteException;

public interface LoginDao {

	boolean customerAuthentication(String username, String password)throws RemoteException;

	boolean AuthenticateSubscription(String username)throws RemoteException;

	boolean ownerAuthentication(String username, String password)throws RemoteException;

}
