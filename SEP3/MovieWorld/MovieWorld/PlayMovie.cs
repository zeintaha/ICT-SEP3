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
    public partial class PlayMovie : Form
    {
        private bool _dragging;
        private Point _offset;

        public PlayMovie()
        {
            InitializeComponent();
            button1.Hide();
        }

        private void axWindowsMediaPlayer_Trailer_Enter(object sender, EventArgs e)
        {
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (axWindowsMediaPlayer_Trailer.playState == WMPLib.WMPPlayState.wmppsPlaying)
            {
                axWindowsMediaPlayer_Trailer.fullScreen = true;
            }
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void Trailer_Load(object sender, EventArgs e)
        {

        }

        private void Trailer_MouseUp(object sender, MouseEventArgs e)
        {
            _dragging = false;
        }

        private void Trailer_MouseDown(object sender, MouseEventArgs e)
        {
            _offset.X = e.X;
            _offset.Y = e.Y;
            _dragging = true;
        }

        private void Trailer_MouseMove(object sender, MouseEventArgs e)
        {
            if (_dragging)
            {
                Point currentScreenPos = PointToScreen(e.Location);
                Location = new Point
                    (currentScreenPos.X - _offset.X,
                     currentScreenPos.Y - _offset.Y);
            }
        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            if (axWindowsMediaPlayer_Trailer.playState == WMPLib.WMPPlayState.wmppsPlaying)
            {
                button1.BackgroundImage = MovieWorld.Properties.Resources.play_4_24__1____Copy;
                axWindowsMediaPlayer_Trailer.Ctlcontrols.pause(); 

            }
            else if (axWindowsMediaPlayer_Trailer.playState == WMPLib.WMPPlayState.wmppsPaused)
            {
                button1.BackgroundImage = MovieWorld.Properties.Resources.media_pause_242;
                axWindowsMediaPlayer_Trailer.Ctlcontrols.play();
            }

            else if (axWindowsMediaPlayer_Trailer.playState == WMPLib.WMPPlayState.wmppsStopped)
            {
                button1.BackgroundImage = MovieWorld.Properties.Resources.media_pause_242;
                axWindowsMediaPlayer_Trailer.Ctlcontrols.play();
            }

        }

        private void axWindowsMediaPlayer_Trailer_PlayStateChange(object sender, AxWMPLib._WMPOCXEvents_PlayStateChangeEvent e)
        {
            if (axWindowsMediaPlayer_Trailer.playState == WMPLib.WMPPlayState.wmppsPlaying)
            {


                button1.BackgroundImage = MovieWorld.Properties.Resources.media_pause_242;
            }
            else if (axWindowsMediaPlayer_Trailer.playState == WMPLib.WMPPlayState.wmppsPaused)
            {

                button1.BackgroundImage = MovieWorld.Properties.Resources.play_4_24__1____Copy;
            }
            else if (axWindowsMediaPlayer_Trailer.playState == WMPLib.WMPPlayState.wmppsStopped)
            {

                button1.BackgroundImage = MovieWorld.Properties.Resources.play_4_24__1____Copy;
            }

        }
    }
}
