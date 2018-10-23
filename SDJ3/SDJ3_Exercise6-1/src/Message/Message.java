package Message;

import java.rmi.server.RemoteRef;

public class Message {
	private int messageType;
	private int requestId;
	private static RemoteRef remoteReference;
	private int operationId;
	private byte[] arguments;
	
	public Message(int messageType, int requestId, RemoteRef remoteReference, int operationId,
			byte[] arguments) {
		super();
		this.requestId = requestId;
		this.remoteReference = remoteReference;
		this.operationId = operationId;
		this.arguments = arguments;
	} 


}
