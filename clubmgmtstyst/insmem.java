
package clubmgmtstyst;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class insmem extends javax.swing.JDialog {

    public insmem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public insmem(){
        initComponents();
        this.setSize(700,500);
        this.setResizable(false);
        this.setVisible(true);
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jf1 = new javax.swing.JTextField();
        jf2 = new javax.swing.JTextField();
        jf3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbs = new javax.swing.JButton();
        exi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("USN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 100, 130, 29);

        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 150, 130, 30);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(26, 207, 0, 0);

        jLabel4.setText("CID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 200, 150, 32);

        jf1.setText("ENTER");
        jf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jf1ActionPerformed(evt);
            }
        });
        getContentPane().add(jf1);
        jf1.setBounds(510, 100, 126, 20);

        jf2.setText("ENTER");
        jf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jf2ActionPerformed(evt);
            }
        });
        getContentPane().add(jf2);
        jf2.setBounds(510, 150, 126, 20);

        jf3.setText("ENTER ");
        jf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jf3ActionPerformed(evt);
            }
        });
        getContentPane().add(jf3);
        jf3.setBounds(510, 200, 126, 20);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setText("ENTER MEMBER DETAILS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(63, 20, 500, 33);

        jbs.setText("SUBMIT");
        jbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsActionPerformed(evt);
            }
        });
        getContentPane().add(jbs);
        jbs.setBounds(174, 360, 200, 23);

        exi.setText("DONE");
        exi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exiActionPerformed(evt);
            }
        });
        getContentPane().add(exi);
        exi.setBounds(430, 360, 210, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jf1ActionPerformed

    private void jbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsActionPerformed
         Connection conn = null;
         PreparedStatement pst=null;
      
   try{
   String sql="INSERT INTO `member`(`USN`, `Name`, `CID`) VALUES (?,?,?)";
   Class.forName("com.mysql.jdbc.Driver");
   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clbmgmt?zeroDateTimeBehavior=convertToNull","root","root");
   pst=conn.prepareStatement(sql);
   pst.setString(1,jf1.getText());
   pst.setString(2,jf2.getText());
   pst.setInt(3,Integer.parseInt(jf3.getText()));
   //pst.setString(4,jTextField1.getText());
   pst.execute();
   Success o=new Success();
   }catch (Exception ex) {
            System.out.println(ex);
   } 
   
    }//GEN-LAST:event_jbsActionPerformed

    private void jf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jf2ActionPerformed

    private void jf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jf3ActionPerformed

    private void exiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exiActionPerformed
         setVisible(false);
         CLUBMANAGER ob=new CLUBMANAGER();
         
    }//GEN-LAST:event_exiActionPerformed

    
    public static void open() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                insmem dialog = new insmem(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
               // dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbs;
    private javax.swing.JTextField jf1;
    private javax.swing.JTextField jf2;
    private javax.swing.JTextField jf3;
    // End of variables declaration//GEN-END:variables
}
