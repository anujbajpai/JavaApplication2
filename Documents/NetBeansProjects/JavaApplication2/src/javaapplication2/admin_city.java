
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
public class admin_city extends javax.swing.JFrame {
     DefaultTableModel dm;
     String id = null;
   
    public admin_city() {
        initComponents();
        setTable();
        getdata();
    }

    private void setTable() {  
        dm = new DefaultTableModel(0, 0);
        String s[] = new String[]{"cityid","cityname"};  
       
        dm.setColumnIdentifiers(s);  
        jTable1.setModel(dm);  
   }
     private void getdata() {
         Connection con;
     
         String s1 = null;
          s1 = "SELECT cityid, cityname FROM city_tab";
          try {  
            con = Action.getDBConnection(); 
            PreparedStatement pst = con.prepareStatement(s1);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String cityID = rs.getString(1);
                String name = rs.getString(2);
          
         Vector<String> display_flights = new Vector<String>();
         
             display_flights.add(cityID);
             display_flights.add(name);
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
             String sql = "select  * from city_tab";
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
        add_btn = new javax.swing.JButton();
        idbt = new javax.swing.JTextField();
        namebt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 570, 210));

        add_btn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        getContentPane().add(add_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 90, 30));
        getContentPane().add(idbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 313, 67, -1));
        getContentPane().add(namebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 313, 76, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 153, 90, 30));

        btn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn.setText("Delete");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 213, 90, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("CITY ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 316, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("CITY NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 316, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 83, 31));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("City Database");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 160, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        if(add()) {
            upd_tab();
            showMessageDialog(null, "Row Inserted");
              idbt.setText("");
              namebt.setText("");
        }      
    }//GEN-LAST:event_add_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String f =  idbt.getText();
            String s = namebt.getText();
           
        Connection conn;
        String sql = "update city_tab set cityid ='"+f+"',cityname ='"+s+"'   where cityid = '"+id+"' ";
        try {  
        conn = Action.getDBConnection(); 
        PreparedStatement pst3 = conn.prepareStatement(sql);
            
             pst3.executeUpdate();
        }
        catch(Exception e) {
            showMessageDialog(null, e);
        }
        showMessageDialog(null, "Row Updated");
        idbt.setText("");
              namebt.setText("");
              
upd_tab();        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
           String fid = (jTable1.getModel().getValueAt(row,0).toString());
           String sou = (jTable1.getModel().getValueAt(row,1).toString());
          
           idbt.setText(fid);
           namebt.setText(sou);
            
           id = fid;     
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
         String sql = "Delete from city_tab where cityid = '"+id+"'  ";    
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
        idbt.setText("");
              namebt.setText("");
              
         upd_tab();       
    }//GEN-LAST:event_btnActionPerformed
    public void close() {
        WindowEvent winClosingEvent=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         close();
        admin_home ad = new admin_home();
        ad.setVisible(true);           
    }//GEN-LAST:event_jButton2ActionPerformed
     private boolean add() {
        Connection conn;
        String sql = "INSERT INTO city_tab values (?,?)";
        try {  
        conn = Action.getDBConnection(); 
        PreparedStatement pst3 = conn.prepareStatement(sql);
            pst3.setString(1,idbt.getText());
            pst3.setString(2,namebt.getText());
          
             pst3.executeUpdate();
             return true;
              
              
        }
        catch(Exception e) {
            showMessageDialog(null, "Row not Inserted");
        }
        return false;
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_city().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton btn;
    private javax.swing.JTextField idbt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField namebt;
    // End of variables declaration//GEN-END:variables
}
