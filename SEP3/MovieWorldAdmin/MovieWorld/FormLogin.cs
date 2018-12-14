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
            
            Close();
        }


        private void button1_Click(object sender, EventArgs e)
        {

            //define local variables from the user inputs 
            string user = textBox_Username.Text;
            string pass = textBox_Password.Text;


            var restClient = new RestClient("http://localhost:8080/sep3/login");
            var restRequest = new RestRequest("owner", Method.POST);
            restRequest.AddParameter("username", user);
            restRequest.AddParameter("password", pass);

            var response = restClient.Execute(restRequest);

            if (response.IsSuccessful)
            {
                User userfrm = new User();
                Session.IsSession = true;
                userfrm.Show();
                this.Hide();
            }
            else
            {
                MessageBox.Show("Login Error!");
            }
        }


    }
}
