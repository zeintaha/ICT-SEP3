using System;
using System.Collections.Generic;
using System.Text;

namespace exam1
{
    //indexer
    static class RandomClass
    {

        private static Random rnd = new Random();



        public static T Randomize<T>(this List<T> list)
        {
            int r = rnd.Next(list.Count);
            return list[r];
        }

    }
}