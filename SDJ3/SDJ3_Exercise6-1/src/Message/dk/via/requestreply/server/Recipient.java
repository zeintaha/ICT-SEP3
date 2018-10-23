package Message.dk.via.requestreply.server;

import Message.dk.via.requestreply.Message;

public interface Recipient {

	byte[] interpret(Message message);

}