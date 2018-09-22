namespace Assignment_DBMS
{
    partial class Account_Name
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
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.accountname = new System.Windows.Forms.TextBox();
            this.customerid = new System.Windows.Forms.TextBox();
            this.Submit = new System.Windows.Forms.Button();
            this.Back = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(119, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(327, 25);
            this.label1.TabIndex = 0;
            this.label1.Text = "Account Name will be Update ";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(170, 43);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(190, 16);
            this.label2.TabIndex = 0;
            this.label2.Text = "Reference By Customer ID";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(33, 89);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(158, 18);
            this.label3.TabIndex = 0;
            this.label3.Text = "Set Account Name :";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(36, 126);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(156, 18);
            this.label4.TabIndex = 0;
            this.label4.Text = "Reference ID         :";
            // 
            // accountname
            // 
            this.accountname.Location = new System.Drawing.Point(198, 93);
            this.accountname.Name = "accountname";
            this.accountname.Size = new System.Drawing.Size(238, 20);
            this.accountname.TabIndex = 1;
            // 
            // customerid
            // 
            this.customerid.Location = new System.Drawing.Point(198, 126);
            this.customerid.Name = "customerid";
            this.customerid.Size = new System.Drawing.Size(238, 20);
            this.customerid.TabIndex = 2;
            // 
            // Submit
            // 
            this.Submit.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Submit.Location = new System.Drawing.Point(371, 181);
            this.Submit.Name = "Submit";
            this.Submit.Size = new System.Drawing.Size(75, 33);
            this.Submit.TabIndex = 3;
            this.Submit.Text = "Submit";
            this.Submit.UseVisualStyleBackColor = true;
            this.Submit.Click += new System.EventHandler(this.Submit_Click);
            // 
            // Back
            // 
            this.Back.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Back.Location = new System.Drawing.Point(39, 181);
            this.Back.Name = "Back";
            this.Back.Size = new System.Drawing.Size(75, 33);
            this.Back.TabIndex = 4;
            this.Back.Text = "Back";
            this.Back.UseVisualStyleBackColor = true;
            this.Back.Click += new System.EventHandler(this.Back_Click);
            // 
            // Account_Name
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(576, 232);
            this.Controls.Add(this.Back);
            this.Controls.Add(this.Submit);
            this.Controls.Add(this.customerid);
            this.Controls.Add(this.accountname);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "Account_Name";
            this.Text = "Account_Name";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox accountname;
        private System.Windows.Forms.TextBox customerid;
        private System.Windows.Forms.Button Submit;
        private System.Windows.Forms.Button Back;
    }
}