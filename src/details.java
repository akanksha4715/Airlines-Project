
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
public class details extends javax.swing.JFrame {

    /**
     * Creates new form details
     */
    public details() {
        initComponents();
    }

    public details(String date) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    initComponents();
    jTextField1.setText(date);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        radmale = new javax.swing.JRadioButton();
        radfemale = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtpnr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("NAME:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 143, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("AGE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 316, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("GENDER:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 363, -1, -1));

        txtfname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 182, 260, 36));

        txtage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });
        getContentPane().add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 317, 260, -1));

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, -1, -1));

        buttonGroup1.add(radmale);
        radmale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        radmale.setText("MALE");
        radmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radmaleActionPerformed(evt);
            }
        });
        getContentPane().add(radmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 260, -1));

        buttonGroup1.add(radfemale);
        radfemale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        radfemale.setText("FEMALE");
        radfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radfemaleActionPerformed(evt);
            }
        });
        getContentPane().add(radfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 260, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("ADD DETAILS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("FIRST NAME:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 189, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("LAST NAME:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 251, -1, -1));

        txtlname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 245, 260, 35));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("PNR:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        txtpnr.setEditable(false);
        txtpnr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtpnr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpnrActionPerformed(evt);
            }
        });
        getContentPane().add(txtpnr, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 260, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("(will be autogenerated)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 481, -1, -1));

        jTextField1.setEnabled(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 10, 0));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void radfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radfemaleActionPerformed
       int a=(int)((Math.random()*(999-100))+100);
        txtpnr.setText(Integer.toString(a));
    }//GEN-LAST:event_radfemaleActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        String fname=txtfname.getText();
        String lname=txtlname.getText();
        String name=fname+" "+lname;
        String gen="";
       String age=txtage.getText();    
        String date  = jTextField1.getText();
        if(radmale.isSelected())
         {
              gen="male";
         }
         else
         {
             gen="female";
         }
        if(fname.equals(""))
        {
            JOptionPane.showMessageDialog(null,"PLEASE ENTER YOUR FIRST NAME");
        }
        if(txtage.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"PLEASE ENTER AGE");
        }
        if(lname.equals(""))
        {
            JOptionPane.showMessageDialog(null,"PLEASE ENTER YOUR LAST NAME");
        }
        if(radmale.isSelected()==false && radfemale.isSelected()==false )
        {
            JOptionPane.showMessageDialog(null,"PLEASE SELECT GENDER");
        }
        else
        {   int pnr=(int)((Math.random()*(9999-1000))+1000);
            
        String pnr1=txtpnr.getText();
        try
               {
                      Class.forName("java.sql.DriverManager");
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lufthansa","root","root");
                  Statement stmt =con.createStatement();

                  String q1="insert into reservations(pnr,name,age,gender,date) values ('"+pnr1+"','"+name+"','"+age+"','"+gen+"','"+date+"');";
                   stmt.executeUpdate(q1);
                   }
             catch(Exception e)
              {
                    JOptionPane.showMessageDialog(this,e.getMessage());
                 }
        {
        JOptionPane.showMessageDialog(this,"RECORD INSERTED");
                   }
        this.dispose();
        
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new reserve().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       this.getContentPane().setBackground(Color.ORANGE); 
    }//GEN-LAST:event_formWindowOpened

    private void txtpnrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpnrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpnrActionPerformed

    private void radmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radmaleActionPerformed
        int a=(int)((Math.random()*(999-100))+100);
        txtpnr.setText(Integer.toString(a));
    }//GEN-LAST:event_radmaleActionPerformed

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
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton radfemale;
    private javax.swing.JRadioButton radmale;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtpnr;
    // End of variables declaration//GEN-END:variables
}