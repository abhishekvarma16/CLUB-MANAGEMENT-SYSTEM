
package clubmgmtstyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class deletecsmem extends javax.swing.JDialog {

 
    public deletecsmem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setVisible(true);
        this.setSize(30,30);
        setResizable(false);
    }
public deletecsmem(){
      initComponents();
      this.setVisible(true);
        this.setSize(360,420);
        setResizable(false);
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        identer = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("REMOVE MEMBER?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 20, 380, 47);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("SPECIFY THE USER ID OF THE MEMBER");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 70, 290, 40);

        identer.setText("ENTER ID");
        getContentPane().add(identer);
        identer.setBounds(140, 120, 150, 40);

        jButton1.setText("DONE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 190, 150, 40);

        jButton2.setText("EXIT");
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 190, 160, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\mini.jpe")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 460, 320);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 230, 460, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     

        int val=Integer.parseInt(identer.getText()); 
        String s = "DELETE FROM `member info` WHERE `MEMBERID` = '"+val+"'";
      
        Statement stmt = null;
        Connection con = null; 
        try {
            con = DriverManager.getConnection("Connection");
            stmt = con.createStatement();
            throw new UnsupportedOperationException("Not supported yet");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"Connection Error",JOptionPane.WARNING_MESSAGE);
        }
        try {
            stmt.executeUpdate(s);
            con.close();
            JOptionPane.showMessageDialog(null,"Deleted Succesfully","Delete Successful",JOptionPane.WARNING_MESSAGE);
            throw new UnsupportedOperationException("Not supported yet");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

     public  void appear(){
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                deletecsmem dialog = new deletecsmem(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
  

    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField identer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
