package GUI;

import java.sql.Connection;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.sql.*;
import java.util.Calendar;
import java.util.HashMap;

public class ReservationCalendar extends javax.swing.JFrame {

    private JTable calendarTable;
    private JLabel labelMonth, labelYear;
    private JButton btnPreviousMonth, btnNextMonth, btnPreviousYear, btnNextYear, btnHome, btnBooking, btnLaborer, btnPackages;
    private JLabel labelClientName, labelEventName, noReservationMessage, legendLabel;
    private JPanel legendPanel;

    private Calendar calendar;
    private HashMap<String, String> dateBookingStatusMap; // Booking statuses

    public ReservationCalendar() {
        // Initialize components
        labelMonth = new JLabel("Month", SwingConstants.CENTER);
        labelYear = new JLabel("Year", SwingConstants.CENTER);

        btnPreviousMonth = new JButton("<");
        btnNextMonth = new JButton(">");
        btnPreviousYear = new JButton("<<");
        btnNextYear = new JButton(">>");

        calendar = Calendar.getInstance();
        dateBookingStatusMap = new HashMap<>();

        DefaultTableModel calendarTableModel = new DefaultTableModel(6, 7);
        calendarTable = new JTable(calendarTableModel) {
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);
                Object value = getValueAt(row, column);

                if (c instanceof JLabel) {
                    ((JLabel) c).setHorizontalAlignment(SwingConstants.CENTER); // Center text
                }

                if (value != null && !value.toString().isEmpty()) {
                    String selectedDate = constructDateString(value.toString().trim());
                    String bookingStatus = dateBookingStatusMap.get(selectedDate);

                    if ("Completed".equalsIgnoreCase(bookingStatus)) {
                        c.setBackground(Color.GREEN);
                    } else if ("Pending".equalsIgnoreCase(bookingStatus)) {
                        c.setBackground(Color.RED);
                    } else {
                        c.setBackground(Color.WHITE);
                    }
                } else {
                    c.setBackground(Color.WHITE);
                }
                return c;
            }
        };

        calendarTable.setCellSelectionEnabled(true);
        calendarTable.setRowHeight(50);

        calendarTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = calendarTable.getSelectedRow();
                int column = calendarTable.getSelectedColumn();
                Object value = calendarTable.getValueAt(row, column);
                if (value != null && !value.toString().isEmpty()) {
                    String clickedDate = constructDateString(value.toString().trim());
                    fetchBookingDetails(clickedDate);
                }
            }
        });

        // Other UI components initialization
        Font labelFont = new Font("Arial", Font.PLAIN, 40);

        labelClientName = new JLabel("Client Name: ");
        labelClientName.setFont(labelFont);

        labelEventName = new JLabel("Event: ");
        labelEventName.setFont(labelFont);

        // Update the label text to indicate no events found and center it horizontally
        noReservationMessage = new JLabel("No Events found on this date.", SwingConstants.CENTER);
        noReservationMessage.setFont(new Font("Arial", Font.BOLD, 26));
        noReservationMessage.setForeground(Color.RED);
        noReservationMessage.setVisible(false);

        // Legend Panel
        legendPanel = new JPanel();
        legendLabel = new JLabel("<html><b>Legend:</b><br><font color='green'>Completed</font><br><font color='red'>Pending</font></html>");
        legendPanel.add(legendLabel);

        // Set up the layout
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new GridLayout(2, 1));
        JPanel navigationPanel = new JPanel(new FlowLayout());
        navigationPanel.add(btnPreviousYear);
        navigationPanel.add(btnPreviousMonth);
        navigationPanel.add(labelMonth);
        navigationPanel.add(labelYear);
        navigationPanel.add(btnNextMonth);
        navigationPanel.add(btnNextYear);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnHome = new JButton("Home");
        btnBooking = new JButton("Booking");
        btnLaborer = new JButton("Laborer");
        btnPackages = new JButton("Packages");
        buttonPanel.add(btnHome);
        buttonPanel.add(btnBooking);
        buttonPanel.add(btnLaborer);
        buttonPanel.add(btnPackages);
        
        btnHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                HomeFrame home = new HomeFrame();
                home.setVisible(true);
                home.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
         btnBooking.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                BookingProcess booking = new BookingProcess();
                booking.setVisible(true);
                booking.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
         btnLaborer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                LaborersFrame laborer = new LaborersFrame();
                laborer.setVisible(true);
                laborer .setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
         btnPackages.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                PackagesFrame packages = new PackagesFrame();
                packages.setVisible(true);
                packages.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
                                           

        topPanel.add(navigationPanel);
        topPanel.add(buttonPanel);

        // Bottom panel for labels and legend
        JPanel bottomPanel = new JPanel(new BorderLayout()); // Use BorderLayout for easy positioning
        JPanel leftPanel = new JPanel(new GridLayout(3, 1)); // Vertical layout for client name, event, and no message
        leftPanel.add(labelClientName);
        leftPanel.add(labelEventName);
        leftPanel.add(noReservationMessage);

        // Set the left panel to the left side
        bottomPanel.add(leftPanel, BorderLayout.WEST);

        // Set the legend to the right side
        bottomPanel.add(legendPanel, BorderLayout.EAST);

        // Add top panel, calendar table and bottom panel
        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(calendarTable), BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        // Button actions
        btnPreviousMonth.addActionListener(e -> {
            calendar.add(Calendar.MONTH, -1);
            showCalendar(calendar);
        });

        btnNextMonth.addActionListener(e -> {
            calendar.add(Calendar.MONTH, 1);
            showCalendar(calendar);
        });

        btnPreviousYear.addActionListener(e -> {
            calendar.add(Calendar.YEAR, -1);
            showCalendar(calendar);
        });

        btnNextYear.addActionListener(e -> {
            calendar.add(Calendar.YEAR, 1);
            showCalendar(calendar);
        });

        setTitle("Reservation Calendar");
        setSize(600, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        showCalendar(calendar);
    }

    private String constructDateString(String day) {
        String month = labelMonth.getText();
        String year = labelYear.getText();
        try {
            int dayInt = Integer.parseInt(day);
            return String.format("%s-%02d-%02d", year, getMonthNumber(month), dayInt);
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    
    private void showCalendar(Calendar calendar) {
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        labelMonth.setText(new SimpleDateFormat("MMMM").format(calendar.getTime()));
        labelYear.setText(String.valueOf(year));

        calendar.set(year, month, 1);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        int numberOfDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        DefaultTableModel model = (DefaultTableModel) calendarTable.getModel();
        model.setRowCount(6);
        model.setColumnCount(7);

        // Set column headers (Sunday to Saturday)
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        model.setColumnIdentifiers(days);

        int day = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 && j < firstDayOfWeek || day > numberOfDays) {
                    model.setValueAt("", i, j);
                } else {
                    model.setValueAt(day, i, j);
                    day++;
                }
            }
        }
        loadBookingStatuses();
    }

    private void loadBookingStatuses() {
        dateBookingStatusMap.clear();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
            String queryBooking = "SELECT EventDate, Status FROM booking";

            // Load booking statuses
            PreparedStatement pstBooking = con.prepareStatement(queryBooking);
            ResultSet rsBooking = pstBooking.executeQuery();
            while (rsBooking.next()) {
                String date = rsBooking.getString("EventDate");
                String status = rsBooking.getString("Status");
                dateBookingStatusMap.put(date, status);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading booking statuses: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private int getMonthNumber(String monthName) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
            Calendar cal = Calendar.getInstance();
            cal.setTime(sdf.parse(monthName));
            return cal.get(Calendar.MONTH) + 1;
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private void fetchBookingDetails(String eventDate) {
        if (eventDate == null) return;

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
            String query = "SELECT b.ClientID, b.Theme, b.EventDate, b.Status, c.ClientName "
                         + "FROM booking b "
                         + "JOIN client c ON b.ClientID = c.ClientID "
                         + "WHERE b.EventDate = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, eventDate);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String clientName = rs.getString("ClientName");
                String eventTheme = rs.getString("Theme");

                labelClientName.setText("Client Name: " + clientName);
                labelEventName.setText("Event: " + eventTheme);
                noReservationMessage.setVisible(false);
            } else {
                labelClientName.setText("Client Name: ");
                labelEventName.setText("Event: ");
                noReservationMessage.setVisible(true);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching booking details: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
    try {
        SwingUtilities.invokeLater(() -> new ReservationCalendar());
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 222, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(245, 222, 179));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1080, 440));

        jPanel2.setBackground(new java.awt.Color(210, 180, 140));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel8.setText("PALATES  ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 280, 60));

        jLabel6.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel6.setText("&   plates");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
