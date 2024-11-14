package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        BtnCalendar = new javax.swing.JButton();
        BtnPackages = new javax.swing.JButton();
        BtnBooking = new javax.swing.JButton();
        BtnHome = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnLaborer = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ReserveBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReservationList = new javax.swing.JTable();
        UpdateReservationBtn = new javax.swing.JButton();
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

        jPanel2.setBackground(new java.awt.Color(210, 180, 140));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCalendar.setBackground(new java.awt.Color(210, 180, 140));
        BtnCalendar.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        BtnCalendar.setText("CALENDAR");
        BtnCalendar.setBorder(null);
        BtnCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalendarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 140, 40));

        BtnPackages.setBackground(new java.awt.Color(210, 180, 140));
        BtnPackages.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        BtnPackages.setText("PACKAGES");
        BtnPackages.setBorder(null);
        BtnPackages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPackagesActionPerformed(evt);
            }
        });
        jPanel2.add(BtnPackages, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 140, 40));

        BtnBooking.setBackground(new java.awt.Color(210, 180, 140));
        BtnBooking.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        BtnBooking.setText("BOOKING");
        BtnBooking.setBorder(null);
        BtnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBookingActionPerformed(evt);
            }
        });
        jPanel2.add(BtnBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 140, 40));

        BtnHome.setBackground(new java.awt.Color(205, 133, 63));
        BtnHome.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        BtnHome.setText("HOME");
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(BtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 140, 40));

        jLabel8.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel8.setText("PALATES  ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 280, 60));

        jLabel6.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel6.setText("&   plates");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 60));

        BtnLaborer.setBackground(new java.awt.Color(210, 180, 140));
        BtnLaborer.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        BtnLaborer.setText("LABOR");
        BtnLaborer.setBorder(null);
        BtnLaborer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLaborerActionPerformed(evt);
            }
        });
        jPanel2.add(BtnLaborer, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 140, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 100));

        jPanel1.setBackground(new java.awt.Color(245, 222, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReserveBtn.setBackground(new java.awt.Color(205, 133, 63));
        ReserveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ReserveBtn.setText("Reserve");
        ReserveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ReserveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 170, 40));

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

        UpdateReservationBtn.setBackground(new java.awt.Color(205, 133, 63));
        UpdateReservationBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpdateReservationBtn.setText("Update Reservation");
        UpdateReservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateReservationBtnActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateReservationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 160, 40));

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

    private void BtnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBookingActionPerformed
    BtnBooking.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        dispose();
        BookingFrame bookingF = new BookingFrame(); 
        bookingF.setVisible(true);
        bookingF.setLocationRelativeTo(null); // Center the SignUP frame
    }
});
    }//GEN-LAST:event_BtnBookingActionPerformed

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

    private void BtnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalendarActionPerformed
        BtnCalendar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        dispose();
        Calendar calendar = new Calendar(); 
        calendar.setVisible(true); 
        calendar.setLocationRelativeTo(null); // Center the SignUP frame
    }
}); 
    }//GEN-LAST:event_BtnCalendarActionPerformed

    private void UpdateReservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateReservationBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateReservationBtnActionPerformed

    private void ReserveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReserveBtnActionPerformed

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

    private void BtnLaborerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLaborerActionPerformed
        BtnLaborer.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        dispose();
        LaborersFrame laborer = new LaborersFrame(); 
        laborer.setVisible(true); 
        laborer .setLocationRelativeTo(null); // Center the SignUP frame
    }
}); 
    }//GEN-LAST:event_BtnLaborerActionPerformed

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
                HomeFrame home = new HomeFrame();
                home.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBooking;
    private javax.swing.JButton BtnCalendar;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnLaborer;
    private javax.swing.JButton BtnPackages;
    private javax.swing.JTable ReservationList;
    private javax.swing.JButton ReserveBtn;
    private javax.swing.JButton UpdateReservationBtn;
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
