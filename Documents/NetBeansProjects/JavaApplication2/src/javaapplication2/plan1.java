package javaapplication2;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.text.DateFormat;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class plan1 extends javax.swing.JFrame {
int flag;
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String customerID;
    public plan1() {
        initComponents();
    }
    public plan1(String textFieldValue, int f) {
        initComponents();
        flag = f;
        customerID = textFieldValue;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","phoenix");
            String s = "select * from city_tab";
            pst = con.prepareStatement(s);
            rs = pst.executeQuery(s);    
            while(rs.next()) {
                if(((DefaultComboBoxModel)ComboBoxfrom.getModel()).getIndexOf(rs.getString(2)) == -1)
                ComboBoxfrom.addItem(rs.getString(2));
            }
            rs.close();
        }
        catch(Exception e) {
            showMessageDialog(null,e);
        }
    }
    public void close() {
        WindowEvent winClosingEvent=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        ComboBoxfrom = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        date_var = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Comboboxto = new javax.swing.JComboBox();
        num_pass = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboBoxfrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxfromItemStateChanged(evt);
            }
        });
        ComboBoxfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxfromActionPerformed(evt);
            }
        });
        jPanel2.add(ComboBoxfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 78, 35));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("To");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 53, -1));
        jPanel2.add(date_var, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 125, 29));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Tickets");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, 33));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Search flight");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 365, 159, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Plan your travel");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 185, 35));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("From");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 53, 35));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Date of Journey");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 137, 31));

        jPanel2.add(Comboboxto, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 90, 33));

        num_pass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        jPanel2.add(num_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 75, 29));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/nn.jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 466, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
              
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String from = ComboBoxfrom.getSelectedItem().toString();
        String x = String.valueOf(ComboBoxfrom.getSelectedIndex());
        String to   = Comboboxto.getSelectedItem().toString();
        String y = String.valueOf(Comboboxto.getSelectedIndex());
        int f_in = Integer.parseInt(x);
        int t_in = Integer.parseInt(y);
        java.util.Date date = date_var.getDate();
        String strDate = DateFormat.getDateInstance().format(date);
        int seats = Integer.parseInt(num_pass.getSelectedItem().toString());
        if(t_in >= f_in)
            t_in +=1;
        close();
        JdefaluttableDemo s = new JdefaluttableDemo(f_in, t_in, strDate, seats, customerID, flag);     
        s.setVisible(true);            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboBoxfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxfromActionPerformed
    
    }//GEN-LAST:event_ComboBoxfromActionPerformed

    private void ComboBoxfromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxfromItemStateChanged
        Connection con1;
        ResultSet rs1;
        PreparedStatement pst1;
        Comboboxto.removeAllItems();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/user","root","phoenix");
            String s = "select * from city_tab";
            pst1 = con1.prepareStatement(s);
            rs1 = pst1.executeQuery(s);    
            while(rs1.next()) {
                if(((DefaultComboBoxModel)Comboboxto.getModel()).getIndexOf(rs1.getString(2)) == -1) {
                    String temp_from =  (String) ComboBoxfrom.getSelectedItem();
                   if(!rs1.getString(2).equals(temp_from))
                    Comboboxto.addItem(rs1.getString(2));
                }
            }
            rs1.close();
        }
        catch(Exception e) {
            showMessageDialog(null,e);
        
        }              
    }//GEN-LAST:event_ComboBoxfromItemStateChanged

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(plan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(plan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(plan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(plan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new plan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox ComboBoxfrom;
    public static javax.swing.JComboBox Comboboxto;
    private com.toedter.calendar.JDateChooser date_var;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JComboBox num_pass;
    // End of variables declaration//GEN-END:variables
}

