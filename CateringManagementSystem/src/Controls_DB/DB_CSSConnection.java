/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controls_DB;

import java.sql.DriverManager;
import java.sql.SQLException;
import Controls_DB.DB_CSSConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DB_CSSConnection {
    
    public static Connection getConnection(){
        
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connection details
            String url = "jdbc:mysql://localhost:3306/css_db"; 
            String user = "root"; 
            String password = ""; 

            return DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            
            return null;
        }
    }
    
}
