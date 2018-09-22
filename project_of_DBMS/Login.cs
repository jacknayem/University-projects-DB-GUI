using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace Assignment_DBMS
{
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }

        private void Login_Load(object sender, EventArgs e)
        {

        }

        private void Password_Click(object sender, EventArgs e)
        {

        }

        private void username_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            string user = "Jack";
            string pass = "1234";

            if (user == this.Username.Text && pass == this.Password.Text)
            {
                Home objhome = new Home();
                this.Hide();
                objhome.Show();
            }
            else
            {
                MessageBox.Show("Check Your Username and Password");
            }


        }

        private void Exit_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
