package sep.via.dk.sep3JPA.dao.owner;

import java.rmi.RemoteException;

import sep.via.dk.sep3JPA.domain.Owner;

public interface OwnerDAO{
	boolean ownerExist(String username)throws RemoteException;

	void addOwner(Owner owner)throws RemoteException;

	Owner getOwnerById(int id)throws RemoteException;

}
