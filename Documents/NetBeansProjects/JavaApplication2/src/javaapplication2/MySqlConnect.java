

package javaapplication2;

import java.sql.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class MySqlConnect {
    Connection conn = null;
    public static Connection ConnectDb(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/user","root","phoenix");
            return conn;
        }
        catch(Exception e) {
            showMessageDialog(null,e);
            return null;
        }
    }
}
