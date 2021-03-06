/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.border.LineBorder;

/**
 *
 * @author 20171174010023
 */
public class MainMenu_1 extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu_1() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setSize(450, 420);
        this.setLocationRelativeTo(null);

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
        btnSimples = new javax.swing.JButton();
        btnComposto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DINK");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("HP Simplified Light", 0, 24)); // NOI18N
        jLabel1.setText("      Bem-Vindo a Calculadora de Juros");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 450, 70);

        btnSimples.setBackground(new java.awt.Color(239, 239, 239));
        btnSimples.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/s100x100.png"))); // NOI18N
        btnSimples.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnSimples.setBorderPainted(false);
        btnSimples.setContentAreaFilled(false);
        btnSimples.setDefaultCapable(false);
        btnSimples.setFocusPainted(false);
        btnSimples.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSimplesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSimplesMouseExited(evt);
            }
        });
        btnSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimplesActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimples);
        btnSimples.setBounds(60, 180, 110, 110);

        btnComposto.setBackground(new java.awt.Color(239, 239, 239));
        btnComposto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/c100x100.png"))); // NOI18N
        btnComposto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnComposto.setBorderPainted(false);
        btnComposto.setContentAreaFilled(false);
        btnComposto.setFocusPainted(false);
        btnComposto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCompostoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCompostoMouseExited(evt);
            }
        });
        btnComposto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompostoActionPerformed(evt);
            }
        });
        getContentPane().add(btnComposto);
        btnComposto.setBounds(280, 180, 110, 110);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 0, 20)); // NOI18N
        jLabel2.setText("Escolha uma opção:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 110, 230, 21);

        btnSair.setBackground(new java.awt.Color(178, 34, 34));
        btnSair.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(225, 225, 225));
        btnSair.setText("Sair");
        btnSair.setBorderPainted(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(300, 330, 128, 39);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo-de-mosaico-geometrico-de-cor-cinza-abstrato_1055-3132.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 450, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimplesActionPerformed
        new JurosSimplesSDI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSimplesActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCompostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompostoActionPerformed
        new JurosCompostosSDI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCompostoActionPerformed

    private void btnSimplesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimplesMouseEntered
        //btnSimples.setBackground(new Color (105,105,105));
    }//GEN-LAST:event_btnSimplesMouseEntered

    private void btnSimplesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimplesMouseExited
        //btnSimples.setBackground(new Color(239,239,239));
    }//GEN-LAST:event_btnSimplesMouseExited

    private void btnCompostoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompostoMouseEntered
        //btnComposto.setBackground(new Color (105,105,105));
    }//GEN-LAST:event_btnCompostoMouseEntered

    private void btnCompostoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompostoMouseExited
        //btnComposto.setBackground(new Color(239,239,239));
    }//GEN-LAST:event_btnCompostoMouseExited

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
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComposto;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSimples;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
