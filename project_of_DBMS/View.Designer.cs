namespace Assignment_DBMS
{
    partial class View
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
            this.viewgrid = new System.Windows.Forms.DataGridView();
            this.Back = new System.Windows.Forms.Button();
            this.View1 = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.viewgrid)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(164, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(216, 25);
            this.label1.TabIndex = 0;
            this.label1.Text = "ALL INFORMATION";
            // 
            // viewgrid
            // 
            this.viewgrid.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.viewgrid.Location = new System.Drawing.Point(12, 76);
            this.viewgrid.Name = "viewgrid";
            this.viewgrid.Size = new System.Drawing.Size(528, 202);
            this.viewgrid.TabIndex = 1;
            // 
            // Back
            // 
            this.Back.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Back.Location = new System.Drawing.Point(12, 37);
            this.Back.Name = "Back";
            this.Back.Size = new System.Drawing.Size(85, 33);
            this.Back.TabIndex = 2;
            this.Back.Text = "Back";
            this.Back.UseVisualStyleBackColor = true;
            this.Back.Click += new System.EventHandler(this.Back_Click);
            // 
            // View1
            // 
            this.View1.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.View1.Location = new System.Drawing.Point(337, 37);
            this.View1.Name = "View1";
            this.View1.Size = new System.Drawing.Size(203, 33);
            this.View1.TabIndex = 3;
            this.View1.Text = "Click Here To View";
            this.View1.UseVisualStyleBackColor = true;
            this.View1.Click += new System.EventHandler(this.View1_Click);
            // 
            // View
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(556, 291);
            this.Controls.Add(this.View1);
            this.Controls.Add(this.Back);
            this.Controls.Add(this.viewgrid);
            this.Controls.Add(this.label1);
            this.Name = "View";
            this.Text = "View";
            ((System.ComponentModel.ISupportInitialize)(this.viewgrid)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.DataGridView viewgrid;
        private System.Windows.Forms.Button Back;
        private System.Windows.Forms.Button View1;
    }
}