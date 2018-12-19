package view;


import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
public class JurosSimplesSDI extends javax.swing.JFrame {
    int dt = 0;
    /**
     * Creates new form JurosSimplesSDI
     */
    public JurosSimplesSDI() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setSize(640, 626);
        this.setLocationRelativeTo(null);
        lblCap.setVisible(false);
        txtCap.setVisible(false);
        jCapRes.setVisible(false);
        
        txtJuros.setVisible(false);
        lblJuros.setVisible(false);
        jJurosRes.setVisible(false);
        
        lblTaxa.setVisible(false);
        txtTaxa.setVisible(false);
        jComboTaxa.setVisible(false);
        InfoTaxa.setVisible(false);
        jTaxaRes.setVisible(false);
        
        lblTempo.setVisible(false);
        txtTempo.setVisible(false);
        jComboTempo.setVisible(false);
        jTempoRes.setVisible(false);
        
        jMontRes.setVisible(false);
        
        btnMontante.setVisible(false);
        btnMontanteExplicado.setVisible(false);
        lblMontante.setVisible(false);
        jMontRes.setVisible(false);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblMontante = new javax.swing.JLabel();
        jCapRes = new javax.swing.JLabel();
        jTaxaRes = new javax.swing.JLabel();
        jTempoRes = new javax.swing.JLabel();
        jJurosRes = new javax.swing.JLabel();
        jMontRes = new javax.swing.JLabel();
        btnMontante = new javax.swing.JButton();
        btnMontanteExplicado = new javax.swing.JButton();
        btnCap = new javax.swing.JButton();
        btnTaxa = new javax.swing.JButton();
        btnTempo = new javax.swing.JButton();
        btnJuros = new javax.swing.JButton();
        btnCapExplicado = new javax.swing.JButton();
        btnTaxaExplicado = new javax.swing.JButton();
        btnTempoExplicado = new javax.swing.JButton();
        btnJurosExplicado = new javax.swing.JButton();
        lblCap = new javax.swing.JLabel();
        lblTaxa = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        lblJuros = new javax.swing.JLabel();
        txtCap = new javax.swing.JTextField();
        txtTaxa = new javax.swing.JTextField();
        txtTempo = new javax.swing.JTextField();
        txtJuros = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboTaxa = new javax.swing.JComboBox<>();
        InfoTaxa = new javax.swing.JButton();
        jComboTempo = new javax.swing.JComboBox<>();
        btnVoltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DINK - Simples");
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jLabel3.setText("Taxa (I): ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 420, 63, 25);

        jLabel10.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jLabel10.setText("Tempo (t): ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 450, 90, 25);

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jLabel2.setText("Capital (C): ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 390, 88, 25);

        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jLabel4.setText("Juros (J): ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 480, 69, 25);

        lblMontante.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblMontante.setText("Montante(S): ");
        getContentPane().add(lblMontante);
        lblMontante.setBounds(20, 510, 104, 25);

        jCapRes.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jCapRes.setText("Resultado");
        getContentPane().add(jCapRes);
        jCapRes.setBounds(260, 390, 110, 25);

        jTaxaRes.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jTaxaRes.setText("Resultado");
        getContentPane().add(jTaxaRes);
        jTaxaRes.setBounds(260, 420, 110, 25);

        jTempoRes.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jTempoRes.setText("Resultado");
        getContentPane().add(jTempoRes);
        jTempoRes.setBounds(260, 450, 120, 25);

        jJurosRes.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jJurosRes.setText("Resultado");
        getContentPane().add(jJurosRes);
        jJurosRes.setBounds(260, 480, 110, 25);

        jMontRes.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jMontRes.setText("Resultado");
        getContentPane().add(jMontRes);
        jMontRes.setBounds(260, 510, 120, 25);

        btnMontante.setBackground(new java.awt.Color(239, 239, 239));
        btnMontante.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnMontante.setText("Calcular Montante(S)");
        btnMontante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMontanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnMontante);
        btnMontante.setBounds(380, 359, 160, 40);

        btnMontanteExplicado.setBackground(new java.awt.Color(239, 239, 239));
        btnMontanteExplicado.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnMontanteExplicado.setText("?");
        btnMontanteExplicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMontanteExplicadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMontanteExplicado);
        btnMontanteExplicado.setBounds(549, 359, 40, 40);

        btnCap.setBackground(new java.awt.Color(239, 239, 239));
        btnCap.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnCap.setText("Capital(C)");
        btnCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapActionPerformed(evt);
            }
        });
        getContentPane().add(btnCap);
        btnCap.setBounds(30, 59, 100, 30);

        btnTaxa.setBackground(new java.awt.Color(239, 239, 239));
        btnTaxa.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnTaxa.setText("Taxa(I) ");
        btnTaxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaxaActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaxa);
        btnTaxa.setBounds(30, 110, 100, 29);

        btnTempo.setBackground(new java.awt.Color(239, 239, 239));
        btnTempo.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnTempo.setText("Tempo(t)");
        btnTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTempoActionPerformed(evt);
            }
        });
        getContentPane().add(btnTempo);
        btnTempo.setBounds(30, 160, 100, 29);

        btnJuros.setBackground(new java.awt.Color(239, 239, 239));
        btnJuros.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnJuros.setText("Juros(J)");
        btnJuros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJurosActionPerformed(evt);
            }
        });
        getContentPane().add(btnJuros);
        btnJuros.setBounds(30, 210, 100, 29);

        btnCapExplicado.setBackground(new java.awt.Color(255, 255, 255));
        btnCapExplicado.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnCapExplicado.setText("?");
        btnCapExplicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapExplicadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCapExplicado);
        btnCapExplicado.setBounds(140, 60, 50, 29);

        btnTaxaExplicado.setBackground(new java.awt.Color(239, 239, 239));
        btnTaxaExplicado.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnTaxaExplicado.setText("?");
        btnTaxaExplicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaxaExplicadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaxaExplicado);
        btnTaxaExplicado.setBounds(140, 110, 50, 29);

        btnTempoExplicado.setBackground(new java.awt.Color(239, 239, 239));
        btnTempoExplicado.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnTempoExplicado.setText("?");
        btnTempoExplicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTempoExplicadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnTempoExplicado);
        btnTempoExplicado.setBounds(140, 160, 50, 29);

        btnJurosExplicado.setBackground(new java.awt.Color(239, 239, 239));
        btnJurosExplicado.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnJurosExplicado.setText("?");
        btnJurosExplicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJurosExplicadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnJurosExplicado);
        btnJurosExplicado.setBounds(140, 210, 50, 29);

        lblCap.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblCap.setText("Capital: ");
        getContentPane().add(lblCap);
        lblCap.setBounds(210, 70, 48, 20);

        lblTaxa.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblTaxa.setText("Taxa :");
        getContentPane().add(lblTaxa);
        lblTaxa.setBounds(210, 120, 34, 20);

        lblTempo.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblTempo.setText("Tempo:");
        getContentPane().add(lblTempo);
        lblTempo.setBounds(210, 170, 50, 20);

        lblJuros.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblJuros.setText("Juros :");
        getContentPane().add(lblJuros);
        lblJuros.setBounds(210, 210, 39, 20);

        txtCap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapActionPerformed(evt);
            }
        });
        txtCap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapKeyTyped(evt);
            }
        });
        getContentPane().add(txtCap);
        txtCap.setBounds(280, 60, 330, 30);

        txtTaxa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtTaxa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTaxaKeyTyped(evt);
            }
        });
        getContentPane().add(txtTaxa);
        txtTaxa.setBounds(280, 110, 220, 30);

        txtTempo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtTempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTempoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTempo);
        txtTempo.setBounds(280, 160, 240, 30);

        txtJuros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtJuros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJurosKeyTyped(evt);
            }
        });
        getContentPane().add(txtJuros);
        txtJuros.setBounds(280, 200, 330, 30);

        jButton1.setBackground(new java.awt.Color(239, 239, 239));
        jButton1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(510, 260, 90, 40);

        jComboTaxa.setBackground(new java.awt.Color(239, 239, 239));
        jComboTaxa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a.m", "a.a", "a.d" }));
        jComboTaxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTaxaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboTaxa);
        jComboTaxa.setBounds(503, 110, 50, 30);

        InfoTaxa.setBackground(new java.awt.Color(239, 239, 239));
        InfoTaxa.setText("?");
        InfoTaxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoTaxaActionPerformed(evt);
            }
        });
        getContentPane().add(InfoTaxa);
        InfoTaxa.setBounds(561, 110, 50, 30);

        jComboTempo.setBackground(new java.awt.Color(239, 239, 239));
        jComboTempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meses", "Anos", "Dias" }));
        jComboTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTempoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboTempo);
        jComboTempo.setBounds(529, 160, 80, 30);

        btnVoltar.setBackground(new java.awt.Color(239, 239, 239));
        btnVoltar.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(420, 260, 80, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText(" ==Resultados ============================================");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 320, 600, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("O que você quer calcular ?");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 10, 590, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Simples trans.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 380, 240, 200);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo-de-mosaico-geometrico-de-cor-cinza-abstrato_1055-3132.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -10, 630, 626);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMontanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontanteActionPerformed
        jMontRes.setVisible(true);
        lblMontante.setVisible(true);
        jMontRes.setVisible(true);
        double j = parseDouble(jJurosRes.getText());
        double t = parseInt(jTempoRes.getText());
        double c = parseDouble(jCapRes.getText());
        double m = c + j;

        jMontRes.setText(""+m);

    }//GEN-LAST:event_btnMontanteActionPerformed

    private void btnMontanteExplicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontanteExplicadoActionPerformed
        JOptionPane.showMessageDialog(null, "O que é Montante? \n Montante é um termo utilizado para definir \n a quantidade de dinheiro que uma pessoa física ou jurídica possui,\n uma soma de Capitais");
    }//GEN-LAST:event_btnMontanteExplicadoActionPerformed

    private void btnCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapActionPerformed
        dt =1;
        lblCap.setVisible(false);
        txtCap.setVisible(false);

        lblTaxa.setVisible(true);
        txtTaxa.setVisible(true);
        jComboTaxa.setVisible(true);
        InfoTaxa.setVisible(true);

        lblTempo.setVisible(true);
        txtTempo.setVisible(true);
        jComboTempo.setVisible(true);

        lblJuros.setVisible(true);
        txtJuros.setVisible(true);
    }//GEN-LAST:event_btnCapActionPerformed

    private void btnTaxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaxaActionPerformed
        dt = 2;
        lblCap.setVisible(true);
        txtCap.setVisible(true);

        lblTaxa.setVisible(false);
        txtTaxa.setVisible(false);
        jComboTaxa.setVisible(false);
        InfoTaxa.setVisible(false);

        lblTempo.setVisible(true);
        txtTempo.setVisible(true);
        jComboTempo.setVisible(true);

        lblJuros.setVisible(true);
        txtJuros.setVisible(true);
    }//GEN-LAST:event_btnTaxaActionPerformed

    private void btnJurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJurosActionPerformed
        dt = 4;

        lblCap.setVisible(true);
        txtCap.setVisible(true);

        lblJuros.setVisible(true);
        txtJuros.setVisible(true);

        lblTaxa.setVisible(true);
        txtTaxa.setVisible(true);
        jComboTaxa.setVisible(true);
        InfoTaxa.setVisible(true);

        lblTempo.setVisible(true);
        txtTempo.setVisible(true);
        jComboTempo.setVisible(true);

        lblJuros.setVisible(false);
        txtJuros.setVisible(false);
    }//GEN-LAST:event_btnJurosActionPerformed

    private void txtCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapActionPerformed

    private void btnTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTempoActionPerformed
        dt = 3;

        lblCap.setVisible(true);
        txtCap.setVisible(true);

        lblTempo.setVisible(true);
        txtTempo.setVisible(true);

        lblTaxa.setVisible(true);
        txtTaxa.setVisible(true);
        jComboTaxa.setVisible(true);
        InfoTaxa.setVisible(true);

        lblTempo.setVisible(false);
        txtTempo.setVisible(false);
        jComboTempo.setVisible(false);

        lblJuros.setVisible(true);
        txtJuros.setVisible(true);
    }//GEN-LAST:event_btnTempoActionPerformed

    private void btnCapExplicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapExplicadoActionPerformed
        JOptionPane.showMessageDialog(null, "O que é Capital? \n Capital ou Principal é valor de uma quantia em dinheiro “na data zero”, \n ou seja, no inicio de uma aplicação.");
    }//GEN-LAST:event_btnCapExplicadoActionPerformed

    private void btnJurosExplicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJurosExplicadoActionPerformed
        JOptionPane.showMessageDialog(null, "O que são Juros? \n Juros é o rendimento que se obtém quando se empresta dinheiro por um determinado período. \n Os juros são para o credor (aquele que tem algo a receber) "
            + "\numa compensação pelo tempo que ficará sem utilizar o dinheiro emprestado.");
    }//GEN-LAST:event_btnJurosExplicadoActionPerformed

    private void btnTempoExplicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTempoExplicadoActionPerformed
        JOptionPane.showMessageDialog(null, "O que é o tempo? \n O tempo define quantas vezes a taxa será aplicada");
    }//GEN-LAST:event_btnTempoExplicadoActionPerformed

    private void btnTaxaExplicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaxaExplicadoActionPerformed
        JOptionPane.showMessageDialog(null, "O que é taxa \n  A taxa de juros indica qual remuneração será paga ao dinheiro emprestado, \n para um determinado período."
            + " O cálculo da taxa de juros é responsável pela "
            + "\nobservação da rentabilidade de uma operação financeira, \n "
            + "sendo indispensável para a tomada de decisão de investimentos.");
    }//GEN-LAST:event_btnTaxaExplicadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        double j, c, i, t;
        DecimalFormat df = new DecimalFormat("#0.00");
        String te;
        try{
            switch(dt){
                case 0:
                    JOptionPane.showMessageDialog(null, "escolha uma opção");
                    break;
                case 1:
                j = parseDouble(txtJuros.getText());
                i = parseDouble(txtTaxa.getText());
                t = parseInt(txtTempo.getText());
                i = i/100;
                if(jComboTaxa.getSelectedItem().equals("a.m") && jComboTempo.getSelectedItem().equals("Anos")){
                    t = t*12;
                }
                if(jComboTaxa.getSelectedItem().equals("a.a") && jComboTempo.getSelectedItem().equals("Meses")){
                    t = t/12;
                }
                if(jComboTaxa.getSelectedItem().equals("a.d") && jComboTempo.getSelectedItem().equals("Meses")){
                    t = t*30;
                }

                if(jComboTaxa.getSelectedItem().equals("a.m") && jComboTempo.getSelectedItem().equals("Dias")){
                    t = t/30;
                }
                if(jComboTaxa.getSelectedItem().equals("a.d") && jComboTempo.getSelectedItem().equals("Anos")){
                    t = t*360;
                }
                if(jComboTaxa.getSelectedItem().equals("a.d") && jComboTempo.getSelectedItem().equals("Anos")){
                    t = t*360;
                }
                c = j/(i*t);
                t = parseInt(txtTempo.getText());
                jCapRes.setText(""+ df.format(c));
                jTaxaRes.setText(""+ df.format(i*100)+ "% " + jComboTaxa.getSelectedItem());
                jTempoRes.setText(""+df.format(t) + " " + jComboTempo.getSelectedItem());
                jJurosRes.setText(""+j);

                double m = c + j;
                jMontRes.setText(""+df.format(m));
                jTaxaRes.setVisible(true);
                jCapRes.setVisible(true);
                jTempoRes.setVisible(true);
                jJurosRes.setVisible(true);
                btnMontante.setVisible(true);
                btnMontanteExplicado.setVisible(true);
                break;
                case 2:
                j = parseDouble(txtJuros.getText());
                t = parseInt(txtTempo.getText());
                c = parseDouble(txtCap.getText());
                
                i = (j/(c*t))*100;
                
                t = parseInt(txtTempo.getText());
                jCapRes.setText(""+df.format(c));
                jTaxaRes.setText(""+df.format(i)+ "% " + jComboTempo.getSelectedItem());
                jTempoRes.setText(""+df.format(t)+ " " + jComboTempo.getSelectedItem());
                jJurosRes.setText(""+ df.format(j));
                double mo = c + j;

                jMontRes.setText(""+df.format(mo));
                jTaxaRes.setVisible(true);
                jCapRes.setVisible(true);
                jTempoRes.setVisible(true);
                jJurosRes.setVisible(true);
                btnMontante.setVisible(true);
                btnMontanteExplicado.setVisible(true);
                break;
                case 3:
                i = parseDouble(txtTaxa.getText());
                j = parseDouble(txtJuros.getText());
                c = parseDouble(txtCap.getText());
                i = i/100;
                
                t = (j/(c*i));
                jCapRes.setText(""+df.format(c));
                jTaxaRes.setText(""+df.format(i*100)+ "% " + jComboTaxa.getSelectedItem());
                jTempoRes.setText(""+df.format(t)+ " " + jComboTaxa.getSelectedItem());
                jJurosRes.setText(""+df.format(j));
                double mont = c + j;
                jMontRes.setText(""+df.format(mont));
                jTaxaRes.setVisible(true);
                jCapRes.setVisible(true);
                jTempoRes.setVisible(true);
                jJurosRes.setVisible(true);
                btnMontante.setVisible(true);
                btnMontanteExplicado.setVisible(true);
                break;
                case 4:
                i = parseDouble(txtTaxa.getText());
                t = parseInt(txtTempo.getText());
                c = parseDouble(txtCap.getText());
                i = i/100;
                if(jComboTaxa.getSelectedItem().equals("a.m") && jComboTempo.getSelectedItem().equals("Anos")){
                    t = t*12;
                }
                if(jComboTaxa.getSelectedItem().equals("a.a") && jComboTempo.getSelectedItem().equals("Meses")){
                    t = t/12;
                }
                if(jComboTaxa.getSelectedItem().equals("a.d") && jComboTempo.getSelectedItem().equals("Meses")){
                    t = t*30;
                }

                if(jComboTaxa.getSelectedItem().equals("a.m") && jComboTempo.getSelectedItem().equals("Dias")){
                    t = t/30;
                }
                if(jComboTaxa.getSelectedItem().equals("a.d") && jComboTempo.getSelectedItem().equals("Anos")){
                    t = t*360;
                }
                if(jComboTaxa.getSelectedItem().equals("a.d") && jComboTempo.getSelectedItem().equals("Anos")){
                    t = t*360;
                }
                j = (c * i * t);
                t = parseInt(txtTempo.getText());
                jCapRes.setText(""+df.format(c));
                jTaxaRes.setText(""+df.format(i*100) + "% " + jComboTaxa.getSelectedItem());
                jTempoRes.setText(""+df.format(t) + " " + jComboTempo.getSelectedItem());
                jJurosRes.setText(""+df.format(j));
                double monta = c + j;
                jMontRes.setText(""+df.format(monta));
                jTaxaRes.setVisible(true);
                jCapRes.setVisible(true);
                jTempoRes.setVisible(true);
                jJurosRes.setVisible(true);
                btnMontante.setVisible(true);
                btnMontanteExplicado.setVisible(true);
                break;

            }
        }catch(NumberFormatException exception){
             if(txtCap.getText()==null || txtCap.getText().trim().equals("")){
                txtCap.setBorder(new LineBorder(new java.awt.Color(178,34,34)));
            }
            if(txtTaxa.getText()==null || txtTaxa.getText().trim().equals("")){
                txtTaxa.setBorder(new LineBorder(new java.awt.Color(178,34,34)));
            }
            if(txtTempo.getText()==null || txtTempo.getText().trim().equals("")){
                txtTempo.setBorder(new LineBorder(new java.awt.Color(178,34,34)));
            }
            if(txtJuros.getText()==null || txtJuros.getText().trim().equals("")){
                txtJuros.setBorder(new LineBorder(new java.awt.Color(178,34,34)));
            }
            JOptionPane.showMessageDialog(null, "Preencha Todos os campos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new MainMenu_1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jComboTaxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTaxaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTaxaActionPerformed

    private void jComboTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTempoActionPerformed

    private void InfoTaxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoTaxaActionPerformed

        JOptionPane.showMessageDialog(null,"a.a -> ao ano \na.m-> ao mês\na.d -> ao dia");
    }//GEN-LAST:event_InfoTaxaActionPerformed

    private void txtCapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapKeyTyped
        String caracteres="0987654321";
        txtCap.setBorder(new LineBorder(new java.awt.Color(204,204,204)));
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }//GEN-LAST:event_txtCapKeyTyped

    private void txtTaxaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaxaKeyTyped
        String caracteres="0987654321";
        txtTaxa.setBorder(new LineBorder(new java.awt.Color(204,204,204)));
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }//GEN-LAST:event_txtTaxaKeyTyped

    private void txtTempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTempoKeyTyped
        String caracteres="0987654321";
        txtTempo.setBorder(new LineBorder(new java.awt.Color(204,204,204)));
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }//GEN-LAST:event_txtTempoKeyTyped

    private void txtJurosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJurosKeyTyped
        String caracteres="0987654321";
        txtJuros.setBorder(new LineBorder(new java.awt.Color(204,204,204)));
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }//GEN-LAST:event_txtJurosKeyTyped

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
            java.util.logging.Logger.getLogger(JurosSimplesSDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JurosSimplesSDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JurosSimplesSDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JurosSimplesSDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JurosSimplesSDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InfoTaxa;
    private javax.swing.JButton btnCap;
    private javax.swing.JButton btnCapExplicado;
    private javax.swing.JButton btnJuros;
    private javax.swing.JButton btnJurosExplicado;
    private javax.swing.JButton btnMontante;
    private javax.swing.JButton btnMontanteExplicado;
    private javax.swing.JButton btnTaxa;
    private javax.swing.JButton btnTaxaExplicado;
    private javax.swing.JButton btnTempo;
    private javax.swing.JButton btnTempoExplicado;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jCapRes;
    private javax.swing.JComboBox<String> jComboTaxa;
    private javax.swing.JComboBox<String> jComboTempo;
    private javax.swing.JLabel jJurosRes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jMontRes;
    private javax.swing.JLabel jTaxaRes;
    private javax.swing.JLabel jTempoRes;
    private javax.swing.JLabel lblCap;
    private javax.swing.JLabel lblJuros;
    private javax.swing.JLabel lblMontante;
    private javax.swing.JLabel lblTaxa;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JTextField txtCap;
    private javax.swing.JTextField txtJuros;
    private javax.swing.JTextField txtTaxa;
    private javax.swing.JTextField txtTempo;
    // End of variables declaration//GEN-END:variables
}
