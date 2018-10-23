package model.movie;

import java.io.Serializable;

public class MovieFactory implements Serializable
{

   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public static AbstractMovie create(String name, String director,
         String description, Category category)
   {

      AbstractMovie movie = null;
     
      
         switch (category)
         {
            case Action:
               movie = new ActionMovie(name, director, description);
               break;
            case Adventure:
               movie = new AdventureMovie(name, director, description);
               break;
            case Comedy:
               movie = new ComedyMovie(name, director, description);
               break;

            case Drama:
               movie = new DramaMovie(name, director, description);
               break;
            case Horror:
               movie = new HorrorMovie(name, director, description);
               break;
            default:
               movie = new ActionMovie(name, director, description);
               break;
         }

         return movie;
      }
   }

