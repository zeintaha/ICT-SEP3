namespace MovieWorld
{
    partial class Subscribe
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
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.button_GoToPayment = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.comboBox_Subscription = new System.Windows.Forms.ComboBox();
            this.label4 = new System.Windows.Forms.Label();
            this.textBox_FirstName = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.textBox_Email = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.textBox_Address = new System.Windows.Forms.TextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.dateTimePicker_Dob = new System.Windows.Forms.DateTimePicker();
            this.textBox_LastName = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.textBox_Mobile = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::MovieWorld.Properties.Resources.close_window_241;
            this.pictureBox1.Location = new System.Drawing.Point(903, 15);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(24, 24);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.AutoSize;
            this.pictureBox1.TabIndex = 14;
            this.pictureBox1.TabStop = false;
            this.pictureBox1.Click += new System.EventHandler(this.pictureBox1_Click);
            // 
            // button_GoToPayment
            // 
            this.button_GoToPayment.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_GoToPayment.Font = new System.Drawing.Font("Century Gothic", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_GoToPayment.ForeColor = System.Drawing.Color.White;
            this.button_GoToPayment.Location = new System.Drawing.Point(732, 471);
            this.button_GoToPayment.Name = "button_GoToPayment";
            this.button_GoToPayment.Size = new System.Drawing.Size(173, 42);
            this.button_GoToPayment.TabIndex = 9;
            this.button_GoToPayment.Text = "Go To Payment";
            this.button_GoToPayment.UseVisualStyleBackColor = true;
            this.button_GoToPayment.Click += new System.EventHandler(this.button1_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Century Gothic", 25.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.White;
            this.label1.Location = new System.Drawing.Point(367, 25);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(225, 49);
            this.label1.TabIndex = 9;
            this.label1.Text = "Subscribe";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label8.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label8.Location = new System.Drawing.Point(126, 115);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(119, 22);
            this.label8.TabIndex = 27;
            this.label8.Text = "Subscription";
            // 
            // comboBox_Subscription
            // 
            this.comboBox_Subscription.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.comboBox_Subscription.ForeColor = System.Drawing.Color.Black;
            this.comboBox_Subscription.FormattingEnabled = true;
            this.comboBox_Subscription.Items.AddRange(new object[] {
            "1 Month",
            "3 Months",
            "12 Months"});
            this.comboBox_Subscription.Location = new System.Drawing.Point(303, 115);
            this.comboBox_Subscription.Name = "comboBox_Subscription";
            this.comboBox_Subscription.Size = new System.Drawing.Size(365, 29);
            this.comboBox_Subscription.TabIndex = 1;
            this.comboBox_Subscription.Text = "Choose Subscription";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label4.Location = new System.Drawing.Point(126, 171);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(103, 22);
            this.label4.TabIndex = 34;
            this.label4.Text = "First Name";
            // 
            // textBox_FirstName
            // 
            this.textBox_FirstName.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBox_FirstName.ForeColor = System.Drawing.Color.Black;
            this.textBox_FirstName.Location = new System.Drawing.Point(303, 170);
            this.textBox_FirstName.Name = "textBox_FirstName";
            this.textBox_FirstName.Size = new System.Drawing.Size(365, 30);
            this.textBox_FirstName.TabIndex = 3;
            this.textBox_FirstName.Text = "First Name";
            this.textBox_FirstName.Enter += new System.EventHandler(this.textBox_FirstName_Enter);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label2.Location = new System.Drawing.Point(126, 395);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(56, 22);
            this.label2.TabIndex = 39;
            this.label2.Text = "Email";
            // 
            // textBox_Email
            // 
            this.textBox_Email.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBox_Email.ForeColor = System.Drawing.Color.Black;
            this.textBox_Email.Location = new System.Drawing.Point(303, 394);
            this.textBox_Email.Name = "textBox_Email";
            this.textBox_Email.Size = new System.Drawing.Size(365, 30);
            this.textBox_Email.TabIndex = 7;
            this.textBox_Email.Text = "Email";
            this.textBox_Email.Enter += new System.EventHandler(this.textBox_Email_Enter);
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label9.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label9.Location = new System.Drawing.Point(126, 451);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(83, 22);
            this.label9.TabIndex = 41;
            this.label9.Text = "Address";
            // 
            // textBox_Address
            // 
            this.textBox_Address.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBox_Address.ForeColor = System.Drawing.Color.Black;
            this.textBox_Address.Location = new System.Drawing.Point(303, 450);
            this.textBox_Address.Name = "textBox_Address";
            this.textBox_Address.Size = new System.Drawing.Size(365, 30);
            this.textBox_Address.TabIndex = 8;
            this.textBox_Address.Text = "Address";
            this.textBox_Address.Enter += new System.EventHandler(this.textBox_Address_Enter);
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label7.Location = new System.Drawing.Point(126, 339);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(123, 22);
            this.label7.TabIndex = 37;
            this.label7.Text = "Date of Birth";
            // 
            // dateTimePicker_Dob
            // 
            this.dateTimePicker_Dob.Font = new System.Drawing.Font("Century Gothic", 10.8F);
            this.dateTimePicker_Dob.Location = new System.Drawing.Point(303, 338);
            this.dateTimePicker_Dob.Name = "dateTimePicker_Dob";
            this.dateTimePicker_Dob.Size = new System.Drawing.Size(365, 30);
            this.dateTimePicker_Dob.TabIndex = 6;
            // 
            // textBox_LastName
            // 
            this.textBox_LastName.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBox_LastName.ForeColor = System.Drawing.Color.Black;
            this.textBox_LastName.Location = new System.Drawing.Point(303, 226);
            this.textBox_LastName.Name = "textBox_LastName";
            this.textBox_LastName.Size = new System.Drawing.Size(365, 30);
            this.textBox_LastName.TabIndex = 4;
            this.textBox_LastName.Text = "Last Name";
            this.textBox_LastName.Enter += new System.EventHandler(this.textBox_LastName_Enter);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label5.Location = new System.Drawing.Point(126, 227);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(107, 22);
            this.label5.TabIndex = 35;
            this.label5.Text = "Last Name";
            // 
            // textBox_Mobile
            // 
            this.textBox_Mobile.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBox_Mobile.ForeColor = System.Drawing.Color.Black;
            this.textBox_Mobile.Location = new System.Drawing.Point(303, 282);
            this.textBox_Mobile.Name = "textBox_Mobile";
            this.textBox_Mobile.Size = new System.Drawing.Size(365, 30);
            this.textBox_Mobile.TabIndex = 5;
            this.textBox_Mobile.Text = "Mobile Number";
            this.textBox_Mobile.Enter += new System.EventHandler(this.textBox_Mobile_Enter);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Century Gothic", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label6.Location = new System.Drawing.Point(126, 283);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(149, 22);
            this.label6.TabIndex = 36;
            this.label6.Text = "Mobile Number";
            // 
            // Subscribe
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.ClientSize = new System.Drawing.Size(964, 556);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.textBox_Address);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.textBox_Email);
            this.Controls.Add(this.dateTimePicker_Dob);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.textBox_Mobile);
            this.Controls.Add(this.textBox_LastName);
            this.Controls.Add(this.textBox_FirstName);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.comboBox_Subscription);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.button_GoToPayment);
            this.Controls.Add(this.label1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "Subscribe";
            this.Text = "Subscribe";
            this.Load += new System.EventHandler(this.Subscribe_Load);
            this.MouseDown += new System.Windows.Forms.MouseEventHandler(this.Subscribe_MouseDown);
            this.MouseMove += new System.Windows.Forms.MouseEventHandler(this.Subscribe_MouseMove);
            this.MouseUp += new System.Windows.Forms.MouseEventHandler(this.Subscribe_MouseUp);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Button button_GoToPayment;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.ComboBox comboBox_Subscription;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox textBox_FirstName;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox textBox_Email;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.TextBox textBox_Address;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.DateTimePicker dateTimePicker_Dob;
        private System.Windows.Forms.TextBox textBox_LastName;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox textBox_Mobile;
        private System.Windows.Forms.Label label6;
    }
}