namespace Assignment_DBMS
{
    partial class Login
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
            this.button1 = new System.Windows.Forms.Button();
            this.Exit = new System.Windows.Forms.Button();
            this.username1 = new System.Windows.Forms.Label();
            this.Password1 = new System.Windows.Forms.Label();
            this.Username = new System.Windows.Forms.TextBox();
            this.Password = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(108, 35);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(203, 25);
            this.label1.TabIndex = 0;
            this.label1.Text = "Admin Login Page";
            // 
            // button1
            // 
            this.button1.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button1.Location = new System.Drawing.Point(276, 175);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 30);
            this.button1.TabIndex = 1;
            this.button1.Text = "Log in";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // Exit
            // 
            this.Exit.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Exit.Location = new System.Drawing.Point(195, 175);
            this.Exit.Name = "Exit";
            this.Exit.Size = new System.Drawing.Size(75, 30);
            this.Exit.TabIndex = 2;
            this.Exit.Text = "Exit";
            this.Exit.UseVisualStyleBackColor = true;
            this.Exit.Click += new System.EventHandler(this.Exit_Click);
            // 
            // username1
            // 
            this.username1.AutoSize = true;
            this.username1.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.username1.Location = new System.Drawing.Point(53, 82);
            this.username1.Name = "username1";
            this.username1.Size = new System.Drawing.Size(103, 18);
            this.username1.TabIndex = 3;
            this.username1.Text = "User Name :";
            this.username1.Click += new System.EventHandler(this.username_Click);
            // 
            // Password1
            // 
            this.Password1.AutoSize = true;
            this.Password1.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Password1.Location = new System.Drawing.Point(53, 122);
            this.Password1.Name = "Password1";
            this.Password1.Size = new System.Drawing.Size(103, 18);
            this.Password1.TabIndex = 3;
            this.Password1.Text = "Password   :";
            this.Password1.Click += new System.EventHandler(this.Password_Click);
            // 
            // Username
            // 
            this.Username.Location = new System.Drawing.Point(170, 80);
            this.Username.Name = "Username";
            this.Username.Size = new System.Drawing.Size(223, 20);
            this.Username.TabIndex = 4;
            // 
            // Password
            // 
            this.Password.Location = new System.Drawing.Point(170, 120);
            this.Password.Name = "Password";
            this.Password.Size = new System.Drawing.Size(223, 20);
            this.Password.TabIndex = 5;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(167, 9);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(88, 18);
            this.label2.TabIndex = 6;
            this.label2.Text = "Bank Lone";
            // 
            // Login
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(427, 261);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.Password);
            this.Controls.Add(this.Username);
            this.Controls.Add(this.Password1);
            this.Controls.Add(this.username1);
            this.Controls.Add(this.Exit);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.label1);
            this.Name = "Login";
            this.Text = "Login";
            this.Load += new System.EventHandler(this.Login_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button Exit;
        private System.Windows.Forms.Label username1;
        private System.Windows.Forms.Label Password1;
        private System.Windows.Forms.TextBox Username;
        private System.Windows.Forms.TextBox Password;
        private System.Windows.Forms.Label label2;
    }
}