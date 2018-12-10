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
    public partial class User : Form
    {
        public User()
        {
            InitializeComponent();
            AddMovie addMovie = new AddMovie();
            addMovie.TopLevel = false;
            tabPage1.Controls.Add(addMovie);
            addMovie.Dock = DockStyle.Fill;
            addMovie.Show();

        }

        private void tabPage1_Click(object sender, EventArgs e)
        {

        }

        private void tabControl1_Click(object sender, EventArgs e)
        {
            


        }

        private void tabControl1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void tabControl1_Selected(object sender, TabControlEventArgs e)
        {
            if (tabControl1.SelectedTab.Name == "tabPage1")
            {
                AddMovie addMovie = new AddMovie();
                addMovie.TopLevel = false;
                tabPage1.Controls.Add(addMovie);
                addMovie.Dock = DockStyle.Fill;
                addMovie.Show();
            }
            else if (tabControl1.SelectedTab == tabControl1.TabPages["tabPage2"])
            {
                RemoveMovie removeMovie = new RemoveMovie();
                removeMovie.TopLevel = false;
                tabPage2.Controls.Add(removeMovie);
                removeMovie.Dock = DockStyle.Fill;
                removeMovie.Show();
            }
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
