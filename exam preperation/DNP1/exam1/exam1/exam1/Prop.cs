using System;
using System.Collections.Generic;
using System.Text;

namespace exam1
{
    class Prop
    {
        
        private string _Name;
        private string _Name2;
        //---------the third name------
        public string _Name3 { get; set; }




        public DateTime _DateCreated { get; }

        public double DaysOld => (_DateCreated - DateTime.Now).TotalDays;

        public List<string> _MyList { get; }

        public DateTime _DateCreated2 { get; } = DateTime.Now;



        public Prop()
        {

            _DateCreated = DateTime.Now;
            _MyList = new List<string>();


        }

        //---------------first name---------

        public void SetName(string name)
        {
            _Name = name;
        }
        public string GetName()
        {
            return _Name;
        }
        //------the second name--------
        public string Name2
        {
            get { return _Name2; }
            set { _Name2 = value; }
        }




    }
}
