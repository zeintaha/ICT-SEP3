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
    public partial class FormLogin : Form
    {
        private bool _dragging;
        private Point _offset;

        public Form RefToMain { get; set; }
        public FormLogin()
        {
            InitializeComponent();
        }

        

        private void FormLogin_MouseDown(object sender, MouseEventArgs e)
        {
            _offset.X = e.X;
            _offset.Y = e.Y;
            _dragging = true;
        }

        private void FormLogin_MouseMove(object sender, MouseEventArgs e)
        {
            if (_dragging)
            {
                Point currentScreenPos = PointToScreen(e.Location);
                Location = new Point
                    (currentScreenPos.X - _offset.X,
                     currentScreenPos.Y - _offset.Y);
            }
        }

        private void FormLogin_MouseUp(object sender, MouseEventArgs e)
        {
            _dragging = false;
        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {
            this.RefToMain.Show();
            
            Close();
        }

        private void FormLogin_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {

            string user = textBox_Username.Text;
            string pass = textBox_Password.Text;


            var restClient = new RestClient("http://localhost:8080/sep3/login");
            var restRequest = new RestRequest("customer", Method.POST);
            restRequest.AddParameter("username", user);
            restRequest.AddParameter("password", pass);

            var response = restClient.Execute(restRequest);

            if (response.IsSuccessful)
            {
             
                Session.IsSession = true;
                this.RefToMain.Show();

                this.Hide();

                MessageBox.Show("Hi "+ user + " you logged in successfully");
            }
            else
            {
                MessageBox.Show("Login Error!");
            }
        }


    }
}
