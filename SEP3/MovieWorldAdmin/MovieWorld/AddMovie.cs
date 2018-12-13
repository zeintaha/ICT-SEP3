using Newtonsoft.Json;
using RestSharp;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MovieWorld
{
    public partial class AddMovie : Form
    {
        public Form RefToMain { get; set; }

        private bool _dragging;
        private Point _offset;

        public AddMovie()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void AddMovie_MouseUp(object sender, MouseEventArgs e)
        {
            _dragging = false;
        }

        private void AddMovie_Load(object sender, EventArgs e)
        {

        }

        private void AddMovie_MouseMove(object sender, MouseEventArgs e)
        {
            if (_dragging)
            {
                Point currentScreenPos = PointToScreen(e.Location);
                Location = new Point
                    (currentScreenPos.X - _offset.X,
                     currentScreenPos.Y - _offset.Y);
            }

        }

        private void AddMovie_MouseDown(object sender, MouseEventArgs e)
        {
            _offset.X = e.X;
            _offset.Y = e.Y;
            _dragging = true;
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            this.RefToMain.Show();
            Close();
        }

        private void AddMovie_FormClosed(object sender, FormClosedEventArgs e)
        {
            
        }

        private void textBox1_Enter(object sender, EventArgs e)
        {
            textBox_MovieURL.Text = "";
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void comboBox1_Enter(object sender, EventArgs e)
        {

        }

        private void textBox3_Enter(object sender, EventArgs e)
        {
            textBox_Description.Text = "";
        }

        private void textBox4_Enter(object sender, EventArgs e)
        {
            textBox_Duration.Text = "";
        }

        private void textBox5_Enter(object sender, EventArgs e)
        {
            textBox_ImageURL.Text = "";
        }

        private void textBox6_Enter(object sender, EventArgs e)
        {
            textBox_TrailerURL.Text = "";
        }

        private void textBox7_Enter(object sender, EventArgs e)
        {
            textBox_Title.Text = "";
        }

        private void button_Save_Click(object sender, EventArgs e)
        {
            Movie movie = new Movie();
            //movie.title = textBox_Title.Text;
            //movie.director = textBox_Director.Text;
            //movie.description = textBox_Description.Text;
            //movie.duration = textBox_Duration.Text;
            //movie.urlTrailer = textBox_TrailerURL.Text;
            //movie.urlFullMovie = textBox_MovieURL.Text;
            //movie.urlImage = textBox_ImageURL.Text;
            //movie.category = comboBox_Genre.Text;

            movie.title = "Mission Impossible - Fallout 2018";
            movie.director = "Christopher McQuarrie";
            movie.description = "When an IMF mission ends badly, the world is faced with dire consequences. As Ethan Hunt takes it upon himself to fulfill his original briefing, the CIA begin to question his loyalty and his motives. The IMF team find themselves in a race against time, hunted by assassins while trying to prevent a global catastrophe.";
            movie.duration = "105 miutes";
            movie.urlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/Mission%20Impossible%20-%20Fallout%202018_trailer.mov?st=2018-12-13T16%3A37%3A06Z&se=2117-11-19T16%3A37%3A06Z&sr=c&sp=r&sig=YKd969bETlpJoQ8cjqzKrwL%2BC32cFZaJ%2Fg5onBeuEK8%3D&si=tempAccess";
            movie.urlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/Mission%20Impossible%20-%20Fallout%202018.mov?st=2018-12-13T16%3A39%3A34Z&se=2117-11-19T16%3A39%3A34Z&sr=c&sp=r&sig=UCGQjkVzfxtyjkzknBl8GuRLqA4Pa1EuvZOxw79Y53A%3D&si=tempAccess";
            movie.urlImage = "https://sep3.blob.core.windows.net/mediacontainer/Mission%20Impossible%20-%20Fallout%202018.jpg?st=2018-12-13T16%3A38%3A19Z&se=2117-11-19T16%3A38%3A19Z&sr=c&sp=r&sig=%2FKchUQ6L7Llv%2FdSC3p9fgJCcUqePKVNyY0bAvaa%2Fi9M%3D&si=tempAccess";
            movie.category = "Action";


            var json = JsonConvert.SerializeObject(movie);

            var restClient = new RestClient("http://localhost:8080/sep3");
            var restRequest = new RestRequest("movie", Method.POST);
           
            restRequest.AddParameter("application/json", json, ParameterType.RequestBody);
            
            var response = restClient.Execute(restRequest);

            if (response.IsSuccessful)
            {
                MessageBox.Show("The Movie is added succsefully");
            }
               
            else
            {
                MessageBox.Show("Error!");
            }

        }


    }
}
