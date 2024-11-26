
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
import java.util.Calendar;

public class BookingProcess extends JFrame {
    // Constructor and other methods
    public BookingProcess() {
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
        logout = new javax.swing.JButton();
        BtnReport = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtSearchBookingI = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        RecordBtn = new javax.swing.JButton();
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
        PackagesDetails = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        pickCateringStyle = new javax.swing.JComboBox<>();
        PackagePicker = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        update = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        idplaceholder = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        Status = new javax.swing.JComboBox<>();
        ViewReceipt = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
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

        BtnBooking.setBackground(new java.awt.Color(205, 133, 63));
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

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 32)); // NOI18N
        jLabel12.setText("orm");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 170, -1));

        txtSearchBookingI.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtSearchBookingI.setText("Enter Booking ID or Client Name");
        txtSearchBookingI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBookingIActionPerformed(evt);
            }
        });
        getContentPane().add(txtSearchBookingI, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 320, 40));

        SearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search (1).png"))); // NOI18N
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 60, 40));

        RecordBtn.setBackground(new java.awt.Color(210, 180, 140));
        RecordBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RecordBtn.setText("RECORDS");
        RecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordBtnActionPerformed(evt);
            }
        });
        getContentPane().add(RecordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, 170, 50));

        jPanel3.setBackground(new java.awt.Color(210, 180, 140));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 60, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setText("Phone Number");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 120, 20));

        txtClientNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNumActionPerformed(evt);
            }
        });
        jPanel3.add(txtClientNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 250, -1));

        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 340, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Client Information");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 880, 80));

        jPanel4.setBackground(new java.awt.Color(210, 180, 140));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Guess Count");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, -1));

        txtTimeEnds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeEndsActionPerformed(evt);
            }
        });
        jPanel4.add(txtTimeEnds, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 100, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Date");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 40, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Time start");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Location");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 20));
        jPanel4.add(NumberOfGuests, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 70, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("No. of Waitstaff");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 110, 20));
        jPanel4.add(NumberOfLaborers, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 60, -1));
        jPanel4.add(jCalendarComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 130, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 440, 200));

        jPanel5.setBackground(new java.awt.Color(210, 180, 140));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Package");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 80, 30));

        PackagesDetails.setText("Packages Details");
        PackagesDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackagesDetailsActionPerformed(evt);
            }
        });
        jPanel5.add(PackagesDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Catering Style");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        pickCateringStyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buffet catering", "Plated catering" }));
        jPanel5.add(pickCateringStyle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, 30));

        PackagePicker.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        PackagePicker.setText("Enter Package ID");
        jPanel5.add(PackagePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 170, 200));

        Clear.setBackground(new java.awt.Color(205, 133, 63));
        Clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 440, 170, 50));

        update.setBackground(new java.awt.Color(205, 133, 63));
        update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, 170, 50));

        Save.setBackground(new java.awt.Color(205, 133, 63));
        Save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 320, 170, 50));

        jLabel19.setFont(new java.awt.Font("Castellar", 3, 48)); // NOI18N
        jLabel19.setText("b");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 40, -1));

        jLabel20.setFont(new java.awt.Font("Castellar", 3, 48)); // NOI18N
        jLabel20.setText("F");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 40, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 32)); // NOI18N
        jLabel21.setText("ooking       ");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 170, -1));

        idplaceholder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idplaceholderActionPerformed(evt);
            }
        });
        getContentPane().add(idplaceholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 170, 60));

        jPanel6.setBackground(new java.awt.Color(210, 180, 140));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setText("Status");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Complete", "Cancelled" }));
        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusActionPerformed(evt);
            }
        });
        jPanel6.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, 30));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 240, 90));

        ViewReceipt.setBackground(new java.awt.Color(205, 133, 63));
        ViewReceipt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewReceipt.setText("View Receipt");
        ViewReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewReceiptActionPerformed(evt);
            }
        });
        getContentPane().add(ViewReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 150, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled design.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1080, 440));

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

    private void txtSearchBookingIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBookingIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBookingIActionPerformed

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

        java.util.Date eventDate = jCalendarComboBox1.getDate();  // Get date from the calendar picker

// Check if the selected date is null
if (eventDate == null) {
    JOptionPane.showMessageDialog(null, "Please select a valid event date.", "Date Error", JOptionPane.ERROR_MESSAGE);
    return;
}

// Get the current date and time
Calendar currentCalendar = Calendar.getInstance();
java.util.Date currentDate = currentCalendar.getTime();

