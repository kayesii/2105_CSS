/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author mchri
 */
public class BookingFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public BookingFrame() {
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
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Calendar = new javax.swing.JButton();
        Packages = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Book = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BookingList1 = new javax.swing.JButton();
        UpdateBook = new javax.swing.JButton();
        UpdateBook1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setBackground(new java.awt.Color(210, 180, 140));
        Home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Home.setText("HOME");
        Home.setBorder(null);
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 160, 40));

        Bookking.setBackground(new java.awt.Color(205, 133, 63));
        Bookking.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Bookking.setText("BOOKING");
        Bookking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookkingActionPerformed(evt);
            }
        });
        getContentPane().add(Bookking, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 160, 40));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 100));

        jPanel1.setBackground(new java.awt.Color(245, 222, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Book.setBackground(new java.awt.Color(210, 180, 140));
        Book.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Book.setText("Book");
        Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookActionPerformed(evt);
            }
        });
        jPanel1.add(Book, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 220, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("BOOKING RECORDS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 230, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Date", "Client Name", "Event", "Price", "Payment Status", "Event Status"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jScrollPane3.setViewportView(jScrollPane2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 810, 360));

        BookingList1.setBackground(new java.awt.Color(205, 133, 63));
        BookingList1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BookingList1.setText("Booking List");
        BookingList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingList1ActionPerformed(evt);
            }
        });
        jPanel1.add(BookingList1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, 50));

        UpdateBook.setBackground(new java.awt.Color(210, 180, 140));
        UpdateBook.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateBook.setText("Update Book");
        UpdateBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBookActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 220, 50));

        UpdateBook1.setBackground(new java.awt.Color(210, 180, 140));
        UpdateBook1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateBook1.setText("Cancel Book");
        UpdateBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBook1ActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateBook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 220, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1080, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeActionPerformed

    private void BookkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookkingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookkingActionPerformed

    private void BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookActionPerformed

    private void CalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalendarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CalendarActionPerformed

    private void PackagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PackagesActionPerformed

    private void BookingList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingList1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookingList1ActionPerformed

    private void UpdateBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBookActionPerformed

    private void UpdateBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBook1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBook1ActionPerformed

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
            java.util.logging.Logger.getLogger(BookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Book;
    private javax.swing.JButton BookingList1;
    private javax.swing.JButton Bookking;
    private javax.swing.JButton Calendar;
    private javax.swing.JButton Home;
    private javax.swing.JButton Packages;
    private javax.swing.JButton UpdateBook;
    private javax.swing.JButton UpdateBook1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
