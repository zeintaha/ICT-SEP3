using System;
using System.Collections.Generic;
using System.Text;

namespace exam1
{
    //extension method
    public class Time
    {
        public int Hours { get; set; }
        public int Minutes { get; set; }

        // extension method are defined as static methods but they are called by using instance method sentax
        // operator overloading and one parameter must be the same type as the class
        public static Time operator +(Time t1, Time t2)
        {
            return new Time
            {
                Hours = t1.Hours + t2.Hours,
                Minutes = t1.Minutes + t2.Minutes
            };
        }
    }

}
