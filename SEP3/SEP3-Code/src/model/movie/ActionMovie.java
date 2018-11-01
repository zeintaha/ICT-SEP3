package model.movie;

import java.io.Serializable;

public class ActionMovie extends AbstractMovie implements Serializable

{
	private static final long serialVersionUID = 1L;
   public ActionMovie(String name, String director, String discription, String duration, String urlTrailer,
			String urlFullMovie, String urlImage) {
		super(name, director, discription, duration, urlTrailer, urlFullMovie, urlImage);
	}

@Override
public String toString() {
	return "ActionMovie [getName()=" + getName() + ", getDirector()=" + getDirector() + ", getDiscription()="
			+ getDiscription() + ", getDuration()=" + getDuration() + ", getUrlTrailer()=" + getUrlTrailer()
			+ ", getUrlFullMovie()=" + getUrlFullMovie() + ", getUrlImage()=" + getUrlImage() + ", toString()="
			+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}
}