
package br.fatec.aula.view;

import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

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
        jLabel5 = new javax.swing.JLabel();
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
        senhaLojaPasswordField1 = new javax.swing.JPasswordField();
        estadoLojaComboBox = new javax.swing.JComboBox<>();
        taxaDeEntregaLojaFormattedTextField = new javax.swing.JFormattedTextField();
        cepLojaFormattedTextField = new javax.swing.JFormattedTextField();
        RuaLojaTextField = new javax.swing.JTextField();
        numeroLojaFormattedTextField = new javax.swing.JFormattedTextField();
        BairroLojaTextField = new javax.swing.JTextField();
        cidadeLojaTextField = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setTitle("Cadastro de Loja");

        jLabel1.setText("Nome ");

        jLabel2.setText("CNPJ");

        jLabel3.setText("Fone");

        jLabel5.setText("Senha");

        jLabel6.setText("Taxa de Entrega ");

        jLabel7.setText("CEP");

        jLabel8.setText("UF");

        jLabel9.setText("Rua");

        jLabel10.setText("N °");

        jLabel11.setText("Cidade");

        jLabel12.setText("Bairro");

        jLabel13.setText("E - Mail");

        GravarjButton.setText("Cadastrar");
        GravarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GravarjButtonActionPerformed(evt);
            }
        });

        LimparjButton.setText("Limpar");

        try {
            CNPJLojajFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        telefoneLojaFormattedTextField.setBackground(new java.awt.Color(240, 240, 240));
        telefoneLojaFormattedTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            telefoneLojaFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneLojaFormattedTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        tipoTelefoneLojaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celular Pessoal", "Celular Contato", "Telefone Pessoal", "Telefone Contato" }));
        tipoTelefoneLojaComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                tipoTelefoneLojaComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        estadoLojaComboBox.setBackground(new java.awt.Color(44, 62, 80));
        estadoLojaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        estadoLojaComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        estadoLojaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoLojaComboBoxActionPerformed(evt);
            }
        });

        taxaDeEntregaLojaFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        cepLojaFormattedTextField.setBackground(new java.awt.Color(240, 240, 240));
        cepLojaFormattedTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            cepLojaFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        RuaLojaTextField.setToolTipText("");
        RuaLojaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RuaLojaTextFieldActionPerformed(evt);
            }
        });

        numeroLojaFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.###"))));

        javax.swing.GroupLayout CadastroLojaPanelLayout = new javax.swing.GroupLayout(CadastroLojaPanel);
        CadastroLojaPanel.setLayout(CadastroLojaPanelLayout);
        CadastroLojaPanelLayout.setHorizontalGroup(
            CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                                .addComponent(telefoneLojaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tipoTelefoneLojaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CNPJLojajFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(NomeLojaTextField)))
                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senhaLojaPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailLojaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taxaDeEntregaLojaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cepLojaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroLojaFormattedTextField))
                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BairroLojaTextField)
                            .addComponent(cidadeLojaTextField)
                            .addComponent(estadoLojaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RuaLojaTextField)))
                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                        .addComponent(LimparjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(GravarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        CadastroLojaPanelLayout.setVerticalGroup(
            CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(cepLojaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(numeroLojaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CNPJLojajFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(RuaLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoTelefoneLojaComboBox, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(telefoneLojaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(BairroLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(EmailLojaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cidadeLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(senhaLojaPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(estadoLojaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(taxaDeEntregaLojaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LimparjButton)
                    .addComponent(GravarjButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CadastroLojaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroLojaPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        // TODO add your handling code here:
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JFormattedTextField numeroLojaFormattedTextField;
    private javax.swing.JPasswordField senhaLojaPasswordField1;
    private javax.swing.JFormattedTextField taxaDeEntregaLojaFormattedTextField;
    private javax.swing.JFormattedTextField telefoneLojaFormattedTextField;
    private javax.swing.JComboBox<String> tipoTelefoneLojaComboBox;
    // End of variables declaration//GEN-END:variables
}
