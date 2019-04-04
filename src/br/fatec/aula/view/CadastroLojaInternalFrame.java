
package br.fatec.aula.view;

import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import model.DAO.LojaDAO;
import model.bean.Loja;

public class CadastroLojaInternalFrame extends javax.swing.JInternalFrame {

    public CadastroLojaInternalFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        CadastroLojaPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        GravarjButton = new javax.swing.JButton();
        LimparjButton = new javax.swing.JButton();
        NomeLojaTextField = new javax.swing.JTextField();
        CNPJLojajFormattedTextField = new javax.swing.JFormattedTextField();
        telefoneLojaFormattedTextField = new javax.swing.JFormattedTextField();
        tipoTelefoneLojaComboBox = new javax.swing.JComboBox<>();
        EmailLojaTextField1 = new javax.swing.JTextField();
        estadoLojaComboBox = new javax.swing.JComboBox<>();
        cepLojaFormattedTextField = new javax.swing.JFormattedTextField();
        RuaLojaTextField = new javax.swing.JTextField();
        numeroLojaFormattedTextField = new javax.swing.JFormattedTextField();
        BairroLojaTextField = new javax.swing.JTextField();
        cidadeLojaTextField = new javax.swing.JTextField();
        taxadeEntregaTextField = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setTitle("Cadastro de Loja");

        CadastroLojaPanel.setBackground(new java.awt.Color(255, 255, 255));
        CadastroLojaPanel.setForeground(new java.awt.Color(255, 167, 38));

        jLabel1.setForeground(new java.awt.Color(255, 167, 38));
        jLabel1.setText("Nome ");

        jLabel2.setForeground(new java.awt.Color(255, 167, 38));
        jLabel2.setText("CNPJ");

        jLabel3.setForeground(new java.awt.Color(255, 167, 38));
        jLabel3.setText("Fone");

        jLabel6.setForeground(new java.awt.Color(255, 167, 38));
        jLabel6.setText("Taxa de Entrega (R$)");

        jLabel7.setForeground(new java.awt.Color(255, 167, 38));
        jLabel7.setText("CEP");

        jLabel8.setForeground(new java.awt.Color(255, 167, 38));
        jLabel8.setText("UF");

