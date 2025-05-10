
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

        jPanel1 = new javax.swing.JPanel();
        clientNameField = new javax.swing.JTextField();
        bookingIdField = new javax.swing.JTextField();
        searchField = new javax.swing.JTextField();
        additionalFeeField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        paymentField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Totalpaid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        balanceField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        downPaymentField = new javax.swing.JTextField();
        totalPriceField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchBookingDetails = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        addtional = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        payButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(210, 180, 140));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(clientNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 200, 30));

        bookingIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingIdFieldActionPerformed(evt);
            }
        });
        jPanel1.add(bookingIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 200, 30));

        searchField.setText("Booking Id or Client Name");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        jPanel1.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 240, 40));
        jPanel1.add(additionalFeeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 200, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Addtional Charge");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 120, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel10.setText("Payment Amount");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 30));
        jPanel1.add(paymentField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 200, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("Payment Paid");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 90, 30));
        jPanel1.add(Totalpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 200, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setText("Balance");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 50, 30));

        balanceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceFieldActionPerformed(evt);
            }
        });
        jPanel1.add(balanceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 200, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setText("Down Payment");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 100, 30));

        downPaymentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downPaymentFieldActionPerformed(evt);
            }
        });
        jPanel1.add(downPaymentField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 200, 30));

        totalPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceFieldActionPerformed(evt);
            }
        });
        jPanel1.add(totalPriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 200, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Total Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Client Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("₱");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 20, 30));

        searchBookingDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search (1).png"))); // NOI18N
        searchBookingDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookingDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(searchBookingDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 50, 40));

        jLabel17.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel17.setText("M");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 40, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jLabel18.setText("AKE");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 50, -1));

        jLabel15.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel15.setText("a");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 40, -1));

        jLabel16.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel16.setText("P");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 40, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jLabel14.setText("AYMENT");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 100, -1));

        addtional.setBackground(new java.awt.Color(205, 133, 63));
        addtional.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addtional.setText("Charge");
        addtional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtionalActionPerformed(evt);
            }
        });
        jPanel1.add(addtional, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 130, 30));

        cancel.setBackground(new java.awt.Color(205, 133, 63));
        cancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancel.setText("Refund");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 130, 30));

        backbutton.setBackground(new java.awt.Color(205, 133, 63));
        backbutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backbutton.setText("Return");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 130, 30));

        payButton.setBackground(new java.awt.Color(205, 133, 63));
        payButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        payButton.setText("Confrim Payment");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });
        jPanel1.add(payButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 130, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("Booking Id");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setText("₱");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 20, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setText("₱");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 20, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel13.setText("₱");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 20, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel19.setText("₱");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 20, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel20.setText("₱");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 20, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
                saveTransaction(bookingId, payment, 0); // Regular payment (refundAmount = 0)

                showSuccess("Payment successful!");
                balanceField.setText(String.format("%.2f", remainingBalance));
                paymentField.setText("");
                 Totalpaid.setText(String.format("%.2f", updatedPaidAmount));
                
            } else {
                showError("Failed to update payment status.");
            }
        } else {
            showError("Booking not found.");
        }
    } catch (SQLException e) {
        showError("Error processing payment: " + e.getMessage());
    } catch (NumberFormatException e) {
        showError("Invalid payment amount.");
    }
    }//GEN-LAST:event_payButtonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

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

        // Calculate 20% cancellation fee and refund amount
        double cancellationFee = totalPrice * 0.20; // 20% of the TotalPrice
        double refundAmount = originalPaidAmount - cancellationFee;

        // Display refund amount and cancellation fee to the user
        int confirm = JOptionPane.showConfirmDialog(
            null,
            "Cancellation Fee: ₱" + String.format("%.2f", cancellationFee) +
            "\nRefund Amount: ₱" + String.format("%.2f", refundAmount) +
            "\n\nAre you sure you want to proceed?",
            "Confirm Cancellation",
            JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            // Update the booking with the new PaidAmount and RefundAmount
            String updateQuery = "UPDATE booking SET PaidAmount = ?, Balance = 0, PaymentStatus = 'Refunded', RefundAmount = ? WHERE BookingId = ?";
            PreparedStatement updatePs = con.prepareStatement(updateQuery);
            updatePs.setDouble(1, cancellationFee); // Set PaidAmount to the cancellation fee
            updatePs.setDouble(2, refundAmount); // Set RefundAmount in booking table
            updatePs.setString(3, bookingId);

            int rowsUpdated = updatePs.executeUpdate();
            if (rowsUpdated > 0) {
                // Record the cancellation transaction in the transactions table
                saveTransaction(bookingId, 0, refundAmount); // For a refund (paymentAmount = 0, refundAmount = refundAmount)

                showSuccess("Booking has been cancelled. Refund amount: ₱" + String.format("%.2f", refundAmount));
            } else {
                showError("Failed to update booking.");
            }
        } else {
            showInfo("Cancellation process was aborted.");
        }
    } else {
        showError("Booking not found. Please check the Booking ID.");
    }
} catch (SQLException e) {
    showError("Error cancelling booking: " + e.getMessage());
}

   
    }//GEN-LAST:event_cancelActionPerformed

    private void balanceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceFieldActionPerformed

    private void downPaymentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downPaymentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downPaymentFieldActionPerformed

    private void totalPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceFieldActionPerformed

    private void bookingIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingIdFieldActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

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

    private void addtionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtionalActionPerformed
       try {
        // Parse and validate the additional fee
        double additionalFee = Double.parseDouble(additionalFeeField.getText().trim());
        if (additionalFee <= 0) {
            showError("Please enter a valid additional fee amount.");
            return;
        }

        // Validate the Booking ID
        String bookingId = bookingIdField.getText().trim();
        if (bookingId.isEmpty()) {
            showError("Please enter a valid Booking ID.");
            return;
        }

        // Retrieve current balance and total price from the database
        String selectQuery = "SELECT Balance, TotalPrice FROM booking WHERE BookingId = ?";
        PreparedStatement psSelect = con.prepareStatement(selectQuery);
        psSelect.setString(1, bookingId);
        
        ResultSet rs = psSelect.executeQuery();
        if (rs.next()) {
            double currentBalance = rs.getDouble("Balance");
            double currentTotalPrice = rs.getDouble("TotalPrice");

            // Calculate updated values
            double updatedBalance = currentBalance + additionalFee;
            double updatedTotalPrice = currentTotalPrice + additionalFee;

            // Update balance and total price in the database
            String updateQuery = "UPDATE booking SET Balance = ?, TotalPrice = ? WHERE BookingId = ?";
            PreparedStatement psUpdate = con.prepareStatement(updateQuery);
            psUpdate.setDouble(1, updatedBalance);
            psUpdate.setDouble(2, updatedTotalPrice);
            psUpdate.setString(3, bookingId);

            int rowsUpdated = psUpdate.executeUpdate();
            if (rowsUpdated > 0) {
                // Optionally record the addition in the transactions table
                saveTransaction(bookingId, 0, additionalFee); // No payment, only additional fee

                // Update UI and show success message
                showSuccess("Additional fee added successfully!");
                balanceField.setText(String.format("%.2f", updatedBalance));
                totalPriceField.setText(String.format("%.2f", updatedTotalPrice));
                additionalFeeField.setText("");
            } else {
                showError("Failed to update balance and total price.");
            }
        } else {
            showError("Booking not found.");
        }
    } catch (SQLException e) {
        showError("Error processing additional fee: " + e.getMessage());
    } catch (NumberFormatException e) {
        showError("Invalid additional fee amount.");
    }

    }//GEN-LAST:event_addtionalActionPerformed
