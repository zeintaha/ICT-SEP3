package model.movie;

import java.io.Serializable;

public abstract class AbstractMovie implements Serializable
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private String name ;
   private String director;
   private String description;
   
   
   public AbstractMovie(String name,String director,String description) {
      this.name = name ;
      this.director = director;
      this.description = description;
      
   }


   public String getName()
   {
      return name;
   }


   public void setName(String name)
   {
      this.name = name;
   }


   public String getDirector()
   {
      return director;
   }


   public void setDirector(String director)
   {
      this.director = director;
   }


   public String getDescription()
   {
      return description;
   }


   public void setDescription(String description)
   {
      this.description = description;
   }


   @Override
   public String toString()
   {
      return "AbstractMovie [name=" + name + ", director=" + director
            + ", description=" + description + "]";
   }
   

}
