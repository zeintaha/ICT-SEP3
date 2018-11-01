package model.movie;

import java.io.Serializable;

public class CrimeMovie extends Movie implements Serializable
{
	private static final long serialVersionUID = 1L;
   public CrimeMovie(String name, String director, String discription, String duration, String urlTrailer,
			String urlFullMovie, String urlImage) {
		super(name, director, discription, duration, urlTrailer, urlFullMovie, urlImage);
	}
   @Override
   public String toString()
   {
      return "CrimeMovie [getName()=" + getName() + ", getDirector()="
            + getDirector() + ", getDiscription()=" + getDiscription()
            + ", toString()=" + super.toString() + ", getClass()=" + getClass()
            + ", hashCode()=" + hashCode() + "]";
   }
}