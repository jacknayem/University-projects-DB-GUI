namespace Assignment_DBMS
{
    partial class Update
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
            this.Customar_id = new System.Windows.Forms.Button();
            this.Customar_Name = new System.Windows.Forms.Button();
            this.Loan_id = new System.Windows.Forms.Button();
            this.Amount = new System.Windows.Forms.Button();
            this.Branch = new System.Windows.Forms.Button();
            this.Account_Name = new System.Windows.Forms.Button();
            this.Back = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(95, 22);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(341, 25);
            this.label1.TabIndex = 0;
            this.label1.Text = "Which are you want to Update?";
            // 
            // Customar_id
            // 
            this.Customar_id.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Customar_id.Location = new System.Drawing.Point(26, 88);
            this.Customar_id.Name = "Customar_id";
            this.Customar_id.Size = new System.Drawing.Size(139, 32);
            this.Customar_id.TabIndex = 1;
            this.Customar_id.Text = "Customar ID";
            this.Customar_id.UseVisualStyleBackColor = true;
            this.Customar_id.Click += new System.EventHandler(this.Customar_id_Click);
            // 
            // Customar_Name
            // 
            this.Customar_Name.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Customar_Name.Location = new System.Drawing.Point(187, 87);
            this.Customar_Name.Name = "Customar_Name";
            this.Customar_Name.Size = new System.Drawing.Size(148, 33);
            this.Customar_Name.TabIndex = 2;
            this.Customar_Name.Text = "Customar Name";
            this.Customar_Name.UseVisualStyleBackColor = true;
            this.Customar_Name.Click += new System.EventHandler(this.Customar_Name_Click);
            // 
            // Loan_id
            // 
            this.Loan_id.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Loan_id.Location = new System.Drawing.Point(371, 87);
            this.Loan_id.Name = "Loan_id";
            this.Loan_id.Size = new System.Drawing.Size(141, 33);
            this.Loan_id.TabIndex = 3;
            this.Loan_id.Text = "Loan ID";
            this.Loan_id.UseVisualStyleBackColor = true;
            this.Loan_id.Click += new System.EventHandler(this.Loan_id_Click);
            // 
            // Amount
            // 
            this.Amount.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Amount.Location = new System.Drawing.Point(26, 148);
            this.Amount.Name = "Amount";
            this.Amount.Size = new System.Drawing.Size(139, 32);
            this.Amount.TabIndex = 4;
            this.Amount.Text = "Amaunt";
            this.Amount.UseVisualStyleBackColor = true;
            this.Amount.Click += new System.EventHandler(this.Amount_Click);
            // 
            // Branch
            // 
            this.Branch.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Branch.Location = new System.Drawing.Point(187, 148);
            this.Branch.Name = "Branch";
            this.Branch.Size = new System.Drawing.Size(148, 32);
            this.Branch.TabIndex = 5;
            this.Branch.Text = "Branch";
            this.Branch.UseVisualStyleBackColor = true;
            this.Branch.Click += new System.EventHandler(this.Branch_Click);
            // 
            // Account_Name
            // 
            this.Account_Name.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Account_Name.Location = new System.Drawing.Point(371, 148);
            this.Account_Name.Name = "Account_Name";
            this.Account_Name.Size = new System.Drawing.Size(141, 32);
            this.Account_Name.TabIndex = 6;
            this.Account_Name.Text = "Account Name";
            this.Account_Name.UseVisualStyleBackColor = true;
            this.Account_Name.Click += new System.EventHandler(this.Account_Name_Click);
            // 
            // Back
            // 
            this.Back.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Back.Location = new System.Drawing.Point(26, 214);
            this.Back.Name = "Back";
            this.Back.Size = new System.Drawing.Size(75, 30);
            this.Back.TabIndex = 7;
            this.Back.Text = "Back";
            this.Back.UseVisualStyleBackColor = true;
            this.Back.Click += new System.EventHandler(this.Back_Click);
            // 
            // Update
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(543, 256);
            this.Controls.Add(this.Back);
            this.Controls.Add(this.Account_Name);
            this.Controls.Add(this.Branch);
            this.Controls.Add(this.Amount);
            this.Controls.Add(this.Loan_id);
            this.Controls.Add(this.Customar_Name);
            this.Controls.Add(this.Customar_id);
            this.Controls.Add(this.label1);
            this.Name = "Update";
            this.Text = "Update";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button Customar_id;
        private System.Windows.Forms.Button Customar_Name;
        private System.Windows.Forms.Button Loan_id;
        private System.Windows.Forms.Button Amount;
        private System.Windows.Forms.Button Branch;
        private System.Windows.Forms.Button Account_Name;
        private System.Windows.Forms.Button Back;
    }
}