
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
        Totalpaid = new javax.swing.JTextField();
        searchField = new javax.swing.JTextField();
        backbutton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookingIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingIdFieldActionPerformed(evt);
            }
        });
        getContentPane().add(bookingIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 160, 30));

        jLabel2.setText("payment ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 50, 30));
        getContentPane().add(clientNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 160, 40));

        searchBookingDetails.setText("Search");
        searchBookingDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookingDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(searchBookingDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 80, 30));

        jLabel3.setText("Booking Id:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

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
        getContentPane().add(paymentField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 170, 30));

        jLabel8.setText("Balance");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 50, 30));

        cancel.setText("cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 120, 40));
        getContentPane().add(Totalpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 160, 40));

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 130, 30));

        backbutton.setText("back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        jLabel9.setText("Binayad");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 50, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookingIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingIdFieldActionPerformed

    private void searchBookingDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookingDetailsActionPerformed
    String searchInput = searchField.getText().trim();

if (searchInput.isEmpty()) {
    showError("Please provide a Booking ID or Client Name to search.");
    return;
}

try {
    String query = """
            SELECT b.BookingId, b.TotalPrice, b.Balance, b.PaidAmount, c.ClientName
            FROM booking b
            JOIN client c ON b.ClientId = c.ClientId
            WHERE b.BookingId = ? OR c.ClientName = ?""";
    PreparedStatement ps = con.prepareStatement(query);

    ps.setString(1, searchInput); // Use the same input for both BookingId and ClientName
    ps.setString(2, searchInput);

    ResultSet rs = ps.executeQuery();
    if (rs.next()) {
        // Retrieve values from the result set
        String bookingId = rs.getString("BookingId");
        String clientName = rs.getString("ClientName");
        double totalPrice = rs.getDouble("TotalPrice");
        double balance = rs.getDouble("Balance");
        double paidAmount = rs.getDouble("PaidAmount");
        double downPayment = totalPrice * 0.30; // Calculate 30% down payment

        // Populate the UI fields
        bookingIdField.setText(bookingId);
        clientNameField.setText(clientName);
        totalPriceField.setText(String.format("%.2f", totalPrice));
        downPaymentField.setText(String.format("%.2f", downPayment));
        balanceField.setText(String.format("%.2f", balance));
        Totalpaid.setText(String.format("%.2f", paidAmount));
    } else {
        showError("No booking found for the provided details.");
    }
} catch (SQLException e) {
    showError("Error retrieving booking details: " + e.getMessage());
}

    }//GEN-LAST:event_searchBookingDetailsActionPerformed
    
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
        double payment = Double.parseDouble(paymentField.getText().trim());
        if (payment <= 0) {
            showError("Please enter a valid payment amount.");
            return;
        }

        String bookingId = bookingIdField.getText().trim();
        if (bookingId.isEmpty()) {
            showError("Please enter a valid Booking ID.");
            return;
        }

        String selectQuery = "SELECT PaidAmount, Balance FROM booking WHERE BookingId = ?";
        PreparedStatement psSelect = con.prepareStatement(selectQuery);
        psSelect.setString(1, bookingId);
        
        ResultSet rs = psSelect.executeQuery();
        if (rs.next()) {
            double currentPaidAmount = rs.getDouble("PaidAmount");
            double currentBalance = rs.getDouble("Balance");
            double updatedPaidAmount = currentPaidAmount + payment;
            double remainingBalance = currentBalance - payment;

            if (remainingBalance < 0) {
                showError("Payment exceeds the balance.");
                return;
            }

            String updateQuery = "UPDATE booking SET Balance = ?, PaidAmount = ?, PaymentStatus = ? WHERE BookingId = ?";
            PreparedStatement psUpdate = con.prepareStatement(updateQuery);
            psUpdate.setDouble(1, remainingBalance);
            psUpdate.setDouble(2, updatedPaidAmount);
            psUpdate.setString(3, (remainingBalance == 0) ? "Paid" : "Partial");
            psUpdate.setString(4, bookingId);

            int rowsUpdated = psUpdate.executeUpdate();
            if (rowsUpdated > 0) {
                // Record payment in the transactions table
                saveTransaction(bookingId, payment);

                showSuccess("Payment successful!");
                balanceField.setText(String.format("%.2f", remainingBalance));
                paymentField.setText("");
            } else {
                showError("Failed to update payment status.");
            }
        } else {
            showError("Booking not found.");
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
        // Query to get the total price and paid amount for the booking
        String query = "SELECT TotalPrice, PaidAmount FROM booking WHERE BookingId = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, bookingId);

        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            double totalPrice = rs.getDouble("TotalPrice");
            double originalPaidAmount = rs.getDouble("PaidAmount");

            // 20% cancellation fee from the total price
            double cancellationFee = totalPrice * 0.20; // 20% of the TotalPrice

            // Refund amount is the original PaidAmount minus the cancellation fee
            double refundAmount = originalPaidAmount - cancellationFee;

            // Update the booking with the new PaidAmount (which is the cancellation fee)
            String updateQuery = "UPDATE booking SET PaidAmount = ?, Balance = 0, PaymentStatus = 'Refunded' WHERE BookingId = ?";
            PreparedStatement updatePs = con.prepareStatement(updateQuery);
            updatePs.setDouble(1, cancellationFee); // Set PaidAmount to the cancellation fee
            updatePs.setString(2, bookingId);

            int rowsUpdated = updatePs.executeUpdate();
            if (rowsUpdated > 0) {
                // Record the cancellation transaction in the transactions table
                saveTransaction(bookingId, cancellationFee); // Save the cancellation fee as the transaction amount

                showSuccess("Booking has been cancelled. Refund amount: ₱" + String.format("%.2f", refundAmount));
            } else {
                showError("Failed to update booking.");
            }
        } else {
            showError("Booking not found. Please check the Booking ID.");
        }
    } catch (SQLException e) {
        showError("Error cancelling booking: " + e.getMessage());
    }
    }//GEN-LAST:event_cancelActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

private void saveTransaction(String bookingId, double amount) {
    try {
        // Get the current date using LocalDate
        String currentDate = java.time.LocalDate.now().toString();  // Format: YYYY-MM-DD
        
        // Insert query with manually set date
        String insertQuery = "INSERT INTO transactions (BookingId, date, paymentAmount) VALUES (?, ?, ?)";
        PreparedStatement psInsert = con.prepareStatement(insertQuery);
        psInsert.setString(1, bookingId);  // Setting bookingId
        psInsert.setString(2, currentDate); // Setting current date
        psInsert.setDouble(3, amount);      // Setting paymentAmount

        int rowsInserted = psInsert.executeUpdate();
        if (rowsInserted <= 0) {
            showError("Failed to record transaction.");
        }
    } catch (SQLException e) {
        showError("Error recording transaction: " + e.getMessage());
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
    private javax.swing.JTextField Totalpaid;
    private javax.swing.JButton backbutton;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton payButton;
    private javax.swing.JTextField paymentField;
    private javax.swing.JButton searchBookingDetails;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField totalPriceField;
    // End of variables declaration//GEN-END:variables
}
