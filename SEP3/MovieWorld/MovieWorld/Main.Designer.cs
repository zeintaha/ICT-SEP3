namespace MovieWorld
{
    partial class Main
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.panel1 = new System.Windows.Forms.Panel();
            this.pictureBoxLogging = new System.Windows.Forms.PictureBox();
            this.pictureBoxInfo = new System.Windows.Forms.PictureBox();
            this.pictureBoxPowerOff = new System.Windows.Forms.PictureBox();
            this.label5 = new System.Windows.Forms.Label();
            this.labellogging = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.panel5 = new System.Windows.Forms.Panel();
            this.buttonAllGenres = new System.Windows.Forms.Button();
            this.buttonDrama = new System.Windows.Forms.Button();
            this.MenuPanel = new System.Windows.Forms.Panel();
            this.buttonComedy = new System.Windows.Forms.Button();
            this.buttonAction = new System.Windows.Forms.Button();
            this.buttonCrime = new System.Windows.Forms.Button();
            this.buttonHorror = new System.Windows.Forms.Button();
            this.buttonAdventure = new System.Windows.Forms.Button();
            this.buttonRemoveMovie = new System.Windows.Forms.Button();
            this.buttonAddMovie = new System.Windows.Forms.Button();
            this.panel4 = new System.Windows.Forms.Panel();
            this.panel2 = new System.Windows.Forms.Panel();
            this.label_hi = new System.Windows.Forms.Label();
            this.panel3 = new System.Windows.Forms.Panel();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.allGenres1 = new MovieWorld.AllGenres();
            this.panel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBoxLogging)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBoxInfo)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBoxPowerOff)).BeginInit();
            this.panel5.SuspendLayout();
            this.panel3.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(41)))), ((int)(((byte)(39)))), ((int)(((byte)(40)))));
            this.panel1.Controls.Add(this.pictureBoxLogging);
            this.panel1.Controls.Add(this.pictureBoxInfo);
            this.panel1.Controls.Add(this.pictureBoxPowerOff);
            this.panel1.Controls.Add(this.label5);
            this.panel1.Controls.Add(this.labellogging);
            this.panel1.Controls.Add(this.label3);
            this.panel1.Controls.Add(this.panel5);
            this.panel1.Controls.Add(this.buttonRemoveMovie);
            this.panel1.Controls.Add(this.buttonAddMovie);
            this.panel1.Controls.Add(this.panel4);
            this.panel1.Controls.Add(this.panel2);
            this.panel1.Controls.Add(this.label_hi);
            this.panel1.Controls.Add(this.panel3);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel1.ForeColor = System.Drawing.Color.White;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Margin = new System.Windows.Forms.Padding(4);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(227, 652);
            this.panel1.TabIndex = 0;
            this.panel1.Paint += new System.Windows.Forms.PaintEventHandler(this.panel1_Paint);
            // 
            // pictureBoxLogging
            // 
            this.pictureBoxLogging.Image = global::MovieWorld.Properties.Resources.login_241;
            this.pictureBoxLogging.Location = new System.Drawing.Point(93, 582);
            this.pictureBoxLogging.Margin = new System.Windows.Forms.Padding(4);
            this.pictureBoxLogging.Name = "pictureBoxLogging";
            this.pictureBoxLogging.Size = new System.Drawing.Size(39, 38);
            this.pictureBoxLogging.TabIndex = 11;
            this.pictureBoxLogging.TabStop = false;
            this.pictureBoxLogging.Click += new System.EventHandler(this.pictureBox4_Click);
            // 
            // pictureBoxInfo
            // 
            this.pictureBoxInfo.Image = global::MovieWorld.Properties.Resources.info_2_241;
            this.pictureBoxInfo.Location = new System.Drawing.Point(21, 582);
            this.pictureBoxInfo.Margin = new System.Windows.Forms.Padding(4);
            this.pictureBoxInfo.Name = "pictureBoxInfo";
            this.pictureBoxInfo.Size = new System.Drawing.Size(39, 38);
            this.pictureBoxInfo.TabIndex = 10;
            this.pictureBoxInfo.TabStop = false;
            this.pictureBoxInfo.Click += new System.EventHandler(this.pictureBox3_Click);
            // 
            // pictureBoxPowerOff
            // 
            this.pictureBoxPowerOff.Image = global::MovieWorld.Properties.Resources.power_241;
            this.pictureBoxPowerOff.Location = new System.Drawing.Point(168, 582);
            this.pictureBoxPowerOff.Margin = new System.Windows.Forms.Padding(4);
            this.pictureBoxPowerOff.Name = "pictureBoxPowerOff";
            this.pictureBoxPowerOff.Size = new System.Drawing.Size(39, 38);
            this.pictureBoxPowerOff.TabIndex = 2;
            this.pictureBoxPowerOff.TabStop = false;
            this.pictureBoxPowerOff.Click += new System.EventHandler(this.pictureBox2_Click);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(150, 619);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(66, 17);
            this.label5.TabIndex = 20;
            this.label5.Text = "PowerOff";
            // 
            // labellogging
            // 
            this.labellogging.AutoSize = true;
            this.labellogging.Location = new System.Drawing.Point(85, 619);
            this.labellogging.Name = "labellogging";
            this.labellogging.Size = new System.Drawing.Size(0, 17);
            this.labellogging.TabIndex = 19;
            this.labellogging.Click += new System.EventHandler(this.label4_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(21, 619);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(31, 17);
            this.label3.TabIndex = 18;
            this.label3.Text = "Info";
            this.label3.Click += new System.EventHandler(this.label3_Click);
            // 
            // panel5
            // 
            this.panel5.Controls.Add(this.buttonAllGenres);
            this.panel5.Controls.Add(this.buttonDrama);
            this.panel5.Controls.Add(this.MenuPanel);
            this.panel5.Controls.Add(this.buttonComedy);
            this.panel5.Controls.Add(this.buttonAction);
            this.panel5.Controls.Add(this.buttonCrime);
            this.panel5.Controls.Add(this.buttonHorror);
            this.panel5.Controls.Add(this.buttonAdventure);
            this.panel5.Location = new System.Drawing.Point(0, 261);
            this.panel5.Name = "panel5";
            this.panel5.Size = new System.Drawing.Size(228, 285);
            this.panel5.TabIndex = 2;
            // 
            // buttonAllGenres
            // 
            this.buttonAllGenres.FlatAppearance.BorderSize = 0;
            this.buttonAllGenres.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonAllGenres.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonAllGenres.Image = global::MovieWorld.Properties.Resources.video_multi_241;
            this.buttonAllGenres.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.buttonAllGenres.Location = new System.Drawing.Point(7, 9);
            this.buttonAllGenres.Margin = new System.Windows.Forms.Padding(4);
            this.buttonAllGenres.Name = "buttonAllGenres";
            this.buttonAllGenres.Size = new System.Drawing.Size(219, 39);
            this.buttonAllGenres.TabIndex = 3;
            this.buttonAllGenres.Text = "All Genres";
            this.buttonAllGenres.UseVisualStyleBackColor = true;
            this.buttonAllGenres.Click += new System.EventHandler(this.button1_Click);
            // 
            // buttonDrama
            // 
            this.buttonDrama.FlatAppearance.BorderSize = 0;
            this.buttonDrama.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonDrama.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonDrama.Image = global::MovieWorld.Properties.Resources.drama_241;
            this.buttonDrama.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.buttonDrama.Location = new System.Drawing.Point(7, 200);
            this.buttonDrama.Margin = new System.Windows.Forms.Padding(4);
            this.buttonDrama.Name = "buttonDrama";
            this.buttonDrama.Size = new System.Drawing.Size(219, 39);
            this.buttonDrama.TabIndex = 8;
            this.buttonDrama.Text = "Drama";
            this.buttonDrama.UseVisualStyleBackColor = true;
            this.buttonDrama.Click += new System.EventHandler(this.button6_Click_1);
            // 
            // MenuPanel
            // 
            this.MenuPanel.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(0)))));
            this.MenuPanel.Location = new System.Drawing.Point(1, 9);
            this.MenuPanel.Margin = new System.Windows.Forms.Padding(4);
            this.MenuPanel.Name = "MenuPanel";
            this.MenuPanel.Size = new System.Drawing.Size(5, 39);
            this.MenuPanel.TabIndex = 2;
            // 
            // buttonComedy
            // 
            this.buttonComedy.FlatAppearance.BorderSize = 0;
            this.buttonComedy.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonComedy.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonComedy.Image = global::MovieWorld.Properties.Resources.comedy_2_241;
            this.buttonComedy.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.buttonComedy.Location = new System.Drawing.Point(7, 124);
            this.buttonComedy.Margin = new System.Windows.Forms.Padding(4);
            this.buttonComedy.Name = "buttonComedy";
            this.buttonComedy.Size = new System.Drawing.Size(219, 39);
            this.buttonComedy.TabIndex = 6;
            this.buttonComedy.Text = "Comedy";
            this.buttonComedy.UseVisualStyleBackColor = true;
            this.buttonComedy.Click += new System.EventHandler(this.button4_Click_1);
            // 
            // buttonAction
            // 
            this.buttonAction.FlatAppearance.BorderSize = 0;
            this.buttonAction.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonAction.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonAction.Image = global::MovieWorld.Properties.Resources.action_241;
            this.buttonAction.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.buttonAction.Location = new System.Drawing.Point(7, 47);
            this.buttonAction.Margin = new System.Windows.Forms.Padding(4);
            this.buttonAction.Name = "buttonAction";
            this.buttonAction.Size = new System.Drawing.Size(219, 39);
            this.buttonAction.TabIndex = 4;
            this.buttonAction.Text = "Action";
            this.buttonAction.UseVisualStyleBackColor = true;
            this.buttonAction.Click += new System.EventHandler(this.button2_Click);
            // 
            // buttonCrime
            // 
            this.buttonCrime.FlatAppearance.BorderSize = 0;
            this.buttonCrime.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonCrime.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonCrime.Image = global::MovieWorld.Properties.Resources.crime_241;
            this.buttonCrime.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.buttonCrime.Location = new System.Drawing.Point(7, 162);
            this.buttonCrime.Margin = new System.Windows.Forms.Padding(4);
            this.buttonCrime.Name = "buttonCrime";
            this.buttonCrime.Size = new System.Drawing.Size(219, 39);
            this.buttonCrime.TabIndex = 7;
            this.buttonCrime.Text = "Crime";
            this.buttonCrime.UseVisualStyleBackColor = true;
            this.buttonCrime.Click += new System.EventHandler(this.button5_Click_1);
            // 
            // buttonHorror
            // 
            this.buttonHorror.FlatAppearance.BorderSize = 0;
            this.buttonHorror.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonHorror.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonHorror.Image = global::MovieWorld.Properties.Resources.horror_241;
            this.buttonHorror.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.buttonHorror.Location = new System.Drawing.Point(7, 239);
            this.buttonHorror.Margin = new System.Windows.Forms.Padding(4);
            this.buttonHorror.Name = "buttonHorror";
            this.buttonHorror.Size = new System.Drawing.Size(219, 39);
            this.buttonHorror.TabIndex = 9;
            this.buttonHorror.Text = "Horror";
            this.buttonHorror.UseVisualStyleBackColor = true;
            this.buttonHorror.Click += new System.EventHandler(this.button7_Click_1);
            // 
            // buttonAdventure
            // 
            this.buttonAdventure.FlatAppearance.BorderSize = 0;
            this.buttonAdventure.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonAdventure.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonAdventure.Image = global::MovieWorld.Properties.Resources.adventures_241;
            this.buttonAdventure.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.buttonAdventure.Location = new System.Drawing.Point(7, 86);
            this.buttonAdventure.Margin = new System.Windows.Forms.Padding(4);
            this.buttonAdventure.Name = "buttonAdventure";
            this.buttonAdventure.Size = new System.Drawing.Size(219, 39);
            this.buttonAdventure.TabIndex = 5;
            this.buttonAdventure.Text = "Adventure";
            this.buttonAdventure.UseVisualStyleBackColor = true;
            this.buttonAdventure.Click += new System.EventHandler(this.button3_Click);
            // 
            // buttonRemoveMovie
            // 
            this.buttonRemoveMovie.FlatAppearance.BorderSize = 0;
            this.buttonRemoveMovie.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonRemoveMovie.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonRemoveMovie.Image = global::MovieWorld.Properties.Resources.video_remove_24;
            this.buttonRemoveMovie.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.buttonRemoveMovie.Location = new System.Drawing.Point(1, 205);
            this.buttonRemoveMovie.Margin = new System.Windows.Forms.Padding(4);
            this.buttonRemoveMovie.Name = "buttonRemoveMovie";
            this.buttonRemoveMovie.Size = new System.Drawing.Size(227, 39);
            this.buttonRemoveMovie.TabIndex = 17;
            this.buttonRemoveMovie.Text = "Remove Movie";
            this.buttonRemoveMovie.UseVisualStyleBackColor = true;
            this.buttonRemoveMovie.Click += new System.EventHandler(this.button8_Click_1);
            // 
            // buttonAddMovie
            // 
            this.buttonAddMovie.FlatAppearance.BorderSize = 0;
            this.buttonAddMovie.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonAddMovie.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonAddMovie.Image = global::MovieWorld.Properties.Resources.video_add_241;
            this.buttonAddMovie.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.buttonAddMovie.Location = new System.Drawing.Point(1, 165);
            this.buttonAddMovie.Margin = new System.Windows.Forms.Padding(4);
            this.buttonAddMovie.Name = "buttonAddMovie";
            this.buttonAddMovie.Size = new System.Drawing.Size(227, 39);
            this.buttonAddMovie.TabIndex = 16;
            this.buttonAddMovie.Text = "Add Movie";
            this.buttonAddMovie.UseVisualStyleBackColor = true;
            this.buttonAddMovie.Click += new System.EventHandler(this.button9_Click);
            // 
            // panel4
            // 
            this.panel4.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.panel4.Location = new System.Drawing.Point(12, 555);
            this.panel4.Name = "panel4";
            this.panel4.Size = new System.Drawing.Size(205, 2);
            this.panel4.TabIndex = 15;
            // 
            // panel2
            // 
            this.panel2.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.panel2.Location = new System.Drawing.Point(12, 253);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(205, 2);
            this.panel2.TabIndex = 14;
            // 
            // label_hi
            // 
            this.label_hi.AutoSize = true;
            this.label_hi.Font = new System.Drawing.Font("Century Gothic", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label_hi.ForeColor = System.Drawing.Color.Gold;
            this.label_hi.Location = new System.Drawing.Point(8, 137);
            this.label_hi.Name = "label_hi";
            this.label_hi.Size = new System.Drawing.Size(69, 21);
            this.label_hi.TabIndex = 12;
            this.label_hi.Text = "Hi User!";
            // 
            // panel3
            // 
            this.panel3.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(0)))));
            this.panel3.Controls.Add(this.label2);
            this.panel3.Controls.Add(this.label1);
            this.panel3.Controls.Add(this.pictureBox1);
            this.panel3.Location = new System.Drawing.Point(1, 0);
            this.panel3.Margin = new System.Windows.Forms.Padding(4);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(225, 128);
            this.panel3.TabIndex = 2;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Century Gothic", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.Color.White;
            this.label2.Location = new System.Drawing.Point(16, 98);
            this.label2.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(190, 20);
            this.label2.TabIndex = 3;
            this.label2.Text = "Bringing the world inside!";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.White;
            this.label1.Location = new System.Drawing.Point(56, 79);
            this.label1.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(111, 19);
            this.label1.TabIndex = 2;
            this.label1.Text = "Movie World";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::MovieWorld.Properties.Resources.popcorn_576599_960_7201;
            this.pictureBox1.Location = new System.Drawing.Point(75, 7);
            this.pictureBox1.Margin = new System.Windows.Forms.Padding(4);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(71, 68);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 0;
            this.pictureBox1.TabStop = false;
            // 
            // allGenres1
            // 
            this.allGenres1.AutoScroll = true;
            this.allGenres1.BackColor = System.Drawing.SystemColors.Control;
            this.allGenres1.Location = new System.Drawing.Point(226, 25);
            this.allGenres1.Name = "allGenres1";
            this.allGenres1.Size = new System.Drawing.Size(1067, 627);
            this.allGenres1.TabIndex = 1;
            // 
            // Main
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(0)))));
            this.ClientSize = new System.Drawing.Size(1293, 652);
            this.Controls.Add(this.allGenres1);
            this.Controls.Add(this.panel1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Margin = new System.Windows.Forms.Padding(4);
            this.Name = "Main";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form1";
            this.MouseDown += new System.Windows.Forms.MouseEventHandler(this.Form1_MouseDown);
            this.MouseMove += new System.Windows.Forms.MouseEventHandler(this.Form1_MouseMove);
            this.MouseUp += new System.Windows.Forms.MouseEventHandler(this.Form1_MouseUp);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBoxLogging)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBoxInfo)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBoxPowerOff)).EndInit();
            this.panel5.ResumeLayout(false);
            this.panel3.ResumeLayout(false);
            this.panel3.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button buttonAllGenres;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button buttonDrama;
        private System.Windows.Forms.Button buttonCrime;
        private System.Windows.Forms.Button buttonComedy;
        private System.Windows.Forms.Button buttonAdventure;
        private System.Windows.Forms.Button buttonAction;
        private System.Windows.Forms.Button buttonHorror;
        private System.Windows.Forms.Panel MenuPanel;
        private System.Windows.Forms.PictureBox pictureBoxPowerOff;
        private System.Windows.Forms.PictureBox pictureBoxInfo;
        public System.Windows.Forms.PictureBox pictureBoxLogging;
        private AllGenres allGenres1;
        public System.Windows.Forms.Label label_hi;
        public System.Windows.Forms.Panel panel4;
        public System.Windows.Forms.Panel panel2;
        public System.Windows.Forms.Button buttonRemoveMovie;
        public System.Windows.Forms.Button buttonAddMovie;
        private System.Windows.Forms.Panel panel5;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label5;
        public System.Windows.Forms.Label labellogging;
    }
}

