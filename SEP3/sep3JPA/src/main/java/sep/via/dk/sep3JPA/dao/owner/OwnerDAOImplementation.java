package sep.via.dk.sep3JPA.dao.owner;

import java.rmi.RemoteException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sep.via.dk.sep3JPA.domain.Owner;

@Transactional
@Repository
public class OwnerDAOImplementation implements OwnerDAO {

	@PersistenceContext
	@Autowired
	public EntityManager entityManager;

	@Override
	public boolean ownerExist(String username)throws RemoteException {
		String jpql = "from Owner as a WHERE a.username = ?0 ";
		int count = entityManager.createQuery(jpql).setParameter(0, username).getResultList().size();
		return count > 0;

	}

	@Override
	public void addOwner(Owner owner)throws RemoteException {
		entityManager.persist(owner);

	}

	@Override
	public Owner getOwnerById(int id)throws RemoteException {
		return entityManager.find(Owner.class, id);
	}

}
