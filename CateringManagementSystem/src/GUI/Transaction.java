
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
public class Transaction extends javax.swing.JFrame {
    private Connection con;

    public Transaction() {
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

        bookingIdField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        clientNameField = new javax.swing.JTextField();
        searchBookingDetails = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        downPaymentField = new javax.swing.JTextField();
        totalPriceField = new javax.swing.JTextField();
        balanceField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        paymentField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookingIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingIdFieldActionPerformed(evt);
            }
        });
        getContentPane().add(bookingIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 160, 30));

        jLabel2.setText("payment ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 50, 30));
        getContentPane().add(clientNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 160, 40));

        searchBookingDetails.setText("Search");
        searchBookingDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookingDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(searchBookingDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 80, 30));

        jLabel3.setText("Booking Id:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        downPaymentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downPaymentFieldActionPerformed(evt);
            }
        });
        getContentPane().add(downPaymentField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 170, 40));

        totalPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceFieldActionPerformed(evt);
            }
        });
        getContentPane().add(totalPriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 170, 40));

        balanceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceFieldActionPerformed(evt);
            }
        });
        getContentPane().add(balanceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 170, 40));

        jLabel4.setText("Client Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel5.setText("Total Price:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel6.setText("Total Price:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel7.setText("DownPayment");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        payButton.setText("pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });
        getContentPane().add(payButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 120, 40));
        getContentPane().add(paymentField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 120, 30));

        jLabel8.setText("Balance");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 50, 30));

        cancel.setText("cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookingIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingIdFieldActionPerformed

    private void searchBookingDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookingDetailsActionPerformed
       String bookingId = bookingIdField.getText().trim();
    String clientName = clientNameField.getText().trim();

    if (bookingId.isEmpty() && clientName.isEmpty()) {
        showError("Please provide a Booking ID or Client Name.");
        return;
    }

    try {
        String query = """
                SELECT b.TotalPrice, b.Balance, b.PaidAmount, c.ClientName
                FROM booking b
                JOIN client c ON b.ClientId = c.ClientId
                WHERE b.BookingId = ? OR c.ClientName = ?""";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, bookingId);
        ps.setString(2, clientName);

        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            double totalPrice = rs.getDouble("TotalPrice");
            double balance = rs.getDouble("Balance");
            double payAmount = rs.getDouble("PaidAmount");
            double downPayment = totalPrice * 0.30; // 30% down payment

            totalPriceField.setText(String.format("%.2f", totalPrice));
            downPaymentField.setText(String.format("%.2f", downPayment));
            balanceField.setText(String.format("%.2f", balance));
            paymentField.setText(String.format("%.2f", payAmount)); // Display PayAmount
        } else {
            showError("No booking found with the provided details.");
        }
    } catch (SQLException e) {
        showError("Error retrieving booking details: " + e.getMessage());
    }
    }//GEN-LAST:event_searchBookingDetailsActionPerformed
    private void processPayment() {
        try {
            double payment = Double.parseDouble(paymentField.getText().trim());
            if (payment <= 0) {
                showError("Payment must be greater than 0.");
                return;
            }

            double balance = Double.parseDouble(balanceField.getText());
            double updatedBalance = balance - payment;

            if (updatedBalance < 0) {
                showError("Payment exceeds the balance.");
                return;
            }

            balanceField.setText(String.format("%.2f", updatedBalance));
            saveTransaction(payment, updatedBalance);

            if (updatedBalance == 0) {
                showSuccess("Payment complete! Booking is fully paid.");
            } else {
                showSuccess("Partial payment recorded.");
            }
        } catch (NumberFormatException e) {
            showError("Invalid payment amount.");
        }
    }
    private void totalPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceFieldActionPerformed

    private void downPaymentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downPaymentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downPaymentFieldActionPerformed

    private void balanceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceFieldActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
       try {
        // Get the payment amount from the input field
        double payment = Double.parseDouble(paymentField.getText().trim());
        if (payment <= 0) {
            showError("Please enter a valid payment amount.");
            return;
        }

        // Get the current balance from the balance field
        double currentBalance = Double.parseDouble(balanceField.getText().trim());
        double remainingBalance = currentBalance - payment;

        // Check if the payment is more than the balance
        if (remainingBalance < 0) {
            showError("Payment exceeds the balance.");
            return;
        }

        // Get the Booking ID from the input field
        String bookingId = bookingIdField.getText().trim();
        if (bookingId.isEmpty()) {
            showError("Please enter a valid Booking ID.");
            return;
        }

        // Update the balance and payment status in the booking table
        String updateQuery = "UPDATE booking SET Balance = ?, PaidAmount = ?, PaymentStatus = ? WHERE BookingId = ?";
        PreparedStatement ps = con.prepareStatement(updateQuery);
        ps.setDouble(1, remainingBalance);
        ps.setDouble(2, payment);  // Save the payment amount in the PayAmount column
        ps.setString(3, (remainingBalance == 0) ? "Paid" : "Partial");  // Update payment status based on balance
        ps.setString(4, bookingId);

        int rowsUpdated = ps.executeUpdate();
        if (rowsUpdated > 0) {
            showSuccess("Payment successful!");
            balanceField.setText(String.format("%.2f", remainingBalance));  // Update the balance display
            paymentField.setText("");  // Clear the payment input field
        } else {
            showError("Failed to update payment status.");
        }
    } catch (SQLException | NumberFormatException ex) {
        showError("Error processing payment: " + ex.getMessage());
    }
    }//GEN-LAST:event_payButtonActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
         String bookingId = bookingIdField.getText().trim();
        if (bookingId.isEmpty()) {
            showError("Please enter a valid Booking ID to cancel.");
            return;
        }

        try {
            String query = "UPDATE booking SET Status = 'Cancelled' WHERE BookingId = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, bookingId);

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                showSuccess("Booking has been cancelled.");
                // Optionally, update payment/transaction info if required.
            } else {
                showError("Booking cancellation failed. Please check the Booking ID.");
            }
        } catch (SQLException e) {
            showError("Error cancelling booking: " + e.getMessage());
        }
    }//GEN-LAST:event_cancelActionPerformed

