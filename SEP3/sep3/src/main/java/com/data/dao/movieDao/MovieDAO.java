package com.data.dao.movieDao;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.data.model.movie.AbstractMovie;

public interface MovieDAO extends Remote {

	public void create(AbstractMovie movie) throws RemoteException;

	public AbstractMovie read(String name) throws RemoteException;

	public void delete(AbstractMovie movie) throws RemoteException;

}