private void saveTransaction(String bookingId, double paymentAmount, double refundAmount) {
    try {
        // Insert payment or refund into the transactions table
        String query = "INSERT INTO transactions (BookingId, Date, PaymentAmount, RefundAmount) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, bookingId); // Booking ID
        ps.setDate(2, new java.sql.Date(System.currentTimeMillis())); // Current date
        ps.setDouble(3, paymentAmount); // Payment amount
        ps.setDouble(4, refundAmount); // Refund amount (0 for regular payments, or actual refund value)

        int rowsAffected = ps.executeUpdate();  // Execute the insert

        if (rowsAffected > 0) {
            System.out.println("Transaction recorded successfully.");
        }

        // Close resources
        ps.close();
    } catch (SQLException e) {
        e.printStackTrace();
        showError("Error saving transaction: " + e.getMessage());
    }
}

private void showInfo(String message) {
    JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE);
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
    private javax.swing.JTextField additionalFeeField;
    private javax.swing.JButton addtional;
    private javax.swing.JButton backbutton;
    private javax.swing.JTextField balanceField;
    private javax.swing.JTextField bookingIdField;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField clientNameField;
    private javax.swing.JTextField downPaymentField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton payButton;
    private javax.swing.JTextField paymentField;
    private javax.swing.JButton searchBookingDetails;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField totalPriceField;
    // End of variables declaration//GEN-END:variables
}
