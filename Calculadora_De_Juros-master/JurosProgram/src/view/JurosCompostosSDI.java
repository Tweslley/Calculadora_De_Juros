package view;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juanl
 */
public class JurosCompostosSDI extends javax.swing.JFrame {
     int dt = 0;
    /**
     * Creates new form JurosCompostosSDI
     */
    public JurosCompostosSDI() {
        
        initComponents();
        lblPrincipal.setVisible(false);
        txtPrincipal.setVisible(false);
        
        lblTaxa.setVisible(false);
        txtTaxa.setVisible(false);
        jPercent.setVisible(false);

        
        lblPeriodo.setVisible(false);
        txtPeriodo.setVisible(false);
        
        lblMontante.setVisible(false);
        txtMontante.setVisible(false);
        
        jPCalculo.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnPrincipal = new javax.swing.JButton();
        btnTaxa = new javax.swing.JButton();
        lblTaxa = new javax.swing.JLabel();
        lblMontante = new javax.swing.JLabel();
        txtPrincipal = new javax.swing.JTextField();
        txtTaxa = new javax.swing.JTextField();
        txtPeriodo = new javax.swing.JTextField();
        lblPrincipal = new javax.swing.JLabel();
        btnPeriodo = new javax.swing.JButton();
        txtMontante = new javax.swing.JTextField();
        lblPeriodo = new javax.swing.JLabel();
        btnMontante = new javax.swing.JButton();
        btnExplicaçãoTaxa = new javax.swing.JButton();
        btnExplicaçãoCapital = new javax.swing.JButton();
        btnExplicacaoPeriodos = new javax.swing.JButton();
        btnExplicacaoMontante = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jPercent = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPCalculo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("O que você quer calcular?"));

