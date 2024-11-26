
package GUI;

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.sql.Date;
/**
 *
 * @author mchri
 */
public class reservationPay extends javax.swing.JFrame {
    private Connection con;

    public reservationPay() {
        initComponents();
        connectToDatabase();
    }

    // Connect to database
    private void connectToDatabase() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "");
        } catch (SQLException e) {
            showError("Database connection failed: " + e.getMessage());
        }
    }

    // Utility method to show error messages
    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Utility method to show success messages
    private void showSuccess(String message) {
        JOptionPane.showMessageDialog(this, message, "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        paymentField = new javax.swing.JTextField();
        backbutton = new javax.swing.JButton();
        paymentField1 = new javax.swing.JTextField();
        clientNameField = new javax.swing.JTextField();
        searchField = new javax.swing.JTextField();
        reservationIdField = new javax.swing.JTextField();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Pay");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 50, 30));

        jLabel3.setText("Reservation Id:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel4.setText("Client Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel6.setText("Reservation Fee:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        payButton.setText("pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });
        getContentPane().add(payButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 120, 40));

        paymentField.setText("500");
        getContentPane().add(paymentField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, 30));

        backbutton.setText("back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        paymentField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentField1ActionPerformed(evt);
            }
        });
        getContentPane().add(paymentField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 170, 30));

        clientNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(clientNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, 30));

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 170, 30));

        reservationIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationIdFieldActionPerformed(evt);
            }
        });
        getContentPane().add(reservationIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 170, 30));

        search.setText("search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
          try {
        double payment = 500;  // Fixed payment amount for the reservation fee

        // Get the reservation ID (assuming you're getting it from a specific field like reservationIdField)
        String reservationId = getReservationIdFromDatabase();  // Method to get reservation ID from the database

        if (reservationId == null) {
            showError("Reservation ID not found.");
            return;
        }

        // Save the transaction with the reservation ID and the fixed payment of 500
        saveTransaction(reservationId, payment);

        showSuccess("Payment recorded successfully!");
        paymentField.setText("");  // Clear the payment field
    } catch (Exception e) {
        showError("Error processing payment: " + e.getMessage());
    }
    }//GEN-LAST:event_payButtonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    private void paymentField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentField1ActionPerformed

    private void clientNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientNameFieldActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
      
    }//GEN-LAST:event_searchFieldActionPerformed

    private void reservationIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservationIdFieldActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
          // Get the user input from the search field
    String searchInput = searchField.getText().trim();

    // Check if input is empty
    if (searchInput.isEmpty()) {
        showError("Please provide a Reservation ID or Client Name to search.");
        return;
    }

    try {
        // SQL query to search by Reservation ID or Client Name
        String query = """
        SELECT r.ReservationId, c.ClientName
        FROM reservation r
        JOIN client c ON r.ClientId = c.ClientId
        WHERE r.ReservationId = ? OR c.ClientName LIKE ?""";

        // Prepare the statement
        PreparedStatement ps = con.prepareStatement(query);

        // Set parameters for the query (using same input for both ReservationId and ClientName)
        ps.setString(1, searchInput);  // For ReservationId
        ps.setString(2, "%" + searchInput + "%");  // For ClientName (wildcard for partial matching)

        // Execute the query
        ResultSet rs = ps.executeQuery();

        // If results are found, populate the UI
        if (rs.next()) {
            String reservationId = rs.getString("ReservationId");
            String clientName = rs.getString("ClientName");

            // Populate the UI fields with the result
            reservationIdField.setText(reservationId);
            clientNameField.setText(clientName);

        } else {
            showError("No reservation found for the provided details.");
        }

    } catch (SQLException e) {
        showError("Error retrieving reservation details: " + e.getMessage());
    }
    }//GEN-LAST:event_searchActionPerformed
private void saveTransaction(String reservationId, double payment) {
    try {
        // Insert the payment transaction into the transactions table
        String insertQuery = "INSERT INTO transactions (ReservationId, PaymentAmount, Date) VALUES (?, ?, NOW())";
        PreparedStatement psInsert = con.prepareStatement(insertQuery);

        psInsert.setString(1, reservationId);  // Use the retrieved reservation ID
        psInsert.setDouble(2, payment);        // Payment amount (500)

        int rowsInserted = psInsert.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Transaction recorded successfully.");
        } else {
            showError("Failed to record the transaction.");
        }
    } catch (SQLException e) {
        showError("Error saving transaction: " + e.getMessage());
    }
}

private String getReservationIdFromDatabase() {
    String reservationId = null;
    try {
        // Assuming you have a way to get the ReservationId based on user input or selected data
        String query = "SELECT ReservationId FROM reservation WHERE ReservationId = ?";
        PreparedStatement ps = con.prepareStatement(query);

        // You can get the reservation ID from a field or selection (e.g., reservationIdField)
        ps.setString(1, reservationIdField.getText().trim());  // Assuming you get it from a text field

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            reservationId = rs.getString("ReservationId");  // Retrieve the ReservationId from the database
        }

    } catch (SQLException e) {
        showError("Error retrieving ReservationId: " + e.getMessage());
    }

    return reservationId;
}





   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reservationPay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JTextField clientNameField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton payButton;
    private javax.swing.JTextField paymentField;
    private javax.swing.JTextField paymentField1;
    private javax.swing.JTextField reservationIdField;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
