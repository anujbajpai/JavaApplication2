
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
public class booking extends javax.swing.JFrame {
         DefaultTableModel dm;
    
    public booking() {
        initComponents();
        setTable();
        getdata();
    }
    private void setTable() {  
        dm = new DefaultTableModel(0, 0);
        String s[] = new String[]{"custid","flightID", "date", "num_seats","amount", "bookingID"};  
       
        dm.setColumnIdentifiers(s);  
        jTable1.setModel(dm);  
   }
     private void getdata() {
         Connection con;
     
         String s1 = null;
          s1 = "SELECT custid,flightID, date, num_seats,amount, bookingID FROM booking";
          try {  
            con = Action.getDBConnection(); 
            PreparedStatement pst = con.prepareStatement(s1);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String cus = rs.getString(1);
                String fid = rs.getString(2);
                String date = rs.getString(3);
                String num = rs.getString(4);
          String amt = rs.getString(5);
                String bid = rs.getString(6);
         Vector<String> display_flights = new Vector<String>();
         
             display_flights.add(cus);
             display_flights.add(fid);
             display_flights.add(date);
             display_flights.add(num);
             display_flights.add(amt);
             display_flights.add(bid);
              dm.addRow(display_flights);
            }
            
          }
          catch (SQLException ex) {  
       Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);  
     } 
     }
     private void upd_tab() {
         Connection conn;
         conn = Action.getDBConnection();
         try{
             String sql = "select  * from booking";
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery();
             jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         }
         catch(Exception e) {
             
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

        jTable1.setBackground(new java.awt.Color(255, 0, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 80, 710, 290));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 83, 35));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Booking Table");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 14, 230, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void close() {
        WindowEvent winClosingEvent=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        admin_home ad = new admin_home();
        ad.setVisible(true);        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking().setVisible(true);
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
