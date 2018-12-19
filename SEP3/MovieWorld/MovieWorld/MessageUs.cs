﻿using Newtonsoft.Json;
using RestSharp;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Net;
using System.Net.Sockets;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MovieWorld
{
    public partial class MessageUs : Form
    {
        private bool _dragging;
        private Point _offset;

        public MessageUs()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void button_Send_Click(object sender, EventArgs e)
        {
            Regex regex = new Regex(@"^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$");
            bool isValid = regex.IsMatch(textBox_Email.Text.Trim());
            if (!isValid)
            {
                MessageBox.Show("Invalid Email.");
            }
            else
            {
                Message message = new Message();
                message.email = textBox_Email.Text;
                message.name = textBox_Name.Text;
                message.body = richTextBox_Body.Text;



                var json = JsonConvert.SerializeObject(message);

                var restClient = new RestClient("https://localhost:8443/sep3");
                var restRequest = new RestRequest("message", Method.POST);

                restRequest.AddParameter("application/json", json, ParameterType.RequestBody);

                var response = restClient.Execute(restRequest);
                if (response.IsSuccessful)
                {
                    MessageBox.Show("The message has been sent");
                    textBox_Email.Text = "";
                    textBox_Name.Text = "";
                    richTextBox_Body.Text = "";
                }
                else
                {
                    MessageBox.Show("Error");
                }
            }

            runclient();
            //----------------------------------------------------------





        }

        private void MessageUs_MouseDown(object sender, MouseEventArgs e)
        {
            {
                _offset.X = e.X;
                _offset.Y = e.Y;
                _dragging = true;
            }
        }

        private void MessageUs_MouseUp(object sender, MouseEventArgs e)
        {
            _dragging = false;
        }

        private void MessageUs_MouseMove(object sender, MouseEventArgs e)
        {
            if (_dragging)
            {
                Point currentScreenPos = PointToScreen(e.Location);
                Location = new Point
                    (currentScreenPos.X - _offset.X,
                     currentScreenPos.Y - _offset.Y);
            }
        }

        private void runclient()
        {
            string toSend = richTextBox_Body.Text ;

            IPEndPoint serverAddress = new IPEndPoint(IPAddress.Parse("127.0.0.1"), 4343);

            Socket clientSocket = new Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp);
            clientSocket.Connect(serverAddress);

            // Sending
            int toSendLen = System.Text.Encoding.ASCII.GetByteCount(toSend);
            byte[] toSendBytes = System.Text.Encoding.ASCII.GetBytes(toSend);
            byte[] toSendLenBytes = System.BitConverter.GetBytes(toSendLen);
            clientSocket.Send(toSendLenBytes);
            clientSocket.Send(toSendBytes);

            // Receiving
            byte[] rcvLenBytes = new byte[4];
            clientSocket.Receive(rcvLenBytes);
            int rcvLen = System.BitConverter.ToInt32(rcvLenBytes, 0);
            byte[] rcvBytes = new byte[rcvLen];
            clientSocket.Receive(rcvBytes);
            String rcv = System.Text.Encoding.ASCII.GetString(rcvBytes);

            Console.WriteLine("Client received: " + rcv);

            clientSocket.Close();
        }
    }
}
