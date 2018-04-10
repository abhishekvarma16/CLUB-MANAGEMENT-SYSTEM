
package clubmgmtstyst;

import java.sql.*;
import java.awt.*;
import java.awt.Image;
import javax.swing.ImageIcon;


public class CLUBMANAGER extends javax.swing.JFrame {

    public CLUBMANAGER() {
        initComponents();
        this.setVisible(true);
        this.setSize(1360,768);
        this.setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1360, 768));
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setText("REMOVE MEMBER FROM CLUB");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 290, 223, 44);

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setText("VIEW THE MEMBERS OF THE CLUB");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 360, 197, 44);

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(190, 430, 223, 44);

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setText("ADD MEMBER TO THE PROJECT");
        getContentPane().add(jButton5);
        jButton5.setBounds(330, 220, 230, 50);

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setText("REMOVE MEMBER FROM PROJECT");
        getContentPane().add(jButton6);
        jButton6.setBounds(330, 290, 230, 50);

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setText("MEMBERS WORKING FOR PROJECT");
        getContentPane().add(jButton7);
        jButton7.setBounds(330, 354, 203, 50);

        jLabel3.setBackground(new java.awt.Color(0, 0, 255));
        jLabel3.setFont(new java.awt.Font("FangSong", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("COMPUTER SCIENCE CLUB");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 100, 680, 110);

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("WELCOME BACK,MANAGER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 10, 490, 80);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setText("ADD MEMBER TO CLUB");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 220, 220, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    insmem o=new insmem();  
     o.open();
    this.setVisible(true);
     setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Connection conn = null;
       int count=0;
     /*  dispview dpv=new dispview();
       dpv.showd();*/
      // PreparedStatement pst=null;
           try{
 //  String sql="INSERT INTO `member info`(`MEMBER NAME`, `MEMBERID`, `phno`) VALUES (?,?,?)";
 /*  Class.forName("com.mysql.jdbc.Driver");
   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clubmgmtst?zeroDateTimeBehavior=convertToNull","root","root");
   Statement stmt=conn.createStatement();
   
   String clb="cs";
   stmt.execute("SELECT * FROM `member info` WHERE club= '"+clb+"'");
   ResultSet rs=stmt.getResultSet();
   while(rs.next()){
        System.out.println(rs.getString(1));
       count++;
   }*/
    tablecsview dio=new tablecsview();
  
    
   }catch (Exception ex) {
            System.out.println(ex);
   }     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       deletecsmem de=new deletecsmem();
      
       
    }//GEN-LAST:event_jButton2ActionPerformed
    //
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
//jLabel5.setIcon(new ImageIcon(img));
}
