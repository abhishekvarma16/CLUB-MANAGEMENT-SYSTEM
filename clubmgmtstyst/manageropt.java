
package clubmgmtstyst;


public class manageropt extends javax.swing.JFrame {

  
    public manageropt() {
        initComponents();
        this.setVisible(true);
        this.setSize(640,500);
        this.setResizable(false);
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("WHICH CLUB DO YOU MANAGE?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(103, 25, 536, 86);

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color2"));
        jButton1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color2"));
        jButton1.setText("AI CLUB");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 130, 170, 47);

        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color2"));
        jButton2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color2"));
        jButton2.setText("ML CLUB");
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 200, 170, 47);

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color2"));
        jButton3.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color2"));
        jButton3.setText("ROBOTICS CLUB");
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 280, 170, 47);

        jButton4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color2"));
        jButton4.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color2"));
        jButton4.setText("AUTOMOBILE CLUB");
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 360, 170, 47);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CLUBMANAGER cb=new CLUBMANAGER();
        
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageropt().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
