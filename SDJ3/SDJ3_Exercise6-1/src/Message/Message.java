package Message;

import java.rmi.server.RemoteRef;

public class Message {
	private int messageType;
	private int requestId;
	private RemoteRef remoteReference;
	private int operationId;
	private Byte[] arguments;
	
	public Message(int messageType, int requestId, RemoteRef remoteReference, int operationId,
			Byte[] arguments) {
		super();
		this.messageType = messageType;
		this.requestId = requestId;
		this.remoteReference = remoteReference;
		this.operationId = operationId;
		this.arguments = arguments;
	}


}
