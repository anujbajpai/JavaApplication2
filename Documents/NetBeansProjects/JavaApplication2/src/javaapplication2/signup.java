
package javaapplication2;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class signup extends javax.swing.JFrame {
int flag = 0;
String userflag = "0";
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public signup() {
        initComponents();
    }
    public signup(int f) {
        initComponents();
        flag = f;
    }
    public void close() {
        WindowEvent winClosingEvent=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Textpasport = new javax.swing.JTextField();
        Text_country = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Text_age = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Text_last = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Text_mail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Button_proceed = new javax.swing.JButton();
        Text_login = new javax.swing.JTextField();
        combosex = new javax.swing.JComboBox();
        Text_first = new javax.swing.JTextField();
        Text_mobile = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jTextField7.setText("jTextField7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Textpasport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextpasportActionPerformed(evt);
            }
        });
        jPanel1.add(Textpasport, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 239, 109, -1));

        Text_country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_countryActionPerformed(evt);
            }
        });
        jPanel1.add(Text_country, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 247, 109, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Paasport ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 234, 110, 30));
        jPanel1.add(Text_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 178, 33, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Age");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 173, 80, 30));
        jPanel1.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 392, 109, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("First Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, 90, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Mobile ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 315, 80, 30));
        jPanel1.add(Text_last, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 106, 109, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Sex");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 173, 80, 30));

        Text_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_mailActionPerformed(evt);
            }
        });
        jPanel1.add(Text_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 321, 109, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Country");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, 80, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel11.setText("SIGN UP");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 140, 38));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("E-Mail");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 314, 80, 34));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Login ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 387, 80, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 387, 80, 30));

        Button_proceed.setBackground(new java.awt.Color(204, 255, 204));
        Button_proceed.setText("Proceed");
        Button_proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_proceedActionPerformed(evt);
            }
        });
        jPanel1.add(Button_proceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 90, 30));

        Text_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_loginActionPerformed(evt);
            }
        });
        jPanel1.add(Text_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 392, 109, -1));

        combosex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE", "OTHERS" }));
        jPanel1.add(combosex, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 171, -1, 35));
        jPanel1.add(Text_first, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 106, 109, -1));

        Text_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_mobileActionPerformed(evt);
            }
        });
        jPanel1.add(Text_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 320, 109, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Last Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 101, 100, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/45.jpg"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text_countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_countryActionPerformed

    private void Text_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_mobileActionPerformed

    private void Text_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_loginActionPerformed

    private void TextpasportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextpasportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextpasportActionPerformed

    private void Text_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_mailActionPerformed

    private void Button_proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_proceedActionPerformed
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","phoenix");
            pst = con.prepareStatement("insert into userlogin values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(3,Text_first.getText());
            pst.setString(4,Text_last.getText());
            pst.setString(5,Text_age.getText());
            pst.setString(6, (String) combosex.getSelectedItem());
            pst.setString(7,Text_country.getText());
            pst.setString(8,Textpasport.getText());
            pst.setString(9,Text_mobile.getText());
            pst.setString(10,Text_mail.getText());
            pst.setString(1,Text_login.getText());
            pst.setString(2,jPasswordField.getText());
            pst.setString(11,userflag);
            String textFieldValue = Text_login.getText();
            int i =pst.executeUpdate();
           if (i>0) {
                close();
                plan1 s = new plan1(textFieldValue, flag);
                s.setVisible(true);
            
           }
            else{
               showMessageDialog(null, "not login");
            }
            
        }catch(Exception e){
            showMessageDialog(null, e);
            
        }
        
    }//GEN-LAST:event_Button_proceedActionPerformed
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_proceed;
    private javax.swing.JTextField Text_age;
    private javax.swing.JTextField Text_country;
    private javax.swing.JTextField Text_first;
    private javax.swing.JTextField Text_last;
    private javax.swing.JTextField Text_login;
    private javax.swing.JTextField Text_mail;
    private javax.swing.JTextField Text_mobile;
    private javax.swing.JTextField Textpasport;
    private javax.swing.JComboBox combosex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
