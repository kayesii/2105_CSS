
package GUI;

import java.sql.Connection;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.sql.*;

public class ReservationCalendar extends javax.swing.JFrame {

    private JTable calendarTable;
    private DefaultTableModel tableModel;
    private JLabel labelMonth, labelYear;
    private JTextField txtDate;
    private JButton btnSearch,btnback,btnHome,btnPackages,btnBooking,btnLaborer;
    private JList<String> listReservations;

    
    public ReservationCalendar() {
        // Initialize components
        labelMonth = new JLabel("Month");
        labelYear = new JLabel("Year");
        txtDate = new JTextField(10);  // For inputting date (YY-MM-DD)
        btnSearch = new JButton("Search");
        listReservations = new JList<>();
        
        // Table setup (6 rows for weeks, 7 columns for days of the week)
        tableModel = new DefaultTableModel(6, 7);
        calendarTable = new JTable(tableModel);
        
        // Setup the table rendering
        calendarTable.setCellSelectionEnabled(true);
        calendarTable.setRowHeight(50);
        calendarTable.setDefaultRenderer(Object.class, new CustomTableCellRenderer());

        // Layout
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(labelMonth);
        topPanel.add(labelYear);
        topPanel.add(txtDate);
        topPanel.add(btnSearch);
        
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(new JScrollPane(listReservations));

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(calendarTable), BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        
        // Action listener for the Search button
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputDate = txtDate.getText().trim();
                searchReservations(inputDate);
            }
        });

        JButton btnHome = new JButton("Home");
    btnHome.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            dispose();
                HomeFrame home = new HomeFrame();
                home.setVisible(true);
                home.setLocationRelativeTo(null); // Center the SignUP frame
        }
    });
   topPanel.add(btnHome);
     JButton btnBooking = new JButton("Booking");
    btnBooking.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            dispose();
                dispose();
                BookingFrame bookingF = new BookingFrame();
                bookingF.setVisible(true);
                bookingF.setLocationRelativeTo(null); // Center the SignUP frame
        }
    });
    bottomPanel.add(btnBooking);
    
     JButton btnLaborer= new JButton("Laborer");
    btnLaborer.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            dispose();
                dispose();
                LaborersFrame laborer = new LaborersFrame();
                laborer.setVisible(true);
                laborer .setLocationRelativeTo(null); // Center the SignUP frame
        }
    });
    bottomPanel.add(btnLaborer);
        
    JButton btnPackages= new JButton("Packages");
    btnPackages.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            dispose();
                 dispose();
                PackagesFrame packages = new PackagesFrame();
                packages.setVisible(true);
                packages.setLocationRelativeTo(null); // Center the SignUP frame
        }
    });
    bottomPanel.add(btnPackages);
        
        // Set frame properties
        setTitle("Reservation Calendar");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        // Initially, show current month and year
        showCalendar(Calendar.getInstance());
    }

    // Display the calendar for a given month/year
    private void showCalendar(Calendar calendar) {
        int month = calendar.get(Calendar.MONTH);  // 0 to 11
        int year = calendar.get(Calendar.YEAR);
        
        // Set the month and year labels
        labelMonth.setText(new SimpleDateFormat("MMMM").format(calendar.getTime()));
        labelYear.setText(String.valueOf(year));
        
        // Get the first day of the month and number of days in the month
        calendar.set(year, month, 1);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);  // 1 = Sunday, 2 = Monday, ..., 7 = Saturday
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        // Fill the table with the correct dates
        int day = 1;
        for (int row = 0; row < 6; row++) {  // 6 rows (weeks)
            for (int col = 0; col < 7; col++) {  // 7 columns (days of the week)
                if (row == 0 && col < firstDayOfWeek - 1) {
                    tableModel.setValueAt("", row, col);  // Empty cell
                } else if (day <= daysInMonth) {
                    tableModel.setValueAt(String.format("%02d", day), row, col);  // Display date
                    day++;
                } else {
                    tableModel.setValueAt("", row, col);  // Empty cell for days after the last day of the month
                }
            }
        }
    }

    // Search reservations based on the date (YY-MM-DD format)
    private void searchReservations(String inputDate) {
        // Validate the input date format (YY-MM-DD)
        if (!inputDate.matches("\\d{2}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Please use YY-MM-DD.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Convert to YYYY-MM-DD format for database query
        String formattedDate = "20" + inputDate.substring(0, 2) + "-" + inputDate.substring(3, 5) + "-" + inputDate.substring(6, 8);
        
        // Extract month and year from the input date
        int year = Integer.parseInt("20" + inputDate.substring(0, 2));  // Full year (20yy)
        int month = Integer.parseInt(inputDate.substring(3, 5)) - 1;  // Month is 0-based (0 = January, 11 = December)
        
        // Update the month and year labels based on the input date
        labelMonth.setText(new SimpleDateFormat("MMMM").format(new GregorianCalendar(year, month, 1).getTime()));
        labelYear.setText(String.valueOf(year));
        
        // Query the database to fetch reservations
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
            String query = "SELECT * FROM RESERVATION WHERE ReservationDate = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, formattedDate);
            ResultSet rs = pst.executeQuery();
            
            // Clear previous reservations in the JList
            DefaultListModel<String> listModel = new DefaultListModel<>();
            
            // Process the results
            while (rs.next()) {
                String clientID = rs.getString("ClientID");
                String eventName = rs.getString("EventName");
                String reservationDate = rs.getString("ReservationDate");
                String status = rs.getString("Status");
                listModel.addElement("ClientID: " + clientID + ", Event: " + eventName + ", Date: " + reservationDate + ", Status: " + status);
            }
            listReservations.setModel(listModel);
            
            // Update the calendar table cell colors based on reservations for the given date
            updateCalendarCellColor(formattedDate, month, year);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error retrieving data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Update the table cell color based on the reservation status for a given date
    private void updateCalendarCellColor(String reservationDate, int month, int year) {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                String cellValue = (String) tableModel.getValueAt(row, col);
                if (cellValue != null && !cellValue.isEmpty()) {
                    String date = String.format("%04d-%02d-%02d", year, month + 1, Integer.parseInt(cellValue));  // Format as YYYY-MM-DD
                    if (date.equals(reservationDate)) {
                        // If the date matches the reservation date, check if status is "Confirmed"
                        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
                            String query = "SELECT Status FROM RESERVATION WHERE ReservationDate = ?";
                            PreparedStatement pst = con.prepareStatement(query);
                            pst.setString(1, reservationDate);
                            ResultSet rs = pst.executeQuery();
                            if (rs.next()) {
                                String status = rs.getString("Status");
                                // Change the background color of the cell based on reservation status
                                int day = Integer.parseInt(cellValue);
                                int rowIdx = (day + 6) / 7; // Find the row for the day in the calendar (6 weeks max)
                                int colIdx = (day - 1) % 7; // Find the column for the day in the calendar (0 - 6 for Sunday to Saturday)

                                if ("Confirmed".equalsIgnoreCase(status)) {
                                    calendarTable.setBackground(Color.GREEN);  // Confirmed -> Green
                                } else {
                                    calendarTable.setBackground(Color.WHITE);  // Not confirmed -> White
                                }
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    // Custom table cell renderer to change cell color
    class CustomTableCellRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            String date = (String) value;
            if (date != null && !date.isEmpty()) {
                // You can implement color-coding based on specific status here
            }
            return cell;
        }
    }

    // Main method to launch the app
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ReservationCalendar();
            }
        });
    }



   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
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

        jPanel3.setBackground(new java.awt.Color(245, 222, 179));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 330));

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

    private void BtnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalendarActionPerformed
       
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

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBooking;
    private javax.swing.JButton BtnCalendar;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnLaborer;
    private javax.swing.JButton BtnPackages;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
