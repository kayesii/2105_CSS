
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
        jLabel12 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
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
        txtEventDate = new javax.swing.JTextField();
        txtTimeStart = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        NumberOfLaborers = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        PackagePicker = new javax.swing.JTextField();
        ViewReceipt = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        pickCateringStyle = new javax.swing.JComboBox<>();
        BookBtn = new javax.swing.JButton();
        RecordBtn = new javax.swing.JButton();
        txtSearchCustomer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        PaymentStatus = new javax.swing.JComboBox<>();
        ViewReceipt1 = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        jCalendarComboBox1 = new de.wannawork.jcalendar.JCalendarComboBox();
        jPanel2 = new javax.swing.JPanel();
        BtnCalendar = new javax.swing.JButton();
        BtnPackages = new javax.swing.JButton();
        BtnBooking = new javax.swing.JButton();
        BtnHome = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnLaborer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 222, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(210, 180, 140));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 40, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Phone Number");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 20));

        txtClientNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNumActionPerformed(evt);
            }
        });
        jPanel3.add(txtClientNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 340, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Client Information");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 160, 20));

        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 400, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 490, 120));

        jPanel4.setBackground(new java.awt.Color(210, 180, 140));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Guess Count");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, -1));

        txtTimeEnds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeEndsActionPerformed(evt);
            }
        });
        jPanel4.add(txtTimeEnds, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 130, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setText("Theme");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        jPanel4.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 390, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Event Details");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 160, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setText("Date");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 40, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel14.setText("Time start");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel15.setText("Location");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 20));
        jPanel4.add(NumberOfGuests, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 80, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("Time ends");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 70, -1));

        txtTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThemeActionPerformed(evt);
            }
        });
        jPanel4.add(txtTheme, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 400, -1));

        txtEventDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEventDateActionPerformed(evt);
            }
        });
        jPanel4.add(txtEventDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 410, -1));

        txtTimeStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeStartActionPerformed(evt);
            }
        });
        jPanel4.add(txtTimeStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel22.setText("No. of Waitstaff");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 110, 20));
        jPanel4.add(NumberOfLaborers, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 80, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 490, 220));

        jPanel5.setBackground(new java.awt.Color(210, 180, 140));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Package");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 80, 30));
        jPanel5.add(PackagePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, -1));

        ViewReceipt.setText("Packages Details");
        jPanel5.add(ViewReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 150, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel25.setText("Catering Style:");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        pickCateringStyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buffet catering", "Plated catering" }));
        jPanel5.add(pickCateringStyle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 120, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 290, 160));

        BookBtn.setBackground(new java.awt.Color(205, 133, 63));
        BookBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BookBtn.setText("Book");
        BookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 220, 50));

        RecordBtn.setBackground(new java.awt.Color(210, 180, 140));
        RecordBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RecordBtn.setText("Records");
        RecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RecordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 50));

        txtSearchCustomer.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtSearchCustomer.setText("Enter Booking ID");
        txtSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(txtSearchCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 290, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Search Customer");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 160, 30));

        jPanel8.setBackground(new java.awt.Color(210, 180, 140));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("Payment");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 90, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel27.setText("Total Amount:");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, -1));

        txtTotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAmountActionPerformed(evt);
            }
        });
        jPanel8.add(txtTotalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel28.setText("Payment Status:");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        PaymentStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Complete", "Cancelled" }));
        jPanel8.add(PaymentStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, 30));

        ViewReceipt1.setText("View Receipt");
        jPanel8.add(ViewReceipt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 110, 30));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 430, 180));

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 390, -1, -1));
        jPanel1.add(jCalendarComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 60, 140, -1));

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

    private void txtSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchCustomerActionPerformed

    private void txtTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAmountActionPerformed

    private void BookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookBtnActionPerformed
        BookBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                BookingProcess booking = new BookingProcess();
                booking.setVisible(true);
                booking.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_BookBtnActionPerformed

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

    private void txtEventDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEventDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEventDateActionPerformed

    private void txtTimeStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeStartActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

    String clientName = txtClientName.getText().trim();
String clientNum = txtClientNum.getText().trim();

// Validate client information
if (clientName.isEmpty() || clientNum.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please fill in all client details.", "Client Error", JOptionPane.ERROR_MESSAGE);
    return;
}

int clientID = -1;

