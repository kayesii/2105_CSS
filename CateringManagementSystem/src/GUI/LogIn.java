package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBtnSignup = new javax.swing.JButton();
        jBtnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 222, 179));
        jPanel1.setForeground(new java.awt.Color(228, 191, 116));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(210, 180, 140));
        jPanel2.setForeground(new java.awt.Color(158, 121, 46));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(231, 203, 147));
        jLabel6.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel6.setText("PALATES & PLATES");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 380, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 70));

        background.setBackground(new java.awt.Color(245, 222, 179));
        background.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(210, 180, 140), new java.awt.Color(255, 239, 213)));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_icon.png"))); // NOI18N
        Exit.setText("Exit");
        buttonGroup1.add(Exit);
        Exit.setContentAreaFilled(false);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        background.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 90, 40));

        jLabel1.setBackground(new java.awt.Color(232, 205, 151));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login_icon.png"))); // NOI18N
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 50, 50));

        jBtnSignup.setBackground(new java.awt.Color(205, 133, 63));
        jBtnSignup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBtnSignup.setText("Sign Up");
        buttonGroup1.add(jBtnSignup);
        jBtnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSignupActionPerformed(evt);
            }
        });
        background.add(jBtnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 140, 30));

        jBtnLogin.setBackground(new java.awt.Color(205, 133, 63));
        jBtnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBtnLogin.setText("Login");
        buttonGroup1.add(jBtnLogin);
        jBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLoginActionPerformed(evt);
            }
        });
        background.add(jBtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 140, 30));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        background.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 330, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Password");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        background.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Username");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 410, 280));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FirstBG.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 620, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
         System.exit(0); // Exits the application
    }//GEN-LAST:event_ExitActionPerformed

    private void jBtnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSignupActionPerformed
        jBtnSignup.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        dispose(); // Close the current LogIn frame
        SignUP signUp = new SignUP(); // Open the SignUP frame
        signUp.setVisible(true); // Make the SignUP frame visible
        signUp.setLocationRelativeTo(null); // Center the SignUP frame
    }
});
    }//GEN-LAST:event_jBtnSignupActionPerformed

    private void jBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoginActionPerformed
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
        
        if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this,"Please enter both username and password.","Login Error", JOptionPane.ERROR_MESSAGE);
        }else{
        this.dispose();
        new HomeFrame().setVisible(true);
       
    }

    }//GEN-LAST:event_jBtnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LogIn logIn = new LogIn();
                logIn.setVisible(true);
                logIn.setLocationRelativeTo(null); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JPanel background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnLogin;
    private javax.swing.JButton jBtnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
