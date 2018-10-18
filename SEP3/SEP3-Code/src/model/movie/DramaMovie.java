package model.movie;

import java.io.Serializable;

public class DramaMovie extends AbstractMovie implements Serializable
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public DramaMovie(String name,String director,String description) {
      super(name,director,description);
      System.out.println(" hi i am drama movie ");
   }

   @Override
   public String toString()
   {
      return "DramaMovie [getName()=" + getName() + ", getDirector()="
            + getDirector() + ", getDescription()=" + getDescription()
            + ", toString()=" + super.toString() + ", getClass()=" + getClass()
            + ", hashCode()=" + hashCode() + "]";
   }


}
