/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uasrezky;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class loginuser extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public loginuser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usr = new javax.swing.JTextField();
        psw = new javax.swing.JPasswordField();
        butusr = new javax.swing.JButton();
        keluar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(204, 204, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 399, -1, -1));

        usr.setBorder(null);
        usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrActionPerformed(evt);
            }
        });
        getContentPane().add(usr, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 260, 50));
        usr.setBackground(new java.awt.Color(0,0,0,1));

        psw.setBorder(null);
        getContentPane().add(psw, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 260, 50));
        psw.setBackground(new java.awt.Color(0,0,0,1));

        butusr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butusrActionPerformed(evt);
            }
        });
        getContentPane().add(butusr, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 300, 50));
        butusr.setOpaque(false);
        butusr.setContentAreaFilled(false);
        butusr.setBorderPainted(false);

        keluar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar1ActionPerformed(evt);
            }
        });
        getContentPane().add(keluar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 530, 90, 90));
        keluar1.setOpaque(false);
        keluar1.setContentAreaFilled(false);
        keluar1.setBorderPainted(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/user.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrActionPerformed

    private void butusrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butusrActionPerformed
        if(usr.getText().equals("user")&& psw.getText().equals("123")){
            new menuuser1().show();
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"Masukkan Username dan Password dengan benar");}
    }//GEN-LAST:event_butusrActionPerformed

    private void keluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar1ActionPerformed
        new thanks().show();
        this.dispose();
    }//GEN-LAST:event_keluar1ActionPerformed

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
            java.util.logging.Logger.getLogger(loginuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butusr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton keluar1;
    private javax.swing.JPasswordField psw;
    private javax.swing.JTextField usr;
    // End of variables declaration//GEN-END:variables
}