try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
    // Step 1: Check if client exists, insert if not
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
                    JOptionPane.showMessageDialog(this, "Failed to register the client.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }
    }

    // Step 2: Get event details
    String theme = txtTheme.getText().trim();
    String dateStr = txtEventDate.getText().trim();  // Event Date from the text field
    String location = txtLocation.getText().trim();
    String timeStartStr = txtTimeStart.getText().trim();  // Event Start Time from text field
    String timeEndStr = txtTimeEnds.getText().trim();  
    String packagePickerStr = PackagePicker.getText().trim();  // Event Package ID from text field

    // Spinner values need to be cast to integers
    int guestCount = (int) NumberOfGuests.getValue();
    int laborCount = (int) NumberOfLaborers.getValue();

    // ComboBox value for Catering Style
    String cateringStyle = pickCateringStyle.getSelectedItem().toString();

    // Validate event details
    if (theme.isEmpty() || dateStr.isEmpty() || location.isEmpty() || timeStartStr.isEmpty() || timeEndStr.isEmpty() || cateringStyle == null || cateringStyle.equals("Select Catering Style")) {
        JOptionPane.showMessageDialog(this, "Please fill in all event details.", "Event Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Step 3: Validate Date and Time Format
    java.sql.Date eventDate = null;
    java.sql.Time eventTimeStart = null;
    java.sql.Time eventTimeEnd = null;

    // Validate and parse Date
    try {
        eventDate = java.sql.Date.valueOf(dateStr);  // Convert String to SQL Date
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, "Invalid date format. Please use YYYY-MM-DD.", "Date Format Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validate and parse Time
    try {
        eventTimeStart = java.sql.Time.valueOf(timeStartStr);  // Convert String to SQL Time
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, "Invalid start time format. Please use HH:mm:ss.", "Start Time Format Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        eventTimeEnd = java.sql.Time.valueOf(timeEndStr);  // Convert String to SQL Time
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, "Invalid end time format. Please use HH:mm:ss.", "End Time Format Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Step 4: Validate and parse Package ID
    int selectedPackageId = -1;
    if (packagePickerStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a package.", "Package Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        selectedPackageId = Integer.parseInt(packagePickerStr);  // Convert string to int
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid package ID. Please enter a valid number.", "Package ID Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Step 5: Calculate total amount
    double totalAmount = calculateTotalAmount(selectedPackageId, laborCount);

    // Step 6: Payment status
    String paymentStatus = (String) PaymentStatus.getSelectedItem();

    // Step 7: Insert booking details into the database
    String bookingQuery = "INSERT INTO booking (ClientID, PackageId, EventDate, NumberOfGuests, TotalPrice, Status, Theme, Location, TimeStart, TimeEnd, NumberOfLaborers, CateringStyle) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    try (PreparedStatement pst = con.prepareStatement(bookingQuery)) {
        pst.setInt(1, clientID);
        pst.setInt(2, selectedPackageId);
        pst.setDate(3, eventDate);  // Set the SQL Date
        pst.setInt(4, guestCount);
        pst.setDouble(5, totalAmount);
        pst.setString(6, paymentStatus);
        pst.setString(7, theme);
        pst.setString(8, location);
        pst.setTime(9, eventTimeStart);  // Set the SQL Start Time
        pst.setTime(10, eventTimeEnd);   // Set the SQL End Time
        pst.setInt(11, laborCount);
        pst.setString(12, cateringStyle);

        // Debug: Print the SQL parameters for logging
        System.out.println("Booking Query Parameters: ");
        System.out.println("ClientID: " + clientID);
        System.out.println("PackageId: " + selectedPackageId);
        System.out.println("EventDate: " + eventDate);
        System.out.println("NumberOfGuests: " + guestCount);
        System.out.println("TotalPrice: " + totalAmount);
        System.out.println("Status: " + paymentStatus);
        System.out.println("Theme: " + theme);
        System.out.println("Location: " + location);
        System.out.println("TimeStart: " + eventTimeStart);
        System.out.println("TimeEnd: " + eventTimeEnd);
        System.out.println("NumberOfLaborers: " + laborCount);
        System.out.println("CateringStyle: " + cateringStyle);

        int rowsInserted = pst.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Booking saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to save the booking.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    ex.printStackTrace();  // Print the stack trace to the console for better debugging
}
    }//GEN-LAST:event_SaveActionPerformed

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
                BookingFrame bookingF = new BookingFrame();
                bookingF.setVisible(true);
                bookingF.setLocationRelativeTo(null); // Center the SignUP frame
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

private double calculateTotalAmount(int selectedPackageId, int laborCount) {
    double packagePrice = 0.0;

    // You need to retrieve the package price from your database based on the selectedPackageId.
    // For simplicity, let's assume you already have a method to get the package price.
    // This is just a mockup of how you might calculate totalAmount.

    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
        String query = "SELECT Price FROM packages WHERE PackageId = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, selectedPackageId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                packagePrice = rs.getDouble("Price");
            }
        }
    } catch (SQLException ex) {
        System.out.println("Error fetching package price: " + ex.getMessage());
    }

    // Assuming a fixed labor charge per laborer, you can multiply laborCount with a rate, for example:
    double laborChargePerPerson = 50.00;  // Example charge per laborer
    double laborCharge = laborCount * laborChargePerPerson;

    // Total amount = package price + labor charge
    return packagePrice + laborCharge;
}

private double getPackagePrice(int packageId) {
    double price = 0;
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
        String packageQuery = "SELECT Price FROM packages WHERE PackageId = ?";
        try (PreparedStatement ps = con.prepareStatement(packageQuery)) {
            ps.setInt(1, packageId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                price = rs.getDouble("Price");
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error fetching package price: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    return price;
}
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
            java.util.logging.Logger.getLogger(BookingProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new BookingProcess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookBtn;
    private javax.swing.JButton BtnBooking;
    private javax.swing.JButton BtnCalendar;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnLaborer;
    private javax.swing.JButton BtnPackages;
    private javax.swing.JSpinner NumberOfGuests;
    private javax.swing.JSpinner NumberOfLaborers;
    private javax.swing.JTextField PackagePicker;
    private javax.swing.JComboBox<String> PaymentStatus;
    private javax.swing.JButton RecordBtn;
    private javax.swing.JButton Save;
    private javax.swing.JButton ViewReceipt;
    private javax.swing.JButton ViewReceipt1;
    private de.wannawork.jcalendar.JCalendarComboBox jCalendarComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
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
    private javax.swing.JComboBox<String> pickCateringStyle;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtClientNum;
    private javax.swing.JTextField txtEventDate;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtSearchCustomer;
    private javax.swing.JTextField txtTheme;
    private javax.swing.JTextField txtTimeEnds;
    private javax.swing.JTextField txtTimeStart;
    private javax.swing.JTextField txtTotalAmount;
    // End of variables declaration//GEN-END:variables
}
