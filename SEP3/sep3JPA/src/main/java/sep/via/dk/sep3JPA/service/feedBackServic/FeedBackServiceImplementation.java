package sep.via.dk.sep3JPA.service.feedBackServic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sep.via.dk.sep3JPA.dao.feedBack.FeedBackDAO;
import sep.via.dk.sep3JPA.domain.Message;

@Service
public class FeedBackServiceImplementation implements FeedBackService {
	@Autowired
	private FeedBackDAO feedBackDAO;

	@Override
	public void addFeedBack(Message feedBack) {
		feedBackDAO.addFeedBack(feedBack);

	}

	@Override
	public List<Message> getAllFeedBack() {
		return feedBackDAO.getAllFeedBack();
	}
	
	

}
