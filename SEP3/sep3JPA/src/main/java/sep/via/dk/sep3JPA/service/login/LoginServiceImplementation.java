package sep.via.dk.sep3JPA.service.login;

import java.rmi.RemoteException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sep.via.dk.sep3JPA.dao.login.LoginDao;

@Service
public class LoginServiceImplementation implements LoginService {

	
	@Autowired
	private LoginDao rmiClient;

	@Override
	public boolean customerAuthentication(String username, String password) {
		 if (rmiClient.customerAuthentication(username,password) && rmiClient.AuthenticateSubscription(username) ){
		        return true;
		    } 
		        return false;
		    
		
	}

	@Override
	public boolean ownerAuthentication(String username, String password) {

		 if (rmiClient.ownerAuthentication(username,password) ){
		        return true;
		    } 
		        return false;
		    

}
}