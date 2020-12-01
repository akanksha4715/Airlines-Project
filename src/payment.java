
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class payment extends javax.swing.JFrame {

    /**
     * Creates new form payment
     */
    public payment() {
        initComponents();
    }
    public payment(int para,String date){
    initComponents();
    int b=para;
   jTextField3.setText(Integer.toString(b));
   txtamt.setText(Integer.toString(b));
   jTextField1.setText(date);
   }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        radcred = new javax.swing.JRadioButton();
        raddaeb = new javax.swing.JRadioButton();
        radnetbank = new javax.swing.JRadioButton();
        lblnum = new javax.swing.JLabel();
        txtnum = new javax.swing.JTextField();
        lblbank = new javax.swing.JLabel();
        radicici = new javax.swing.JRadioButton();
        radhdfc = new javax.swing.JRadioButton();
        radsbi = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        txtamt = new javax.swing.JTextField();
        lblaccnum = new javax.swing.JLabel();
        txtaccnum = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("SELECT MODE OF PAYMENT:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 146, -1, 28));

        buttonGroup1.add(radcred);
        radcred.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        radcred.setText("CREDIT CARD");
        radcred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radcredActionPerformed(evt);
            }
        });
        getContentPane().add(radcred, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 146, -1, -1));

        buttonGroup1.add(raddaeb);
        raddaeb.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        raddaeb.setText("DEBIT CARD");
        raddaeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raddaebActionPerformed(evt);
            }
        });
        getContentPane().add(raddaeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 186, 199, -1));

        buttonGroup1.add(radnetbank);
        radnetbank.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        radnetbank.setText("NET BANKING");
        radnetbank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radnetbankActionPerformed(evt);
            }
        });
        getContentPane().add(radnetbank, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        lblnum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblnum.setText("ENTER CARD NUMBER:");
        lblnum.setEnabled(false);
        getContentPane().add(lblnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 321, -1, -1));

        txtnum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtnum.setEnabled(false);
        getContentPane().add(txtnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 318, 212, -1));

        lblbank.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblbank.setText("CHOOSE BANK:");
        lblbank.setEnabled(false);
        getContentPane().add(lblbank, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 385, -1, -1));

        radicici.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        radicici.setText("ICICI BANK");
        radicici.setEnabled(false);
        radicici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiciciActionPerformed(evt);
            }
        });
        getContentPane().add(radicici, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 381, -1, -1));

        radhdfc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        radhdfc.setText("HDFC BANK");
        radhdfc.setEnabled(false);
        getContentPane().add(radhdfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 415, 164, -1));

        radsbi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        radsbi.setText("SBI ");
        radsbi.setEnabled(false);
        getContentPane().add(radsbi, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 449, 164, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("PAY");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 160, 40));

        txtamt.setEditable(false);
        txtamt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtamt.setText("20000");
        getContentPane().add(txtamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 41, 250, 40));

        lblaccnum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblaccnum.setText("ENETER ACCOUNT NUMBER:");
        lblaccnum.setEnabled(false);
        getContentPane().add(lblaccnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 539, -1, -1));

        txtaccnum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtaccnum.setEnabled(false);
        getContentPane().add(txtaccnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 536, 212, -1));

        jTextField3.setText("jTextField3");
        jTextField3.setOpaque(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("YOUR NET AMOUNT:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 270, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("DATE OF JOURNEY:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 250, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("PRINT TICKET");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 160, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void raddaebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raddaebActionPerformed
        lblnum.setEnabled(true);
        txtnum.setEnabled(true);
        jButton1.setEnabled(true);
        lblbank.setEnabled(false);
        radicici.setEnabled(true);
        radhdfc.setEnabled(true);
        radsbi.setEnabled(true);
        lblaccnum.setEnabled(false);
        txtaccnum.setEnabled(false);
    }//GEN-LAST:event_raddaebActionPerformed

    private void radcredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radcredActionPerformed
        lblnum.setEnabled(true);
        txtnum.setEnabled(true);
        jButton1.setEnabled(true);
        lblbank.setEnabled(false);
        radicici.setEnabled(true);
        radhdfc.setEnabled(true);
        radsbi.setEnabled(true);
        lblaccnum.setEnabled(false);
        txtaccnum.setEnabled(false);
    }//GEN-LAST:event_radcredActionPerformed

    private void radnetbankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radnetbankActionPerformed
        lblnum.setEnabled(false);
        txtnum.setEnabled(false);
        jButton1.setEnabled(true);
        lblbank.setEnabled(true);
        radicici.setEnabled(true);
        radhdfc.setEnabled(true);
        radsbi.setEnabled(true);
        lblaccnum.setEnabled(true);
        txtaccnum.setEnabled(true);
    }//GEN-LAST:event_radnetbankActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String b=  txtnum.getText();
        if(radicici.isSelected()== false && radhdfc.isSelected()==false && radsbi.isSelected()==false)
        {
            JOptionPane.showMessageDialog(null,"Choose your bank");
        }
        int l=b.length();
      String a=  txtamt.getText();
      if(l!=16 && (radcred.isSelected()==true || raddaeb.isSelected()==true) )
      {
          JOptionPane.showMessageDialog(null,"Invalid Card Number");
          txtnum.setText("");
          radicici.setSelected(false);
          radhdfc.setSelected(false);
          radsbi.setSelected(false);
          radcred.setSelected(false);
          raddaeb.setSelected(false);
          radnetbank.setSelected(false);
      }
      else
      {  JOptionPane.showMessageDialog(null,"Amount "+a+" is paid!");
           jButton1.setEnabled(false);
           txtnum.setText("");
           radicici.setEnabled(false);
        radhdfc.setEnabled(false);
        radsbi.setEnabled(false);
        radicici.setEnabled(false);
        radhdfc.setEnabled(false);
        radcred.setEnabled(false);
        raddaeb.setEnabled(false);
        radnetbank.setEnabled(false);
        txtnum.setEnabled(false);
        txtaccnum.setEnabled(false);
      //  if(l==16 && (radhdfc.isSelected()==true || radicici.isSelected()==true || radsbi.isSelected()==true) )
      //{
          jButton2.setEnabled(true);
      }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radiciciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiciciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiciciActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new view_booking().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblaccnum;
    private javax.swing.JLabel lblbank;
    private javax.swing.JLabel lblnum;
    private javax.swing.JRadioButton radcred;
    private javax.swing.JRadioButton raddaeb;
    private javax.swing.JRadioButton radhdfc;
    private javax.swing.JRadioButton radicici;
    private javax.swing.JRadioButton radnetbank;
    private javax.swing.JRadioButton radsbi;
    private javax.swing.JTextField txtaccnum;
    private javax.swing.JTextField txtamt;
    private javax.swing.JTextField txtnum;
    // End of variables declaration//GEN-END:variables
}
