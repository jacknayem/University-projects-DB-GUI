namespace Assignment_DBMS
{
    partial class Home
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
            this.VIEW = new System.Windows.Forms.Button();
            this.INSERT = new System.Windows.Forms.Button();
            this.UPDATE = new System.Windows.Forms.Button();
            this.DELETE = new System.Windows.Forms.Button();
            this.label3 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(190, 22);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(128, 25);
            this.label1.TabIndex = 0;
            this.label1.Text = "WELCOME";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(157, 56);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(189, 18);
            this.label2.TabIndex = 1;
            this.label2.Text = "To Bank Lone Database";
            // 
            // VIEW
            // 
            this.VIEW.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.VIEW.Location = new System.Drawing.Point(27, 212);
            this.VIEW.Name = "VIEW";
            this.VIEW.Size = new System.Drawing.Size(199, 30);
            this.VIEW.TabIndex = 2;
            this.VIEW.Text = "VIEW INFORMATION";
            this.VIEW.UseVisualStyleBackColor = true;
            this.VIEW.Click += new System.EventHandler(this.VIEW_Click);
            // 
            // INSERT
            // 
            this.INSERT.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.INSERT.Location = new System.Drawing.Point(27, 140);
            this.INSERT.Name = "INSERT";
            this.INSERT.Size = new System.Drawing.Size(199, 30);
            this.INSERT.TabIndex = 3;
            this.INSERT.Text = "INSERT INFORMATION";
            this.INSERT.UseVisualStyleBackColor = true;
            this.INSERT.Click += new System.EventHandler(this.INSERT_Click);
            // 
            // UPDATE
            // 
            this.UPDATE.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.UPDATE.Location = new System.Drawing.Point(286, 140);
            this.UPDATE.Name = "UPDATE";
            this.UPDATE.Size = new System.Drawing.Size(209, 30);
            this.UPDATE.TabIndex = 4;
            this.UPDATE.Text = "UPDATE INFORMATION";
            this.UPDATE.UseVisualStyleBackColor = true;
            this.UPDATE.Click += new System.EventHandler(this.UPDATE_Click);
            // 
            // DELETE
            // 
            this.DELETE.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.DELETE.Location = new System.Drawing.Point(286, 212);
            this.DELETE.Name = "DELETE";
            this.DELETE.Size = new System.Drawing.Size(209, 30);
            this.DELETE.TabIndex = 5;
            this.DELETE.Text = "DELETE INFORMATION";
            this.DELETE.UseVisualStyleBackColor = true;
            this.DELETE.Click += new System.EventHandler(this.DELETE_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(23, 100);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(196, 24);
            this.label3.TabIndex = 6;
            this.label3.Text = "Which is you want ?";
            // 
            // Home
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(543, 268);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.DELETE);
            this.Controls.Add(this.UPDATE);
            this.Controls.Add(this.INSERT);
            this.Controls.Add(this.VIEW);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "Home";
            this.Text = "Home";
            this.Load += new System.EventHandler(this.Home_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button VIEW;
        private System.Windows.Forms.Button INSERT;
        private System.Windows.Forms.Button UPDATE;
        private System.Windows.Forms.Button DELETE;
        private System.Windows.Forms.Label label3;
    }
}