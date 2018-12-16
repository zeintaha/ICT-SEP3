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
    public partial class BuyTicket : Form
    {
        

        private bool _dragging;
        private Point _offset;

        Movie movie = new Movie();

        private string movieId;

        public string MovieId { get => movieId; set => movieId = value; }

        public BuyTicket()
        {
            InitializeComponent();
        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {

        }

        private void dateTimePicker1_ValueChanged(object sender, EventArgs e)
        {

        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            
            Close();
        }

        private void BuyTicket_MouseDown(object sender, MouseEventArgs e)
        {
            _offset.X = e.X;
            _offset.Y = e.Y;
            _dragging = true;
        }

        private void BuyTicket_MouseMove(object sender, MouseEventArgs e)
        {
            if (_dragging)
            {
                Point currentScreenPos = PointToScreen(e.Location);
                Location = new Point
                    (currentScreenPos.X - _offset.X,
                     currentScreenPos.Y - _offset.Y);
            }
        }

        private void BuyTicket_MouseUp(object sender, MouseEventArgs e)
        {
            _dragging = false;
        }

        private void textBox3_Enter(object sender, EventArgs e)
        {
            textBox_FirstName.Text = "";
        }

        private void textBox4_Enter(object sender, EventArgs e)
        {
            textBox_LastName.Text = "";
        }

        private void textBox5_Enter(object sender, EventArgs e)
        {
           
        }

        private void button_GoToPayment_Click(object sender, EventArgs e)
        {
            var restClient = new RestClient("http://localhost:8080/sep3/ticket");
            var restRequest = new RestRequest("link", Method.GET);
          

            var response = restClient.Execute(restRequest);

            System.Diagnostics.Process.Start(response.Content);
            button2.Enabled = true;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            foreach (Movie m in MovieList.movies)
            {
                if (m.id == this.movieId)
                {
                    this.movie = m;

                }
            }

            Ticket ticket = new Ticket();
            ticket.firstName = textBox_FirstName.Text;
            ticket.lastName = textBox_LastName.Text;
            ticket.time = comboBox_SelectTime.Text;
            ticket.movieDate =dateTimePicker_SelectDate.Text;
            //ticket.movieDate = Convert.ToDateTime(dateTimePicker_SelectDate.Text);
            ticket.dateOfBirth = dateTimePicker_DOB.Text;
            ticket.movie = this.movie;


            var json = JsonConvert.SerializeObject(ticket);

            var restClient = new RestClient("http://localhost:8080/sep3");
            var restRequest = new RestRequest("ticket", Method.POST);

            restRequest.AddParameter("application/json", json, ParameterType.RequestBody);

            var response = restClient.Execute(restRequest);

            if (response.IsSuccessful)
            {
                MessageBox.Show(response.Content);
                this.Close();
               
            }
            else
            {
                MessageBox.Show("please pay and try again");
            }
        }
    }
}
