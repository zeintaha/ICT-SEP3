package model.movie;

import java.io.Serializable;

public class AdventureMovie extends AbstractMovie implements Serializable
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public AdventureMovie(String name,String director,String description) {
      super(name,director,description);
      System.out.println(" hi i am adventure movie ");
   }

   @Override
   public String toString()
   {
      return "AdventureMovie [getName()=" + getName() + ", getDirector()="
            + getDirector() + ", getDescription()=" + getDescription()
            + ", toString()=" + super.toString() + ", getClass()=" + getClass()
            + ", hashCode()=" + hashCode() + "]";
   }


}
