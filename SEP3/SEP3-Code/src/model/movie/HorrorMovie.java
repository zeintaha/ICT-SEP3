package model.movie;

import java.io.Serializable;

public class HorrorMovie extends AbstractMovie implements Serializable
{
	private static final long serialVersionUID = 1L;
   public HorrorMovie(String name, String director, String description, String duration, String urlTrailer,
			String urlFullMovie, String urlImage) {
		super(name, director, description, duration, urlTrailer, urlFullMovie, urlImage);
		System.out.println(" hi i am horror movie ");
	}
@Override
public String toString() {
	return "HorrorMovie [getName()=" + getName() + ", getDirector()=" + getDirector() + ", getDescription()="
			+ getDescription() + ", getDuration()=" + getDuration() + ", getUrlTrailer()=" + getUrlTrailer()
			+ ", getUrlFullMovie()=" + getUrlFullMovie() + ", getUrlImage()=" + getUrlImage() + ", toString()="
			+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}
}
