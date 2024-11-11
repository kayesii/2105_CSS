/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author mchri
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
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
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Calendar = new javax.swing.JButton();
        Packages = new javax.swing.JButton();
        Bookking = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Save = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReservationList = new javax.swing.JTable();
        ViewReservation = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtClientNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtReserveDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEvent = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

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

        jLabel6.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel6.setText("&   plates");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 60));

        jLabel8.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel8.setText("PALATES  ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 280, 60));

        jPanel2.setBackground(new java.awt.Color(210, 180, 140));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Calendar.setBackground(new java.awt.Color(210, 180, 140));
        Calendar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Calendar.setText("CALENDAR");
        Calendar.setBorder(null);
        Calendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalendarActionPerformed(evt);
            }
        });
        jPanel2.add(Calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 160, 20));

        Packages.setBackground(new java.awt.Color(210, 180, 140));
        Packages.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Packages.setText("PACKAGES");
        Packages.setBorder(null);
        Packages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackagesActionPerformed(evt);
            }
        });
        jPanel2.add(Packages, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 160, 20));

        Bookking.setBackground(new java.awt.Color(210, 180, 140));
        Bookking.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Bookking.setText("BOOKING");
        Bookking.setBorder(null);
        Bookking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookkingActionPerformed(evt);
            }
        });
        jPanel2.add(Bookking, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 160, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 100));

        jPanel1.setBackground(new java.awt.Color(245, 222, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Save.setBackground(new java.awt.Color(205, 133, 63));
        Save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Save.setText("Reserve");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 170, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Reserved Customer");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 220, -1));

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

        ViewReservation.setBackground(new java.awt.Color(205, 133, 63));
        ViewReservation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewReservation.setText("Update Reservation");
        ViewReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewReservationActionPerformed(evt);
            }
        });
        jPanel1.add(ViewReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 160, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Enter ID ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 60, -1));

        txtID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 490, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Client Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 90, -1));

        txtClientName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 490, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Client Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 100, -1));

        txtClientNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtClientNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtClientNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 490, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 50, -1));

        txtReserveDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtReserveDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReserveDateActionPerformed(evt);
            }
        });
        jPanel1.add(txtReserveDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 490, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Event");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 40, 20));

        txtEvent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEventActionPerformed(evt);
            }
        });
        jPanel1.add(txtEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 490, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Status");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 60, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Confirmed", "Pending", "Cancelled" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 230, -1));

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

    private void ViewReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewReservationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewReservationActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNameActionPerformed

    private void txtClientNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNumberActionPerformed

    private void txtReserveDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReserveDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReserveDateActionPerformed

    private void txtEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEventActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bookking;
    private javax.swing.JButton Calendar;
    private javax.swing.JButton Home;
    private javax.swing.JButton Packages;
    private javax.swing.JTable ReservationList;
    private javax.swing.JButton Save;
    private javax.swing.JButton ViewReservation;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtClientNumber;
    private javax.swing.JTextField txtEvent;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtReserveDate;
    // End of variables declaration//GEN-END:variables
}