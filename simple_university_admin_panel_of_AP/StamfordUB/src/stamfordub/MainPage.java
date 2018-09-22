package stamfordub;

import java.sql.*;
import javax.swing.*;
public class MainPage extends javax.swing.JFrame {

    public MainPage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        HSignUp = new javax.swing.JButton();
        HSignIn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        HContract = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        HCareer = new javax.swing.JButton();
        HIQAC = new javax.swing.JButton();
        HLibrary = new javax.swing.JButton();
        HDegreeVarification = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        HAboutUs = new javax.swing.JComboBox<>();
        HAdmission = new javax.swing.JComboBox<>();
        HAcademic = new javax.swing.JComboBox<>();
        HStudentForums = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        HSignUp.setText("Sign Up");
        HSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(HSignUp);
        HSignUp.setBounds(370, 10, 80, 23);

        HSignIn.setText("Sign In");
        HSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HSignInActionPerformed(evt);
            }
        });
        jPanel1.add(HSignIn);
        HSignIn.setBounds(460, 10, 80, 23);

        jButton3.setText("Email");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(550, 10, 80, 23);

        HContract.setText("Contract");
        HContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HContractActionPerformed(evt);
            }
        });
        jPanel1.add(HContract);
        HContract.setBounds(280, 10, 80, 23);

        jLabel1.setFont(new java.awt.Font("Vijaya", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText(" to Stamford Univarsity Bangladesh");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 50, 480, 40);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("LilyUPC", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Education for tomorrows world a greener world");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(240, 0, 380, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 90, 630, 40);

        HCareer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HCareer.setText("Career");
        HCareer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HCareerActionPerformed(evt);
            }
        });
        jPanel1.add(HCareer);
        HCareer.setBounds(10, 270, 140, 25);

        HIQAC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HIQAC.setText("IQAC");
        HIQAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HIQACActionPerformed(evt);
            }
        });
        jPanel1.add(HIQAC);
        HIQAC.setBounds(10, 310, 140, 25);

        HLibrary.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HLibrary.setText("Library");
        HLibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HLibraryActionPerformed(evt);
            }
        });
        jPanel1.add(HLibrary);
        HLibrary.setBounds(10, 350, 140, 25);

        HDegreeVarification.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HDegreeVarification.setText("Degree Varification");
        jPanel1.add(HDegreeVarification);
        HDegreeVarification.setBounds(10, 430, 140, 25);

        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 16)); // NOI18N
        jLabel3.setText("Message From President");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(150, 0, 210, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 480, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("    Welcome to Stamford University Bangladesh. Located in the heart of Capital city,  ");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 40, 480, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("    Stamford  University  is  one of the  leading  private  universities  of the  country. ");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(0, 60, 470, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("    The characteristics of an outstanding university are good students, great faculty");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(0, 80, 480, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("    and great facilities: Stamford University Bangladesh has it all.  Our programs are");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(0, 100, 470, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("    globally   recognized and  nationally   accredited; at both the undergraduate.");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(0, 120, 480, 14);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("   You will find Stamford  alumni in every  corner of the  world. They are  successful   ");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(0, 150, 480, 14);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("    leaders own professions in nationally,multinationally and internationally reputed.");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(0, 170, 480, 14);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("   Since its inception, Stamford has been working closely with the  industry to cater ");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(0, 200, 480, 14);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("   to the need for  educating students and training professionals. We have a commit");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(0, 220, 480, 14);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("   ment to provide technology, trends and changing requirements. ");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(0, 240, 420, 14);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("   As we believe in  developing  a person  academically  , professionally and socially, ");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(0, 270, 480, 14);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("   to the  vision of  excellence  with  greater emphasis  on research,  scholarly ment ");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(0, 290, 480, 14);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("   ment to provide technology, activity that will lead us towards a better and brighter future. If you are looking for a place to study and dream of receiving a world class quality education, if you think you can change the world through your knowledge and experience, and if your goal is great success in life,");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(0, 310, 480, 14);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stamfordub/HomeBackgrd.jpg"))); // NOI18N
        jPanel3.add(jLabel19);
        jLabel19.setBounds(0, 0, 480, 340);

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("jLabel21");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(410, 140, 40, 14);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(160, 140, 480, 340);

        HAboutUs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HAboutUs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "About Us", "University Profile", "Board of Trustees", "Management Team", "Employees'(Service) Manual" }));
        jPanel1.add(HAboutUs);
        HAboutUs.setBounds(10, 150, 140, 25);

        HAdmission.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HAdmission.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admission", "Program Information", "Requirements", "Admission Test,", "Admission Schedule", "Apply Online", "Admission Test Result", "Contact to Admission" }));
        jPanel1.add(HAdmission);
        HAdmission.setBounds(10, 190, 140, 25);

        HAcademic.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HAcademic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Academic", "Team of Faculty", "Academic Excellence", "Academic Calender", "Academic Policy", "Facilities for Student", "Credit Transfer", "Job Placement", "Clall For Paper", "Schedule", "Certificate Requirements", "Academic Result" }));
        HAcademic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HAcademicActionPerformed(evt);
            }
        });
        jPanel1.add(HAcademic);
        HAcademic.setBounds(10, 230, 140, 25);

        HStudentForums.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HStudentForums.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student Forums", "Career Counseling and Placement Centre", "Stamford University Volunteers", "Public Relations Division (PRD)", "STRAYBIRD,Stamford University Math_Circle", "Stamford Debate Forum,Stamford Institute on Addiction And Rehabilitation (SIAR)", "Center for Professional Development in Business (CPDB)", "Stamford University Research Center (SURC)", "Japanese Language Center,International Center for Development & Research", "Center for South Asian Policy Research", "Center of Continuing Education", "Consultancy & Research (CECR)" }));
        HStudentForums.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HStudentForumsActionPerformed(evt);
            }
        });
        jPanel1.add(HStudentForums);
        HStudentForums.setBounds(10, 390, 140, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stamfordub/animated-welcome.gif"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 40, 150, 40);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stamfordub/hbackground.png"))); // NOI18N
        jLabel20.setText("jLabel20");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(0, 2, 660, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HSignUpActionPerformed
        // TODO add your handling code here:
        StudentSignUp hsignup = new StudentSignUp();
        this.dispose();
        hsignup.setVisible(true);
    }//GEN-LAST:event_HSignUpActionPerformed

    private void HContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HContractActionPerformed
       // TODO add your handling code here:
        Contract contract = new Contract();
        this.dispose();
        contract.setVisible(true);   
    }//GEN-LAST:event_HContractActionPerformed

    private void HLibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HLibraryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HLibraryActionPerformed

    private void HIQACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HIQACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HIQACActionPerformed

    private void HCareerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HCareerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HCareerActionPerformed

    private void HStudentForumsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HStudentForumsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HStudentForumsActionPerformed

    private void HAcademicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HAcademicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HAcademicActionPerformed

    private void HSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HSignInActionPerformed
        SignIn hsignin = new SignIn();
        this.dispose();
        hsignin.setVisible(true);
    }//GEN-LAST:event_HSignInActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Email email = new Email();
        this.dispose();
        email.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> HAboutUs;
    private javax.swing.JComboBox<String> HAcademic;
    private javax.swing.JComboBox<String> HAdmission;
    private javax.swing.JButton HCareer;
    private javax.swing.JButton HContract;
    private javax.swing.JButton HDegreeVarification;
    private javax.swing.JButton HIQAC;
    private javax.swing.JButton HLibrary;
    private javax.swing.JButton HSignIn;
    private javax.swing.JButton HSignUp;
    private javax.swing.JComboBox<String> HStudentForums;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    // End of variables declaration//GEN-END:variables

}
