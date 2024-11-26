package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.table.DefaultTableModel;


public class SaleCatalog extends javax.swing.JFrame {

    public SaleCatalog() {
        initComponents();
        record();
    }
    
    private void record() {
    try {
        // Establish the database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "");

    // SQL query to fetch data from the transactions table, including RefundAmount
    String query = "SELECT TransactionId, BookingId, Date, PaymentAmount, RefundAmount FROM transactions";

    PreparedStatement ps = con.prepareStatement(query);
    ResultSet rs = ps.executeQuery();

    // Initialize table with appropriate columns
    String[] columnNames = {"Transaction Id", "Booking Id", "Date", "Payment", "Refund"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    CombinedTable.setModel(model);

    // SimpleDateFormat to format the date
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    // Iterate through the result set and add rows to the table model
    while (rs.next()) {
        int transactionId = rs.getInt("TransactionId");
        int bookingId = rs.getInt("BookingId");
        Date date = rs.getDate("Date");
        double paymentAmount = rs.getDouble("PaymentAmount");
        double refundAmount = rs.getDouble("RefundAmount");  // Fetch the refund amount

        // Format the date
        String formattedDate = sdf.format(date);

        // Add row to the model
        model.addRow(new Object[]{transactionId, bookingId, formattedDate, paymentAmount, refundAmount});
    }

    // Ensure the table refreshes after data is added
    CombinedTable.updateUI();

    // Close resources
    rs.close();
    ps.close();
    con.close();

} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }











    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        CombinedTable = new javax.swing.JTable();
        TotalSaleField = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        monthComboBox = new javax.swing.JComboBox<>();
        yearTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnCalendar = new javax.swing.JButton();
        BtnPackages = new javax.swing.JButton();
        BtnBooking = new javax.swing.JButton();
        BtnHome = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnLaborer = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        BtnReport = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 125));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CombinedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Booking Id", "Date", "Status", "Payment", "Refund"
            }
        ));
        jScrollPane3.setViewportView(CombinedTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 1030, 310));

        TotalSaleField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TotalSaleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalSaleFieldActionPerformed(evt);
            }
        });
        getContentPane().add(TotalSaleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 220, 40));

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search (1).png"))); // NOI18N
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 40, 40));

        monthComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "Year" }));
        getContentPane().add(monthComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 140, 40));

        yearTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        yearTextField.setText("YYYY");
        yearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(yearTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 140, 40));

        jLabel15.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 40, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jLabel14.setText("EPORT");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 100, -1));

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

        jLabel8.setFont(new java.awt.Font("Castellar", 3, 30)); // NOI18N
        jLabel8.setText("PALATES  ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 280, 60));

        jLabel6.setFont(new java.awt.Font("Castellar", 3, 30)); // NOI18N
        jLabel6.setText("&   plates");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 60));

        BtnLaborer.setBackground(new java.awt.Color(210, 180, 140));
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

        BtnReport.setBackground(new java.awt.Color(205, 133, 63));
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

        jLabel19.setFont(new java.awt.Font("Castellar", 3, 48)); // NOI18N
        jLabel19.setText("R");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 50, 60));

        jLabel20.setFont(new java.awt.Font("Castellar", 3, 48)); // NOI18N
        jLabel20.setText("C");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 50, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jLabel16.setText("ATERING");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 100, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jLabel17.setText("ALE");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 70, -1));

        jLabel21.setFont(new java.awt.Font("Castellar", 3, 48)); // NOI18N
        jLabel21.setText("s");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 50, 60));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Total Sale: ₱");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 110, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Filter");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 50, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled design.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1080, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TotalSaleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalSaleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalSaleFieldActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
         // Get selected month and year input
  
    }//GEN-LAST:event_SearchActionPerformed

    private void yearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTextFieldActionPerformed

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

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBooking;
    private javax.swing.JButton BtnCalendar;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnLaborer;
    private javax.swing.JButton BtnPackages;
    private javax.swing.JButton BtnReport;
    private javax.swing.JTable CombinedTable;
    private javax.swing.JButton Search;
    private javax.swing.JTextField TotalSaleField;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logout;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
