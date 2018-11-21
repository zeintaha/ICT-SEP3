package persistenceTier.model.movie;

import java.io.Serializable;

public class MovieFactory implements Serializable
{

   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public static AbstractMovie create(String name, String director,
         String description, Category category,String duration, String urlTrailer,
			String urlFullMovie, String urlImage)
   {

      AbstractMovie movie = null;
     
      
         switch (category)
         {
            case Action:
               movie = new ActionMovie(name, director, description,duration, urlTrailer, urlFullMovie, urlImage);
               break;
            case Adventure:
               movie = new AdventureMovie(name, director, description,duration, urlTrailer, urlFullMovie, urlImage);
               break;
            case Comedy:
               movie = new ComedyMovie(name, director, description,duration, urlTrailer, urlFullMovie, urlImage);
               break;

            case Drama:
               movie = new DramaMovie(name, director, description,duration, urlTrailer, urlFullMovie, urlImage);
               break;
            case Horror:
               movie = new HorrorMovie(name, director, description,duration, urlTrailer, urlFullMovie, urlImage);
               break;
            default:
               movie = new ActionMovie(name, director, description,duration, urlTrailer, urlFullMovie, urlImage);
               break;
         }

         return movie;
      }
   }