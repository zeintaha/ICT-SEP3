//package sep.via.dk.sep3JPA.dao;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import sep.via.dk.sep3JPA.socket.Message;
//
//@Transactional
//@Repository
//public class MessageDAO {
//
//	@PersistenceContext
//	@Autowired
//	public EntityManager entityManager;
//
//	public void addMessage(Message message) {
//
//		entityManager.persist(message);
//
//	}
//
//}
