package sep.via.dk.sep3JPA.service.feedBackServic;

import java.util.List;

import sep.via.dk.sep3JPA.domain.Message;

public interface FeedBackService {
	public void addFeedBack(Message feedBack);

	public List<Message> getAllFeedBack();
}
