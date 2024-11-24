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
import javax.swing.table.DefaultTableModel;


public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        loadReservationsToTable();
        loadUpcomingEvents();
    }
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomeFrame home = new HomeFrame();
                home.setVisible(true);
                home.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }
     
    private void loadUpcomingEvents() {
    try {
        // Establish the database connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "");
        System.out.println("Database connected successfully!");

        // SQL query to fetch upcoming events
        String query = "SELECT b.BookingId, b.EventDate, c.ClientName, c.ClientNumber, b.Theme AS Event, b.Status " +
                       "FROM booking b " +
                       "INNER JOIN client c ON b.ClientID = c.ClientID " +
                       "WHERE b.EventDate > CURDATE() " +
                       "ORDER BY b.EventDate ASC " +
                       "LIMIT 3";

        System.out.println("SQL Query: " + query); // Check the query
        
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        
        // Check if the result set has data
        if (!rs.isBeforeFirst()) {
            System.out.println("No records found in the query result.");
        }

        // Create a DefaultTableModel for UpcomingEvents JTable
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) UpcomingEvents.getModel();
        model.setRowCount(0); // Clear existing rows

        // Iterate through the result set and add rows to the model
        boolean dataAdded = false;
        while (rs.next()) {
            dataAdded = true;
            // Print the data for debugging
            System.out.println("Fetched Row: BookingId: " + rs.getInt("BookingId") + 
                               ", EventDate: " + rs.getString("EventDate") + 
                               ", ClientName: " + rs.getString("ClientName"));
            model.addRow(new Object[]{
                rs.getInt("BookingId"),
                rs.getString("EventDate"),
                rs.getString("ClientName"),
                rs.getString("ClientNumber"),
                rs.getString("Event"),
                rs.getString("Status")
            });
        }

        // Check if data was added to the table model
        System.out.println("Rows in table after fetching data: " + model.getRowCount());

        if (!dataAdded) {
            System.out.println("No upcoming events found.");
        }

        // Set the model to the JTable
        UpcomingEvents.setModel(model);
        System.out.println("Table model set successfully.");

        // Refresh the table view
        UpcomingEvents.revalidate();
        UpcomingEvents.repaint();

        // Close connections
        rs.close();
        ps.close();
        con.close();

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error loading upcoming events: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // Print stack trace for debugging
    }
}






    private void loadReservationsToTable() {
    try {
        // Establish the database connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "");

        // Query to fetch data from both 'client' and 'reservation' tables
        String query = "SELECT r.ReservationID, r.ReservationDate, c.ClientName, c.ClientNumber, r.EventName, r.Status " +
                       "FROM reservation r " +
                       "INNER JOIN client c ON r.ClientID = c.ClientID"; // Adjust if necessary

        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        // Create a DefaultTableModel
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) ReservationList.getModel();
        model.setRowCount(0); // Clear existing rows

        // Iterate through the result set
        while (rs.next()) {
            // Add row to the model
            model.addRow(new Object[]{
                rs.getInt("ReservationID"),
                rs.getString("ReservationDate"),
                rs.getString("ClientName"),
                rs.getString("ClientNumber"),
                rs.getString("EventName"),
                rs.getString("Status")
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ReserveBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReservationList = new javax.swing.JTable();
        UpdateReservationBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtReservationID = new javax.swing.JTextField();
        txtClientName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtClientNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pickStatus = new javax.swing.JComboBox<>();
        SearchBtn = new javax.swing.JButton();
        txtEventName = new javax.swing.JTextField();
        jCalendarComboBox1 = new de.wannawork.jcalendar.JCalendarComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        UpcomingEvents = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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
        setLocation(new java.awt.Point(250, 125));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(ReserveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 160, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 220, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Events");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 80, -1));

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setDoubleBuffered(true);

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
        // Set grid and selection properties
        ReservationList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); // Disable auto-resize
        ReservationList.setGridColor(new java.awt.Color(210, 180, 140));
        ReservationList.setSelectionBackground(new java.awt.Color(153, 102, 0));
        ReservationList.setShowGrid(true);

        // Adjust column widths
        javax.swing.table.TableColumnModel columnModel = ReservationList.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);  // ID column
        columnModel.getColumn(1).setPreferredWidth(120); // Date column
        columnModel.getColumn(2).setPreferredWidth(150); // Client Name column
        columnModel.getColumn(3).setPreferredWidth(120); // Contact column
        columnModel.getColumn(4).setPreferredWidth(100); // Event column
        columnModel.getColumn(5).setPreferredWidth(80);  // Status column

        // Add to scroll pane
        jScrollPane2.setViewportView(ReservationList);
        ReservationList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        ReservationList.setGridColor(new java.awt.Color(210, 180, 140));
        ReservationList.setSelectionBackground(new java.awt.Color(153, 102, 0));
        ReservationList.setShowGrid(true);
        jScrollPane2.setViewportView(ReservationList);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 660, 240));

        UpdateReservationBtn.setBackground(new java.awt.Color(205, 133, 63));
        UpdateReservationBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpdateReservationBtn.setText("Update Reservation");
        UpdateReservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateReservationBtnActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateReservationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 160, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Search ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 100, 40));

        txtReservationID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReservationIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtReservationID, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 240, 40));

        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 290, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Contact");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 60, 30));

        txtClientNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtClientNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 290, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 50, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Event");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 40, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Status");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 60, 30));

        pickStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pickStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Confirmed", "Pending", "Cancelled", " " }));
        pickStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickStatusActionPerformed(evt);
            }
        });
        jPanel1.add(pickStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 290, -1));

        SearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search (1).png"))); // NOI18N
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 50, 40));

        txtEventName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEventNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtEventName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 290, 30));
        jPanel1.add(jCalendarComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 290, 30));

        UpcomingEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Booking Id", "Date", "Client Name", "Contact ", "Event", "Status"
            }
        ));
        jScrollPane1.setViewportView(UpcomingEvents);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 920, 80));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Reservation Record");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 230, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Upcoming ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Client Name");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, 30));

        jButton1.setText("Sale Catalog");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, -1, -1));

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

    private void UpdateReservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateReservationBtnActionPerformed
    String reservationID = txtReservationID.getText().trim();
