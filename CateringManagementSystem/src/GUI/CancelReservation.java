/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author mchri
 */
public class CancelReservation extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public CancelReservation() {
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

        Home = new javax.swing.JButton();
        Bookking = new javax.swing.JButton();
        Packages = new javax.swing.JButton();
        Calendar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReservationList = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        ViewReservation1 = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setBackground(new java.awt.Color(205, 133, 63));
        Home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Home.setText("HOME");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 160, 40));

        Bookking.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Bookking.setText("BOOKING");
        Bookking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookkingActionPerformed(evt);
            }
        });
        getContentPane().add(Bookking, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 160, 40));

        Packages.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Packages.setText("PACKAGES");
        Packages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackagesActionPerformed(evt);
            }
        });
        getContentPane().add(Packages, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 160, 40));

        Calendar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Calendar.setText("CALENDAR");
        Calendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalendarActionPerformed(evt);
            }
        });
        getContentPane().add(Calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 160, -1));

        jLabel6.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel6.setText("&   plates");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 60));

        jLabel8.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel8.setText("PALATES  ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 280, 60));

        jPanel2.setBackground(new java.awt.Color(210, 180, 140));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 100));

        jPanel1.setBackground(new java.awt.Color(245, 222, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Enter Id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 110, -1));

        txtClientName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 550, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Reservation");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 140, -1));

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setDoubleBuffered(true);

        ReservationList.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ReservationList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Date", "Client Name", "Contact", "Event", "Status"
            }
        ));
        jScrollPane2.setViewportView(ReservationList);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 440, 340));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Reserved Customer");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 220, -1));

        ViewReservation1.setBackground(new java.awt.Color(205, 133, 63));
        ViewReservation1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewReservation1.setText("Cancel Reservation");
        ViewReservation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewReservation1ActionPerformed(evt);
            }
        });
        jPanel1.add(ViewReservation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 160, 40));

        Exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_icon.png"))); // NOI18N
        Exit.setText("Back");
        Exit.setContentAreaFilled(false);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1080, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeActionPerformed

    private void BookkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookkingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookkingActionPerformed

    private void PackagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PackagesActionPerformed

    private void CalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalendarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CalendarActionPerformed

    private void ViewReservation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewReservation1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewReservation1ActionPerformed

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNameActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(CancelReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bookking;
    private javax.swing.JButton Calendar;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Home;
    private javax.swing.JButton Packages;
    private javax.swing.JTable ReservationList;
    private javax.swing.JButton ViewReservation1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtClientName;
    // End of variables declaration//GEN-END:variables
}