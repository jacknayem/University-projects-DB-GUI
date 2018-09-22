namespace Assignment_DBMS
{
    partial class Delete
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
            this.Delete1 = new System.Windows.Forms.Button();
            this.delete2 = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.Back = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(131, 12);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(282, 25);
            this.label1.TabIndex = 0;
            this.label1.Text = "Choose The Customer ID,";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(178, 46);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(181, 16);
            this.label2.TabIndex = 1;
            this.label2.Text = "Which you want to Delete";
            // 
            // Delete1
            // 
            this.Delete1.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Delete1.Location = new System.Drawing.Point(389, 165);
            this.Delete1.Name = "Delete1";
            this.Delete1.Size = new System.Drawing.Size(75, 27);
            this.Delete1.TabIndex = 2;
            this.Delete1.Text = "Delete";
            this.Delete1.UseVisualStyleBackColor = true;
            this.Delete1.Click += new System.EventHandler(this.Delete1_Click);
            // 
            // delete2
            // 
            this.delete2.Location = new System.Drawing.Point(215, 113);
            this.delete2.Name = "delete2";
            this.delete2.Size = new System.Drawing.Size(220, 20);
            this.delete2.TabIndex = 3;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(91, 113);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(118, 18);
            this.label3.TabIndex = 4;
            this.label3.Text = "Customer ID  :";
            // 
            // Back
            // 
            this.Back.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Back.Location = new System.Drawing.Point(104, 166);
            this.Back.Name = "Back";
            this.Back.Size = new System.Drawing.Size(75, 26);
            this.Back.TabIndex = 5;
            this.Back.Text = "Back";
            this.Back.UseVisualStyleBackColor = true;
            this.Back.Click += new System.EventHandler(this.Back_Click);
            // 
            // Delete
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(506, 223);
            this.Controls.Add(this.Back);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.delete2);
            this.Controls.Add(this.Delete1);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "Delete";
            this.Text = "Delete";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button Delete1;
        private System.Windows.Forms.TextBox delete2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button Back;
    }
}