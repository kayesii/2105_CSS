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
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;


public class Sales extends javax.swing.JFrame {

    public Sales() {
        initComponents();
        record();
    }
    
   
    private void record() {
    try {
        // Establish the database connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "");

        // SQL query to fetch data from the transactions table, including RefundAmount
        String query = "SELECT TransactionId, BookingId, ReservationId, Date, PaymentAmount, RefundAmount FROM transactions";

        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        // Initialize table with appropriate columns
        String[] columnNames = {"Transaction Id", "Booking Id","Reservation Id", "Date", "Payment", "Refund"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        CombinedTable.setModel(model);

        // SimpleDateFormat to format the date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        double totalPayment = 0;  // Initialize variable to store total payment amount
        double totalRefund = 0;   // Initialize variable to store total refund amount

        // Iterate through the result set and add rows to the table model
        while (rs.next()) {
            int transactionId = rs.getInt("TransactionId");
            int bookingId = rs.getInt("BookingId");
            int reservationId = rs.getInt("ReservationId");
            Date date = rs.getDate("Date");
            double paymentAmount = rs.getDouble("PaymentAmount");
            double refundAmount = rs.getDouble("RefundAmount");  // Fetch the refund amount

            // Add the payment and refund amounts to the total
            totalPayment += paymentAmount;
            totalRefund += refundAmount;

            // Format the date
            String formattedDate = sdf.format(date);

            // Add row to the model
            model.addRow(new Object[]{transactionId, bookingId,reservationId, formattedDate, paymentAmount, refundAmount});
        }

        // Set the total sale value in the TotalSaleField (only payment in this case)
        TotalSaleField.setText("₱" + (totalPayment - totalRefund));  // Subtract refunds from total payments

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

        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TotalSaleField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        CombinedTable = new javax.swing.JTable();
        Search = new javax.swing.JButton();
        yearTextField = new javax.swing.JTextField();
        monthComboBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnCalendar = new javax.swing.JButton();
        BtnPackages = new javax.swing.JButton();
        BtnBooking = new javax.swing.JButton();
        BtnHome = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        BtnReport = new javax.swing.JButton();
        BtnLaborer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 125));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Castellar", 3, 48)); // NOI18N
        jLabel20.setText("C");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 50, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jLabel16.setText("ATERING");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 100, -1));

        jLabel21.setFont(new java.awt.Font("Castellar", 3, 48)); // NOI18N
        jLabel21.setText("s");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 50, 50));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jLabel17.setText("ALE");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 70, -1));

        jLabel19.setFont(new java.awt.Font("Castellar", 3, 48)); // NOI18N
        jLabel19.setText("R");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 50, 50));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jLabel14.setText("EPORT");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 100, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Total Sale: ₱");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 110, 40));

        TotalSaleField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TotalSaleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalSaleFieldActionPerformed(evt);
            }
        });
        getContentPane().add(TotalSaleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 220, 40));

        CombinedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Booking Id", "Date", "Status", "Payment", "Refund", "Title 6"
            }
        ));
        jScrollPane3.setViewportView(CombinedTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 1030, 310));

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search (1).png"))); // NOI18N
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 40, 40));

        yearTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        yearTextField.setText("YYYY");
        yearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(yearTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 140, 40));

        monthComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "Year" }));
        getContentPane().add(monthComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 140, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Filter");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 50, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled design.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1080, 440));

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

        jLabel15.setFont(new java.awt.Font("Castellar", 3, 30)); // NOI18N
        jLabel15.setText("PALATES  ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 280, 60));

        jLabel22.setFont(new java.awt.Font("Castellar", 3, 30)); // NOI18N
        jLabel22.setText("&   plates");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 60));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TotalSaleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalSaleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalSaleFieldActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed

       try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
    String selectedMonth = monthComboBox.getSelectedItem().toString(); // e.g., "January"
    String yearText = yearTextField.getText(); // e.g., "2024"

    // Validate the year input
    if (!yearText.matches("\\d{4}")) { // check if year is a 4-digit number
        JOptionPane.showMessageDialog(this, "Please enter a valid year (YYYY).");
        return;
    }

    // Map the month name to month number (e.g., "January" -> "01")
    Map<String, String> monthMap = new HashMap<>();
    monthMap.put("January", "01");
    monthMap.put("February", "02");
    monthMap.put("March", "03");
    monthMap.put("April", "04");
    monthMap.put("May", "05");
    monthMap.put("June", "06");
    monthMap.put("July", "07");
    monthMap.put("August", "08");
    monthMap.put("September", "09");
    monthMap.put("October", "10");
    monthMap.put("November", "11");
    monthMap.put("December", "12");

    String monthNumber = null;

    // If a month is selected, get the corresponding month number
    if (!selectedMonth.equals("Year")) {
        monthNumber = monthMap.get(selectedMonth);
        if (monthNumber == null) {
            JOptionPane.showMessageDialog(this, "Invalid month selected.");
            return;
        }
    }

    // Build the query based on the selection
    String query = "SELECT * FROM transactions WHERE YEAR(Date) = ?";
    if (monthNumber != null) {
        query += " AND MONTH(Date) = ?";
    }

    try (PreparedStatement stmt = con.prepareStatement(query)) {
        stmt.setString(1, yearText); // Set the year (e.g., "2024")

        // If a month is selected, set the month as well
        if (monthNumber != null) {
            stmt.setString(2, monthNumber); // Set the month (e.g., "01")
        }

        ResultSet rs = stmt.executeQuery();

        // Clear the previous data in the table before populating new data
        DefaultTableModel model = new DefaultTableModel(new Object[]{"TransactionId", "BookingId", "ReservationId", "Date", "Payment", "Refund"}, 0);
        CombinedTable.setModel(model);  // Set this model to the table

        // Variables for total sales calculation
        double totalSale = 0.0;

        // Populate the table with the data from the result set
        while (rs.next()) {
            String transactionId = rs.getString("TransactionId"); // Fetch the TransactionId
            String bookingId = rs.getString("BookingId");
            String reservation = rs.getString("ReservationId");
            String date = rs.getString("Date");
            String paymentAmount = rs.getString("PaymentAmount");
            String refundAmount = rs.getString("RefundAmount");

            // Ensure paymentAmount and refundAmount are not null
            double payment = paymentAmount != null ? Double.parseDouble(paymentAmount) : 0.0;
            double refund = refundAmount != null ? Double.parseDouble(refundAmount) : 0.0;

            // Add the data to the table
            model.addRow(new Object[]{transactionId, bookingId, reservation, date, payment, refund});

            // Calculate total sales (consider payment only)
            totalSale += payment;
        }

        // Update the Total Sale field with the calculated total
        TotalSaleField.setText("₱" + totalSale);

    } catch (Exception ex) {
        // Handle any SQL exceptions
        JOptionPane.showMessageDialog(this, "Error fetching data: " + ex.getMessage());
    }

} catch (Exception ex) {
    // Handle database connection issues
    JOptionPane.showMessageDialog(this, "Database connection error: " + ex.getMessage());
}
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
                Sales laborer = new Sales();
                laborer.setVisible(true);
                laborer .setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_BtnReportActionPerformed

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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logout;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
