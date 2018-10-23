package model.movie;

import java.io.Serializable;

public abstract class AbstractMovie implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private String name;
	private String director;
	private String description;
	private String duration;
	private String urlTrailer;
	private String urlFullMovie;
	private String urlImage;

	public AbstractMovie(String name, String director, String description, String duration, String urlTrailer,
			String urlFullMovie, String urlImage) {
		this.name = name;
		this.director = director;
		this.description = description;
		this.duration = duration;
		this.urlTrailer = urlTrailer;
		this.urlFullMovie = urlFullMovie;
		this.urlImage = urlImage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getUrlTrailer() {
		return urlTrailer;
	}

	public void setUrlTrailer(String urlTrailer) {
		this.urlTrailer = urlTrailer;
	}

	public String getUrlFullMovie() {
		return urlFullMovie;
	}

	public void setUrlFullMovie(String urlFullMovie) {
		this.urlFullMovie = urlFullMovie;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	@Override
	public String toString() {
		return "AbstractMovie [name=" + name + ", director=" + director + ", description=" + description + ", duration="
				+ duration + ", urlTrailer=" + urlTrailer + ", urlFullMovie=" + urlFullMovie + ", urlImage=" + urlImage
				+ "]";
	}

}
