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
    public partial class View : Form
    {
        SqlConnection con = new SqlConnection(@"Data Source=USER-PC;Initial Catalog=jack;Integrated Security=True");
        public View()
        {
            InitializeComponent();
        }

        private void Back_Click(object sender, EventArgs e)
        {
            Home objhome = new Home();
            this.Hide();
            objhome.Show();
        }

        private void View1_Click(object sender, EventArgs e)
        {

            con.Open();
            SqlCommand cmd = con.CreateCommand();
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = "select * from Bank_Loan";
            cmd.ExecuteNonQuery();
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            da.Fill(dt);
            viewgrid.DataSource = dt;
            con.Close();

        }
    }
}
