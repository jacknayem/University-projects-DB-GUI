using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Assignment_DBMS
{
    public partial class Update : Form
    {
        public Update()
        {
            InitializeComponent();
        }

        private void Back_Click(object sender, EventArgs e)
        {
            Home objhome = new Home();
            this.Hide();
            objhome.Show();
        }

        private void Customar_id_Click(object sender, EventArgs e)
        {
            Customer_id objcustomer_id = new Customer_id();
            this.Hide();
            objcustomer_id.Show();
        }

        private void Customar_Name_Click(object sender, EventArgs e)
        {
            Customer_Name objCustomer_Name = new Customer_Name();
            this.Hide();
            objCustomer_Name.Show();
    }

        private void Loan_id_Click(object sender, EventArgs e)
        {
            Loan_id objloan = new Loan_id();
            this.Hide();
            objloan.Show();
        }

        private void Amount_Click(object sender, EventArgs e)
        {
            Amount objamount = new Amount();
            this.Hide();
            objamount.Show();
        }

        private void Branch_Click(object sender, EventArgs e)
        {
            Branch objbranch = new Branch();
            this.Hide();
            objbranch.Show();
        }

        private void Account_Name_Click(object sender, EventArgs e)
        {
            Account_Name objaccount_name = new Account_Name();
            this.Hide();
            objaccount_name.Show();
        }
    }
}
