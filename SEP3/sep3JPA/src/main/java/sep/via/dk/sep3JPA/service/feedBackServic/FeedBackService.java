package sep.via.dk.sep3JPA.service.feedBackServic;

import java.util.List;

import sep.via.dk.sep3JPA.domain.FeedBack;

public interface FeedBackService {
	public void addFeedBack(FeedBack feedBack);

	public List<FeedBack> getAllFeedBack();
}
