
package GUI;

// Import necessary classes
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;

public class BookingProcess extends JFrame {
    // Constructor and other methods
    public BookingProcess() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClientNum = new javax.swing.JTextField();
        txtClientName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTimeEnds = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        NumberOfGuests = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        txtTheme = new javax.swing.JTextField();
        txtTimeStart = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        NumberOfLaborers = new javax.swing.JSpinner();
        jCalendarComboBox1 = new de.wannawork.jcalendar.JCalendarComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        PackagePicker = new javax.swing.JTextField();
        PackagesDetails = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        pickCateringStyle = new javax.swing.JComboBox<>();
        RecordBtn = new javax.swing.JButton();
        txtSearchBookingID = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Status = new javax.swing.JComboBox<>();
        ViewReceipt = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        update = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
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

        jPanel3.setBackground(new java.awt.Color(210, 180, 140));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setText("Phone Number");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 120, 20));

        txtClientNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNumActionPerformed(evt);
            }
        });
        jPanel3.add(txtClientNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 250, -1));

        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 330, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Client Information");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 880, 80));

        jPanel4.setBackground(new java.awt.Color(210, 180, 140));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Guess Count");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, -1));

        txtTimeEnds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeEndsActionPerformed(evt);
            }
        });
        jPanel4.add(txtTimeEnds, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 100, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setText("Event Name");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        jPanel4.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 310, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Event Details");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 160, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setText("Date");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 40, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel14.setText("Time start");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel15.setText("Location");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 20));
        jPanel4.add(NumberOfGuests, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 70, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("Time ends");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 70, -1));

        txtTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThemeActionPerformed(evt);
            }
        });
        jPanel4.add(txtTheme, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 310, -1));

        txtTimeStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeStartActionPerformed(evt);
            }
        });
        jPanel4.add(txtTimeStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 110, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel22.setText("No. of Waitstaff");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 110, 20));
        jPanel4.add(NumberOfLaborers, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 60, -1));
        jPanel4.add(jCalendarComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 130, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 440, 200));

        jPanel5.setBackground(new java.awt.Color(210, 180, 140));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Package");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 80, 30));
        jPanel5.add(PackagePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, -1));

        PackagesDetails.setText("Packages Details");
        PackagesDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackagesDetailsActionPerformed(evt);
            }
        });
        jPanel5.add(PackagesDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel25.setText("Catering Style:");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        pickCateringStyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buffet catering", "Plated catering" }));
        jPanel5.add(pickCateringStyle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 170, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 210, 200));

        RecordBtn.setBackground(new java.awt.Color(210, 180, 140));
        RecordBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RecordBtn.setText("Records");
        RecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RecordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 160, 50));

        txtSearchBookingID.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtSearchBookingID.setText("Enter Booking ID");
        txtSearchBookingID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBookingIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtSearchBookingID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 320, 40));

        jPanel8.setBackground(new java.awt.Color(210, 180, 140));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("Payment");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel28.setText("Payment Status:");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Complete", "Cancelled" }));
        jPanel8.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, 30));

        ViewReceipt.setText("View Receipt");
        ViewReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewReceiptActionPerformed(evt);
            }
        });
        jPanel8.add(ViewReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, 50));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 210, 200));

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, 160, 50));

        SearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search (1).png"))); // NOI18N
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 60, 40));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, 160, 50));

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 220, 160, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Booking Form");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1080, 420));

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

    private void txtClientNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNumActionPerformed

    private void txtTimeEndsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeEndsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeEndsActionPerformed

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNameActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtSearchBookingIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBookingIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBookingIDActionPerformed

    private void RecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordBtnActionPerformed
        RecordBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                BookingFrame records = new BookingFrame();
                records.setVisible(true);
                records.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_RecordBtnActionPerformed

    private void txtThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThemeActionPerformed

    private void txtTimeStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeStartActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
    // Step 1: Validate client information
    String clientName = txtClientName.getText().trim();
    String clientNum = txtClientNum.getText().trim();
    // Step 3: Check if the client already has a reservation based on clientName and clientNumber (for uniqueness)

    if (clientName.isEmpty() || clientNum.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all client details.", "Client Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int clientID = -1;

    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
        // Step 2: Check if client exists, insert if not
        String checkClientQuery = "SELECT ClientID FROM client WHERE ClientName = ? AND ClientNumber = ?";
        try (PreparedStatement ps = con.prepareStatement(checkClientQuery)) {
            ps.setString(1, clientName);
            ps.setString(2, clientNum);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                clientID = rs.getInt("ClientID");
            } else {
                // Insert new client if not found
                String insertClientQuery = "INSERT INTO client (ClientName, ClientNumber) VALUES (?, ?)";
                try (PreparedStatement insertClientStmt = con.prepareStatement(insertClientQuery, PreparedStatement.RETURN_GENERATED_KEYS)) {
                    insertClientStmt.setString(1, clientName);
                    insertClientStmt.setString(2, clientNum);
                    int rowsInserted = insertClientStmt.executeUpdate();

                    if (rowsInserted > 0) {
                        ResultSet generatedKeys = insertClientStmt.getGeneratedKeys();
                        if (generatedKeys.next()) {
                            clientID = generatedKeys.getInt(1);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to register the client.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }
        }

// Debugging: Print values to check if they are correct
System.out.println("Client Name: " + clientName);
System.out.println("Client Number: " + clientNum);

// SQL query to check if a reservation exists for the client based on their name and number
String checkReservationQuery = "SELECT ReservationID FROM reservation WHERE ClientID = (SELECT ClientID FROM client WHERE TRIM(ClientName) = TRIM(?) AND ClientNumber = ? LIMIT 1)";

try (PreparedStatement ps = con.prepareStatement(checkReservationQuery)) {
    ps.setString(1, clientName);  // Use the client name
    ps.setString(2, clientNum);   // Use the client number to ensure uniqueness
    
    ResultSet rs = ps.executeQuery();
    
    // If a reservation exists, delete it
    if (rs.next()) {
        int reservationID = rs.getInt("ReservationID");

        // Delete the existing reservation
        String deleteReservationQuery = "DELETE FROM reservation WHERE ReservationID = ?";
        try (PreparedStatement deleteStmt = con.prepareStatement(deleteReservationQuery)) {
            deleteStmt.setInt(1, reservationID);
            int rowsDeleted = deleteStmt.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Previous reservation deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete reservation.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "No previous reservation found for the client.", "Info", JOptionPane.INFORMATION_MESSAGE);
    }
}

        // Step 4: Get event details for the new booking
        String theme = txtTheme.getText().trim();
        String location = txtLocation.getText().trim();
        String timeStartStr = txtTimeStart.getText().trim();
        String timeEndStr = txtTimeEnds.getText().trim();
        String packagePickerStr = PackagePicker.getText().trim();

        int guestCount = (int) NumberOfGuests.getValue();
        int laborCount = (int) NumberOfLaborers.getValue();
        String cateringStyle = pickCateringStyle.getSelectedItem().toString();

        if (theme.isEmpty() || location.isEmpty() || timeStartStr.isEmpty() || timeEndStr.isEmpty() || cateringStyle == null || cateringStyle.equals("Select Catering Style")) {
            JOptionPane.showMessageDialog(null, "Please fill in all event details.", "Event Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Step 5: Get and validate Date and Time from Calendar Picker
        java.util.Date eventDate = jCalendarComboBox1.getDate();  // Get date from the calendar picker
        if (eventDate == null) {
            JOptionPane.showMessageDialog(null, "Please select a valid event date.", "Date Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        java.sql.Time eventTimeStart = null;
        java.sql.Time eventTimeEnd = null;

        try {
            eventTimeStart = java.sql.Time.valueOf(timeStartStr);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Invalid start time format. Please use HH:mm:ss.", "Start Time Format Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            eventTimeEnd = java.sql.Time.valueOf(timeEndStr);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Invalid end time format. Please use HH:mm:ss.", "End Time Format Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Step 6: Validate and parse Package ID
        int selectedPackageId = -1;
        if (packagePickerStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a package.", "Package Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            selectedPackageId = Integer.parseInt(packagePickerStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid package ID. Please enter a valid number.", "Package ID Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Step 7: Retrieve available laborers from the database
        int availableLaborers = 0;
        String laborerQuery = "SELECT COUNT(*) AS availableLaborers FROM laborer WHERE Status = 'Active'";
        try (PreparedStatement ps = con.prepareStatement(laborerQuery)) {
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                availableLaborers = rs.getInt("availableLaborers");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Step 8: Compare requested laborers with available laborers
        if (laborCount > availableLaborers) {
            JOptionPane.showMessageDialog(null, "Not enough available laborers. Only " + availableLaborers + " laborers are available.", "Labor Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Step 9: Calculate hours worked
        int hoursWorked = (int) ChronoUnit.HOURS.between(eventTimeStart.toLocalTime(), eventTimeEnd.toLocalTime());

        // Step 10: Calculate total price
        double totalPrice = calculateTotalAmount(selectedPackageId, guestCount, laborCount, hoursWorked, cateringStyle);

        // Step 11: Payment status
        String paymentStatus = (Status.getSelectedItem() != null) ? Status.getSelectedItem().toString() : "Pending";

        // Step 12: Insert booking details into the database
        String bookingQuery = "INSERT INTO booking (ClientID, PackageId, EventDate, NumberOfGuests, TotalPrice, Status, Theme, Location, TimeStart, TimeEnd, NumberOfLaborers, CateringStyle) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pst = con.prepareStatement(bookingQuery, PreparedStatement.RETURN_GENERATED_KEYS)) {
            pst.setInt(1, clientID);
            pst.setInt(2, selectedPackageId);
            pst.setDate(3, new java.sql.Date(eventDate.getTime()));  // Use the date directly
            pst.setInt(4, guestCount);
            pst.setDouble(5, totalPrice);
            pst.setString(6, paymentStatus);
            pst.setString(7, theme);
            pst.setString(8, location);
            pst.setTime(9, eventTimeStart);
            pst.setTime(10, eventTimeEnd);
            pst.setInt(11, laborCount);
            pst.setString(12, cateringStyle);

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                ResultSet generatedKeys = pst.getGeneratedKeys();
                int bookingId = -1;
                if (generatedKeys.next()) {
                    bookingId = generatedKeys.getInt(1);  // Retrieve the BookingID
                }

                // Step 13: Insert labor details and total pay into LaborPayment table
                String laborPaymentQuery = "INSERT INTO booking_laborer (BookingId, LaborerID, TotalPay, StatusPay) VALUES (?, ?, ?, ?)";
                for (int laborerId = 1; laborerId <= laborCount; laborerId++) {  // Assuming laborers are numbered 1, 2, ..., laborCount
                    double laborPay = calculateLaborPay(laborerId, hoursWorked);  // You need to define this function
                    try (PreparedStatement laborPst = con.prepareStatement(laborPaymentQuery)) {
                        laborPst.setInt(1, bookingId);
                        laborPst.setInt(2, laborerId);
                        laborPst.setDouble(3, laborPay);
                        laborPst.setString(4, "Pending");
                        laborPst.executeUpdate();
                    }
                }

                JOptionPane.showMessageDialog(null, "Booking confirmed! Total price: Php " + totalPrice, "Booking Successful", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error booking the event.", "Booking Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_SaveActionPerformed

    private void ViewReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewReceiptActionPerformed
        String clientName = txtClientName.getText().trim();
        String clientNum = txtClientNum.getText().trim();
        String theme = txtTheme.getText().trim();
        String location = txtLocation.getText().trim();

        // Formatting the date from jCalendarComboBox1
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = dateFormat.format(jCalendarComboBox1.getDate());

        String timeStartStr = txtTimeStart.getText().trim();
        String timeEndStr = txtTimeEnds.getText().trim();
        int guestCount = (int) NumberOfGuests.getValue();
        int laborCount = (int) NumberOfLaborers.getValue();
        String cateringStyle = pickCateringStyle.getSelectedItem().toString();
        int hoursWorked;
        try {
            hoursWorked = (int) ChronoUnit.HOURS.between(
                java.sql.Time.valueOf(timeStartStr).toLocalTime(),
                java.sql.Time.valueOf(timeEndStr).toLocalTime()
            );
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Invalid start or end time format.", "Time Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String packagePickerStr = PackagePicker.getText().trim();
        if (packagePickerStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a package.", "Package Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int selectedPackageId;
        try {
            selectedPackageId = Integer.parseInt(packagePickerStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid package ID. Please enter a valid number.", "Package ID Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double totalPrice = calculateTotalAmount(selectedPackageId, guestCount, laborCount, hoursWorked, cateringStyle);
        double laborPayPerLaborer = calculateLaborPay(1, hoursWorked);
        double totalLaborPay = laborPayPerLaborer * laborCount;

 String receiptContent = "-----------------------------------------\n"
        + "             Palates & Plates            \n"
        + "              Event Receipt             \n"
        + "-----------------------------------------\n"
        + "Client Name: " + clientName + "\n"
        + "Client Number: " + clientNum + "\n"
        + "Event Theme: " + theme + "\n"
        + "Event Date: " + dateStr + "\n"
        + "Event Location: " + location + "\n"
        + "Start Time: " + timeStartStr + "\n"
        + "End Time: " + timeEndStr + "\n"
        + "Number of Guests: " + guestCount + "\n"
        + "Catering Style: " + cateringStyle + "\n"  // Add catering style to receipt
        + "-----------------------------------------\n"
        + "Fee:\n"
        + "Reservation Fee:₱ 500\n"
        + "-----------------------------------------\n"
        + "Laborers:\n"
        + "Number of Laborers: " + laborCount + "\n"
        + "Labor Pay Per Laborer: ₱" + String.format("%.2f", laborPayPerLaborer) + "\n"
        + "Total Labor Pay: ₱" + String.format("%.2f", totalLaborPay) + "\n"
        + "-----------------------------------------\n"
        + "Total Price for Event: ₱" + String.format("%.2f", totalPrice) + "\n"  // Add total price
        + "-----------------------------------------\n";
    JTextArea receiptTextArea = new JTextArea(20, 20);
    receiptTextArea.setText(receiptContent);
    receiptTextArea.setEditable(false);

    JScrollPane scrollPane = new JScrollPane(receiptTextArea);
    JOptionPane.showMessageDialog(null, scrollPane, "Booking Receipt", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ViewReceiptActionPerformed

    private void PackagesDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackagesDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PackagesDetailsActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
    String bookingID = txtSearchBookingID.getText().trim();
    if (bookingID.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a Booking ID", "Search Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
        String searchQuery = "SELECT b.*, c.ClientName, c.ClientNumber FROM booking b " +
                             "JOIN client c ON b.ClientID = c.ClientID WHERE b.BookingID = ?";
        try (PreparedStatement ps = con.prepareStatement(searchQuery)) {
            ps.setString(1, bookingID);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                txtClientName.setText(rs.getString("ClientName"));
                txtClientNum.setText(rs.getString("ClientNumber"));
                txtTheme.setText(rs.getString("Theme"));

                // Formatting date before setting it into the combo box
                java.util.Date eventDate = rs.getDate("EventDate");
                jCalendarComboBox1.setDate(eventDate);

                txtLocation.setText(rs.getString("Location"));
                txtTimeStart.setText(rs.getString("TimeStart"));
                txtTimeEnds.setText(rs.getString("TimeEnd"));
                PackagePicker.setText(rs.getString("PackageID"));
                pickCateringStyle.setSelectedItem(rs.getString("CateringStyle"));
                NumberOfGuests.setValue(rs.getInt("NumberOfGuests"));
                NumberOfLaborers.setValue(rs.getInt("NumberOfLaborers"));
                Status.setSelectedItem(rs.getString("Status"));

                JOptionPane.showMessageDialog(null, "Booking details retrieved successfully.", "Search Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No booking found for the provided Booking ID.", "Search Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database connection error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // Step 1: Get Booking ID
    String bookingID = txtSearchBookingID.getText().trim();
    if (bookingID.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a Booking ID to update.", "Update Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Step 2: Validate and collect updated data from fields
    String clientName = txtClientName.getText().trim();
    String clientNumber = txtClientNum.getText().trim();
    String theme = txtTheme.getText().trim();
    String location = txtLocation.getText().trim();
    String timeStartStr = txtTimeStart.getText().trim();
    String timeEndStr = txtTimeEnds.getText().trim();
    String packagePickerStr = PackagePicker.getText().trim();
    int numberOfGuests = (int) NumberOfGuests.getValue();
    int numberOfLaborers = (int) NumberOfLaborers.getValue();
    String cateringStyle = pickCateringStyle.getSelectedItem().toString();
    String status = Status.getSelectedItem().toString();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String eventDateStr = dateFormat.format(jCalendarComboBox1.getDate());


    if (clientName.isEmpty() || clientNumber.isEmpty() || theme.isEmpty() || eventDateStr.isEmpty() || 
        location.isEmpty() || timeStartStr.isEmpty() || timeEndStr.isEmpty() || packagePickerStr.isEmpty() || 
        cateringStyle.equals("Select Catering Style")) {
        JOptionPane.showMessageDialog(null, "Please fill in all required fields.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Step 3: Parse dates and times
    java.sql.Date eventDate;
    java.sql.Time timeStart, timeEnd;

    try {
        eventDate = java.sql.Date.valueOf(eventDateStr);
        timeStart = java.sql.Time.valueOf(timeStartStr);
        timeEnd = java.sql.Time.valueOf(timeEndStr);
    } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(null, "Invalid date or time format. Please check your inputs.", "Format Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Step 4: Calculate total price
    double totalPrice = calculateTotalAmount(
    Integer.parseInt(packagePickerStr),          // Package ID (from selected package)
    numberOfGuests,                              // Number of guests
    numberOfLaborers,                            // Number of laborers
    (int) ChronoUnit.HOURS.between(timeStart.toLocalTime(), timeEnd.toLocalTime()),  // Hours worked (time duration)
    cateringStyle                                 // Catering style (e.g., "Plated catering" or "Buffet catering")
);

    // Step 5: Connect to the database and update records
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
        con.setAutoCommit(false); // Begin transaction

        // Update client information
        String updateClientQuery = "UPDATE client SET ClientName = ?, ClientNumber = ? WHERE ClientID = (SELECT ClientID FROM booking WHERE BookingID = ?)";
        try (PreparedStatement ps = con.prepareStatement(updateClientQuery)) {
            ps.setString(1, clientName);
            ps.setString(2, clientNumber);
            ps.setString(3, bookingID);
            ps.executeUpdate();
        }

        // Update booking details
        String updateBookingQuery = "UPDATE booking SET Theme = ?, EventDate = ?, Location = ?, TimeStart = ?, TimeEnd = ?, " +
                                    "PackageID = ?, NumberOfGuests = ?, NumberOfLaborers = ?, CateringStyle = ?, Status = ?, TotalPrice = ? " +
                                    "WHERE BookingID = ?";
        try (PreparedStatement ps = con.prepareStatement(updateBookingQuery)) {
            ps.setString(1, theme);
            ps.setDate(2, eventDate);
            ps.setString(3, location);
            ps.setTime(4, timeStart);
            ps.setTime(5, timeEnd);
            ps.setInt(6, Integer.parseInt(packagePickerStr));
            ps.setInt(7, numberOfGuests);
            ps.setInt(8, numberOfLaborers);
            ps.setString(9, cateringStyle);
            ps.setString(10, status);
            ps.setDouble(11, totalPrice);
            ps.setString(12, bookingID);

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Booking updated successfully!", "Update Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No booking found with the provided Booking ID.", "Update Error", JOptionPane.ERROR_MESSAGE);
                con.rollback(); // Revert transaction if update fails
                return;
            }
        }

        con.commit(); // Commit transaction if all updates are successful

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
        
    
    }//GEN-LAST:event_updateActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // Clear text fields
    txtSearchBookingID.setText("");
    txtClientName.setText("");
    txtClientNum.setText("");
    txtTheme.setText("");
    txtLocation.setText("");
    txtTimeStart.setText("");
    txtTimeEnds.setText("");

    // Clear combo boxes and other inputs
    jCalendarComboBox1.setDate(null); // Reset date
    PackagePicker.setText("");
    pickCateringStyle.setSelectedIndex(0); // Reset to the first item
    Status.setSelectedIndex(0); // Reset to the first status
    NumberOfGuests.setValue(0); // Reset spinner
    NumberOfLaborers.setValue(0); // Reset spinner

    // Show a debug message (optional)
    JOptionPane.showMessageDialog(null, "Form cleared successfully.", "Clear Success", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_ClearActionPerformed

    private void BtnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalendarActionPerformed
        BtnCalendar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                CalendarTable calendar = new CalendarTable();
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

    public double calculateLaborPay(int laborerId, int hoursWorked) {
    double hourlyRate = 0.0; // Default hourly rate if not found
    
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
        // SQL query to fetch the HourlyRate of a specific laborer
        String laborQuery = "SELECT HourlyRate FROM laborer WHERE LaborerId = ?";
        
        try (PreparedStatement laborStmt = con.prepareStatement(laborQuery)) {
            laborStmt.setInt(1, laborerId); // Set the laborerId parameter
            ResultSet laborRs = laborStmt.executeQuery();
            
            // If the laborer is found, get their hourly rate
            if (laborRs.next()) {
                hourlyRate = laborRs.getDouble("HourlyRate");
                
                // If the hourly rate is 0.00, apply a fallback rate
                if (hourlyRate == 0.0) {
                    hourlyRate = 15.0; // Fallback rate of 15.00
                }
            }
        }
    } catch (SQLException ex) {
        System.out.println("Error fetching laborer's hourly rate: " + ex.getMessage());
    }
    
    // Calculate and return the laborer's pay based on hours worked
    return hourlyRate * hoursWorked;
}

    private double calculateTotalAmount(int selectedPackageId, int guestCount, int laborCount, int hoursWorked, String cateringStyle) {
    double packagePrice = 0.0;
    double laborPay = 0.0;
    double totalAmount = 0.0;
    double reservationfee = 500.0;

    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
        // Query to fetch the package price
        String packageQuery = "SELECT Price FROM packages WHERE PackageId = ?";
        try (PreparedStatement packageStmt = con.prepareStatement(packageQuery)) {
            packageStmt.setInt(1, selectedPackageId);
            ResultSet packageRs = packageStmt.executeQuery();
            if (packageRs.next()) {
                packagePrice = packageRs.getDouble("Price");
            }
        }

        // Query to fetch the hourly rates for each laborer
        String laborQuery = "SELECT LaborerID, HourlyRate FROM laborer LIMIT ?";
        try (PreparedStatement laborStmt = con.prepareStatement(laborQuery)) {
            laborStmt.setInt(1, laborCount);
            ResultSet laborRs = laborStmt.executeQuery();

            // Calculate labor pay for each laborer
            while (laborRs.next()) {
                double hourlyRate = laborRs.getDouble("HourlyRate");
                laborPay += hourlyRate * hoursWorked;  // Add each laborer's pay to total labor cost
            }
        }

        // Calculate total amount based on catering style
        if ("Plated catering".equalsIgnoreCase(cateringStyle)) {
        totalAmount = (20 * guestCount) + laborPay + reservationfee +(packagePrice * guestCount); // Include packagePrice for plated catering
        } else {
            totalAmount = (packagePrice * guestCount) + reservationfee +laborPay; // Default package price calculation for other catering styles
        }

    } catch (SQLException ex) {
        System.out.println("Error calculating total amount: " + ex.getMessage());
    }

    return totalAmount;
}

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingProcess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBooking;
    private javax.swing.JButton BtnCalendar;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnLaborer;
    private javax.swing.JButton BtnPackages;
    private javax.swing.JButton Clear;
    private javax.swing.JSpinner NumberOfGuests;
    private javax.swing.JSpinner NumberOfLaborers;
    private javax.swing.JTextField PackagePicker;
    private javax.swing.JButton PackagesDetails;
    private javax.swing.JButton RecordBtn;
    private javax.swing.JButton Save;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JButton ViewReceipt;
    private de.wannawork.jcalendar.JCalendarComboBox jCalendarComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton logout;
    private javax.swing.JComboBox<String> pickCateringStyle;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtClientNum;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtSearchBookingID;
    private javax.swing.JTextField txtTheme;
    private javax.swing.JTextField txtTimeEnds;
    private javax.swing.JTextField txtTimeStart;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
