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
    public partial class Insert : Form
    {
        SqlConnection con = new SqlConnection(@"Data Source=USER-PC;Initial Catalog=jack;Integrated Security=True");
        public Insert()
        {
            InitializeComponent();
        }

        private void Back_Click(object sender, EventArgs e)
        {
            Home objhome = new Home();
            this.Hide();
            objhome.Show();
        }

        private void Submit_Click(object sender, EventArgs e)
        {
            con.Open();
            SqlCommand cmd = new SqlCommand("Insert into Bank_Loan(Customar_id, Customar_Name, Loan_id,Amaunt,Branch,Accaunt_Name) values('" + customerid.Text + "', '" + customername.Text + "','" + loneid.Text + "','" + amount.Text + "','" + branch.Text + "','" + accountname.Text + "')", con);
            cmd.ExecuteNonQuery();
            customerid.Text = "";
            customername.Text = "";
            loneid.Text = "";
            amount.Text = "";
            branch.Text = "";
            accountname.Text = "";
            con.Close();

        }
    }
}
