package sep.via.dk.sep3JPA.dao.feedBack;

import java.util.List;

import sep.via.dk.sep3JPA.domain.Message;

public interface FeedBackDAO {
	public void addFeedBack(Message feedBack);

	public List<Message> getAllFeedBack();
}
