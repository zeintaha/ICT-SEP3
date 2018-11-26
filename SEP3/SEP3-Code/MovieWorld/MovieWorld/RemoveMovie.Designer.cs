namespace MovieWorld
{
    partial class RemoveMovie
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
            this.label1 = new System.Windows.Forms.Label();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.label3 = new System.Windows.Forms.Label();
            this.comboBoxSelectGenres = new System.Windows.Forms.ComboBox();
            this.label2 = new System.Windows.Forms.Label();
            this.comboBoxSelectMovie = new System.Windows.Forms.ComboBox();
            this.buttonDelete = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Century Gothic", 25.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.White;
            this.label1.Location = new System.Drawing.Point(216, 26);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(336, 49);
            this.label1.TabIndex = 5;
            this.label1.Text = "Remove Movie";
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::MovieWorld.Properties.Resources.close_window_241;
            this.pictureBox1.Location = new System.Drawing.Point(738, 12);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(24, 24);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.AutoSize;
            this.pictureBox1.TabIndex = 6;
            this.pictureBox1.TabStop = false;
            this.pictureBox1.Click += new System.EventHandler(this.pictureBox1_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label3.Location = new System.Drawing.Point(120, 141);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(129, 22);
            this.label3.TabIndex = 9;
            this.label3.Text = "Select Genre";
            // 
            // comboBoxSelectGenres
            // 
            this.comboBoxSelectGenres.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.comboBoxSelectGenres.ForeColor = System.Drawing.Color.Black;
            this.comboBoxSelectGenres.FormattingEnabled = true;
            this.comboBoxSelectGenres.Items.AddRange(new object[] {
            "Action",
            "Adventure",
            "Comedy",
            "Crime",
            "Drama",
            "Horror"});
            this.comboBoxSelectGenres.Location = new System.Drawing.Point(279, 138);
            this.comboBoxSelectGenres.Name = "comboBoxSelectGenres";
            this.comboBoxSelectGenres.Size = new System.Drawing.Size(365, 29);
            this.comboBoxSelectGenres.TabIndex = 8;
            this.comboBoxSelectGenres.Text = "Select Genre";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label2.Location = new System.Drawing.Point(120, 208);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(127, 22);
            this.label2.TabIndex = 11;
            this.label2.Text = "Select Movie";
            // 
            // comboBoxSelectMovie
            // 
            this.comboBoxSelectMovie.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.comboBoxSelectMovie.ForeColor = System.Drawing.Color.Black;
            this.comboBoxSelectMovie.FormattingEnabled = true;
            this.comboBoxSelectMovie.Items.AddRange(new object[] {
            "Action",
            "Adventure",
            "Comedy",
            "Crime",
            "Drama",
            "Horror"});
            this.comboBoxSelectMovie.Location = new System.Drawing.Point(279, 205);
            this.comboBoxSelectMovie.Name = "comboBoxSelectMovie";
            this.comboBoxSelectMovie.Size = new System.Drawing.Size(365, 29);
            this.comboBoxSelectMovie.TabIndex = 10;
            this.comboBoxSelectMovie.Text = "Select Movie";
            // 
            // buttonDelete
            // 
            this.buttonDelete.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonDelete.Font = new System.Drawing.Font("Century Gothic", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonDelete.ForeColor = System.Drawing.Color.White;
            this.buttonDelete.Location = new System.Drawing.Point(494, 292);
            this.buttonDelete.Name = "buttonDelete";
            this.buttonDelete.Size = new System.Drawing.Size(150, 42);
            this.buttonDelete.TabIndex = 12;
            this.buttonDelete.Text = "Delete";
            this.buttonDelete.UseVisualStyleBackColor = true;
            // 
            // RemoveMovie
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.buttonDelete);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.comboBoxSelectMovie);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.comboBoxSelectGenres);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.label1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "RemoveMovie";
            this.Text = "RemoveMovie";
            this.MouseDown += new System.Windows.Forms.MouseEventHandler(this.RemoveMovie_MouseDown);
            this.MouseMove += new System.Windows.Forms.MouseEventHandler(this.RemoveMovie_MouseMove);
            this.MouseUp += new System.Windows.Forms.MouseEventHandler(this.RemoveMovie_MouseUp);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.ComboBox comboBoxSelectGenres;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ComboBox comboBoxSelectMovie;
        private System.Windows.Forms.Button buttonDelete;
    }
}