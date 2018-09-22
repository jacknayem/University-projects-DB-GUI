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
    public partial class Loan_id : Form
    {
        SqlConnection con = new SqlConnection(@"Data Source=USER-PC;Initial Catalog=jack;Integrated Security=True");
        public Loan_id()
        {
            InitializeComponent();
        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void Back_Click(object sender, EventArgs e)
        {
            Update objupdate = new Update();
            this.Hide();
            objupdate.Show();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            con.Open();
            SqlCommand cmd = con.CreateCommand();
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = "update Bank_Loan set Loan_id='" + loanid.Text + "'  where Customar_id = '" + customerid.Text + "'";
            cmd.ExecuteNonQuery();
            con.Close();
            MessageBox.Show("Done");
    }
    }
}
