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
            guestlayout();



        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            MenuPanel.Show();
            //movies1.BringToFront();
            MenuPanel.Height = buttonAllGenres.Height;
            MenuPanel.Top = buttonAllGenres.Top;
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
           // action1.BringToFront();
            MenuPanel.Height = buttonAction.Height;
            MenuPanel.Top = buttonAction.Top;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            MenuPanel.Show();
            MenuPanel.Height = buttonAdventure.Height;
            MenuPanel.Top = buttonAdventure.Top;
            //adventure1.BringToFront();
            
            MessageBox.Show("Enter the passowrd!");

        }




        private void button4_Click_1(object sender, EventArgs e)
        {
            MenuPanel.Show();
            MenuPanel.Height = buttonComedy.Height;
            MenuPanel.Top = buttonComedy.Top;
            //comedy1.BringToFront();

        }

        private void button5_Click_1(object sender, EventArgs e)
        {
            MenuPanel.Show();
            MenuPanel.Height = buttonCrime.Height;
            MenuPanel.Top = buttonCrime.Top;
            //crime1.BringToFront();

        }

        private void button6_Click_1(object sender, EventArgs e)
        {
            MenuPanel.Show();
            MenuPanel.Height = buttonDrama.Height;
            MenuPanel.Top = buttonDrama.Top;
            //drama1.BringToFront();

        }

        private void button7_Click_1(object sender, EventArgs e)
        {
            MenuPanel.Show();
            MenuPanel.Height = buttonHorror.Height;
            MenuPanel.Top = buttonHorror.Top;

            //horror1.BringToFront();

        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {
          //  about1.BringToFront();
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

                guestlayout();
                Session.IsSession = false;
                

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

        private void button9_Click(object sender, EventArgs e)
        {
            

            AddMovie addMovie = new AddMovie();
            addMovie.RefToMain = this;
            this.Visible = false;
            addMovie.Show();

        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        public void guestlayout()
        {
            this.buttonRemoveMovie.Hide();
            this.buttonAddMovie.Hide();
            this.label_hi.Hide();
            this.panel2.Hide();
            this.panel4.Hide();
            panel5.Location = new Point(0, 160);
            this.pictureBoxLogging.Image = MovieWorld.Properties.Resources.login_241;
            this.labellogging.Text = "Login";
           
        }
        public void customerlayout()
        {
            this.buttonRemoveMovie.Hide();
            this.buttonAddMovie.Hide();
            this.label_hi.Text = "Hi Customer!";
            this.label_hi.Show();
            this.panel2.Hide();
            this.panel4.Hide();
            panel5.Location = new Point(0, 160);
            this.pictureBoxLogging.Image = MovieWorld.Properties.Resources.logout_24;
            this.labellogging.Text = "Logout";
        }

        public void userlayout()
        {
            this.buttonRemoveMovie.Show();
            this.buttonAddMovie.Show();
            this.label_hi.Text = "Hi User!";
            this.label_hi.Show();
            this.panel2.Show();
            this.panel4.Show();
            this.pictureBoxLogging.Image = MovieWorld.Properties.Resources.logout_24;
            panel5.Location = new Point(0, 210);
            this.labellogging.Text = "Logout";

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void button8_Click_1(object sender, EventArgs e)
        {
            

            RemoveMovie removeMovie = new RemoveMovie();
            removeMovie.RefToMain = this;
            this.Visible = false;
            removeMovie.Show();

        }
    }
}
