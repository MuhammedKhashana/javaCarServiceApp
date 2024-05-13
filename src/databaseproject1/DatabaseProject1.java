/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databaseproject1;

//import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author CompuMall
 */
public class DatabaseProject1 {

    /**
     * @param args the command line arguments
     */
    
    
    void createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "khashana44Wlv");
////          THIS HOW TO CREATE STATMENT AND GET DATA  
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from users");
////            while there is one more than one row
//            while (rs.next()) {                
//                String name = rs.getString("userName");
//                System.out.println(name);
//            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseProject1.class.getName()).log(Level.SEVERE, null, ex);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseProject1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        DatabaseProject1 pro = new DatabaseProject1();
        pro.createConnection();
        AdminLogin al = new AdminLogin();
        al.setVisible(true);
    }
}
