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
    private JLabel labelClientID, labelEventName, labelReservationDate, labelStatus, noReservationMessage;

    private Calendar calendar;
    private HashMap<String, String> dateStatusMap; // Stores date and status for coloring

    public ReservationCalendar() {
        // Initialize components
        labelMonth = new JLabel("Month", SwingConstants.CENTER);
        labelYear = new JLabel("Year", SwingConstants.CENTER);

        btnPreviousMonth = new JButton("<");
        btnNextMonth = new JButton(">");
        btnPreviousYear = new JButton("<<");
        btnNextYear = new JButton(">>");

        calendar = Calendar.getInstance();
        dateStatusMap = new HashMap<>();

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
                    String status = dateStatusMap.get(selectedDate);

                    if ("Pending".equalsIgnoreCase(status)) {
                        c.setBackground(Color.ORANGE);
                    } else if ("Cancelled".equalsIgnoreCase(status)) {
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
                    searchReservations(clickedDate);
                }
            }
        });

        // Set larger font for labels
        Font labelFont = new Font("Arial", Font.PLAIN, 24);

        labelClientID = new JLabel("ClientID: ");
        labelClientID.setFont(labelFont);

        labelEventName = new JLabel("Event: ");
        labelEventName.setFont(labelFont);

        labelReservationDate = new JLabel("Reservation Date: ");
        labelReservationDate.setFont(labelFont);

        labelStatus = new JLabel("Status: ");
        labelStatus.setFont(labelFont);

        noReservationMessage = new JLabel("No reservations found for this date.", SwingConstants.CENTER);
        noReservationMessage.setFont(new Font("Arial", Font.BOLD, 26));
        noReservationMessage.setForeground(Color.RED);
        noReservationMessage.setVisible(false);

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

        topPanel.add(navigationPanel);
        topPanel.add(buttonPanel);

        JPanel bottomPanel = new JPanel(new GridLayout(5, 1));
        bottomPanel.add(labelClientID);
        bottomPanel.add(labelEventName);
        bottomPanel.add(labelReservationDate);
        bottomPanel.add(labelStatus);
        bottomPanel.add(noReservationMessage);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(calendarTable), BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        btnHome.addActionListener(e -> {
            dispose();
            HomeFrame home = new HomeFrame();
            home.setVisible(true);
            home.setLocationRelativeTo(null);
        });
        btnBooking.addActionListener(e -> {
            dispose();
            BookingProcess Booking = new BookingProcess();
            Booking.setVisible(true);
            Booking.setLocationRelativeTo(null);
        });
        btnLaborer.addActionListener(e -> {
            dispose();
            LaborersFrame Laborer = new LaborersFrame();
            Laborer.setVisible(true);
            Laborer.setLocationRelativeTo(null);
        });
        btnPackages.addActionListener(e -> {
            dispose();
            PackagesFrame Packages = new PackagesFrame();
            Packages.setVisible(true);
            Packages.setLocationRelativeTo(null);
        });

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
        loadStatuses();
    }

    private void loadStatuses() {
        dateStatusMap.clear();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
            String query = "SELECT ReservationDate, Status FROM reservation";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String date = rs.getString("ReservationDate");
                String status = rs.getString("Status");
                dateStatusMap.put(date, status);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading statuses: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void searchReservations(String inputDate) {
        if (!inputDate.matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Please use YYYY-MM-DD.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
            String query = "SELECT * FROM reservation WHERE ReservationDate = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, inputDate);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                labelClientID.setText("ClientID: " + rs.getString("ClientID"));
                labelEventName.setText("Event: " + rs.getString("EventName"));
                labelReservationDate.setText("Reservation Date: " + rs.getString("ReservationDate"));
                labelStatus.setText("Status: " + rs.getString("Status"));
                noReservationMessage.setVisible(false);
            } else {
                labelClientID.setText("ClientID: ");
                labelEventName.setText("Event: ");
                labelReservationDate.setText("Reservation Date: ");
                labelStatus.setText("Status: ");
                noReservationMessage.setVisible(true);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching reservation: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new ReservationCalendar();
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
