package model.movie;

import java.io.Serializable;

public class ComedyMovie extends AbstractMovie implements Serializable
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public ComedyMovie(String name,String director,String description) {
      super(name,director,description);
      System.out.println(" hi i am comedy movie ");
   }

   @Override
   public String toString()
   {
      return "ComedyMovie [getName()=" + getName() + ", getDirector()="
            + getDirector() + ", getDescription()=" + getDescription()
            + ", toString()=" + super.toString() + ", getClass()=" + getClass()
            + ", hashCode()=" + hashCode() + "]";
   }

}