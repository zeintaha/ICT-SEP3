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
    public partial class Main : Form
    {
        private bool _dragging;
        private Point _offset;
        public Main()
        {
            InitializeComponent();
           
            label_hi.Hide();
            about1.Hide();
            allGenres1.Show();
            allGenres1.BringToFront();

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            MenuPanel.Show();
            MenuPanel.Height = buttonAllGenres.Height;
            MenuPanel.Top = buttonAllGenres.Top;
            about1.Hide();

            allGenres1.Show();
            allGenres1.BringToFront();
            
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {

            Close();
        }

        private void button8_Click(object sender, EventArgs e)
        {
            

        }

        private void button2_Click(object sender, EventArgs e)
        {
            MenuPanel.Show();
            MenuPanel.Height = buttonAction.Height;
            MenuPanel.Top = buttonAction.Top;
            about1.Hide();

            action1.Show();
            action1.BringToFront();
            
        }

        private void button3_Click(object sender, EventArgs e)
        {
            MenuPanel.Show();
            MenuPanel.Height = buttonAdventure.Height;
            MenuPanel.Top = buttonAdventure.Top;
            about1.Hide();

            adventure1.Show();
            adventure1.BringToFront();
            
        }




        private void button4_Click_1(object sender, EventArgs e)
        {
            MenuPanel.Show();
            MenuPanel.Height = buttonComedy.Height;
            MenuPanel.Top = buttonComedy.Top;
            about1.Hide();

            comedy1.Show();
            comedy1.BringToFront();

        }

        private void button5_Click_1(object sender, EventArgs e)
        {
            MenuPanel.Show();
            MenuPanel.Height = buttonCrime.Height;
            MenuPanel.Top = buttonCrime.Top;
            about1.Hide();

            crime1.Show();
            crime1.BringToFront();

        }

        private void button6_Click_1(object sender, EventArgs e)
        {
            MenuPanel.Show();
            MenuPanel.Height = buttonDrama.Height;
            MenuPanel.Top = buttonDrama.Top;
            about1.Hide();

            drama1.Show();
            drama1.BringToFront();

        }

        private void button7_Click_1(object sender, EventArgs e)
        {
            MenuPanel.Show();
            MenuPanel.Height = buttonHorror.Height;
            MenuPanel.Top = buttonHorror.Top;
            about1.Hide();

            horror1.Show();
            horror1.BringToFront();

        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {
            about1.Show();
            about1.BringToFront();
            MenuPanel.Hide();
            
        }

        private void pictureBox4_Click(object sender, EventArgs e)
        {
            if (Session.IsSession == false) { 
            FormLogin formLogin = new FormLogin();
            formLogin.RefToMain = this;
            this.Visible = false;
            formLogin.Show();
            }
            else if (Session.IsSession == true) {

             Session.IsSession = false;
                MessageBox.Show("You logged out successfully");

            }
        }





        private void panel4_Paint(object sender, PaintEventArgs e)
        {

        }

        private void Form1_MouseUp(object sender, MouseEventArgs e)
        {
            _dragging = false;
        }

        private void Form1_MouseMove(object sender, MouseEventArgs e)
        {
            if (_dragging)
            {
                Point currentScreenPos = PointToScreen(e.Location);
                Location = new Point
                    (currentScreenPos.X - _offset.X,
                     currentScreenPos.Y - _offset.Y);
            }

        }

        private void Form1_MouseDown(object sender, MouseEventArgs e)
        {
            _offset.X = e.X;
            _offset.Y = e.Y;
            _dragging = true;
        }


        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        //public void guestlayout()
        //{
        //    this.buttonRemoveMovie.Hide();
        //    this.buttonAddMovie.Hide();
        //    this.label_hi.Hide();
        //    this.panel2.Hide();
        //    this.panel4.Hide();
        //    panel5.Location = new Point(0, 160);
        //    this.pictureBoxLogging.Image = MovieWorld.Properties.Resources.login_241;
        //    this.labellogging.Text = "Login";
           
        //}
        //public void customerlayout()
        //{
        //    this.buttonRemoveMovie.Hide();
        //    this.buttonAddMovie.Hide();
        //    this.label_hi.Text = "Hi Customer!";
        //    this.label_hi.Show();
        //    this.panel2.Hide();
        //    this.panel4.Hide();
        //    panel5.Location = new Point(0, 160);
        //    this.pictureBoxLogging.Image = MovieWorld.Properties.Resources.logout_24;
        //    this.labellogging.Text = "Logout";
        //}

        //public void userlayout()
        //{
        //    this.buttonRemoveMovie.Show();
        //    this.buttonAddMovie.Show();
        //    this.label_hi.Text = "Hi User!";
        //    this.label_hi.Show();
        //    this.panel2.Show();
        //    this.panel4.Show();
        //    this.pictureBoxLogging.Image = MovieWorld.Properties.Resources.logout_24;
        //    panel5.Location = new Point(0, 210);
        //    this.labellogging.Text = "Logout";

        //}

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

    }
}
