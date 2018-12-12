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
    public partial class RemoveMovie : Form
    {
        public Form RefToMain { get; set; }

        private bool _dragging;
        private Point _offset;

        public RemoveMovie()
        {
            InitializeComponent();
        }

        private void RemoveMovie_MouseDown(object sender, MouseEventArgs e)
        {
            _offset.X = e.X;
            _offset.Y = e.Y;
            _dragging = true;
        }

        private void RemoveMovie_MouseMove(object sender, MouseEventArgs e)
        {
            if (_dragging)
            {
                Point currentScreenPos = PointToScreen(e.Location);
                Location = new Point
                    (currentScreenPos.X - _offset.X,
                     currentScreenPos.Y - _offset.Y);
            }
        }

        private void RemoveMovie_MouseUp(object sender, MouseEventArgs e)
        {
            _dragging = false;
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            this.RefToMain.Show();
            Close();
        }
    }
}
