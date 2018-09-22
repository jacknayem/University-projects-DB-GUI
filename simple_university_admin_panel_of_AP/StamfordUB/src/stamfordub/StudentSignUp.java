
package stamfordub;

import java.sql.*;
import java.util.Arrays;
import javax.swing.*;

public class StudentSignUp extends javax.swing.JFrame {

    public StudentSignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        SUSignUp = new javax.swing.JButton();
        SUSignIn = new javax.swing.JButton();
        SUEmail = new javax.swing.JButton();
        SUContract = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        StudentID = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        SignUp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BirthDate = new datechooser.beans.DateChooserCombo();
        Trimester = new javax.swing.JComboBox<>();
        EmailID = new javax.swing.JTextField();
        PhoneNumber = new javax.swing.JTextField();
        ReenterPassword = new javax.swing.JPasswordField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        SUCareer = new javax.swing.JButton();
        SUIQAC = new javax.swing.JButton();
        SULibrary = new javax.swing.JButton();
        SUDegreeVarification = new javax.swing.JButton();
        SUAboutUs = new javax.swing.JComboBox<>();
        SUAdmission = new javax.swing.JComboBox<>();
        SUAcademic = new javax.swing.JComboBox<>();
        SUStudentForums = new javax.swing.JComboBox<>();
        SignUpBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        SUSignUp.setText("Sign Up");
        SUSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUSignUpActionPerformed(evt);
            }
        });
        jPanel2.add(SUSignUp);
        SUSignUp.setBounds(370, 10, 80, 23);

        SUSignIn.setText("Sign In");
        SUSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUSignInActionPerformed(evt);
            }
        });
        jPanel2.add(SUSignIn);
        SUSignIn.setBounds(460, 10, 80, 23);

        SUEmail.setText("Email");
        SUEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUEmailActionPerformed(evt);
            }
        });
        jPanel2.add(SUEmail);
        SUEmail.setBounds(550, 10, 80, 23);

        SUContract.setText("Contract");
        SUContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUContractActionPerformed(evt);
            }
        });
        jPanel2.add(SUContract);
        SUContract.setBounds(280, 10, 80, 23);

        jLabel1.setFont(new java.awt.Font("Vijaya", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Stamford Univarsity Bangladesh");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(100, 50, 450, 40);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("LilyUPC", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Education for tomorrows world a greener world");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(241, 0, 389, 40);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(10, 90, 630, 40);

        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel4.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));
        jPanel5.setLayout(null);
        jPanel4.add(jPanel5);
        jPanel5.setBounds(0, 0, 0, 0);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student ID  :");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(10, 40, 90, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password  :");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(10, 250, 90, 16);

        StudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentIDActionPerformed(evt);
            }
        });
        jPanel4.add(StudentID);
        StudentID.setBounds(150, 40, 170, 25);

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel4.add(Password);
        Password.setBounds(150, 240, 170, 25);

        SignUp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SignUp.setText("Sign Up");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        jPanel4.add(SignUp);
        SignUp.setBounds(240, 320, 79, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Birth Date  :");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(10, 80, 80, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email ID  :");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 170, 70, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone Number  :");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 210, 106, 16);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Re-enter Password  :");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(10, 290, 140, 16);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Trimester  :");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 130, 80, 16);
        jPanel4.add(BirthDate);
        BirthDate.setBounds(150, 80, 170, 25);

        Trimester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spring 2015", "Summer 2015", "Fall 2015", "Spring 2016", "Summer 2016", "Fall 2016", "Spring 2017", "Summer 2017", "Fall 2017", "Spring 2018", "Summer 2018", "Fall 2018" }));
        jPanel4.add(Trimester);
        Trimester.setBounds(150, 120, 170, 25);
        jPanel4.add(EmailID);
        EmailID.setBounds(150, 160, 170, 25);
        jPanel4.add(PhoneNumber);
        PhoneNumber.setBounds(150, 200, 170, 25);
        jPanel4.add(ReenterPassword);
        ReenterPassword.setBounds(150, 280, 170, 25);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stamfordub/BackgroundSignup2.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jTabbedPane1.addTab("Sign Up Student Account", jLabel11);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stamfordub/backgroud.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, -26, 480, 350);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Teacher ID  :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 40, 90, 20);

        jTabbedPane1.addTab("Sign Up Teacher Account", jPanel1);

        jPanel7.setLayout(null);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stamfordub/BackgroundSignup3.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel7.add(jLabel14);
        jLabel14.setBounds(0, -20, 480, 340);

        jTabbedPane1.addTab("Sign Up Employee Account", jPanel7);

        jPanel4.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 480, 350);
        jTabbedPane1.getAccessibleContext().setAccessibleName("Student");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6);
        jPanel6.setBounds(300, -20, 100, 100);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(170, 140, 480, 350);

        SUCareer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SUCareer.setText("Career");
        SUCareer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUCareerActionPerformed(evt);
            }
        });
        jPanel2.add(SUCareer);
        SUCareer.setBounds(10, 270, 140, 25);

        SUIQAC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SUIQAC.setText("IQAC");
        SUIQAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUIQACActionPerformed(evt);
            }
        });
        jPanel2.add(SUIQAC);
        SUIQAC.setBounds(10, 310, 140, 25);

        SULibrary.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SULibrary.setText("Library");
        SULibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SULibraryActionPerformed(evt);
            }
        });
        jPanel2.add(SULibrary);
        SULibrary.setBounds(10, 350, 140, 25);

        SUDegreeVarification.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SUDegreeVarification.setText("Degree Varification");
        jPanel2.add(SUDegreeVarification);
        SUDegreeVarification.setBounds(10, 430, 140, 23);

        SUAboutUs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SUAboutUs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "About Us", "University Profile", "Board of Trustees", "Management Team", "Employees'(Service) Manual" }));
        jPanel2.add(SUAboutUs);
        SUAboutUs.setBounds(10, 150, 140, 25);

        SUAdmission.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SUAdmission.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admission", "Program Information", "Requirements", "Admission Test,", "Admission Schedule", "Apply Online", "Admission Test Result", "Contact to Admission" }));
        jPanel2.add(SUAdmission);
        SUAdmission.setBounds(10, 190, 140, 25);

        SUAcademic.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SUAcademic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Academic", "Team of Faculty", "Academic Excellence", "Academic Calender", "Academic Policy", "Facilities for Student", "Credit Transfer", "Job Placement", "Clall For Paper", "Schedule", "Certificate Requirements", "Academic Result" }));
        jPanel2.add(SUAcademic);
        SUAcademic.setBounds(10, 230, 140, 25);

        SUStudentForums.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SUStudentForums.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student Forums", "Career Counseling and Placement Centre", "Stamford University Volunteers", "Public Relations Division (PRD)", "STRAYBIRD,Stamford University Math_Circle", "Stamford Debate Forum,Stamford Institute on Addiction And Rehabilitation (SIAR)", "Center for Professional Development in Business (CPDB)", "Stamford University Research Center (SURC)", "Japanese Language Center,International Center for Development & Research", "Center for South Asian Policy Research", "Center of Continuing Education", "Consultancy & Research (CECR)" }));
        jPanel2.add(SUStudentForums);
        SUStudentForums.setBounds(10, 390, 140, 25);

        SignUpBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stamfordub/BackIcon.PNG"))); // NOI18N
        SignUpBack.setText("Back to Main");
        SignUpBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBackActionPerformed(evt);
            }
        });
        jPanel2.add(SignUpBack);
        SignUpBack.setBounds(20, 10, 120, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stamfordub/BackgroundSignup.jpg"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 0, 660, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SUSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SUSignUpActionPerformed

    private void SUContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUContractActionPerformed
        // TODO add your handling code here:
        Contract contract = new Contract();
        this.dispose();
        contract.setVisible(true);
    }//GEN-LAST:event_SUContractActionPerformed

    private void StudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentIDActionPerformed

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
       try{
        String url = "jdbc:sqlserver://localhost:1433;databaseName=JavaProject";
        String username = "JackNayem";
        String password = "asdfghjkl";       
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stmt = con.createStatement();
        //String Query = "insert into SignUpStudent (StdID,BirthDate,Trimester,EmailAddress,MobileNumber,Pass,passReturn) values ('"+StudentID.getText()+"','"+BirthDate.getSelectedDate()+"','"+Trimester.getSelectedItem()+"','"+EmailID.getText()+"','"+PhoneNumber.getText()+"','"+Arrays.toString(Password.getPassword())+"','"+Arrays.toString(ReenterPassword.getPassword())+"')";
        String Query = "insert into SignUpStudent (StdID,BirthDate,Trimester,EmailAddress,MobileNumber,Pass,passReturn) values ('"+StudentID.getText()+"','"+BirthDate.getDateFormat()+"','"+Trimester.getSelectedItem()+"','"+EmailID.getText()+"','"+PhoneNumber.getText()+"','"+Arrays.toString(Password.getPassword())+"','"+Arrays.toString(ReenterPassword.getPassword())+"')";
        stmt.execute(Query);
        
        JOptionPane.showMessageDialog(null,"Welcome to Stamford Univarsity Bangladesh,Your Account is created");
       
       
//       StudentID.setText(null);
//       Trimester.setSelectedItem("Select");
//       EmailID.setText(null);
//       PhoneNumber.setText(null);
//       Password.setText(null);
//       ReenterPassword.setText(null);
       
       }catch(SQLException ex)
       {
           JOptionPane.showMessageDialog(null,ex.toString());
       }
        
    }//GEN-LAST:event_SignUpActionPerformed

    private void SUCareerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUCareerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SUCareerActionPerformed

    private void SUIQACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUIQACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SUIQACActionPerformed

    private void SULibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SULibraryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SULibraryActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void SignUpBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBackActionPerformed
        // TODO add your handling code here:
        MainPage mainpage = new MainPage();
        this.dispose();
        mainpage.setVisible(true); 
    }//GEN-LAST:event_SignUpBackActionPerformed

    private void SUSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUSignInActionPerformed
        // TODO add your handling code here:
        SignIn hsignin = new SignIn();
        this.dispose();
        hsignin.setVisible(true);
    }//GEN-LAST:event_SUSignInActionPerformed

    private void SUEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUEmailActionPerformed
        // TODO add your handling code here:
        Email email = new Email();
        this.dispose();
        email.setVisible(true);
    }//GEN-LAST:event_SUEmailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo BirthDate;
    private javax.swing.JTextField EmailID;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JPasswordField ReenterPassword;
    private javax.swing.JComboBox<String> SUAboutUs;
    private javax.swing.JComboBox<String> SUAcademic;
    private javax.swing.JComboBox<String> SUAdmission;
    private javax.swing.JButton SUCareer;
    private javax.swing.JButton SUContract;
    private javax.swing.JButton SUDegreeVarification;
    private javax.swing.JButton SUEmail;
    private javax.swing.JButton SUIQAC;
    private javax.swing.JButton SULibrary;
    private javax.swing.JButton SUSignIn;
    private javax.swing.JButton SUSignUp;
    private javax.swing.JComboBox<String> SUStudentForums;
    private javax.swing.JButton SignUp;
    private javax.swing.JButton SignUpBack;
    private javax.swing.JTextField StudentID;
    private javax.swing.JComboBox<String> Trimester;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