String clientName = txtClientName.getText().trim();
String clientNumber = txtClientNumber.getText().trim();
String eventName = txtEventName.getText().trim();
String status = pickStatus.getSelectedItem().toString().trim();

// Step 4: Get and validate Date from Calendar Picker
java.util.Date eventDate = jCalendarComboBox1.getDate(); // Get date from the calendar picker
if (eventDate == null) {
    JOptionPane.showMessageDialog(null, "Please select a valid event date.", "Date Error", JOptionPane.ERROR_MESSAGE);
    return;
}

// Convert java.util.Date to java.sql.Date for database storage
java.sql.Date sqlEventDate = new java.sql.Date(eventDate.getTime());

// Check if any field is empty
if (reservationID.isEmpty() || clientName.isEmpty() || clientNumber.isEmpty() || 
    eventName.isEmpty() || status.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please fill all fields to update the reservation.", "Input Error", JOptionPane.ERROR_MESSAGE);
    return;
}

try {
    // Establish the database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "");

    // Query to get the ClientID based on the ReservationID
    String getClientQuery = "SELECT ClientID FROM reservation WHERE ReservationID = ?";
    PreparedStatement psGetClient = con.prepareStatement(getClientQuery);
    psGetClient.setInt(1, Integer.parseInt(reservationID));
    ResultSet rsClient = psGetClient.executeQuery();

    // Check if a reservation with the given ReservationID exists
    if (rsClient.next()) {
        // Get the ClientID from the reservation
        int clientID = rsClient.getInt("ClientID");

        // Update query for the client table
        String updateClientQuery = "UPDATE client SET ClientName = ?, ClientNumber = ? WHERE ClientID = ?";
        PreparedStatement psClient = con.prepareStatement(updateClientQuery);
        psClient.setString(1, clientName);
        psClient.setString(2, clientNumber);
        psClient.setInt(3, clientID); // Use the retrieved ClientID
        int clientUpdateCount = psClient.executeUpdate();

        // Update query for the reservation table
        String updateReservationQuery = "UPDATE reservation SET EventName = ?, ReservationDate = ?, Status = ? WHERE ReservationID = ?";
        PreparedStatement psReservation = con.prepareStatement(updateReservationQuery);
        psReservation.setString(1, eventName);
        psReservation.setDate(2, sqlEventDate); // Use the formatted SQL Date
        psReservation.setString(3, status);
        psReservation.setInt(4, Integer.parseInt(reservationID));
        int reservationUpdateCount = psReservation.executeUpdate();

        // Check if the update was successful
        if (clientUpdateCount > 0 && reservationUpdateCount > 0) {
            JOptionPane.showMessageDialog(this, "Reservation and client details updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update reservation. Please check the input.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Close the connections
        psClient.close();
        psReservation.close();
        psGetClient.close();
        con.close();
        
        dispose();
        HomeFrame home = new HomeFrame(); 
        home.setVisible(true); 
        home.setLocationRelativeTo(null); // Center the HomeFrame
    } else {
        JOptionPane.showMessageDialog(this, "Reservation not found. Please check the ReservationID.", "Error", JOptionPane.ERROR_MESSAGE);
    }

} catch (Exception ex) {
    JOptionPane.showMessageDialog(this, "Error updating reservation: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_UpdateReservationBtnActionPerformed

    private void ReserveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveBtnActionPerformed
        // Get input data from text fields
String ClientName = txtClientName.getText().trim();
String ClientNumber = txtClientNumber.getText().trim();
String EventName = txtEventName.getText().trim();
String Status = pickStatus.getSelectedItem().toString().trim();

// Retrieve the selected date from jCalendarComboBox1
java.util.Date eventDate = jCalendarComboBox1.getDate(); // Get date from the calendar picker

// Validate date selection
if (eventDate == null) {
    JOptionPane.showMessageDialog(null, "Please select a valid event date.", "Date Error", JOptionPane.ERROR_MESSAGE);
    return;
}

// Format the date to "YYYY-MM-DD" before using it in the database
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
String formattedDate = sdf.format(eventDate);

// Validate other inputs
if (ClientName.isEmpty() || ClientNumber.isEmpty() || EventName.isEmpty() || Status.isEmpty()) {
    JOptionPane.showMessageDialog(this, 
        "Please fill in all fields.", 
        "Reservation Error", 
        JOptionPane.ERROR_MESSAGE);
    return;
}

try {
    // Connect to the database
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "");

    // Check if the client exists
    String checkClientQuery = "SELECT ClientID FROM CLIENT WHERE ClientName = ? AND ClientNumber = ?";
    PreparedStatement checkClientStmt = con.prepareStatement(checkClientQuery);
    checkClientStmt.setString(1, ClientName);
    checkClientStmt.setString(2, ClientNumber);
    ResultSet rs = checkClientStmt.executeQuery();

    int clientID = -1; // Default to an invalid ID
    if (rs.next()) {
        clientID = rs.getInt("ClientID");
    } else {
        // Register a new client if not found
        String insertClientQuery = "INSERT INTO CLIENT (ClientName, ClientNumber) VALUES (?, ?)";
        PreparedStatement insertClientStmt = con.prepareStatement(insertClientQuery, PreparedStatement.RETURN_GENERATED_KEYS);
        insertClientStmt.setString(1, ClientName);
        insertClientStmt.setString(2, ClientNumber);

        int rowsInserted = insertClientStmt.executeUpdate();
        if (rowsInserted > 0) {
            ResultSet generatedKeys = insertClientStmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                clientID = generatedKeys.getInt(1); // Get the auto-generated ClientID
            }
        } else {
            JOptionPane.showMessageDialog(this, 
                "Failed to register the client. Reservation aborted.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    // Insert reservation data
    String query = "INSERT INTO RESERVATION (ClientID, EventName, ReservationDate, Status) " +
                   "VALUES (?, ?, ?, ?)";
    PreparedStatement pst = con.prepareStatement(query);
    pst.setInt(1, clientID);
    pst.setString(2, EventName);
    pst.setString(3, formattedDate); // Use the formatted date
    pst.setString(4, Status);

    int rowsInserted = pst.executeUpdate();
    if (rowsInserted > 0) {
        JOptionPane.showMessageDialog(this, 
            "Reservation saved successfully!", 
            "Success", 
            JOptionPane.INFORMATION_MESSAGE);

        // Clear fields after saving
        txtClientName.setText("");
        txtClientNumber.setText("");
        txtEventName.setText("");
        jCalendarComboBox1.setDate(null);       // Clear the calendar picker
        pickStatus.setSelectedIndex(0);         // Reset status combo box
    } else {
        JOptionPane.showMessageDialog(this, 
            "Failed to save the reservation.", 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    }

} catch (Exception e) {
    // Handle database errors
    JOptionPane.showMessageDialog(this, 
        "Database error: " + e.getMessage(), 
        "Error", 
        JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_ReserveBtnActionPerformed

    private void txtReservationIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReservationIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReservationIDActionPerformed

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNameActionPerformed

    private void txtClientNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNumberActionPerformed

    private void txtEventNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEventNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEventNameActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
       String reservationID = txtReservationID.getText().trim();

if (reservationID.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please enter a Reservation ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
    return;
}

try {
    // Establish the database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "");

    // SQL query with JOIN to retrieve data from both tables
    String query = "SELECT c.ClientName, c.ClientNumber, r.EventName, r.ReservationDate, r.Status " +
                   "FROM client c " +
                   "INNER JOIN reservation r ON c.ClientID = r.ClientID " +
                   "WHERE r.ReservationID = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, reservationID);

    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
        // Retrieve data from the ResultSet using the correct column names
        txtClientName.setText(rs.getString("ClientName"));
        txtClientNumber.setText(rs.getString("ClientNumber"));
        txtEventName.setText(rs.getString("EventName"));

        // Retrieve and set the event date to the jCalendarComboBox1
        java.util.Date eventDate = rs.getDate("ReservationDate"); // Get date from the result set
        jCalendarComboBox1.setDate(eventDate); // Set the date to the calendar combo box
        
        pickStatus.setSelectedItem(rs.getString("Status"));
    } else {
        JOptionPane.showMessageDialog(this, "No reservation found with the given ID.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Close the connections
    rs.close();
    ps.close();
    con.close();

} catch (Exception ex) {
    JOptionPane.showMessageDialog(this, "Error searching reservation: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_SearchBtnActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                SaleCatalog laborer = new SaleCatalog();
                laborer.setVisible(true);
                laborer .setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pickStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pickStatusActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBooking;
    private javax.swing.JButton BtnCalendar;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnLaborer;
    private javax.swing.JButton BtnPackages;
    private javax.swing.JTable ReservationList;
    private javax.swing.JButton ReserveBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTable UpcomingEvents;
    private javax.swing.JButton UpdateReservationBtn;
    private javax.swing.JButton jButton1;
    private de.wannawork.jcalendar.JCalendarComboBox jCalendarComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JComboBox<String> pickStatus;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtClientNumber;
    private javax.swing.JTextField txtEventName;
    private javax.swing.JTextField txtReservationID;
    // End of variables declaration//GEN-END:variables
}
