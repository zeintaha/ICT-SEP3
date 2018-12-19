package sep.via.dk.sep3JPA.dao.feedBack;

import java.util.List;

import sep.via.dk.sep3JPA.domain.FeedBack;

public interface FeedBackDAO {
	public void addFeedBack(FeedBack feedBack);

	public List<FeedBack> getAllFeedBack();
}
