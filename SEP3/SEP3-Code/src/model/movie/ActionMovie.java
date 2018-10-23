package model.movie;

import java.io.Serializable;

public class ActionMovie extends AbstractMovie implements Serializable
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public ActionMovie(String name,String director,String description) {
      super(name,director,description);
      System.out.println(" hi i am action movie ");
   }

   @Override
   public String toString()
   {
      return "ActionMovie [getName()=" + getName() + ", getDirector()="
            + getDirector() + ", getDescription()=" + getDescription()
            + ", toString()=" + super.toString() + ", getClass()=" + getClass()
            + ", hashCode()=" + hashCode() + "]";
   }
  
}
