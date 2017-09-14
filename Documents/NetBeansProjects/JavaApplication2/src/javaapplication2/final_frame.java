
package javaapplication2;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;


public class final_frame extends javax.swing.JFrame {
Connection conn = null;
String source1,destination1, time_d;
Vector<String> store_name = new Vector<String>();
  
    public final_frame() {
        initComponents();
        
    }
    public final_frame(String bookID,String flightI,String date_in, String So,String de, String desttime, int amt ) {
        initComponents();
        String sql = null;
        time_d = desttime;
        source1 = So;
        destination1 = de;
        sql = "SELECT pass_name from passenger_tab where bookingID = ?";
        
        try{
            conn = Action.getDBConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, bookID);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next())  {
                String pass = rs.getString(1);
                store_name.add(pass);
            }
        }
        catch(Exception e){
            showMessageDialog(null, e);
            
        }
        if(store_name.size() >=1) {
            //String t = store_name.get(0);
            pass1.setText(store_name.get(0)+" / ");
            if(store_name.size() >= 2) {
                //String t = store_name.get(1);
                pass2.setText(store_name.get(1)+" / ");
                if(store_name.size() >= 3) {
                    pass3.setText(store_name.get(2)+" / ");
                    if(store_name.size() >= 4) {
                        pass4.setText(store_name.get(3)+" / ");
                        if(store_name.size() >= 5) {
                            pass5.setText(store_name.get(4)+" / ");
                            if(store_name.size() >= 6) {
                                pass6.setText(store_name.get(5)+" / ");
                            }
                        } 
                    }
                }
            }
        }
        from_lab.setText(source1);
        to_lab.setText(destination1);
        date_lab1.setText(date_in);
        id_lab1.setText(flightI);
        jLabel8.setText( time_d);
        String am = String.valueOf(amt);
        amt_lab.setText(am);
        
    }
    public void close() {
        WindowEvent winClosingEvent=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pass1 = new javax.swing.JLabel();
        pass2 = new javax.swing.JLabel();
        pass3 = new javax.swing.JLabel();
        pass4 = new javax.swing.JLabel();
        pass5 = new javax.swing.JLabel();
        pass6 = new javax.swing.JLabel();
        from_lab = new javax.swing.JLabel();
        to_lab = new javax.swing.JLabel();
        date_lab = new javax.swing.JLabel();
        id_lab = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        date_lab1 = new javax.swing.JLabel();
        id_lab1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        amt_lab = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ticket Details");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 31, 249, 29));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Name of Passengers =>");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 112, 150, 25));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("From");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 123, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("To");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Flight Id");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 57, 23));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Departure Time");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 123, 23));
        jPanel1.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 70, 25));
        jPanel1.add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 112, 70, 26));
        jPanel1.add(pass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 116, 70, 22));
        jPanel1.add(pass4, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 116, 70, 22));
        jPanel1.add(pass5, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 116, 70, 22));
        jPanel1.add(pass6, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 116, 70, 22));
        jPanel1.add(from_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 90, 22));
        jPanel1.add(to_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 80, 20));
        jPanel1.add(date_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 270, -1, 25));
        jPanel1.add(id_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 328, -1, 24));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 70, 23));
        jPanel1.add(date_lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 80, 20));
        jPanel1.add(id_lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 70, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Amount");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 70, 20));
        jPanel1.add(amt_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 404, 60, 20));

        jButton1.setBackground(new java.awt.Color(153, 153, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Thank You");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 120, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/airbus-a321-my-austrian--austrian-airlines.jpg.3148170.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();      
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new final_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amt_lab;
    private javax.swing.JLabel date_lab;
    private javax.swing.JLabel date_lab1;
    private javax.swing.JLabel from_lab;
    private javax.swing.JLabel id_lab;
    private javax.swing.JLabel id_lab1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pass1;
    private javax.swing.JLabel pass2;
    private javax.swing.JLabel pass3;
    private javax.swing.JLabel pass4;
    private javax.swing.JLabel pass5;
    private javax.swing.JLabel pass6;
    private javax.swing.JLabel to_lab;
    // End of variables declaration//GEN-END:variables
}
