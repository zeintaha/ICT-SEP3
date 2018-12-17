package sep.via.dk.sep3JPA.dao.login;

import java.rmi.RemoteException;

public interface LoginDao {

	boolean customerAuthentication(String username, String password);

	boolean AuthenticateSubscription(String username);

	boolean ownerAuthentication(String username, String password);

}
