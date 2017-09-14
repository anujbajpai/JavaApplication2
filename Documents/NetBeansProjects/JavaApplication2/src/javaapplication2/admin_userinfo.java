

package javaapplication2;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class admin_userinfo extends javax.swing.JFrame {
     DefaultTableModel dm;
     String f = "0";
  
    public admin_userinfo() {
        initComponents();
        setTable();
        getdata();
    }
     private void setTable() {  
        dm = new DefaultTableModel(0, 0);
        String s[] = new String[]{"username", "firstname", "lastname","age", "gender","country","passport", "mobile", "mail"};  
       
        dm.setColumnIdentifiers(s);  
        jTable1.setModel(dm);  
   }
     public void close() {
        WindowEvent winClosingEvent=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
     private void getdata() {
         Connection con;
     
         String s1 = null;
          s1 = "SELECT username, firstname, lastname,age, gender,country,passport, mobile, mail FROM userlogin where admin_flag = '"+f+"'";
          try {  
              
            con = Action.getDBConnection(); 
            PreparedStatement pst = con.prepareStatement(s1);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String user = rs.getString(1);
                String fir = rs.getString(2);
                String last = rs.getString(3);
                String agee = rs.getString(4);
                String gender = rs.getString(5);
                String count = rs.getString(6);
                String passp = rs.getString(7);
                String mob = rs.getString(8);
                String mai = rs.getString(9);
         Vector<String> display_flights = new Vector<String>();
        
             display_flights.add(user);
             display_flights.add(fir);
             display_flights.add(last);
             display_flights.add(agee);
             display_flights.add(gender);
             display_flights.add(count);
              display_flights.add(passp);
             display_flights.add(mob);
             display_flights.add(mai);
              dm.addRow(display_flights);
            }
            
          }
          catch (SQLException ex) {  
       Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);  
     } 
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 740, 280));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 88, 33));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Registered Users");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 190, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        admin_home ad = new admin_home();
        ad.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_userinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
