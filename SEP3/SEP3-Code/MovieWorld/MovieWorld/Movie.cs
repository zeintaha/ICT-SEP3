using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MovieWorld
{
    public class Movie
    {
        private string name;
        private string movieId;
        private string genre;
        private string director;
        private string discription;
        private string duration;
        private string urlTrailer;
        private string urlFullMovie;
        private string urlImage;

        public string Name { get => name; set => name = value; }
        public string MovieId { get => movieId; set => movieId = value; }
        public string Genre { get => genre; set => genre = value; }
        public string Director { get => director; set => director = value; }
        public string Discription { get => discription; set => discription = value; }
        public string Duration { get => duration; set => duration = value; }
        public string UrlTrailer { get => urlTrailer; set => urlTrailer = value; }
        public string UrlFullMovie { get => urlFullMovie; set => urlFullMovie = value; }
        public string UrlImage { get => urlImage; set => urlImage = value; }
    }
}
