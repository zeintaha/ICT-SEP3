package sep.via.dk.sep3JPA.service.ownerService;

import java.rmi.RemoteException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sep.via.dk.sep3JPA.dao.owner.OwnerDAO;
import sep.via.dk.sep3JPA.domain.Owner;

@Service
public class OwnerServiceImplementation implements OwnerService {

	@Autowired
	private OwnerDAO rmiClient;

	@Override
	public boolean addOwner(Owner owner) {
		if (rmiClient.ownerExist(owner.getUsername())) {
			return false;
		} else {
			rmiClient.addOwner(owner);
			return true;
		}

	}

	@Override
	public Owner getOwnerById(int id)  {
		return rmiClient.getOwnerById(id);
	}

}
