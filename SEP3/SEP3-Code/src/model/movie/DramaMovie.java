package model.movie;

import java.io.Serializable;

public class DramaMovie extends AbstractMovie implements Serializable
{
	private static final long serialVersionUID = 1L;
   public DramaMovie(String name, String director, String discription, String duration, String urlTrailer,
			String urlFullMovie, String urlImage) {
		super(name, director, discription, duration, urlTrailer, urlFullMovie, urlImage);
		System.out.println(" hi i am drama movie ");
	}
@Override
public String toString() {
	return "DramaMovie [getName()=" + getName() + ", getDirector()=" + getDirector() + ", getDiscription()="
			+ getDiscription() + ", getDuration()=" + getDuration() + ", getUrlTrailer()=" + getUrlTrailer()
			+ ", getUrlFullMovie()=" + getUrlFullMovie() + ", getUrlImage()=" + getUrlImage() + ", toString()="
			+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
} 
}