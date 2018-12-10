package sep.via.dk.sep3JPA.domain.movie;

import java.io.Serializable;

import javax.persistence.Entity;
@Entity
public class HorrorMovie extends Movie implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	public HorrorMovie() {

	}
	
   public HorrorMovie(String title, String director, String description, String duration, String urlTrailer,
			String urlFullMovie, String urlImage,String category) {
		super(title, director, description, duration, urlTrailer, urlFullMovie, urlImage,category);
	}
@Override
public String toString() {
	return "ActionMovie Category :" + getCategory() + ", Title=" + getTitle() + ", Director : "
			+ getDirector() + ", Description :" + getDescription() + ", Duration : " + getDuration()
			+ ", getUrlTrailer( :" + getUrlTrailer() + ", tUrlFullMovie" + getUrlFullMovie() + ", tUrlImage :"
			+ getUrlImage() + ", toString :" + super.toString() + ", tClass" + getClass() + ", hashCode()="
			+ hashCode() + "]";
}

}