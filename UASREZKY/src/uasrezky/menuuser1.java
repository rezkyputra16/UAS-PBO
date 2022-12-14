/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uasrezky;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class menuuser1 extends javax.swing.JFrame {

    private void tampil_data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Buku");
        model.addColumn("Judul");
        model.addColumn("Penerbit");
        model.addColumn("Jumlah Halaman");
    
    try{
        String sql = "SELECT * FROM buku";
        java.sql.Connection conn = (Connection)Connect.getKoneksi();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet res = stm.executeQuery(sql);
    
        while (res.next()){
            model.addRow(new Object[]{res.getString(1),
                                      res.getString(2),
                                      res.getString(3),
                                      res.getString(4)});
        }
        tabeldata10.setModel(model);
    } catch (SQLException e){
        System.out.println("Error : " + e.getMessage());
    }}
    public menuuser1() {
        initComponents();
        tampil_data();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata10 = new javax.swing.JTable();
        butkembali = new javax.swing.JButton();
        butrefresh = new javax.swing.JButton();
        tabeldata5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(864, 634));
        setMinimumSize(new java.awt.Dimension(864, 634));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabeldata10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabeldata10);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 650, 350));

        butkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(butkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 200, 50));
        butkembali.setOpaque(false);
        butkembali.setContentAreaFilled(false);
        butkembali.setBorderPainted(false);
        getContentPane().add(butrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 200, 50));
        butrefresh.setOpaque(false);
        butrefresh.setContentAreaFilled(false);
        butrefresh.setBorderPainted(false);

        tabeldata5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/DAFTAR.png"))); // NOI18N
        getContentPane().add(tabeldata5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 635));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butkembaliActionPerformed
        new loginuser().show();
        this.dispose();
        
    }//GEN-LAST:event_butkembaliActionPerformed

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
            java.util.logging.Logger.getLogger(menuuser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuuser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuuser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuuser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuuser1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butkembali;
    private javax.swing.JButton butrefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeldata10;
    private javax.swing.JLabel tabeldata5;
    // End of variables declaration//GEN-END:variables
}