        jLabel9.setForeground(new java.awt.Color(255, 167, 38));
        jLabel9.setText("Rua");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 167, 38));
        jLabel10.setText("N °");

        jLabel11.setForeground(new java.awt.Color(255, 167, 38));
        jLabel11.setText("Cidade");

        jLabel12.setForeground(new java.awt.Color(255, 167, 38));
        jLabel12.setText("Bairro");

        jLabel13.setForeground(new java.awt.Color(255, 167, 38));
        jLabel13.setText("E - Mail");

        GravarjButton.setBackground(new java.awt.Color(255, 167, 38));
        GravarjButton.setForeground(new java.awt.Color(255, 255, 255));
        GravarjButton.setText("Cadastrar");
        GravarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GravarjButtonActionPerformed(evt);
            }
        });

        LimparjButton.setBackground(new java.awt.Color(255, 167, 38));
        LimparjButton.setForeground(new java.awt.Color(255, 255, 255));
        LimparjButton.setText("Limpar");

        NomeLojaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        CNPJLojajFormattedTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        try {
            CNPJLojajFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        telefoneLojaFormattedTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        try {
            telefoneLojaFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneLojaFormattedTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        tipoTelefoneLojaComboBox.setForeground(new java.awt.Color(255, 167, 38));
        tipoTelefoneLojaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celular Pessoal", "Celular Contato", "Telefone Pessoal", "Telefone Contato" }));
        tipoTelefoneLojaComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        tipoTelefoneLojaComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                tipoTelefoneLojaComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        EmailLojaTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        estadoLojaComboBox.setForeground(new java.awt.Color(255, 167, 38));
        estadoLojaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        estadoLojaComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        estadoLojaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoLojaComboBoxActionPerformed(evt);
            }
        });

        cepLojaFormattedTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        try {
            cepLojaFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        RuaLojaTextField.setToolTipText("");
        RuaLojaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        RuaLojaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RuaLojaTextFieldActionPerformed(evt);
            }
        });

        numeroLojaFormattedTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        numeroLojaFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.###"))));

        BairroLojaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        cidadeLojaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        taxadeEntregaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        javax.swing.GroupLayout CadastroLojaPanelLayout = new javax.swing.GroupLayout(CadastroLojaPanel);
        CadastroLojaPanel.setLayout(CadastroLojaPanelLayout);
        CadastroLojaPanelLayout.setHorizontalGroup(
            CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLojaPanelLayout.createSequentialGroup()
                                .addComponent(LimparjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(83, 83, 83)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel9)
                                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                                        .addComponent(cepLojaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numeroLojaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(GravarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CNPJLojajFormattedTextField)
                            .addComponent(jLabel3)
                            .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                                .addComponent(telefoneLojaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoTelefoneLojaComboBox, 0, 122, Short.MAX_VALUE))
                            .addComponent(jLabel13)
                            .addComponent(EmailLojaTextField1))
                        .addGap(18, 18, 18)
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RuaLojaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(jLabel12)
                            .addComponent(BairroLojaTextField)
                            .addComponent(jLabel11)
                            .addComponent(cidadeLojaTextField)))
                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(158, 158, 158))
                            .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                                .addComponent(taxadeEntregaTextField)
                                .addGap(18, 18, 18)))
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(estadoLojaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CadastroLojaPanelLayout.setVerticalGroup(
            CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepLojaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroLojaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CNPJLojajFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RuaLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneLojaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoTelefoneLojaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BairroLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLojaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxadeEntregaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoLojaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LimparjButton)
                    .addComponent(GravarjButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroLojaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CadastroLojaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoTelefoneLojaComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_tipoTelefoneLojaComboBoxPopupMenuWillBecomeInvisible
        telefoneLojaFormattedTextField.setText("");
        telefoneLojaFormattedTextField.setFormatterFactory(null);
        telefoneLojaFormattedTextField.setValue(null);
        String texto = tipoTelefoneLojaComboBox.getSelectedItem().toString();
        try {
            if (texto.contains("Telefone")) {
                MaskFormatter mascara = new MaskFormatter("(##) ####-####");
                DefaultFormatterFactory formato = new DefaultFormatterFactory(mascara);
                telefoneLojaFormattedTextField.setFormatterFactory(formato);
            } else {
                MaskFormatter mascara = new MaskFormatter("(##) 9####-####");
                DefaultFormatterFactory formato = new DefaultFormatterFactory(mascara);
                telefoneLojaFormattedTextField.setFormatterFactory(formato);
            }
        } catch (ParseException ex) {
            // Arqui vai um erro
        }
    }//GEN-LAST:event_tipoTelefoneLojaComboBoxPopupMenuWillBecomeInvisible

    private void RuaLojaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RuaLojaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RuaLojaTextFieldActionPerformed

    private void estadoLojaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoLojaComboBoxActionPerformed

    }//GEN-LAST:event_estadoLojaComboBoxActionPerformed

    private void GravarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GravarjButtonActionPerformed
        
        Loja l = new Loja();
        LojaDAO dao = new LojaDAO();
        
        l.setNome(NomeLojaTextField.getText());
        l.setCNPJ(CNPJLojajFormattedTextField.getText());
        l.setTelefone(telefoneLojaFormattedTextField.getText());
        l.setEmail(EmailLojaTextField1.getText());
        l.setTaxaentrega(Double.parseDouble(taxadeEntregaTextField.getText()));
        l.setCEP(cepLojaFormattedTextField.getText());
        l.setNumero((Integer.parseInt(numeroLojaFormattedTextField.getText())));
        l.setRua(RuaLojaTextField.getText());
        l.setBairro(BairroLojaTextField.getText());    
        l.setCidade(cidadeLojaTextField.getText());
        l.setUF((String) estadoLojaComboBox.getSelectedItem());
        
        dao.create(l);
        
        NomeLojaTextField.setText("");
        CNPJLojajFormattedTextField.setText("");
        telefoneLojaFormattedTextField.setText("");
        tipoTelefoneLojaComboBox.setSelectedIndex(0);
        EmailLojaTextField1.setText("");
        taxadeEntregaTextField.setText("");
        cepLojaFormattedTextField.setText("");
        numeroLojaFormattedTextField.setText("");
        RuaLojaTextField.setText("");
        BairroLojaTextField.setText("");
        cidadeLojaTextField.setText("");
        cidadeLojaTextField.setText("");
        estadoLojaComboBox.setSelectedIndex(0);
        
    }//GEN-LAST:event_GravarjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BairroLojaTextField;
    private javax.swing.JFormattedTextField CNPJLojajFormattedTextField;
    private javax.swing.JPanel CadastroLojaPanel;
    private javax.swing.JTextField EmailLojaTextField1;
    private javax.swing.JButton GravarjButton;
    private javax.swing.JButton LimparjButton;
    private javax.swing.JTextField NomeLojaTextField;
    private javax.swing.JTextField RuaLojaTextField;
    private javax.swing.JFormattedTextField cepLojaFormattedTextField;
    private javax.swing.JTextField cidadeLojaTextField;
    private javax.swing.JComboBox<String> estadoLojaComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JFormattedTextField numeroLojaFormattedTextField;
    private javax.swing.JTextField taxadeEntregaTextField;
    private javax.swing.JFormattedTextField telefoneLojaFormattedTextField;
    private javax.swing.JComboBox<String> tipoTelefoneLojaComboBox;
    // End of variables declaration//GEN-END:variables
}
