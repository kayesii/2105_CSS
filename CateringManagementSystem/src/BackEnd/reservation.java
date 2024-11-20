/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class reservation {

    private Connection getConnection() throws Exception {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "");
    }

    public void loadReservationsToTable(DefaultTableModel model) {
        try (Connection con = getConnection()) {
            String query = "SELECT r.ReservationID, r.ReservationDate, c.ClientName, c.ClientNumber, r.EventName, r.Status " +
                           "FROM reservation r " +
                           "INNER JOIN client c ON r.ClientID = c.ClientID";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            model.setRowCount(0); // Clear existing rows

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("ReservationID"),
                    rs.getString("ReservationDate"),
                    rs.getString("ClientName"),
                    rs.getString("ClientNumber"),
                    rs.getString("EventName"),
                    rs.getString("Status")
                });
            }
            
            rs.close();
            ps.close();
        } catch (Exception ex) {
            throw new RuntimeException("Error loading reservations: " + ex.getMessage());
        }
    }
    
    
    public boolean updateReservation(
        int reservationID,
        String clientName,
        String clientNumber,
        String eventName,
        String reservationDate,
        String status
    ) throws Exception {
        try (Connection con = getConnection()) {
            // Query to get the ClientID based on the ReservationID
            String getClientQuery = "SELECT ClientID FROM reservation WHERE ReservationID = ?";
            PreparedStatement psGetClient = con.prepareStatement(getClientQuery);
            psGetClient.setInt(1, reservationID);
            ResultSet rsClient = psGetClient.executeQuery();

            if (rsClient.next()) {
                // Get the ClientID from the reservation
                int clientID = rsClient.getInt("ClientID");

                // Update query for the client table
                String updateClientQuery = "UPDATE client SET ClientName = ?, ClientNumber = ? WHERE ClientID = ?";
                PreparedStatement psClient = con.prepareStatement(updateClientQuery);
                psClient.setString(1, clientName);
                psClient.setString(2, clientNumber);
                psClient.setInt(3, clientID);
                psClient.executeUpdate();

                // Update query for the reservation table
                String updateReservationQuery = "UPDATE reservation SET EventName = ?, ReservationDate = ?, Status = ? WHERE ReservationID = ?";
                PreparedStatement psReservation = con.prepareStatement(updateReservationQuery);
                psReservation.setString(1, eventName);
                psReservation.setString(2, reservationDate);
                psReservation.setString(3, status);
                psReservation.setInt(4, reservationID);
                psReservation.executeUpdate();

                // Close resources
                rsClient.close();
                psGetClient.close();
                psClient.close();
                psReservation.close();

                return true; // Success
            } else {
                return false; // ReservationID not found
            }
        }
    }
}
