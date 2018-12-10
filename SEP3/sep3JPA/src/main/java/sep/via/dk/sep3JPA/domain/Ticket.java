package sep.via.dk.sep3JPA.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import sep.via.dk.sep3JPA.domain.movie.Movie;

@Entity
@Table(name = "Ticket")
public class Ticket implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer cusotmer;

	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate date;

	public Ticket() {

	}

	public Ticket(Integer id, Customer cusotmer, Movie movie, LocalDate date) {
		super();
		this.id = id;
		this.cusotmer = cusotmer;
		this.movie = movie;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCusotmer() {
		return cusotmer;
	}

	public void setCusotmer(Customer cusotmer) {
		this.cusotmer = cusotmer;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", cusotmer=" + cusotmer + ", movie=" + movie + ", date=" + date + "]";
	}

}
