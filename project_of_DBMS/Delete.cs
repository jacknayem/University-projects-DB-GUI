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
    public partial class Delete : Form
    {
        SqlConnection con = new SqlConnection(@"Data Source=USER-PC;Initial Catalog=jack;Integrated Security=True");
        public Delete()
        {
            InitializeComponent();
        }

        private void Delete1_Click(object sender, EventArgs e)
        {

            con.Open();
            SqlCommand cmd = con.CreateCommand();
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = "delete from Bank_Loan where Customar_id = '" + delete2.Text + "'";
            cmd.ExecuteNonQuery();
            con.Close();
            MessageBox.Show("Done");
        }

        private void Back_Click(object sender, EventArgs e)
        {
            Home objhome = new Home();
            this.Hide();
            objhome.Show();
        }
    }
}
