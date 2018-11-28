using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MovieWorld
{
    class MoviePanel : FlowLayoutPanel
    {
        
        private string _link;
        private string _image;
        private string _title;
        private string UrlTrailer;
        private string UrlFullMovie;
        private string UrlImagelocation;
        private string MovieId;
        private string MovieTitle;
        

        MovieDetail movieDetail = new MovieDetail();
        Label title = new Label();
        PictureBox image = new PictureBox();


        public string Link {
            get
            {
                return _link;
            }
            set
            {
                _link = value;
            }
        }
                
        public string Image {
            get
            {
                return _image;
            }
            set
            {
                _image = value;
                if(_image != null)
                { 
                image.Load(_image);
                }
            }
        }
        public string Title {
            get
            {
                return _title;
            }

            set
            {
                _title = value;
                if (_title != null)
                {
                    title.Text = _title;
                }
            }
        }

        public MoviePanel()
        {
            image.Width = 140;
            image.Height = 190;
            image.SizeMode = PictureBoxSizeMode.StretchImage;
            image.Click += new EventHandler(imClicked);

            title.Width = 140;
            title.Font = new Font("Arial",8,FontStyle.Bold);
            Create();
        }

        private void imClicked(object sender, EventArgs e)
        {

           
            string UrlImage = ((System.Windows.Forms.PictureBox)sender).ImageLocation.ToString();

            foreach (Movie m in MovieList.movies)
            {
                if (m.UrlImage == UrlImage) {

                    movieDetail.label_desc.Text = m.Discription;
                    movieDetail.label_title.Text = m.Name;
                    movieDetail.pictureBox_detailed.ImageLocation = m.UrlImage;
                    movieDetail.button_trailer.Click += new EventHandler(button_trailer);
                    movieDetail.button_buy.Click += new EventHandler(button_buy);
                    movieDetail.button_watch.Click += new EventHandler(button_watch);

                    UrlTrailer = m.UrlTrailer;
                    UrlFullMovie = m.UrlFullMovie;
                    UrlImagelocation = m.UrlImage;
                    MovieId = m.MovieId;
                    MovieTitle = m.Name;
                    





                }
            }


            
            movieDetail.Show();

        }

        private void button_buy(object sender, EventArgs e)
        {
            

            BuyTicket buyTicket  = new BuyTicket();

            buyTicket.pictureBox_buy.ImageLocation = UrlImagelocation;
            buyTicket.Show();
        }

        private void button_watch(object sender, EventArgs e)
        {
            
            PlayMovie trailer = new PlayMovie();
            trailer.axWindowsMediaPlayer_Trailer.URL = UrlFullMovie;
            trailer.label_Title.Text = "Streming Movie: " + MovieTitle;
            trailer.Show();
        }

        private void button_trailer(object sender, EventArgs e)
        {
            
            PlayMovie trailer = new PlayMovie();
            trailer.axWindowsMediaPlayer_Trailer.URL = UrlTrailer;
            trailer.label_Title.Text = "Trailer: "+MovieTitle;
            trailer.Show();
        }

        private void Create()
        {
            this.FlowDirection = FlowDirection.TopDown;
            this.BorderStyle = BorderStyle.FixedSingle;
            this.Controls.Add(title);
            this.Controls.Add(image);

        }
    }


}