// Check if the selected date is in the past
if (eventDate.before(currentDate)) {
    JOptionPane.showMessageDialog(null, "Event date cannot be in the past.", "Date Error", JOptionPane.ERROR_MESSAGE);
    return;
}

// Set minimum date to 1 week from now
currentCalendar.add(Calendar.DAY_OF_YEAR, 7);  // Adds 7 days to the current date
java.util.Date minDate = currentCalendar.getTime();

// Check if the selected date is less than 1 week from today
if (eventDate.before(minDate)) {
    JOptionPane.showMessageDialog(null, "Event date must be at least 1 week from today.", "Date Error", JOptionPane.ERROR_MESSAGE);
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
       // Initialize the connection to the database
    Connection con = null;
    try {
        // Set up the connection to the MySQL database
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "");
        
        // Retrieve client and event information
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
        double packagePrice = 0; // To store the price of the selected package
        try {
            selectedPackageId = Integer.parseInt(packagePickerStr);

            // Retrieve the package price from the database based on selectedPackageId
            String packagePriceQuery = "SELECT Price FROM packages WHERE PackageId = ?";
            try (PreparedStatement ps = con.prepareStatement(packagePriceQuery)) {
                ps.setInt(1, selectedPackageId);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    packagePrice = rs.getDouble("Price");
                } else {
                    JOptionPane.showMessageDialog(null, "Package not found.", "Package Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid package ID. Please enter a valid number.", "Package ID Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // The rest of your code continues here...
        
        // Calculate the total price for the package based on the guest count
        double totalPackagePrice = packagePrice * guestCount;

        double totalPrice = calculateTotalAmount(selectedPackageId, guestCount, laborCount, hoursWorked, cateringStyle);
        double laborPayPerLaborer = calculateLaborPay(1, hoursWorked);
        double totalLaborPay = laborPayPerLaborer * laborCount;

        // Calculate catering style cost only for "Plated Catering"
        double cateringStyleCost = 0;
        if ("Plated catering".equals(cateringStyle)) {
            cateringStyleCost = 30 * guestCount;  // 30 * number of guests for plated catering
        }

        // Update receipt content
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
                + (cateringStyleCost > 0 ? "Catering Style Cost: ₱" + String.format("%.2f", cateringStyleCost) + "\n" : "")
                + "Package Price: ₱" + String.format("%.2f", totalPackagePrice) + "\n"

                + "-----------------------------------------\n"
                + "Laborers:\n"
                + "Number of Laborers: " + laborCount + "\n"
                + "Labor Pay Per Laborer: ₱" + String.format("%.2f", laborPayPerLaborer) + "\n"
                + "Total Labor Pay: ₱" + String.format("%.2f", totalLaborPay) + "\n"
                + "-----------------------------------------\n"
                + "Total Price for Event: ₱" + String.format("%.2f", totalPrice) + "\n"  // Add package price and catering style cost to total price
                + "-----------------------------------------\n";

        JTextArea receiptTextArea = new JTextArea(20, 20);
        receiptTextArea.setText(receiptContent);
        receiptTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(receiptTextArea);
        JOptionPane.showMessageDialog(null, scrollPane, "Booking Receipt", JOptionPane.INFORMATION_MESSAGE);
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Database connection failed: " + e.getMessage(), "Connection Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } finally {
        // Always close the connection to avoid memory leaks
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    }//GEN-LAST:event_ViewReceiptActionPerformed

    private void PackagesDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackagesDetailsActionPerformed
        PackagesDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PackageF1 F1 = new PackageF1();
                F1.setVisible(true);
                F1.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_PackagesDetailsActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
   String searchInput = txtSearchBookingI.getText().trim(); // Can be Booking ID or Client Name
if (searchInput.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Booking ID or Client Name", "Search Error", JOptionPane.ERROR_MESSAGE);
    return;
}

try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
    // Construct query that checks both Booking ID and Client Name
    String searchQuery = "SELECT b.BookingID, b.Theme, b.EventDate, b.Location, b.TimeStart, b.TimeEnd, b.PackageID, " +
                         "b.NumberOfGuests, b.NumberOfLaborers, b.CateringStyle, b.Status, b.TotalPrice, " +
                         "c.ClientName, c.ClientNumber " +
                         "FROM client c " +
                         "LEFT JOIN booking b ON c.ClientID = b.ClientID " + 
                         "WHERE b.BookingID = ? OR c.ClientName LIKE ?";

    try (PreparedStatement ps = con.prepareStatement(searchQuery)) {
        ps.setString(1, searchInput); // First parameter for Booking ID
        ps.setString(2, "%" + searchInput + "%"); // Second parameter for Client Name (partial match)

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            // Set client details (they will always be fetched)
            txtClientName.setText(rs.getString("ClientName"));
            txtClientNum.setText(rs.getString("ClientNumber"));

            // Set booking details if available (it may be null if no booking exists)
            String bookingID = rs.getString("BookingID");
            if (bookingID != null) {
                idplaceholder.setText(bookingID);
                txtTheme.setText(rs.getString("Theme"));

                // Formatting date before setting it into the combo box
                java.util.Date eventDate = rs.getDate("EventDate");
                if (eventDate != null) {
                    jCalendarComboBox1.setDate(eventDate);
                }

                txtLocation.setText(rs.getString("Location"));
                txtTimeStart.setText(rs.getString("TimeStart"));
                txtTimeEnds.setText(rs.getString("TimeEnd"));
                PackagePicker.setText(rs.getString("PackageID"));
                pickCateringStyle.setSelectedItem(rs.getString("CateringStyle"));
                NumberOfGuests.setValue(rs.getInt("NumberOfGuests"));
                NumberOfLaborers.setValue(rs.getInt("NumberOfLaborers"));
                Status.setSelectedItem(rs.getString("Status"));
            } else {
                // If no booking is found for the client
                JOptionPane.showMessageDialog(null, "Client found, but no booking information available.", "Search Info", JOptionPane.INFORMATION_MESSAGE);
                // Optionally, you can clear the booking-related fields if no booking exists.
                clearBookingFields();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No client or booking found for the provided input.", "Search Error", JOptionPane.ERROR_MESSAGE);
        }
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Database connection error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
}



    }//GEN-LAST:event_SearchBtnActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // Step 1: Get Booking ID
String bookingID = idplaceholder.getText().trim();
if (bookingID.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Booking ID to update.", "Update Error", JOptionPane.ERROR_MESSAGE);
    return;
}

// For debugging: Print the booking ID with visible brackets to detect hidden characters
System.out.println("Booking ID: [" + bookingID + "]");

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
    Integer.parseInt(packagePickerStr), // Package ID (from selected package)
    numberOfGuests,                     // Number of guests
    numberOfLaborers,                   // Number of laborers
    (int) ChronoUnit.HOURS.between(timeStart.toLocalTime(), timeEnd.toLocalTime()), // Hours worked (time duration)
    cateringStyle                       // Catering style (e.g., "Plated catering" or "Buffet catering")
);

// Step 5: Connect to the database and update records
try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
    con.setAutoCommit(false); // Begin transaction

    // Debugging: Check if the booking ID exists in the database
    String checkBookingQuery = "SELECT * FROM booking WHERE BookingID = ?";
    try (PreparedStatement psCheck = con.prepareStatement(checkBookingQuery)) {
        psCheck.setString(1, bookingID);
        ResultSet rs = psCheck.executeQuery();

        // If no record is found, show error message
        if (!rs.next()) {
            JOptionPane.showMessageDialog(null, "No booking found with the provided Booking ID.", "Update Error", JOptionPane.ERROR_MESSAGE);
            return; // Stop here if no booking found
        }
    }

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
    txtSearchBookingI.setText("");
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

    }//GEN-LAST:event_ClearActionPerformed

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

    private void StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusActionPerformed

    private void idplaceholderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idplaceholderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idplaceholderActionPerformed

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
        totalAmount = (30 * guestCount) + laborPay + reservationfee +(packagePrice * guestCount); // Include packagePrice for plated catering
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
    
    // Optional: Clear booking fields if no booking is found
private void clearBookingFields() {
    idplaceholder.setText("");
    txtTheme.setText("");
    jCalendarComboBox1.setDate(null);
    txtLocation.setText("");
    txtTimeStart.setText("");
    txtTimeEnds.setText("");
    PackagePicker.setText("");
    pickCateringStyle.setSelectedItem("Select Catering Style");
    NumberOfGuests.setValue(0);
    NumberOfLaborers.setValue(0);
    Status.setSelectedItem("Select Status");
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBooking;
    private javax.swing.JButton BtnCalendar;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnLaborer;
    private javax.swing.JButton BtnPackages;
    private javax.swing.JButton BtnReport;
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
    private javax.swing.JTextField idplaceholder;
    private de.wannawork.jcalendar.JCalendarComboBox jCalendarComboBox1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton logout;
    private javax.swing.JComboBox<String> pickCateringStyle;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtClientNum;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtSearchBookingI;
    private javax.swing.JTextField txtTheme;
    private javax.swing.JTextField txtTimeEnds;
    private javax.swing.JTextField txtTimeStart;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
