package view;

import java.awt.Color;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

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
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setSize(640,626);
        this.setLocationRelativeTo(null);
        lblPrincipal.setVisible(false);
        txtPrincipal.setVisible(false);

        lblTaxa.setVisible(false);
        txtTaxa.setVisible(false);
        jComboTaxa.setVisible(false);
        btnTaxaExplic.setVisible(false);

        lblPeriodo.setVisible(false);
        txtPeriodo.setVisible(false);
        jComboPeriodo.setVisible(false);

        lblMontante.setVisible(false);
        txtMontante.setVisible(false);
        
        jPrincipalRes.setVisible(false);
        jTaxaRes.setVisible(false);
        jPeriodoRes.setVisible(false);
        jMontanteRes.setVisible(false);

        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPrincipal = new javax.swing.JButton();
        btnTaxa = new javax.swing.JButton();
        btnPeriodo = new javax.swing.JButton();
        btnMontante = new javax.swing.JButton();
        btnExplicaçãoCapital = new javax.swing.JButton();
        btnExplicaçãoTaxa = new javax.swing.JButton();
        btnExplicacaoPeriodos = new javax.swing.JButton();
        btnExplicacaoMontante = new javax.swing.JButton();
        lblPrincipal = new javax.swing.JLabel();
        lblTaxa = new javax.swing.JLabel();
        lblPeriodo = new javax.swing.JLabel();
        lblMontante = new javax.swing.JLabel();
        txtPrincipal = new javax.swing.JTextField();
        txtTaxa = new javax.swing.JTextField();
        txtPeriodo = new javax.swing.JTextField();
        txtMontante = new javax.swing.JTextField();
        jComboTaxa = new javax.swing.JComboBox<>();
        btnTaxaExplic = new javax.swing.JButton();
        jComboPeriodo = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPrincipalRes = new javax.swing.JLabel();
        jTaxaRes = new javax.swing.JLabel();
        jPeriodoRes = new javax.swing.JLabel();
        jMontanteRes = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DINK - composto");
        setPreferredSize(new java.awt.Dimension(640, 626));
        getContentPane().setLayout(null);

        btnPrincipal.setBackground(new java.awt.Color(239, 239, 239));
        btnPrincipal.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnPrincipal.setText("Principal(P)");
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrincipal);
        btnPrincipal.setBounds(30, 60, 110, 29);

        btnTaxa.setBackground(new java.awt.Color(239, 239, 239));
        btnTaxa.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnTaxa.setText("Taxa(i)");
        btnTaxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaxaActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaxa);
        btnTaxa.setBounds(30, 110, 110, 29);

        btnPeriodo.setBackground(new java.awt.Color(239, 239, 239));
        btnPeriodo.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnPeriodo.setText("Períodos(n)");
        btnPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeriodoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPeriodo);
        btnPeriodo.setBounds(30, 160, 110, 29);

        btnMontante.setBackground(new java.awt.Color(239, 239, 239));
        btnMontante.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnMontante.setText("Montante(M)");
        btnMontante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMontanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnMontante);
        btnMontante.setBounds(30, 210, 110, 29);

        btnExplicaçãoCapital.setBackground(new java.awt.Color(239, 239, 239));
        btnExplicaçãoCapital.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnExplicaçãoCapital.setText("?");
        btnExplicaçãoCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExplicaçãoCapitalActionPerformed(evt);
            }
        });
        getContentPane().add(btnExplicaçãoCapital);
        btnExplicaçãoCapital.setBounds(159, 60, 50, 29);

        btnExplicaçãoTaxa.setBackground(new java.awt.Color(239, 239, 239));
        btnExplicaçãoTaxa.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnExplicaçãoTaxa.setText("?");
        btnExplicaçãoTaxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExplicaçãoTaxaActionPerformed(evt);
            }
        });
        getContentPane().add(btnExplicaçãoTaxa);
        btnExplicaçãoTaxa.setBounds(159, 110, 50, 29);

        btnExplicacaoPeriodos.setBackground(new java.awt.Color(239, 239, 239));
        btnExplicacaoPeriodos.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnExplicacaoPeriodos.setText("?");
        btnExplicacaoPeriodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExplicacaoPeriodosActionPerformed(evt);
            }
        });
        getContentPane().add(btnExplicacaoPeriodos);
        btnExplicacaoPeriodos.setBounds(159, 160, 50, 29);

        btnExplicacaoMontante.setBackground(new java.awt.Color(239, 239, 239));
        btnExplicacaoMontante.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnExplicacaoMontante.setText("?");
        btnExplicacaoMontante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExplicacaoMontanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnExplicacaoMontante);
        btnExplicacaoMontante.setBounds(159, 210, 50, 29);

        lblPrincipal.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblPrincipal.setText("Principal :");
        getContentPane().add(lblPrincipal);
        lblPrincipal.setBounds(230, 70, 58, 20);

        lblTaxa.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblTaxa.setText("Taxa :");
        getContentPane().add(lblTaxa);
        lblTaxa.setBounds(240, 120, 34, 20);

        lblPeriodo.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblPeriodo.setText("Periodos :");
        getContentPane().add(lblPeriodo);
        lblPeriodo.setBounds(230, 170, 60, 20);

        lblMontante.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblMontante.setText("Montante:");
        getContentPane().add(lblMontante);
        lblMontante.setBounds(230, 220, 61, 20);

        txtPrincipal.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        txtPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrincipalActionPerformed(evt);
            }
        });
        txtPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrincipalKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrincipal);
        txtPrincipal.setBounds(300, 60, 320, 30);

        txtTaxa.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        txtTaxa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtTaxa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTaxaKeyTyped(evt);
            }
        });
        getContentPane().add(txtTaxa);
        txtTaxa.setBounds(300, 110, 210, 30);

        txtPeriodo.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        txtPeriodo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtPeriodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPeriodoKeyTyped(evt);
            }
        });
        getContentPane().add(txtPeriodo);
        txtPeriodo.setBounds(300, 160, 240, 30);

        txtMontante.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        txtMontante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtMontante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontanteActionPerformed(evt);
            }
        });
        txtMontante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontanteKeyTyped(evt);
            }
        });
        getContentPane().add(txtMontante);
        txtMontante.setBounds(300, 210, 320, 30);

        jComboTaxa.setBackground(new java.awt.Color(239, 239, 239));
        jComboTaxa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a.m", "a.a", "a.d" }));
        jComboTaxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTaxaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboTaxa);
        jComboTaxa.setBounds(513, 110, 50, 30);

        btnTaxaExplic.setBackground(new java.awt.Color(239, 239, 239));
        btnTaxaExplic.setText("?");
        btnTaxaExplic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaxaExplicActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaxaExplic);
        btnTaxaExplic.setBounds(570, 110, 50, 30);

        jComboPeriodo.setBackground(new java.awt.Color(239, 239, 239));
        jComboPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meses", "Anos", "Dias" }));
        getContentPane().add(jComboPeriodo);
        jComboPeriodo.setBounds(548, 160, 70, 30);

        btnCalcular.setBackground(new java.awt.Color(239, 239, 239));
        btnCalcular.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(510, 260, 90, 40);

        btnVoltar.setBackground(new java.awt.Color(239, 239, 239));
        btnVoltar.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(400, 260, 80, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("O que você quer calcular ?");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 10, 580, 40);

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jLabel1.setText("Capital (C): ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 380, 88, 25);

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jLabel2.setText("Taxa (I): ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 410, 63, 25);

        jLabel10.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jLabel10.setText("Periodos(n) :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 440, 100, 25);

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jLabel3.setText("Montante(M): ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 470, 111, 25);

        jPrincipalRes.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jPrincipalRes.setText("Resultado");
        getContentPane().add(jPrincipalRes);
        jPrincipalRes.setBounds(250, 380, 120, 25);

        jTaxaRes.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jTaxaRes.setText("Resultado");
        getContentPane().add(jTaxaRes);
        jTaxaRes.setBounds(250, 410, 120, 25);

        jPeriodoRes.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jPeriodoRes.setText("Resultado");
        getContentPane().add(jPeriodoRes);
        jPeriodoRes.setBounds(250, 440, 120, 25);

        jMontanteRes.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jMontanteRes.setText("Resultado");
        getContentPane().add(jMontanteRes);
        jMontanteRes.setBounds(250, 470, 140, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("==Resultados==============================================");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 330, 610, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Composto trans.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 360, 230, 200);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo-de-mosaico-geometrico-de-cor-cinza-abstrato_1055-3132.jpg"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(603, 635));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 640, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        dt = 1;
        lblPrincipal.setVisible(false);
        txtPrincipal.setVisible(false);

        lblTaxa.setVisible(true);
        txtTaxa.setVisible(true);
        jComboTaxa.setVisible(true);
        btnTaxaExplic.setVisible(true);

        lblPeriodo.setVisible(true);
        txtPeriodo.setVisible(true);
        jComboPeriodo.setVisible(true);

        lblMontante.setVisible(true);
        txtMontante.setVisible(true);
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void txtPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrincipalActionPerformed

    }//GEN-LAST:event_txtPrincipalActionPerformed

    private void btnPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeriodoActionPerformed
        dt = 4;
        lblPrincipal.setVisible(true);
        txtPrincipal.setVisible(true);

        lblTaxa.setVisible(true);
        txtTaxa.setVisible(true);
        jComboTaxa.setVisible(true);
        btnTaxaExplic.setVisible(true);

        lblPeriodo.setVisible(false);
        txtPeriodo.setVisible(false);
        jComboPeriodo.setVisible(false);

        lblMontante.setVisible(true);
        txtMontante.setVisible(true);
    }//GEN-LAST:event_btnPeriodoActionPerformed

    private void txtMontanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontanteActionPerformed

    private void btnMontanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontanteActionPerformed
        dt = 5;
        lblPrincipal.setVisible(true);
        txtPrincipal.setVisible(true);

        lblTaxa.setVisible(true);
        txtTaxa.setVisible(true);
        jComboTaxa.setVisible(true);
        btnTaxaExplic.setVisible(true);

        lblPeriodo.setVisible(true);
        txtPeriodo.setVisible(true);
        jComboPeriodo.setVisible(true);

        lblMontante.setVisible(false);
        txtMontante.setVisible(false);
    }//GEN-LAST:event_btnMontanteActionPerformed

    private void btnExplicaçãoTaxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExplicaçãoTaxaActionPerformed
        JOptionPane.showMessageDialog(null, "O que é taxa \n  A taxa de juros indica qual remuneração será paga ao dinheiro emprestado, \n para um determinado período."
            + " O cálculo da taxa de juros é responsável pela "
            + "\nobservação da rentabilidade de uma operação financeira, \n "
            + "sendo indispensável para a tomada de decisão de investimentos.");
    }//GEN-LAST:event_btnExplicaçãoTaxaActionPerformed

    private void btnExplicaçãoCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExplicaçãoCapitalActionPerformed
        JOptionPane.showMessageDialog(null, "O que é Capital? \n Capital ou Principal é valor de uma quantia em dinheiro “na data zero”, \n ou seja, no inicio de uma aplicação.");
    }//GEN-LAST:event_btnExplicaçãoCapitalActionPerformed

    private void btnExplicacaoPeriodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExplicacaoPeriodosActionPerformed
        JOptionPane.showMessageDialog(null, "O que é o tempo? \n O tempo define quantas vezes a taxa será aplicada");
    }//GEN-LAST:event_btnExplicacaoPeriodosActionPerformed

    private void btnExplicacaoMontanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExplicacaoMontanteActionPerformed
        JOptionPane.showMessageDialog(null, "O que é Montante? \n Montante é um termo utilizado para definir \n a quantidade de dinheiro que uma pessoa física ou jurídica possui,\n uma soma de Capitais");
    }//GEN-LAST:event_btnExplicacaoMontanteActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        jLabel7.setVisible(true);
        double p, m, i, j, n;
        
        DecimalFormat df = new DecimalFormat("#0.00");
        try{
            switch(dt){
                case 0:
                    JOptionPane.showMessageDialog(null, "Escolha uma opção");
                case 1:
                n = parseInt(txtPeriodo.getText());
                m = parseDouble(txtMontante.getText());
                i = parseDouble(txtTaxa.getText());
                i = i/100;
                if(jComboTaxa.getSelectedItem().equals("a.m") && jComboPeriodo.getSelectedItem().equals("Anos")){
                    n = n*12;
                }
                if(jComboTaxa.getSelectedItem().equals("a.a") && jComboPeriodo.getSelectedItem().equals("Meses")){
                    n = n/12;
                }
                if(jComboTaxa.getSelectedItem().equals("a.d") && jComboPeriodo.getSelectedItem().equals("Meses")){
                    n = n*30;
                }

                if(jComboTaxa.getSelectedItem().equals("a.m") && jComboPeriodo.getSelectedItem().equals("Dias")){
                    n = n/30;
                }
                if(jComboTaxa.getSelectedItem().equals("a.d") && jComboPeriodo.getSelectedItem().equals("Anos")){
                    n = n*360;
                }
                if(jComboTaxa.getSelectedItem().equals("a.d") && jComboPeriodo.getSelectedItem().equals("Anos")){
                    n = n*360;
                }
                p = m/ (Math.pow(1+ i, n));
                n = parseInt(txtPeriodo.getText());
                jPrincipalRes.setText(""+df.format(p));
                jPeriodoRes.setText(""+ df.format(n) + "" + jComboPeriodo.getSelectedItem());
                jTaxaRes.setText(""+df.format(i* 100)+ "% " + jComboTaxa.getSelectedItem());
                jMontanteRes.setText(""+df.format(m));
                
                break;
                case 3:
                p = parseDouble(txtPrincipal.getText());
                n = parseInt(txtPeriodo.getText());
                m = parseDouble(txtMontante.getText());
                //for,ula do juros aqui

                i = (Math.pow(((m/p)), ((1/n))) - 1)/100;
                n = parseInt(txtPeriodo.getText());
                jPrincipalRes.setText(""+df.format(p));
                jPeriodoRes.setText(""+df.format(n) + " " + jComboPeriodo.getSelectedItem()) ;
                jTaxaRes.setText(""+df.format(i*100)+ " % " + jComboPeriodo.getSelectedItem());
                jMontanteRes.setText(""+df.format(m));
                break;
                
                case 4:
                p = parseDouble(txtPrincipal.getText());
                i = parseDouble(txtTaxa.getText());
                m = parseDouble(txtMontante.getText());
                //formula do periodo aqui
                i = i/100;
                n = (int) ((Math.log10(m/p))/(Math.log10(1+i)));
                n = parseInt(txtPeriodo.getText());
                jPrincipalRes.setText(""+df.format(p));
                jPeriodoRes.setText(""+df.format(n) + " "+ jComboTaxa.getSelectedItem());
                jTaxaRes.setText(""+df.format(i * 100)+ " % " + jComboTaxa.getSelectedItem());
                jMontanteRes.setText(""+df.format(m));
                break;
                
                case 5:
                p = parseDouble(txtPrincipal.getText());
                n = parseInt(txtPeriodo.getText());
                i = parseDouble(txtTaxa.getText());
                if(jComboTaxa.getSelectedItem().equals("a.m") && jComboPeriodo.getSelectedItem().equals("Anos")){
                    n = n*12;
                }
                if(jComboTaxa.getSelectedItem().equals("a.a") && jComboPeriodo.getSelectedItem().equals("Meses")){
                    n = n/12;
                }
                if(jComboTaxa.getSelectedItem().equals("a.d") && jComboPeriodo.getSelectedItem().equals("Meses")){
                    n = n*30;
                }

                if(jComboTaxa.getSelectedItem().equals("a.m") && jComboPeriodo.getSelectedItem().equals("Dias")){
                    n = n/30;
                }
                if(jComboTaxa.getSelectedItem().equals("a.d") && jComboPeriodo.getSelectedItem().equals("Anos")){
                    n = n*360;
                }
                if(jComboTaxa.getSelectedItem().equals("a.d") && jComboPeriodo.getSelectedItem().equals("Anos")){
                    n = n*360;
                }
                //Formula do Montante aqui
                i = i/100;
                m =  p * (Math.pow((1+i), n));
                 n = parseInt(txtPeriodo.getText());
                jPrincipalRes.setText(""+df.format(p));
                jPeriodoRes.setText(""+df.format(n) + " " + jComboPeriodo.getSelectedItem());
                jTaxaRes.setText(""+df.format(i * 100)+ " % " + jComboTaxa.getSelectedItem());
                jMontanteRes.setText("" + df.format(m));
                break;
            }
        }catch(NumberFormatException exception){
            if(txtPrincipal.getText()==null || txtPrincipal.getText().trim().equals("")){
                txtPrincipal.setBorder(new LineBorder(new java.awt.Color(178,34,34)));
            }
            if(txtTaxa.getText()==null || txtTaxa.getText().trim().equals("")){
                txtTaxa.setBorder(new LineBorder(new java.awt.Color(178,34,34)));
            }
            if(txtPeriodo.getText()==null || txtPeriodo.getText().trim().equals("")){
                txtPeriodo.setBorder(new LineBorder(new java.awt.Color(178,34,34)));
            }
            if(txtMontante.getText()==null || txtMontante.getText().trim().equals("")){
                txtMontante.setBorder(new LineBorder(new java.awt.Color(178,34,34)));
            }
            JOptionPane.showMessageDialog(null, "preencha Todos os campos");
        }
        jPrincipalRes.setVisible(true);
        jTaxaRes.setVisible(true);
        jPeriodoRes.setVisible(true);
        jMontanteRes.setVisible(true);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new MainMenu_1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnTaxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaxaActionPerformed
        dt = 3;
        lblPrincipal.setVisible(true);
        txtPrincipal.setVisible(true);

        lblTaxa.setVisible(false);
        txtTaxa.setVisible(false);
        jComboTaxa.setVisible(false);
        btnTaxaExplic.setVisible(false);

        lblPeriodo.setVisible(true);
        txtPeriodo.setVisible(true);
        jComboPeriodo.setVisible(true);

        lblMontante.setVisible(true);
        txtMontante.setVisible(true);
    }//GEN-LAST:event_btnTaxaActionPerformed

    private void jComboTaxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTaxaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTaxaActionPerformed

    private void txtPrincipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrincipalKeyTyped
        String caracteres="0987654321";
        txtPrincipal.setBorder(new LineBorder(new java.awt.Color(204,204,204)));
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }//GEN-LAST:event_txtPrincipalKeyTyped

    private void txtTaxaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaxaKeyTyped
        String caracteres="0987654321";
        txtTaxa.setBorder(new LineBorder(new java.awt.Color(204,204,204)));
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }//GEN-LAST:event_txtTaxaKeyTyped

    private void txtPeriodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPeriodoKeyTyped
        String caracteres="0987654321";
        txtPeriodo.setBorder(new LineBorder(new java.awt.Color(204,204,204)));
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }//GEN-LAST:event_txtPeriodoKeyTyped

    private void txtMontanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontanteKeyTyped
        String caracteres="0987654321";
        txtMontante.setBorder(new LineBorder(new java.awt.Color(204,204,204)));
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }//GEN-LAST:event_txtMontanteKeyTyped

    private void btnTaxaExplicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaxaExplicActionPerformed
        JOptionPane.showMessageDialog(null,"a.a -> ao ano \na.m-> ao mês\na.d -> ao dia");

    }//GEN-LAST:event_btnTaxaExplicActionPerformed

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
    private javax.swing.JButton btnTaxaExplic;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> jComboPeriodo;
    private javax.swing.JComboBox<String> jComboTaxa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jMontanteRes;
    private javax.swing.JLabel jPeriodoRes;
    private javax.swing.JLabel jPrincipalRes;
    private javax.swing.JLabel jTaxaRes;
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
