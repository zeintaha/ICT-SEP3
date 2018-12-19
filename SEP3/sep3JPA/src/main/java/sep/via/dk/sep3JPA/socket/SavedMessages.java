package sep.via.dk.sep3JPA.socket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sep.via.dk.sep3JPA.dao.message.MessageDAO;
import sep.via.dk.sep3JPA.domain.Message;

public class SavedMessages {
	

	public SavedMessages() {

	}

	public String getMessage(String msg) {
		return msg + "welcom to the server";
	}


}
