using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MovieWorld
{
    public class Movie
    {
        private string title;
        private string id;
        private string category;
        private string director;
        private string description;
        private string duration;
        private string urlTrailer;
        private string urlFullMovie;
        private string urlImage;

        public string Title { get => title; set => title = value; }
        public string Id { get => id; set => id = value; }
        public string Category { get => category; set => category = value; }
        public string Director { get => director; set => director = value; }
        public string Description { get => description; set => description = value; }
        public string Duration { get => duration; set => duration = value; }
        public string UrlTrailer { get => urlTrailer; set => urlTrailer = value; }
        public string UrlFullMovie { get => urlFullMovie; set => urlFullMovie = value; }
        public string UrlImage { get => urlImage; set => urlImage = value; }
    }
}
