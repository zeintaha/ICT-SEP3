package model.movie;

import java.io.Serializable;

public class CrimeMovie extends AbstractMovie implements Serializable
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public CrimeMovie(String name,String director,String description) {
      super(name,director,description);
      System.out.println(" hi i am crime movie ");
   }

   @Override
   public String toString()
   {
      return "CrimeMovie [getName()=" + getName() + ", getDirector()="
            + getDirector() + ", getDescription()=" + getDescription()
            + ", toString()=" + super.toString() + ", getClass()=" + getClass()
            + ", hashCode()=" + hashCode() + "]";
   }
}
