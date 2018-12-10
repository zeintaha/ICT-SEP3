package sep.via.dk.sep3JPA.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sep.via.dk.sep3JPA.dao.login.LoginDao;

@Service
public class LoginImplementation implements LoginService {

	@Autowired
	public LoginDao login;

	@Override
	public boolean customerAuthentication(String username, String password) {
		 if (login.customerAuthentication(username,password) ){
		        return true;
		    } 
		        return false;
		    
		
	}

	@Override
	public boolean ownerAuthentication(String username, String password) {

		 if (login.ownerAuthentication(username,password) ){
		        return true;
		    } 
		        return false;
		    

}
}