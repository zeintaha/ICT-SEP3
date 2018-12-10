package sep.via.dk.sep3JPA.dao.login;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository


public class LoginDAOImplementation implements LoginDao{
	@PersistenceContext
	@Autowired
	public EntityManager entityManager;

	@Override
	public boolean customerAuthentication(String username, String password) {
		
		String jpql = "from Customer as a WHERE a.username = ?0  and a.password = ?1";
		int count = entityManager.createQuery(jpql).setParameter(0, username).setParameter(1, password).getResultList().size();
		return count > 0;
	}

	@Override
	public boolean ownerAuthentication(String username, String password) {
		
		String jpql = "from Owner as a WHERE a.username = ?0  and a.password = ?1";
		int count = entityManager.createQuery(jpql).setParameter(0, username).setParameter(1, password).getResultList().size();
		return count > 0;
	}
}
