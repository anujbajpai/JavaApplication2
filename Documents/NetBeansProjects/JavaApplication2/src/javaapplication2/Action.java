
package javaapplication2;
 import java.sql.Connection;  
 import java.sql.DriverManager;  
 import java.sql.SQLException;  
 import java.util.logging.Level;  
 import java.util.logging.Logger;
public class Action {
    public static Connection getDBConnection() {  
     Connection conn = null;  
     try {  
         Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost/user","root","phoenix");
            return conn;
     }
     catch (SQLException ex) {  
       Logger.getLogger(Action.class.getName()).log(Level.SEVERE, null, ex);  
     } catch (ClassNotFoundException ex) {  
       Logger.getLogger(Action.class.getName()).log(Level.SEVERE, null, ex);  
     }
     return conn;
    }
     
       
    }
