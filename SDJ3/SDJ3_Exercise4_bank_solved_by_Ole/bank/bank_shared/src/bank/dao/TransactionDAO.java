package bank.dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import bank.model.Account;
import bank.model.transaction.Transaction;

public interface TransactionDAO extends Remote {
	Transaction read(int transactionId) throws RemoteException;
	List<Transaction> readAllFor(Account account) throws RemoteException;
	void create(Transaction transaction) throws RemoteException;
	void deleteFor(Account account) throws RemoteException;
}
