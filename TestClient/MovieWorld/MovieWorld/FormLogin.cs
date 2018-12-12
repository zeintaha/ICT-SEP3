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

        Login login = new Login("Taha", "1234");

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
           

            //define local variables from the user inputs 
            string user = textBox_Username.Text;
            string pass = textBox_Password.Text;
            //check if eligible to be logged in 
            if (login.IsLoggedIn(user, pass))
            {
                //MessageBox.Show("You are logged in successfully");
                Main main = new Main();
                login.Isuser = true;
                if (login.Isuser == true) {
                    Session.IsSession = true;
                    
                    main.userlayout();
                }
                else if (login.Isuser == false)
                {
                    Session.IsSession = true;
                    
                    main.customerlayout();
                }



                main.Show();
                this.Hide();
            }
            else
            {
                //show default login error message 
                MessageBox.Show("Login Error!");
            }
        }


    }
}
