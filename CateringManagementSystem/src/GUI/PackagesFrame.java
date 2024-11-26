/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author Ivan
 */
public class PackagesFrame extends javax.swing.JFrame {

    /**
     * Creates new form PackagesFrame
     */
    public PackagesFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        BtnCalendar = new javax.swing.JButton();
        BtnPackages = new javax.swing.JButton();
        BtnBooking = new javax.swing.JButton();
        BtnHome = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BtnLaborer = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        BtnReport = new javax.swing.JButton();
        P1F1 = new javax.swing.JButton();
        jButtonBaptismPack = new javax.swing.JButton();
        jButtonBdayPack = new javax.swing.JButton();
        jButtonWedPack = new javax.swing.JButton();
        P1F2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1080, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(210, 180, 140));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCalendar.setBackground(new java.awt.Color(210, 180, 140));
        BtnCalendar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnCalendar.setText("CALENDAR");
        BtnCalendar.setBorder(null);
        BtnCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalendarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 120, 40));

        BtnPackages.setBackground(new java.awt.Color(210, 180, 140));
        BtnPackages.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnPackages.setText("PACKAGES");
        BtnPackages.setBorder(null);
        BtnPackages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPackagesActionPerformed(evt);
            }
        });
        jPanel2.add(BtnPackages, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 120, 40));

        BtnBooking.setBackground(new java.awt.Color(210, 180, 140));
        BtnBooking.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnBooking.setText("BOOKING");
        BtnBooking.setBorder(null);
        BtnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBookingActionPerformed(evt);
            }
        });
        jPanel2.add(BtnBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 120, 40));

        BtnHome.setBackground(new java.awt.Color(210, 180, 140));
        BtnHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnHome.setText("HOME");
        BtnHome.setBorder(null);
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(BtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 120, 40));

        jLabel13.setFont(new java.awt.Font("Castellar", 3, 30)); // NOI18N
        jLabel13.setText("PALATES  ");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 280, 60));

        jLabel14.setFont(new java.awt.Font("Castellar", 3, 30)); // NOI18N
        jLabel14.setText("&   plates");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 60));

        BtnLaborer.setBackground(new java.awt.Color(205, 133, 63));
        BtnLaborer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnLaborer.setText("LABOR");
        BtnLaborer.setBorder(null);
        BtnLaborer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLaborerActionPerformed(evt);
            }
        });
        jPanel2.add(BtnLaborer, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 120, 40));

        logout.setBackground(new java.awt.Color(210, 180, 140));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout (1).png"))); // NOI18N
        logout.setBorder(null);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, 40, 40));

        BtnReport.setBackground(new java.awt.Color(210, 180, 140));
        BtnReport.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnReport.setText("REPORT");
        BtnReport.setBorder(null);
        BtnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReportActionPerformed(evt);
            }
        });
        jPanel2.add(BtnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 120, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 90));

        P1F1.setBackground(new java.awt.Color(210, 180, 140));
        P1F1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        P1F1.setText("Serenity Farewell ");
        P1F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1F1ActionPerformed(evt);
            }
        });
        getContentPane().add(P1F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 310, 50));

        jButtonBaptismPack.setBackground(new java.awt.Color(210, 180, 140));
        jButtonBaptismPack.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonBaptismPack.setText("Baptism Packages");
        getContentPane().add(jButtonBaptismPack, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 320, 150));

        jButtonBdayPack.setBackground(new java.awt.Color(210, 180, 140));
        jButtonBdayPack.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonBdayPack.setText("Birthday Packages");
        jButtonBdayPack.setBorder(null);
        getContentPane().add(jButtonBdayPack, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 320, 150));

        jButtonWedPack.setBackground(new java.awt.Color(210, 180, 140));
        jButtonWedPack.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonWedPack.setText("Wedding Packages");
        getContentPane().add(jButtonWedPack, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 320, 150));

        P1F2.setBackground(new java.awt.Color(210, 180, 140));
        P1F2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        P1F2.setText("Timeless Remembrance");
        P1F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1F2ActionPerformed(evt);
            }
        });
        getContentPane().add(P1F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 310, 50));

        jLabel19.setFont(new java.awt.Font("Castellar", 3, 48)); // NOI18N
        jLabel19.setText("F");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 40, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 32)); // NOI18N
        jLabel21.setText("uneral");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 170, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled design.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1080, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void P1F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1F1ActionPerformed
        P1F1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                PackageF1 f1 = new PackageF1();
                f1.setVisible(true);
                f1.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_P1F1ActionPerformed

    private void BtnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalendarActionPerformed
        BtnCalendar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ReservationCalendar calendar = new ReservationCalendar();
                calendar.setVisible(true);
                calendar.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_BtnCalendarActionPerformed

    private void BtnPackagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPackagesActionPerformed
        BtnPackages.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                PackagesFrame packages = new PackagesFrame();
                packages.setVisible(true);
                packages.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_BtnPackagesActionPerformed

    private void BtnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBookingActionPerformed
        BtnBooking.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                BookingProcess booking = new BookingProcess();
                booking.setVisible(true);
                booking.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_BtnBookingActionPerformed

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
        BtnHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                HomeFrame home = new HomeFrame();
                home.setVisible(true);
                home.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_BtnHomeActionPerformed

    private void BtnLaborerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLaborerActionPerformed
        BtnLaborer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                LaborersTable laborer = new LaborersTable();
                laborer.setVisible(true);
                laborer .setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_BtnLaborerActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Show a confirmation dialog to the user before logging out
                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Log Out", JOptionPane.YES_NO_OPTION);

                // If the user selects "Yes" (confirm == 0), log out and dispose of the frame
                if (confirm == JOptionPane.YES_OPTION) {
                    dispose(); // Close the current LogIn frame
                    LogIn login = new LogIn();
                    login.setVisible(true); // Make the LogIn frame visible
                    login.setLocationRelativeTo(null); // Center the LogIn frame
                }
            }
        });
    }//GEN-LAST:event_logoutActionPerformed

    private void BtnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReportActionPerformed
        BtnReport.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                SaleCatalog laborer = new SaleCatalog();
                laborer.setVisible(true);
                laborer .setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_BtnReportActionPerformed

    private void P1F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1F2ActionPerformed
        P1F2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PackageF2 F2 = new PackageF2();
                F2.setVisible(true);
                F2.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_P1F2ActionPerformed

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
            java.util.logging.Logger.getLogger(PackagesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PackagesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PackagesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PackagesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PackagesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBooking;
    private javax.swing.JButton BtnCalendar;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnLaborer;
    private javax.swing.JButton BtnPackages;
    private javax.swing.JButton BtnReport;
    private javax.swing.JButton P1F1;
    private javax.swing.JButton P1F2;
    private javax.swing.JButton jButtonBaptismPack;
    private javax.swing.JButton jButtonBdayPack;
    private javax.swing.JButton jButtonWedPack;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
