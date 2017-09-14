package javaapplication2;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
 import java.sql.Connection;  
 import java.sql.PreparedStatement;  
 import java.sql.ResultSet;  
 import java.sql.SQLException;  
 import java.util.Vector;  
 import java.util.logging.Level;  
 import java.util.logging.Logger;  
 import javax.swing.JOptionPane;  
 import static javax.swing.JOptionPane.showMessageDialog;
 import javax.swing.table.DefaultTableModel;
public class JdefaluttableDemo extends javax.swing.JFrame {
    DefaultTableModel dm; 
    String d1, custID, from_source, to_dest;
    int pass1, total_seats = 50, f1, t1, flag;
    public JdefaluttableDemo() {
        initComponents();   
    }
    public JdefaluttableDemo(int f, int t, String d, int passengers, String customerID, int fla) {
        initComponents();
        custID = customerID;
        flag = fla;
        this.f1 = f;
        this.t1 = t;
        this.d1 = d;
        pass1 = passengers;
        getValue();
        setTable();  
        getdata(); 
    }
    private void getValue() {
        String s3 = null, s4 = null;
        Connection con;
        s3 = "SELECT cityname FROM city_tab where cityid = ? ";
        s4 = "SELECT cityname FROM city_tab where cityid = ?";
        try {
            con = Action.getDBConnection(); 
            PreparedStatement pst = con.prepareStatement(s3); 
            PreparedStatement pst2 = con.prepareStatement(s4);
            pst.setInt (1, f1);
            pst2.setInt (1, t1);
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            if (rs.next()) {
                from_source = rs.getString(1);
            }
            if (rs2.next()) {
                to_dest = rs2.getString(1);
            }
        }
        catch (SQLException ex) {  
       Logger.getLogger(JdefaluttableDemo.class.getName()).log(Level.SEVERE, null, ex);  
     } 
    }
    public boolean isCellEditable(int row, int column){  
          return false;  
      }
    private void setTable() {  
        dm = new DefaultTableModel(0, 0);
        String s[] = new String[]{"flightID", "source", "dest", "depart", "arr", "price"};  
        dm.setColumnIdentifiers(s);  
        jTable1.setModel(dm);  
   }
    public void close() {
        WindowEvent winClosingEvent=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    private void getdata() {  
        String s1 = null, s2 = null; 
        int flag1 = 0;
        Connection con;
        s1 = "SELECT flight_id, depart, arr, price FROM flightdb t2 LEFT JOIN booking t1 ON t1.flightID = t2.flight_id WHERE t2.source = ? and t2.dest = ? and date = ? group by t1.flightID having (50 - sum(t1.num_seats)) >= ?" ;
        s2 = "SELECT flight_id, depart, arr, price FROM flightdb t2 LEFT JOIN booking t1 ON t1.flightID = t2.flight_id and t1.date = ? WHERE t2.source = ? and t2.dest = ? and t1.flightID IS NULL";
        try {  
        con = Action.getDBConnection();  
        PreparedStatement pst = con.prepareStatement(s1); 
        PreparedStatement pst2 = con.prepareStatement(s2);
        pst2.setString(1, d1);
        pst2.setInt(2, f1);
        pst2.setInt(3, t1);
        pst.setInt(1,f1);
        pst.setInt(2, t1);
        pst.setString(3, d1);
        pst.setInt(4, pass1);
        ResultSet rs = pst.executeQuery();
        ResultSet rs1 = pst2.executeQuery();
        while (rs.next()) {  
            String flightID = rs.getString(1);  
            String depar = rs.getString(2);
            String ar = rs.getString(3);
            int amt = rs.getInt(4);
            Vector<String> display_flights = new Vector<String>();
             String amt_str = Integer.toString(amt);
             display_flights.add(flightID);
             display_flights.add(from_source);
             display_flights.add(to_dest);
             display_flights.add(depar);
             display_flights.add(ar);
             display_flights.add(amt_str);
              dm.addRow(display_flights);
              flag1 =1;
         }
        while(rs1.next()){
            String flightID = rs1.getString(1);
            String depar = rs1.getString(2);
            String ar = rs1.getString(3);
            int amt = rs1.getInt(4);
            Vector<String> display_flights = new Vector<String>();
            String amt_str = Integer.toString(amt);
            display_flights.add(flightID);
            display_flights.add(from_source);
            display_flights.add(to_dest);
             display_flights.add(depar);
             display_flights.add(ar);
             display_flights.add(amt_str);
              dm.addRow(display_flights);
               flag1 =1;
        }
        if(flag1!= 1 )  {
            
                showMessageDialog(null, "No Flights");
                 close();
                plan1 s = new plan1(custID, flag);
                s.setVisible(true);
                
        }
           
       }
      catch (SQLException ex) {  
       Logger.getLogger(JdefaluttableDemo.class.getName()).log(Level.SEVERE, null, ex);  
     }  
   } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BOOK_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BOOK_button.setBackground(new java.awt.Color(204, 255, 204));
        BOOK_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BOOK_button.setText("BOOK");
        BOOK_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOOK_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(BOOK_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 112, 50));

        jTable1.setBackground(new java.awt.Color(255, 0, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 599, 130));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Flight Records");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 170, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 100, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/CLE_security11.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOOK_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOOK_buttonActionPerformed
       if (flag == 0) {
           flag = 1;
           showMessageDialog(null, "Login Required");
           close();
                  signup p = new signup(flag);
                  p.setVisible(true);
       }
       else{
        Connection con;
        String add = null;
        try{
           int row = jTable1.getSelectedRow();
           String Table_click = (jTable1.getModel().getValueAt(row,0).toString());
           String Table_click_price = (jTable1.getModel().getValueAt(row,5).toString());
           String departtime = (jTable1.getModel().getValueAt(row,3).toString());
           int click_price =Integer.parseInt(Table_click_price);
     
           close();
                  pass_info p = new pass_info(pass1, custID, Table_click, d1, click_price, from_source, to_dest, departtime);
                  p.setVisible(true);
              
        }catch(Exception e) {
            
        }
       }
        
    }//GEN-LAST:event_BOOK_buttonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        plan1 s = new plan1(custID ,flag);
        s.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new JdefaluttableDemo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOOK_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
