/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controls_DB;

import Controls_DB.DB_CSSConnection;
import java.sql.Connection;


public class Main {
    
    public static void main(String[] args) {
        Connection conn = DB_CSSConnection.getConnection();
        
        if (conn != null) {
            System.out.println("Connected to css_db successfully!");
        } else {
            System.out.println("Failed to connect to css_db.");
        }
    }
}
