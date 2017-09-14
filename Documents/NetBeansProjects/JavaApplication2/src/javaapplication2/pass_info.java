

package javaapplication2;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;

public class pass_info extends javax.swing.JFrame {
    int pass_num, amount;
    String cusID, flightI, date_in, randm, sourc, destin, dt;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement psti = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    PreparedStatement pst3 = null;
    PreparedStatement pst4 = null;
    PreparedStatement pst5 = null;

    public pass_info() {
        initComponents();
    }
    public pass_info(int num_pass, String custID, String flight, String dat, int click_price, String sour, String desti, String dtime) throws SQLException {
        initComponents();
        sourc = sour;
        destin = desti;
         cusID = custID;
         dt = dtime;
         flightI = flight;
         date_in = dat;
         amount = click_price*num_pass;
           age1.setEnabled(false);
           age2.setEnabled(false);
           age3.setEnabled(false);
           age4.setEnabled(false);
           age5.setEnabled(false);
           age6.setEnabled(false);
         text1.setEnabled(false);
        text2.setEnabled(false);
        text3.setEnabled(false);
        text4.setEnabled(false);
        text5.setEnabled(false);
        text6.setEnabled(false);
        pass_num = num_pass;
        if(pass_num >= 1) {
            text1.setEnabled(true);
            age1.setEnabled(true);
            if(pass_num >= 2) {
                text2.setEnabled(true);
                age2.setEnabled(true);
                if(pass_num >= 3) {
                text3.setEnabled(true);
                age3.setEnabled(true);
                if(pass_num >= 4) {
                text4.setEnabled(true);
                age4.setEnabled(true);
                if(pass_num >= 5) {
                text5.setEnabled(true);
                age5.setEnabled(true);
                if(pass_num >= 6) {
                text6.setEnabled(true);
                age6.setEnabled(true);
                }
            }
            }
            }
            }
        }

     String all = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";   
     StringBuilder all_build = new StringBuilder();
     Random rnd = new Random();
     while(all_build.length() <= 4) {
         int index = (int) (rnd.nextFloat() * all.length());
         all_build.append(all.charAt(index));
     }
     randm = all_build.toString();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text1 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text5 = new javax.swing.JTextField();
        text6 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        age1 = new javax.swing.JTextField();
        age2 = new javax.swing.JTextField();
        age3 = new javax.swing.JTextField();
        age4 = new javax.swing.JTextField();
        age5 = new javax.swing.JTextField();
        age6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });
        getContentPane().add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 113, 95, 28));
        getContentPane().add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 285, 95, 28));

        text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text2ActionPerformed(evt);
            }
        });
        getContentPane().add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 178, 95, 28));
        getContentPane().add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 331, 95, 28));
        getContentPane().add(text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 394, 95, 28));
        getContentPane().add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 237, 95, 28));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Proceed  To Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 170, 50));
        getContentPane().add(age1, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 113, 95, 28));
        getContentPane().add(age2, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 178, 95, 28));
        getContentPane().add(age3, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 237, 95, 28));
        getContentPane().add(age4, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 285, 95, 28));

        age5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age5ActionPerformed(evt);
            }
        });
        getContentPane().add(age5, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 331, 95, 28));
        getContentPane().add(age6, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 394, 95, 28));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Enter Passenger Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 11, 262, 41));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 24, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 24, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 24, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("4");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 24, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("5");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 24, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("6");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 24, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Name");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 62, 74, 23));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Age");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 63, 50, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/6.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-16, -6, 840, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

    private void text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text2ActionPerformed
    public void store() {
        conn = Action.getDBConnection();
        try{
            psti = conn.prepareStatement("insert into booking values(?,?,?,?,?,?)");
            psti.setString(1,cusID);
            psti.setString(2,flightI);
            psti.setString(3,date_in);
            psti.setInt(4, pass_num);
            psti.setInt(5, amount);
            psti.setString(6, randm);
            psti.executeUpdate();
        }
        catch(Exception e){
            showMessageDialog(null, e);
            
        }
    }
    public void close() {
        WindowEvent winClosingEvent=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conn = Action.getDBConnection();
        try {
        if (pass_num >= 1) {
            
            pst = conn.prepareStatement("insert into passenger_tab (pass_name,pass_age, cust_id, bookingID) values(?,?, ?,?)");
            
            pst.setString(1,text1.getText());
            pst.setString(2,age1.getText());
            pst.setString(3, cusID);
            pst.setString(4,randm);
           
            pst.executeUpdate();
            
        
        if (pass_num >= 2) {
            
            pst1 = conn.prepareStatement("insert into passenger_tab (pass_name, pass_age, cust_id, bookingID) values(?,?,?,?)");
            pst1.setString(1,text2.getText());
            pst1.setString(2,age2.getText());
            pst1.setString(3, cusID);
            pst1.setString(4,randm);
             pst1.executeUpdate();
        if (pass_num >= 3) {
            
            pst2 = conn.prepareStatement("insert into passenger_tab (pass_name, pass_age, cust_id, bookingID) values(?,?,?,?)");
            pst2.setString(1,text3.getText());
            pst2.setString(2,age3.getText());
            pst2.setString(3, cusID); 
            pst2.setString(4,randm);
            pst2.executeUpdate();
            if (pass_num >= 4) {
            
            pst3 = conn.prepareStatement("insert into passenger_tab (pass_name, pass_age, cust_id, bookingID) values(?,?,?,?)");
            pst3.setString(1,text4.getText());
            pst3.setString(2,age4.getText());
            pst3.setString(3,cusID);
            pst3.setString(4,randm);
             pst3.executeUpdate();
            if (pass_num >= 5) {
            
            pst4 = conn.prepareStatement("insert into passenger_tab (pass_name, pass_age, cust_id, bookingID) values(?,?,?,?)");
            pst4.setString(1,text5.getText());
            pst4.setString(2,age5.getText());
            pst4.setString(3,cusID);
            pst4.setString(4,randm);
            pst4.executeUpdate();
            if (pass_num == 6) {
            
            pst5 = conn.prepareStatement("insert into passenger_tab (pass_name,pass_age, cust_id, bookingID) values(?,?,?,?)");
            pst5.setString(1,text6.getText());
            pst5.setString(2,age6.getText());
            pst5.setString(3,cusID);
            pst5.setString(4,randm);
             pst5.executeUpdate();
        }
        }
        }
        }
        }
        }
        store();
        
                close();
                final_frame s = new final_frame(randm, flightI,date_in, sourc, destin, dt, amount);
                s.setVisible(true);
            
           
        }
catch(Exception e){
            showMessageDialog(null, e);
            
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void age5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age5ActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pass_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age1;
    private javax.swing.JTextField age2;
    private javax.swing.JTextField age3;
    private javax.swing.JTextField age4;
    private javax.swing.JTextField age5;
    private javax.swing.JTextField age6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    private javax.swing.JTextField text6;
    // End of variables declaration//GEN-END:variables
}
