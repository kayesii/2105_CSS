
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
import java.util.Date;
import java.sql.Time;

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
        jPanel6 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        ViewReceipt = new javax.swing.JButton();
        Transaction = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        idplaceholder = new javax.swing.JTextField();

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
        txtSearchBookingI.setText("Booking id or Client Name");
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
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 120, 20));

        txtClientNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNumActionPerformed(evt);
            }
        });
        jPanel3.add(txtClientNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 250, -1));

        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 300, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Client Information");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 840, 80));

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

        PackagesDetails.setBackground(new java.awt.Color(205, 133, 63));
        PackagesDetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, 170, 50));

        update.setBackground(new java.awt.Color(205, 133, 63));
        update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, 170, 50));

        Save.setBackground(new java.awt.Color(205, 133, 63));
        Save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 270, 170, 50));

        jLabel19.setFont(new java.awt.Font("Castellar", 3, 48)); // NOI18N
        jLabel19.setText("b");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 40, -1));

        jLabel20.setFont(new java.awt.Font("Castellar", 3, 48)); // NOI18N
        jLabel20.setText("F");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 40, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 32)); // NOI18N
        jLabel21.setText("ooking       ");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 170, -1));

        jPanel6.setBackground(new java.awt.Color(210, 180, 140));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setText("Status");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Upcoming", "Complete", "Cancelled" }));
        statusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusComboBoxActionPerformed(evt);
            }
        });
        jPanel6.add(statusComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 30));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 190, 80));

        ViewReceipt.setBackground(new java.awt.Color(205, 133, 63));
        ViewReceipt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewReceipt.setText("View Total Amount");
        ViewReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewReceiptActionPerformed(evt);
            }
        });
        getContentPane().add(ViewReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 190, 40));

        Transaction.setBackground(new java.awt.Color(205, 133, 63));
        Transaction.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Transaction.setText("Process Payment");
        Transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransactionActionPerformed(evt);
            }
        });
        getContentPane().add(Transaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 190, 40));

        jButton1.setBackground(new java.awt.Color(205, 133, 63));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Cancel Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, 170, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled design.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1080, 440));

        idplaceholder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idplaceholderActionPerformed(evt);
            }
        });
        getContentPane().add(idplaceholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, 60));

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

        if (guestCount < 8) {
    JOptionPane.showMessageDialog(this, "The minimum number of guests is 8.", "Guest Limit Not Met", JOptionPane.ERROR_MESSAGE);
    guestCount = 8; // Set the guest count to 8 if it's less than 8
    // Update the spinner value to reflect the new limit (optional)
    NumberOfGuests.setValue(8);
    return;
}
        if (eventDate == null) {
            JOptionPane.showMessageDialog(null, "Please select a valid event date.", "Date Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if the event date is in the past or less than 1 week from now
        Calendar currentCalendar = Calendar.getInstance();
        java.util.Date currentDate = currentCalendar.getTime();
        if (eventDate.before(currentDate)) {
            JOptionPane.showMessageDialog(null, "Event date cannot be in the past.", "Date Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        currentCalendar.add(Calendar.DAY_OF_YEAR, 7);
        java.util.Date minDate = currentCalendar.getTime();
        if (eventDate.before(minDate)) {
            JOptionPane.showMessageDialog(null, "Event date must be at least 1 week from today.", "Date Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate the time format and duration
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

        // Check if event duration is between 2 and 10 hours
        long eventDuration = ChronoUnit.HOURS.between(eventTimeStart.toLocalTime(), eventTimeEnd.toLocalTime());
        if (eventDuration < 2 || eventDuration > 10) {
            JOptionPane.showMessageDialog(null, "Event duration must be between 2 to 10 hours.", "Time Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check for existing reservations at the same date and time
        String checkBookingQuery = "SELECT * FROM booking WHERE EventDate = ? AND ((TimeStart BETWEEN ? AND ?) OR (TimeEnd BETWEEN ? AND ?))";
        try (PreparedStatement ps = con.prepareStatement(checkBookingQuery)) {
            ps.setDate(1, new java.sql.Date(eventDate.getTime()));
            ps.setTime(2, eventTimeStart);
            ps.setTime(3, eventTimeEnd);
            ps.setTime(4, eventTimeStart);
            ps.setTime(5, eventTimeEnd);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Date is not Available","", JOptionPane.ERROR_MESSAGE);
                return;
            }
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
        String selectedStatus = (statusComboBox.getSelectedItem() != null) 
                            ? statusComboBox.getSelectedItem().toString() 
                            : "Pending";

        
    String bookingQuery = "INSERT INTO booking (ClientID, PackageId, EventDate, NumberOfGuests, TotalPrice, Status, Theme, Location, TimeStart, TimeEnd, NumberOfLaborers, CateringStyle, Balance) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pst = con.prepareStatement(bookingQuery, PreparedStatement.RETURN_GENERATED_KEYS)) {
            pst.setInt(1, clientID);
            pst.setInt(2, selectedPackageId);
            pst.setDate(3, new java.sql.Date(eventDate.getTime()));  // Use the date directly
            pst.setInt(4, guestCount);
            pst.setDouble(5, totalPrice);
            pst.setString(6, selectedStatus);
            pst.setString(7, theme);
            pst.setString(8, location);
            pst.setTime(9, eventTimeStart);
            pst.setTime(10, eventTimeEnd);
            pst.setInt(11, laborCount);
            pst.setString(12, cateringStyle);
            pst.setDouble(13, totalPrice);

    int rowsInserted = pst.executeUpdate();
    if (rowsInserted > 0) {
        try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
            int bookingId = -1;
            if (generatedKeys.next()) {
                bookingId = generatedKeys.getInt(1);  // Retrieve the BookingID
            }

            // Step 13: Insert labor details and total pay into LaborPayment table
            String laborPaymentQuery = "INSERT INTO booking_laborer (BookingId, LaborerID, TotalPay, StatusPay) VALUES (?, ?, ?, ?)";
            for (int laborerId = 1; laborerId <= laborCount; laborerId++) {  // Assuming laborers are numbered 1, 2, ..., laborCount
                double laborPay = calculateLaborPay(laborerId, hoursWorked);  // Ensure this method is defined properly
                try (PreparedStatement laborPst = con.prepareStatement(laborPaymentQuery)) {
                    laborPst.setInt(1, bookingId);
                    laborPst.setInt(2, laborerId);
                    laborPst.setDouble(3, laborPay);
                    laborPst.setString(4, "Pending");  // Assuming laborer payment status is "Pending"
                    laborPst.executeUpdate();
                }
            }

            JOptionPane.showMessageDialog(null, "Booking confirmed! Total price: Php " + totalPrice, "Booking Successful", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Error booking the event.", "Booking Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Database error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
        double downpayment = totalPrice * 0.30;
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
                + "Wait Staff: " + laborCount + "\n"
                + "Wait Staff Pay: ₱" + String.format("%.2f", totalLaborPay) + "\n"
                + "-----------------------------------------\n"
                + "Downpayment: ₱" + String.format("%.2f", downpayment) + "\n"
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
                statusComboBox.setSelectedItem(rs.getString("Status"));
                
                
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
    String status = statusComboBox.getSelectedItem().toString();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String eventDateStr = dateFormat.format(jCalendarComboBox1.getDate());

    // Validation check: Ensure no field is empty
    if (clientName.isEmpty() || clientNumber.isEmpty() || theme.isEmpty() || eventDateStr.isEmpty() ||
        location.isEmpty() || timeStartStr.isEmpty() || timeEndStr.isEmpty() || packagePickerStr.isEmpty() ||
        cateringStyle.equals("Select Catering Style")) {
        JOptionPane.showMessageDialog(null, "Please fill in all required fields.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    if (numberOfGuests < 8) {
    JOptionPane.showMessageDialog(this, "The minimum number of guests is 8.", "Guest Limit Not Met", JOptionPane.ERROR_MESSAGE);
    NumberOfGuests.setValue(8); // Set the guest count to 8 if it's less than 8
    return;  // Add a return statement to stop further processing
}
    // Step 3: Parse dates and times
    java.sql.Date eventDate;
    java.sql.Time timeStart, timeEnd;
    try {
       
        eventDate = java.sql.Date.valueOf(eventDateStr);
        timeStart = java.sql.Time.valueOf(timeStartStr);
        timeEnd = java.sql.Time.valueOf(timeEndStr);
        
        // Check if event duration is between 2 and 10 hours
        long eventDuration = ChronoUnit.HOURS.between(timeStart.toLocalTime(), timeEnd.toLocalTime());
        if (eventDuration < 2 || eventDuration > 10) {
            JOptionPane.showMessageDialog(null, "Event duration must be between 2 to 10 hours.", "Time Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(null, "Invalid date or time format. Please check your inputs.", "Format Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    

    // Check if the selected date is valid
    if (!isValidEventDate(eventDate)) {
        return; // Exit if validation fails
    }

    // Step 4: Get current booking details from the database to check if the event date is being updated
    if (!isEventDateAvailable(bookingID, eventDate, timeStart, timeEnd)) {
        return; // Exit if the date or time is not available
    }

    // Step 5: Calculate total price
    int packageID;
    try {
        packageID = Integer.parseInt(packagePickerStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid package selection.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    double totalPrice = calculateTotalAmount(packageID, numberOfGuests, numberOfLaborers,
                                              (int) ChronoUnit.HOURS.between(timeStart.toLocalTime(), timeEnd.toLocalTime()),
                                              cateringStyle);

    // Step 6: Connect to the database and update records
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
        con.setAutoCommit(false); // Begin transaction

        // Step 6.1: Check if the booking exists
        if (!checkBookingExists(con, bookingID)) {
            return; // Exit if the booking doesn't exist
        }

        // Step 6.2: Update client information
        updateClientInformation(con, bookingID, clientName, clientNumber);

        // Step 6.3: Update booking details
        updateBookingDetails(con, bookingID, theme, eventDate, location, timeStart, timeEnd, packageID, numberOfGuests,
                             numberOfLaborers, cateringStyle, status, totalPrice);

        con.commit(); // Commit transaction if all updates are successful
        JOptionPane.showMessageDialog(null, "Booking updated successfully!", "Update Success", JOptionPane.INFORMATION_MESSAGE);

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
    statusComboBox.setSelectedIndex(0); // Reset to the first status
    NumberOfGuests.setValue(0); // Reset spinner
    NumberOfLaborers.setValue(0); // Reset spinner

    }//GEN-LAST:event_ClearActionPerformed
private boolean isValidEventDate(java.sql.Date eventDate) {
    // Get the current date and time
    Calendar currentCalendar = Calendar.getInstance();
    java.util.Date currentDate = currentCalendar.getTime();

    // Check if the selected date is in the past
    if (eventDate.before(currentDate)) {
        JOptionPane.showMessageDialog(null, "Event date cannot be in the past.", "Date Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Set minimum date to 1 week from now
    currentCalendar.add(Calendar.DAY_OF_YEAR, 7);  // Adds 7 days to the current date
    java.util.Date minDate = currentCalendar.getTime();

    // Check if the selected date is less than 1 week from today
    if (eventDate.before(minDate)) {
        JOptionPane.showMessageDialog(null, "Event date must be at least 1 week from today.", "Date Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    return true;
}

private boolean isEventDateAvailable(String bookingID, java.sql.Date eventDate, java.sql.Time timeStart, java.sql.Time timeEnd) {
    String checkBookingQuery = "SELECT EventDate, TimeStart, TimeEnd FROM booking WHERE BookingID = ?";
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "");
         PreparedStatement psCheck = con.prepareStatement(checkBookingQuery)) {
        psCheck.setString(1, bookingID);
        ResultSet rs = psCheck.executeQuery();
        
        if (rs.next()) {
            Date existingEventDate = rs.getDate("EventDate");
            Time existingTimeStart = rs.getTime("TimeStart");
            Time existingTimeEnd = rs.getTime("TimeEnd");

            // If the event date is not changed, skip the date conflict check
            if (eventDate.equals(existingEventDate)) {
                return true; // Date hasn't changed, no need to check availability
            } else {
                // Check for conflicts if the event date is changed
                String checkDateQuery = "SELECT BookingId FROM booking WHERE EventDate = ? AND (" +
                        "(TimeStart < ? AND TimeEnd > ?) OR (TimeStart < ? AND TimeEnd > ?))";
                try (PreparedStatement checkDatePst = con.prepareStatement(checkDateQuery)) {
                    checkDatePst.setDate(1, new java.sql.Date(eventDate.getTime()));
                    checkDatePst.setTime(2, timeEnd);
                    checkDatePst.setTime(3, timeStart);
                    checkDatePst.setTime(4, timeStart);
                    checkDatePst.setTime(5, timeEnd);
                    ResultSet dateRs = checkDatePst.executeQuery();
                    if (dateRs.next()) {
                        JOptionPane.showMessageDialog(null, "Selected date and time are already booked.", "Date Conflict", JOptionPane.ERROR_MESSAGE);
                        return false; // Date and time are already booked
                    }
                }
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
        return false;
    }
    return true; // No conflict
}

private boolean checkBookingExists(Connection con, String bookingID) throws SQLException {
    String checkBookingQuery = "SELECT * FROM booking WHERE BookingID = ?";
    try (PreparedStatement psCheck = con.prepareStatement(checkBookingQuery)) {
        psCheck.setString(1, bookingID);
        ResultSet rs = psCheck.executeQuery();
        if (!rs.next()) {
            JOptionPane.showMessageDialog(null, "No booking found with the provided Booking ID.", "Update Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    return true;
}

private void updateClientInformation(Connection con, String bookingID, String clientName, String clientNumber) throws SQLException {
    String updateClientQuery = "UPDATE client SET ClientName = ?, ClientNumber = ? WHERE ClientID = (SELECT ClientID FROM booking WHERE BookingID = ?)";
    try (PreparedStatement ps = con.prepareStatement(updateClientQuery)) {
        ps.setString(1, clientName);
        ps.setString(2, clientNumber);
        ps.setString(3, bookingID);
        ps.executeUpdate();
    }
}

private void updateBookingDetails(Connection con, String bookingID, String theme, java.sql.Date eventDate, String location,
                                   java.sql.Time timeStart, java.sql.Time timeEnd, int packageID, int numberOfGuests,
                                   int numberOfLaborers, String cateringStyle, String status, double totalPrice) throws SQLException {
    String updateBookingQuery = "UPDATE booking SET Theme = ?, EventDate = ?, Location = ?, TimeStart = ?, TimeEnd = ?, " +
                                "PackageID = ?, NumberOfGuests = ?, NumberOfLaborers = ?, CateringStyle = ?, Status = ?, TotalPrice = ? WHERE BookingID = ?";
    try (PreparedStatement ps = con.prepareStatement(updateBookingQuery)) {
        ps.setString(1, theme);
        ps.setDate(2, eventDate);
        ps.setString(3, location);
        ps.setTime(4, timeStart);
        ps.setTime(5, timeEnd);
        ps.setInt(6, packageID);
        ps.setInt(7, numberOfGuests);
        ps.setInt(8, numberOfLaborers);
        ps.setString(9, cateringStyle);
        ps.setString(10, status);
        ps.setDouble(11, totalPrice);
        ps.setString(12, bookingID);
        ps.executeUpdate();
    }
}
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
                Sales laborer = new Sales();
                laborer.setVisible(true);
                laborer .setLocationRelativeTo(null); // Center the SignUP frame
            }
        });

    }//GEN-LAST:event_BtnReportActionPerformed

    private void statusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusComboBoxActionPerformed

    private void idplaceholderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idplaceholderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idplaceholderActionPerformed

    private void TransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransactionActionPerformed
        Transaction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Transaction pay = new Transaction();
                pay.setVisible(true);
                pay .setLocationRelativeTo(null); // Center the SignUP frame
            }
        });

    }//GEN-LAST:event_TransactionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // Step 1: Get Booking ID
    String bookingID = idplaceholder.getText().trim();
    if (bookingID.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a Booking ID to cancel.", "Cancellation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Step 2: Ask for confirmation to cancel the booking
    int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel this booking?", "Cancel Booking", JOptionPane.YES_NO_OPTION);
    if (response != JOptionPane.YES_OPTION) {
        return; // Exit if the user chooses not to cancel
    }

    // Step 3: Connect to the database and update the booking details
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
        // Start transaction
        con.setAutoCommit(false);

        // Step 3.1: Update booking status to "Cancelled" and set event date to null
        String updateQuery = "UPDATE booking SET EventDate = NULL, Status = 'Cancelled' WHERE BookingId = ?";
        try (PreparedStatement ps = con.prepareStatement(updateQuery)) {
            ps.setString(1, bookingID);

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                con.commit(); // Commit the transaction if the update is successful
                JOptionPane.showMessageDialog(null, "Booking has been cancelled successfully.", "Cancellation Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                con.rollback(); // Rollback if no rows were updated
                JOptionPane.showMessageDialog(null, "Booking not found or cancellation failed.", "Cancellation Failed", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            con.rollback(); // Rollback in case of any error
            JOptionPane.showMessageDialog(null, "Error while cancelling the booking: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    statusComboBox.setSelectedItem("Select Status");
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
    private javax.swing.JButton Transaction;
    private javax.swing.JButton ViewReceipt;
    private javax.swing.JTextField idplaceholder;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JComboBox<String> statusComboBox;
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
