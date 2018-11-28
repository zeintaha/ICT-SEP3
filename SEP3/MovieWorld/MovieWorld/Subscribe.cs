using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MovieWorld
{
    public partial class Subscribe : Form
    {
        private bool _dragging;
        private Point _offset;

        public Subscribe()
        {
            InitializeComponent();
        }

        private void Subscribe_MouseDown(object sender, MouseEventArgs e)
        {
            {
                _offset.X = e.X;
                _offset.Y = e.Y;
                _dragging = true;
            }
        }

        private void Subscribe_MouseMove(object sender, MouseEventArgs e)
        {
            if (_dragging)
            {
                Point currentScreenPos = PointToScreen(e.Location);
                Location = new Point
                    (currentScreenPos.X - _offset.X,
                     currentScreenPos.Y - _offset.Y);
            }
        }

        private void Subscribe_MouseUp(object sender, MouseEventArgs e)
        {
            _dragging = false;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Regex regex = new Regex(@"^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$");
            bool isValid = regex.IsMatch(textBox_Email.Text.Trim());
            if (!isValid)
            {
                MessageBox.Show("Invalid Email.");
            }
        }

        private void Subscribe_Load(object sender, EventArgs e)
        {

        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void textBox_FirstName_Enter(object sender, EventArgs e)
        {
            textBox_FirstName.Text = "";
        }

        private void textBox_LastName_Enter(object sender, EventArgs e)
        {
            textBox_LastName.Text = "";
        }

        private void textBox_Mobile_Enter(object sender, EventArgs e)
        {
            textBox_Mobile.Text = "";
        }

        private void textBox_Email_Enter(object sender, EventArgs e)
        {
            textBox_Email.Text = "";
        }

        private void textBox_Address_Enter(object sender, EventArgs e)
        {
            textBox_Address.Text = "";
        }
    }
}
