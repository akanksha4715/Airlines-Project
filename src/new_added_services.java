
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
public class new_added_services extends javax.swing.JFrame {

    /**
     * Creates new form new_added_services
     */
    public new_added_services() {
        initComponents();
    }
   //public new_added_services(int a){
   // initComponents();
  // jTextField1.setText(Integer.toString(a));
  // jTextField1.setText(Integer.toString(a));
   
  // }

  

    public new_added_services(int a, int billamt, String date) {
        initComponents();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    jTextField3.setText(date);
    jTextField1.setText(Integer.toString(a));
   jTextField2.setText(Integer.toString(billamt));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        btnbill = new javax.swing.JButton();
        txtbill = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        radyes = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        radno = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("SERVICES AVAILABLE");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("FOOD");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("SELECT FROM THE");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("LIST OF FOOD ITEMS:-");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Burritto Bowl         ₹300", " ", "Veg Biryani            ₹200", " ", "Rava Upma           ₹100", " ", "Cup Noodles         ₹200", " ", "Fruit Platter           ₹300", " ", "Cheese omelette   ₹190", " ", "Paneer Sandwich   ₹120", " ", "Brisket Chilli           ₹180", " ", "Cobb Salad            ₹100", " ", "Viennese Schnitzel ₹350", " ", "Curry Chicken        ₹300", " ", "Yogurt Bars            ₹110", " ", "Loco Moco              ₹190", " ", "Sirloin Sandwhich   ₹200" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 200, 300));

        btnbill.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnbill.setText("Show Bill Amount:");
        btnbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbillActionPerformed(evt);
            }
        });
        getContentPane().add(btnbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, -1, -1));

        txtbill.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbillActionPerformed(evt);
            }
        });
        getContentPane().add(txtbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 160, 50));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setText("INSURANCE");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        radyes.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radyes);
        radyes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        radyes.setText("Yes,Secure My Trip With");
        radyes.setOpaque(false);
        radyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radyesActionPerformed(evt);
            }
        });
        getContentPane().add(radyes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 320, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("₹499");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Per Person");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("I Accept All The Terms And Conditions");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, 40));

        radno.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radno);
        radno.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        radno.setText("I Will Risk My Trip");
        radno.setOpaque(false);
        getContentPane().add(radno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("<<BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 140, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("PROCEED TO PAYMENT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, 250, 50));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("HOME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 110, 50));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Insurance.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("₹");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 30, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pulao better.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 130, 50, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 60, -1));

        jLabel7.setText("total passangers:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        jTextField3.setText("jTextField3");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbillActionPerformed

    private void radyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radyesActionPerformed

    }//GEN-LAST:event_radyesActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      new home_page().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbillActionPerformed
        int total=0;
        if(list.isSelectedIndex(0))
        {
            total=total+300;
        }
        if(list.isSelectedIndex(2))
        {
            total=total+200;
        }
        if(list.isSelectedIndex(4))
        {
            total=total+100;
        }
        if(list.isSelectedIndex(6))
        {
            total=total+200;
        }
        if(list.isSelectedIndex(8))
        {
            total=total+300;
        }
        if(list.isSelectedIndex(10))
        {
            total=total+190;
        }
        if(list.isSelectedIndex(12))
        {
            total=total+120;
        }
        if(list.isSelectedIndex(14))
        {
            total=total+180;
        }
        if(list.isSelectedIndex(16))
        {
            total=total+100;
        }
        if(list.isSelectedIndex(18))
        {
            total=total+350;
        }
        if(list.isSelectedIndex(20))
        {
            total=total+300;
        }
        if(list.isSelectedIndex(22))
        {
            total=total+110;
        }
        if(list.isSelectedIndex(24))
        {
            total=total+190;
        }if(list.isSelectedIndex(26))
        {
            total=total+200;
        }
        txtbill.setText(""+total);
    }//GEN-LAST:event_btnbillActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new reserve().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int a=Integer.parseInt(jTextField1.getText()),ins=0;
        int total=Integer.parseInt(txtbill.getText());
        int billamt=Integer.parseInt(jTextField2.getText());
        if(radyes.isSelected()==true)
        {
             ins=a*149;
        }
        else
        {
            ins=0;
        }
        int amt=ins+total+billamt;
        String date = jTextField3.getText();
         new payment(amt,date).setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(new_added_services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(new_added_services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(new_added_services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(new_added_services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_added_services().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbill;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JList<String> list;
    private javax.swing.JRadioButton radno;
    private javax.swing.JRadioButton radyes;
    private javax.swing.JTextField txtbill;
    // End of variables declaration//GEN-END:variables
}
