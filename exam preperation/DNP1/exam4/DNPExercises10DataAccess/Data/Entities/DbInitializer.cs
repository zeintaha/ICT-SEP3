using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DNPExercises10DataAccess.Data.Entities
{
    public class DbInitializer
    {
        public static void Initialize(ApplicationDbContext context)
        {
            context.Database.EnsureCreated();
            //if (context.cats.Any())
            //{
            //    return;
            //}

            var cats = new Cat[]
            {
                new Cat { Name="Katty", Color="Red", FavoriteDish="Milk", Birthdate=DateTime.Parse("18/5/2017"), Price=50},
                new Cat { Name="lileKat", Color="white", FavoriteDish="Hony", Birthdate=DateTime.Parse("19/7/2018"), Price=60}
            };

            Console.WriteLine("Hello");
            foreach(Cat c in cats)
            {
                context.Add(c);

            }
            context.SaveChanges();
        }

        internal static void Initialize(object context)
        {
            throw new NotImplementedException();
        }
    }
}
