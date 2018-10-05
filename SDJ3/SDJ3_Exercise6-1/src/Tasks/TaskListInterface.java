package Tasks;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TaskListInterface extends Remote {
	public void add(Task task) throws RemoteException;
	public Task getAndRemoveNextTask() throws RemoteException;
	public int size() throws RemoteException;
}
