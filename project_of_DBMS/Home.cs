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
    public partial class Home : Form
    {
        SqlConnection con = new SqlConnection(@"Data Source=USER-PC;Initial Catalog=jack;Integrated Security=True");
        public Home()
        {
            InitializeComponent();
        }

        private void Home_Load(object sender, EventArgs e)
        {

        }

        private void UPDATE_Click(object sender, EventArgs e)
        {
            Update objupdate = new Update();
            this.Hide();
            objupdate.Show();
        }

        private void INSERT_Click(object sender, EventArgs e)
        {
            Insert objinsert = new Insert();
            this.Hide();
            objinsert.Show();

        }

        private void VIEW_Click(object sender, EventArgs e)
        {
            View objview = new View();
            this.Hide();
            objview.Show();
        }

        private void DELETE_Click(object sender, EventArgs e)
        {
            Delete objdelete = new Delete();
            this.Hide();
            objdelete.Show();
        }
    }
}
