using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MovieWorld
{
    public class Movie
    {
        public string title { get; set; }
        public string id { get; set; }
        public string category { get; set; }
        public string director { get; set; }
        public string description { get; set; }
        public string duration { get; set; }
        public string urlTrailer { get; set; }
        public string urlFullMovie { get; set; }
        public string urlImage { get; set; }


        //public string Title { get => title; set => title = value; }
        //public string Id { get => id; set => id = value; }
        //public string Category { get => category; set => category = value; }
        //public string Director { get => director; set => director = value; }
        //public string Description { get => description; set => description = value; }
        //public string Duration { get => duration; set => duration = value; }
        //public string UrlTrailer { get => urlTrailer; set => urlTrailer = value; }
        //public string UrlFullMovie { get => urlFullMovie; set => urlFullMovie = value; }
        //public string UrlImage { get => urlImage; set => urlImage = value; }
    }
}
