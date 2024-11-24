/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
public class BookingFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public BookingFrame() {
        initComponents();
        loadBookingToTable();
    }
    private void loadBookingToTable() {
    try {
        // Establish the database connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "");

        // Query to fetch data from 'booking', 'client', and 'packages' tables
        String query = """
                SELECT 
                    b.BookingId,
                    b.EventDate,
                    c.ClientName,
                    c.ClientNumber,
                    b.Theme AS Event,           -- Fetch Theme for the Event column
                    p.PackageName,              -- Fetch Package Name
                    b.TotalPrice AS Price,
                    b.Status
                FROM booking b
                INNER JOIN client c ON b.ClientID = c.ClientID
                INNER JOIN packages p ON b.PackageId = p.PackageID
                """;

        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        // Create a DefaultTableModel
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) BookingRecords.getModel();
        model.setRowCount(0); // Clear existing rows

        // Iterate through the result set
        while (rs.next()) {
            // Add row to the model
            model.addRow(new Object[]{
                rs.getInt("BookingId"),         // ID
                rs.getString("EventDate"),      // Date
                rs.getString("ClientName"),     // Client Name
                rs.getString("ClientNumber"),   // Number
                rs.getString("Event"),          // Event (Theme)
                rs.getString("PackageName"),    // Package Name
                rs.getDouble("Price"),          // Total Price
                rs.getString("Status")          // Payment Status
            });
        }

        // Close connections
        rs.close();
        ps.close();
        con.close();

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error loading reservations: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void loadUpcomingBookingsToTable() {
    try {
        // Establish the database connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "");

        // Query to fetch only upcoming events (where EventDate is greater than the current date)
        String query = """
                SELECT 
                    b.BookingId,
                    b.EventDate,
                    c.ClientName,
                    c.ClientNumber,
                    b.Theme AS Event,           -- Fetch Theme for the Event column
                    p.PackageName,              -- Fetch Package Name
                    b.TotalPrice AS Price,
                    b.Status
                FROM booking b
                INNER JOIN client c ON b.ClientID = c.ClientID
                INNER JOIN packages p ON b.PackageId = p.PackageID
                WHERE b.EventDate >= CURDATE() -- Only upcoming events
                ORDER BY b.EventDate ASC        -- Sort by EventDate (ascending)
                """;

        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        // Create a DefaultTableModel
        DefaultTableModel model = (DefaultTableModel) BookingRecords.getModel();

        // Iterate through the result set and add rows to the table model
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("BookingId"),         // ID
                rs.getString("EventDate"),      // Date
                rs.getString("ClientName"),     // Client Name
                rs.getString("ClientNumber"),   // Number
                rs.getString("Event"),          // Event (Theme)
                rs.getString("PackageName"),    // Package Name
                rs.getDouble("Price"),          // Total Price
                rs.getString("Status")          // Payment Status
            });
        }

        // Close connections
        rs.close();
        ps.close();
        con.close();

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error loading upcoming reservations: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void filterBookingsByPaymentStatus(String paymentStatus) {
    try {
        // Establish the database connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "");

        // Prepare the query based on the selected payment status
        String query = """
                SELECT 
                    b.BookingId,
                    b.EventDate,
                    c.ClientName,
                    c.ClientNumber,
                    b.Theme AS Event,           -- Fetch Theme for the Event column
                    p.PackageName,              -- Fetch Package Name
                    b.TotalPrice AS Price,
                    b.Status
                FROM booking b
                INNER JOIN client c ON b.ClientID = c.ClientID
                INNER JOIN packages p ON b.PackageId = p.PackageID
                """;

        // If the user selects a status, we add a WHERE clause to filter by that status
        if (!paymentStatus.equals("All")) {
            query += " WHERE b.Status = ?";
        }

        PreparedStatement ps = con.prepareStatement(query);

        // If filtering by status, set the parameter
        if (!paymentStatus.equals("All")) {
            ps.setString(1, paymentStatus);
        }

        ResultSet rs = ps.executeQuery();

        // Create a DefaultTableModel
        DefaultTableModel model = (DefaultTableModel) BookingRecords.getModel();
        model.setRowCount(0); // Clear existing rows

        // Iterate through the result set and add rows to the table model
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("BookingId"),         // ID
                rs.getString("EventDate"),      // Date
                rs.getString("ClientName"),     // Client Name
                rs.getString("ClientNumber"),   // Number
                rs.getString("Event"),          // Event (Theme)
                rs.getString("PackageName"),    // Package Name
                rs.getDouble("Price"),          // Total Price
                rs.getString("Status")          // Payment Status
            });
        }

        // Close connections
        rs.close();
        ps.close();
        con.close();

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error loading reservations: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        BookingRecords = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        SORTBYUPCOMINGEVENT = new javax.swing.JButton();
        Status = new javax.swing.JComboBox<>();
        SearchByStatus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BtnCalendar = new javax.swing.JButton();
        BtnPackages = new javax.swing.JButton();
        BtnBooking = new javax.swing.JButton();
        BtnHome = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnLaborer = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 222, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BookingRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Date", "Client Name", "Number", "Event", "Package Name", "Price", "Payment Status"
            }
        ));
        jScrollPane2.setViewportView(BookingRecords);

        jScrollPane3.setViewportView(jScrollPane2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 910, 350));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Booking Records");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 150, -1));

        SORTBYUPCOMINGEVENT.setText("Upcoming Events");
        SORTBYUPCOMINGEVENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SORTBYUPCOMINGEVENTActionPerformed(evt);
            }
        });
        jPanel1.add(SORTBYUPCOMINGEVENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 140, 40));

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Complete", "Cancelled" }));
        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusActionPerformed(evt);
            }
        });
        jPanel1.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 120, 30));

        SearchByStatus.setText("Search");
        SearchByStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByStatusActionPerformed(evt);
            }
        });
        jPanel1.add(SearchByStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 220, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1080, 440));

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

        BtnBooking.setBackground(new java.awt.Color(205, 133, 63));
        BtnBooking.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        BtnBooking.setText("BOOKING");
        BtnBooking.setBorder(null);
        BtnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBookingActionPerformed(evt);
            }
        });
        jPanel2.add(BtnBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 140, 40));

        BtnHome.setBackground(new java.awt.Color(210, 180, 140));
        BtnHome.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        BtnHome.setText("HOME");
        BtnHome.setBorder(null);
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

        logout.setBackground(new java.awt.Color(210, 180, 140));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout (1).png"))); // NOI18N
        logout.setBorder(null);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SORTBYUPCOMINGEVENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SORTBYUPCOMINGEVENTActionPerformed
      // Clear the existing data in the table
    DefaultTableModel model = (DefaultTableModel) BookingRecords.getModel();
    model.setRowCount(0); // Clear existing rows

    // Now reload the upcoming events into the table
    loadUpcomingBookingsToTable(); // Call your method to fetch data from the database and refresh the table

    }//GEN-LAST:event_SORTBYUPCOMINGEVENTActionPerformed

    private void SearchByStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByStatusActionPerformed
   // Add an ActionListener to the button
SearchByStatus.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedStatus = (String) Status.getSelectedItem();  // Get the selected status from the combo box
        filterBookingsByPaymentStatus(selectedStatus);  // Call the method to filter the bookings by selected status
    }
});
    }//GEN-LAST:event_SearchByStatusActionPerformed

    private void StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusActionPerformed

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
                LaborersFrame laborer = new LaborersFrame();
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
    private javax.swing.JTable BookingRecords;
    private javax.swing.JButton BtnBooking;
    private javax.swing.JButton BtnCalendar;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnLaborer;
    private javax.swing.JButton BtnPackages;
    private javax.swing.JButton SORTBYUPCOMINGEVENT;
    private javax.swing.JButton SearchByStatus;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
