package model.movie;

import java.io.Serializable;

public class HorrorMovie extends AbstractMovie implements Serializable
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public HorrorMovie(String name,String director,String description) {
      super(name,director,description);
      System.out.println(" hi i am horror movie ");
   }

   @Override
   public String toString()
   {
      return "HorrorMovie [getName()=" + getName() + ", getDirector()="
            + getDirector() + ", getDescription()=" + getDescription()
            + ", toString()=" + super.toString() + ", getClass()=" + getClass()
            + ", hashCode()=" + hashCode() + "]";
   }


}
