package sep.via.dk.sep3JPA.dao.customer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sep.via.dk.sep3JPA.domain.Customer;
import sep.via.dk.sep3JPA.domain.movie.Movie;

// for update data it will be needed in movie 
@Transactional
@Repository

public class CustomerDAOImplementation implements CustomerDAO {

	@PersistenceContext
	@Autowired
	public EntityManager entityManager;

	@Override
	public Customer getCustomerById(int id) {

		return entityManager.find(Customer.class, id);

	}

	@Override
	public boolean customerExist(String username) {

		String jpql = "from Customer as a WHERE a.username = ?0 ";
		int count = entityManager.createQuery(jpql).setParameter(0, username).getResultList().size();
		return count > 0;

	}

	@Override
	public void addCustomer(Customer customer) {

		entityManager.persist(customer);

	}

	@Override
	public List<Customer> getCustomerByUsername(String username) {
		String jpql = "select * from Customer as a WHERE a.username = ?0 ";
		return (List<Customer>) entityManager.createNativeQuery(jpql).setParameter(0, username).getResultList();
	}

}