        btnPrincipal.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnPrincipal.setText("Principal(P)");
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        btnTaxa.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnTaxa.setText("Juros(J)");
        btnTaxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaxaActionPerformed(evt);
            }
        });

        lblTaxa.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblTaxa.setText("Taxa :");

        lblMontante.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblMontante.setText("Montante:");

        txtPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrincipalActionPerformed(evt);
            }
        });

        lblPrincipal.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblPrincipal.setText("Principal :");

        btnPeriodo.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnPeriodo.setText("Períodos (n)");
        btnPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeriodoActionPerformed(evt);
            }
        });

        lblPeriodo.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblPeriodo.setText("Periodos :");

        btnMontante.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnMontante.setText("Montante");
        btnMontante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMontanteActionPerformed(evt);
            }
        });

        btnExplicaçãoTaxa.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnExplicaçãoTaxa.setText("?");

        btnExplicaçãoCapital.setBackground(new java.awt.Color(255, 255, 255));
        btnExplicaçãoCapital.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnExplicaçãoCapital.setText("?");
        btnExplicaçãoCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExplicaçãoCapitalActionPerformed(evt);
            }
        });

        btnExplicacaoPeriodos.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnExplicacaoPeriodos.setText("?");
        btnExplicacaoPeriodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExplicacaoPeriodosActionPerformed(evt);
            }
        });

        btnExplicacaoMontante.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnExplicacaoMontante.setText("?");
        btnExplicacaoMontante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExplicacaoMontanteActionPerformed(evt);
            }
        });

        btnCalcular.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jPercent.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jPercent.setText("%");

        btnVoltar.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jButton1.setText("Taxa(i)");

        jButton2.setText("?");

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMontante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTaxa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(btnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnExplicaçãoCapital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExplicaçãoTaxa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblPrincipal)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTaxa)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnExplicacaoMontante)
                                        .addGap(17, 17, 17)
                                        .addComponent(lblMontante))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(btnExplicacaoPeriodos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPeriodo)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTaxa, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jPercent)
                                .addGap(22, 22, 22))
                            .addComponent(txtMontante)
                            .addComponent(jTextField1)
                            .addComponent(txtPeriodo))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrincipal)
                    .addComponent(lblPrincipal)
                    .addComponent(txtPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExplicaçãoCapital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaxa)
                    .addComponent(lblTaxa)
                    .addComponent(txtTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExplicaçãoTaxa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPercent))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton2))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMontante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPeriodo)
                    .addComponent(lblPeriodo)
                    .addComponent(btnExplicacaoPeriodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExplicacaoMontante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMontante)
                    .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMontante))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnVoltar))
                .addContainerGap())
        );

        jPCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculando"));

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel1.setText("Capital (C): ");

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel2.setText("Taxa (I): ");

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel3.setText("Montante: ");

        jLabel10.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel10.setText("Periodos :");

        jLabel13.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel13.setText("Resultado");

        jLabel14.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel14.setText("Resultado");

        jLabel15.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel15.setText("Resultado");

        jLabel16.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel16.setText("Resultado");

        javax.swing.GroupLayout jPCalculoLayout = new javax.swing.GroupLayout(jPCalculo);
        jPCalculo.setLayout(jPCalculoLayout);
        jPCalculoLayout.setHorizontalGroup(
            jPCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCalculoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(55, 55, 55))
            .addGroup(jPCalculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPCalculoLayout.createSequentialGroup()
                        .addGroup(jPCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3))
                        .addGap(58, 58, 58)
                        .addGroup(jPCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCalculoLayout.setVerticalGroup(
            jPCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCalculoLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel16))
                .addGap(45, 45, 45)
                .addComponent(jLabel11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrincipalActionPerformed
        
    }//GEN-LAST:event_txtPrincipalActionPerformed

    private void btnMontanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontanteActionPerformed
        dt = 4;
        lblPrincipal.setVisible(true);
        txtPrincipal.setVisible(true);
        
        lblTaxa.setVisible(true);
        txtTaxa.setVisible(true);
        jPercent.setVisible(true);
        
        lblPeriodo.setVisible(true);
        txtPeriodo.setVisible(true);
        
        lblMontante.setVisible(false);
        txtMontante.setVisible(false);
    }//GEN-LAST:event_btnMontanteActionPerformed

    private void btnExplicacaoPeriodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExplicacaoPeriodosActionPerformed
        
    }//GEN-LAST:event_btnExplicacaoPeriodosActionPerformed

    private void btnExplicacaoMontanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExplicacaoMontanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExplicacaoMontanteActionPerformed

    private void btnPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeriodoActionPerformed
        dt = 3;
        lblPrincipal.setVisible(true);
        txtPrincipal.setVisible(true);
        
        lblTaxa.setVisible(true);
        txtTaxa.setVisible(true);
        jPercent.setVisible(true);

        
        lblPeriodo.setVisible(false);
        txtPeriodo.setVisible(false);
        
        lblMontante.setVisible(true);
        txtMontante.setVisible(true);
    }//GEN-LAST:event_btnPeriodoActionPerformed

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        dt = 1;
        lblPrincipal.setVisible(false);
        txtPrincipal.setVisible(false);
        
        lblTaxa.setVisible(true);
        txtTaxa.setVisible(true);
        jPercent.setVisible(true);
        
        lblPeriodo.setVisible(true);
        txtPeriodo.setVisible(true);
        
        lblMontante.setVisible(true);
        txtMontante.setVisible(true);
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnTaxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaxaActionPerformed
        dt = 2;
        lblPrincipal.setVisible(true);
        txtPrincipal.setVisible(true);
        
        lblTaxa.setVisible(false);
        txtTaxa.setVisible(false);
        jPercent.setVisible(false);
        
        lblPeriodo.setVisible(true);
        txtPeriodo.setVisible(true);
        
        lblMontante.setVisible(true);
        txtMontante.setVisible(true);
    }//GEN-LAST:event_btnTaxaActionPerformed

    private void btnExplicaçãoCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExplicaçãoCapitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExplicaçãoCapitalActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        jPCalculo.setVisible(true);
        double p, m, i;
        int n;

        try{
            switch(dt){
                case 1:
                    i = parseDouble(txtTaxa.getText());
                    n = parseInt(txtPeriodo.getText());
                    m = parseDouble(txtMontante.getText());
                    break;
                case 2:
                    p = parseDouble(txtPrincipal.getText());
                    n = parseInt(txtPeriodo.getText());
                    m = parseDouble(txtMontante.getText());
                    
                    break;
                case 3:
                    p = parseDouble(txtPeriodo.getText());
                    i = parseDouble(txtTaxa.getText());
                    m = parseDouble(txtMontante.getText());
                    
                    break;
                case 4:
                    p = parseDouble(txtPeriodo.getText());
                    i = parseDouble(txtTaxa.getText());
                    n = parseInt(txtPeriodo.getText());
                    
                    break;
            }
        }catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(null, "Insira os valores corretamente e preencha todos os campos");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(JurosCompostosSDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JurosCompostosSDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JurosCompostosSDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JurosCompostosSDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JurosCompostosSDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnExplicacaoMontante;
    private javax.swing.JButton btnExplicacaoPeriodos;
    private javax.swing.JButton btnExplicaçãoCapital;
    private javax.swing.JButton btnExplicaçãoTaxa;
    private javax.swing.JButton btnMontante;
    private javax.swing.JButton btnPeriodo;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnTaxa;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPCalculo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jPercent;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblMontante;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblPrincipal;
    private javax.swing.JLabel lblTaxa;
    private javax.swing.JTextField txtMontante;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtPrincipal;
    private javax.swing.JTextField txtTaxa;
    // End of variables declaration//GEN-END:variables
}
