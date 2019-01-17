using System;
using System.Collections.Generic;

namespace exam1
{
    class MyClass
    {
        public string InstanceMethod(int a, int b)
        {
            return (a + b * 2).ToString();
        }
    }
    class Program
    {

        public delegate string MyDelegate(int arg1, int arg2);


        //-------- the two functions that match the delgate signature ----------
        public static string Function1(int a, int b)
        {
            return (a + b).ToString();
        }

        public static string Function2(int a, int b)
        {
            return (a * b).ToString();
        }

        public static void Main(string[] args)
        {
            //----------------indexer----------------------
            List<int> myList = new List<int>();
            myList.Add(100);
            myList.Add(200);
            myList.Add(300);
            myList.Add(400);

            Console.WriteLine(RandomClass.Randomize(myList));

            //--------------------delegates--------------------------

            //---------------normal delegate----------------
            MyDelegate f1 = Function1;
            Console.WriteLine("the number from the first function is " + f1(10, 20));

            MyDelegate f2 = Function2;

            Console.WriteLine("the number form the second function is " + f2(10, 20));


            // we can ever chain the delegate like so
            MyDelegate f1f2 = f1 + f2;
            Console.WriteLine("the number of the chained delegate is" + f1f2(10, 20));
            f1f2 -= f1;

            //---------------delegate using a mthoed from another class------

            MyClass mc = new MyClass();
            MyDelegate f3 = mc.InstanceMethod;
            Console.WriteLine("the number is " + f3(10, 20));


            //-------2anonymous delegate----------
            MyDelegate f4 = delegate (int arg1, int arg2)
            {
                return (arg1 + arg2).ToString();
            };
            Console.WriteLine("the number is " + f4(10, 20));

            //--------predicate delegate -------
            Predicate<string> isUpperCase = upperCase;
            bool doesItMeetTheCrieteriea = isUpperCase("HELLO");
            Console.WriteLine(doesItMeetTheCrieteriea);

            //  -----------------------------extension----------------------

            Time time1 = new Time();
            time1.Hours = 2;
            time1.Minutes = 3;
            Time time2 = new Time();

            time2.Hours = 4;
            time2.Minutes = 5;

            Time time3 = time1 + time2;
            Console.WriteLine(time3.Hours);
            Console.WriteLine(time3.Minutes);

            Console.ReadLine();
        }

        private static bool upperCase(string something)
        {
            return something.Equals(something.ToUpper());
        }
    }
}