
package dao;

import javax.swing.JOptionPane;

public class tables {
    public static void main(String[] args){
        try{
            String userTable = "CREATE TABLE user ("
        + "id INT AUTO_INCREMENT PRIMARY KEY, "
        + "name VARCHAR(200), "
        + "email VARCHAR(200), "
        + "phoneNumber VARCHAR(200), "
        + "password VARCHAR(200), "
        + "UNIQUE(email)"
        + ")";
        DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
