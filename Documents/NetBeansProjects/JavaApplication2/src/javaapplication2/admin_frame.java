
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

public class admin_frame extends javax.swing.JFrame {
    DefaultTableModel dm;
    String id = null;
    
    public admin_frame() {
        initComponents();
        setTable();
        getdata();
    }
    private void setTable() {  
        dm = new DefaultTableModel(0, 0);
        String s[] = new String[]{"flightID", "source", "dest", "depart", "arr", "price"};  
        
        dm.setColumnIdentifiers(s);  
        jTable1.setModel(dm);  
   }
     private void getdata() {
         Connection con;
     
         String s1 = null;
          s1 = "SELECT flight_id,source, dest, depart, arr, price FROM flightdb";
          try {  
            con = Action.getDBConnection(); 
            PreparedStatement pst = con.prepareStatement(s1);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String flightID = rs.getString(1);
                String sour = rs.getString(2);
                String dest = rs.getString(3);
        
         String depar = rs.getString(4);
         String ar = rs.getString(5);
         String pric = rs.getString(6);
        
         Vector<String> display_flights = new Vector<String>();
         
             display_flights.add(flightID);
             display_flights.add(sour);
             display_flights.add(dest);
             display_flights.add(depar);
             display_flights.add(ar);
             display_flights.add(pric);
             
              dm.addRow(display_flights);
            }
            
          }
          catch (SQLException ex) {  
       Logger.getLogger(admin_frame.class.getName()).log(Level.SEVERE, null, ex);  
     } 
     }
     private void upd_tab() {
         Connection conn;
         conn = Action.getDBConnection();
         try{
             String sql = "select  * from flightdb";
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
        flightid = new javax.swing.JTextField();
        depart = new javax.swing.JTextField();
        source = new javax.swing.JTextField();
        arr = new javax.swing.JTextField();
        desti = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(255, 0, 204));
        jTable1.setForeground(new java.awt.Color(255, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 640, 230));
        getContentPane().add(flightid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 69, -1));
        getContentPane().add(depart, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 69, -1));
        getContentPane().add(source, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 65, -1));
        getContentPane().add(arr, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 65, -1));
        getContentPane().add(desti, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 60, -1));
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 60, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 80, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 80, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 80, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Flight ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 60, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Source");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 49, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Destination");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 80, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Departs");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("arrival");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 106, 34));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Flight Database");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 180, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private boolean add() {
        Connection conn;
        String sql = "INSERT INTO flightdb values (?,?,?,?,?,?)";
        try {  
        conn = Action.getDBConnection(); 
        PreparedStatement pst3 = conn.prepareStatement(sql);
            pst3.setString(1,flightid.getText());
            pst3.setString(2,source.getText());
            pst3.setString(3,desti.getText());
            pst3.setString(4,depart.getText());
            pst3.setString(5,arr.getText());
            pst3.setString(6,price.getText());
             pst3.executeUpdate();
             return true;
              //dm.fireTableDataChanged(); 
              
        }
        catch(Exception e) {
            showMessageDialog(null, "Row not Inserted");
        }
        return false;
        
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(add()) {
            upd_tab();
            showMessageDialog(null, "Row Inserted");
              flightid.setText("");
              depart.setText("");
              source.setText("");
              arr.setText("");
              desti.setText("");
              price.setText("");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String f =  flightid.getText();
            String s = source.getText();
            String d = desti.getText();
            String de = depart.getText();
           String arri = arr.getText();
           String p = price.getText();
        Connection conn;
        String sql = "update flightdb set flight_id ='"+f+"',source ='"+s+"',dest = '"+d+"',depart = '"+de+"',arr = '"+arri+"', price = '"+p+"'   where flight_id = '"+id+"' ";
        try {  
        conn = Action.getDBConnection(); 
        PreparedStatement pst3 = conn.prepareStatement(sql);
            
             pst3.executeUpdate();
        }
        catch(Exception e) {
            showMessageDialog(null, e);
        }
        showMessageDialog(null, "Row Updated");
        flightid.setText("");
              depart.setText("");
              source.setText("");
              arr.setText("");
              desti.setText("");
              price.setText("");
upd_tab();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
           String fid = (jTable1.getModel().getValueAt(row,0).toString());
           String sou = (jTable1.getModel().getValueAt(row,1).toString());
           String dest = (jTable1.getModel().getValueAt(row,2).toString());
           String dep = (jTable1.getModel().getValueAt(row,3).toString());
           String arr1 = (jTable1.getModel().getValueAt(row,4).toString());
           String price1 = (jTable1.getModel().getValueAt(row,5).toString());
           flightid.setText(fid);
           source.setText(sou);
           desti.setText(dest);
           depart.setText(dep);
           arr.setText(arr1);
           price.setText(price1); 
           id = fid;
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String sql = "Delete from flightdb where flight_id = '"+id+"'  ";    
         Connection conn;
         try{
             conn = Action.getDBConnection();
             PreparedStatement pst3 = conn.prepareStatement(sql);
              pst3.executeUpdate();
         }
         catch(Exception e) {
            showMessageDialog(null, e);
        }
         showMessageDialog(null, "Row Deleted");
        flightid.setText("");
              depart.setText("");
              source.setText("");
              arr.setText("");
              desti.setText("");
              price.setText("");
         upd_tab();
    }//GEN-LAST:event_jButton3ActionPerformed
    public void close() {
        WindowEvent winClosingEvent=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         close();
        admin_home ad = new admin_home();
        ad.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arr;
    private javax.swing.JTextField depart;
    private javax.swing.JTextField desti;
    private javax.swing.JTextField flightid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField source;
    // End of variables declaration//GEN-END:variables
}
