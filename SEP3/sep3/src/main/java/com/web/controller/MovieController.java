package com.web.controller;

import java.rmi.RemoteException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.model.movie.AbstractMovie;
import com.web.BrokerClient;

@RestController
@RequestMapping("/sep3/movie")
public class MovieController {

	private BrokerClient brokerClient;

	@Autowired
	public MovieController(BrokerClient brokerClient) {

		this.brokerClient = brokerClient;

	}

	@GetMapping("/{name}")

	public AbstractMovie readMovie(@PathVariable String name) throws RemoteException {

		AbstractMovie movie = brokerClient.readMovie(name);
		return movie;

	}

	@PostMapping()
	public AbstractMovie createUser(@RequestBody AbstractMovie movie) throws RemoteException {

		
		AbstractMovie createdMovie = brokerClient.createMovie(movie);
		return createdMovie;

	}

	@DeleteMapping("/{name}")
	public AbstractMovie deleteUser(@PathVariable String name) throws RemoteException {

		AbstractMovie movie = brokerClient.readMovie(name);
		brokerClient.deleteMovie(movie);
		;
		return movie;
	}

}