private double getTotalPriceFromBookingId(String bookingId) {
        double totalPrice = 0;
        try {
            String query = "SELECT TotalPrice FROM booking WHERE BookingId = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, bookingId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                totalPrice = rs.getDouble("TotalPrice");
            }
        } catch (SQLException e) {
            showError("Error fetching total price: " + e.getMessage());
        }
        return totalPrice;
    }

    private double getTotalPayments(String bookingId) {
        double totalPayments = 0;
        try {
            String query = "SELECT SUM(PaymentAmount) FROM transactions WHERE BookingId = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, bookingId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                totalPayments = rs.getDouble(1);
            }
        } catch (SQLException e) {
            showError("Error fetching total payments: " + e.getMessage());
        }
        return totalPayments;
    }

     private void saveTransaction(double payment, double updatedBalance) {
        String bookingId = bookingIdField.getText().trim();
        try {
            String query = "INSERT INTO transactions (BookingId, PaymentAmount, Balance) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, bookingId);
            ps.setDouble(2, payment);
            ps.setDouble(3, updatedBalance);

            ps.executeUpdate();
        } catch (SQLException e) {
            showError("Error saving transaction: " + e.getMessage());
        }
    }

    private void logRefundTransaction(String bookingId, double refundAmount) throws SQLException {
        String query = "INSERT INTO transactions (BookingId, Date, PaymentAmount, RefundAmount, PaymentStatus) " +
                       "VALUES (?, NOW(), 0, ?, 'Refunded')";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, bookingId);
            stmt.setDouble(2, refundAmount);
            stmt.executeUpdate();
        }
    }

    private void updateBookingStatus(String bookingId, String status) throws SQLException {
        String query = "UPDATE booking SET Status = ? WHERE BookingId = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, status);
            stmt.setString(2, bookingId);
            stmt.executeUpdate();
        }
    }

    
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField balanceField;
    private javax.swing.JTextField bookingIdField;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField clientNameField;
    private javax.swing.JTextField downPaymentField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton payButton;
    private javax.swing.JTextField paymentField;
    private javax.swing.JButton searchBookingDetails;
    private javax.swing.JTextField totalPriceField;
    // End of variables declaration//GEN-END:variables
}
