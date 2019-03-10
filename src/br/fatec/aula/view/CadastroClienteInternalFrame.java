package br.fatec.aula.view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class CadastroClienteInternalFrame extends javax.swing.JInternalFrame {

    public CadastroClienteInternalFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        dadosPessoaisPanel = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        cpfLabel = new javax.swing.JLabel();
        sexoLabel = new javax.swing.JLabel();
        sexoComboBox = new javax.swing.JComboBox<>();
        cpfClienteFormattedTextField = new javax.swing.JFormattedTextField();
        endereçoPanel = new javax.swing.JPanel();
        ruaClienteTextField = new javax.swing.JTextField();
        ruaLabel = new javax.swing.JLabel();
        bairroLabel = new javax.swing.JLabel();
        cidadeLabel = new javax.swing.JLabel();
        cidadeClienteTextField = new javax.swing.JTextField();
        bairroClienteTextField = new javax.swing.JTextField();
        cepClienteFormattedTextField = new javax.swing.JFormattedTextField();
        estadoClienteComboBox = new javax.swing.JComboBox<>();
        ufLabel = new javax.swing.JLabel();
        cepLabel = new javax.swing.JLabel();
        numeroLabel1 = new javax.swing.JLabel();
        numeroClienteTextField1 = new javax.swing.JTextField();
        senhaLabel1 = new javax.swing.JLabel();
        senhaClientePasswordField1 = new javax.swing.JPasswordField();
        limparButton = new javax.swing.JButton();
        cadastrarClienteButton = new javax.swing.JButton();
        emailClienteTextField = new javax.swing.JTextField();
        cpfLabel1 = new javax.swing.JLabel();
        nomeClienteTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        telefoneClienteLabel = new javax.swing.JLabel();
        telefoneClienteFormattedTextField = new javax.swing.JFormattedTextField();
        tipoTelefoneLabel = new javax.swing.JLabel();
        tipoTelefoneComboBox = new javax.swing.JComboBox<>();

        jFormattedTextField1.setText("jFormattedTextField1");

        setClosable(true);
        setTitle("Cadastro de Cliente");

        dadosPessoaisPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dadosPessoaisPanel.setForeground(new java.awt.Color(255, 255, 255));
        dadosPessoaisPanel.setToolTipText("");

        nomeLabel.setText("Usuario (E - Mail)");

        cpfLabel.setText("CPF");
        cpfLabel.setToolTipText("");

        sexoLabel.setText("Sexo");

        sexoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Feminino", "Masculino", "Outro" }));
        sexoComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cpfClienteFormattedTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            cpfClienteFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        endereçoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Endereço"));

        ruaClienteTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ruaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ruaLabel.setText("Rua");

        bairroLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bairroLabel.setText("Bairro");

        cidadeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cidadeLabel.setText("Cidade");

        cidadeClienteTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bairroClienteTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cepClienteFormattedTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            cepClienteFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        estadoClienteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        estadoClienteComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estadoClienteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoClienteComboBoxActionPerformed(evt);
            }
        });

        ufLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ufLabel.setText("UF");

        cepLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cepLabel.setText("CEP");

        numeroLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numeroLabel1.setText("  N°");

        numeroClienteTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout endereçoPanelLayout = new javax.swing.GroupLayout(endereçoPanel);
        endereçoPanel.setLayout(endereçoPanelLayout);
        endereçoPanelLayout.setHorizontalGroup(
            endereçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endereçoPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(endereçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(endereçoPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(cepLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cepClienteFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(ufLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estadoClienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(endereçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, endereçoPanelLayout.createSequentialGroup()
                            .addComponent(cidadeLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cidadeClienteTextField))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, endereçoPanelLayout.createSequentialGroup()
                            .addComponent(bairroLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bairroClienteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, endereçoPanelLayout.createSequentialGroup()
                            .addGroup(endereçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(numeroLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ruaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(endereçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ruaClienteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                .addComponent(numeroClienteTextField1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        endereçoPanelLayout.setVerticalGroup(
            endereçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endereçoPanelLayout.createSequentialGroup()
                .addGroup(endereçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruaClienteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(endereçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLabel1)
                    .addComponent(numeroClienteTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(endereçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairroClienteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(endereçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeClienteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(endereçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cepClienteFormattedTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(endereçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cepLabel)
                        .addComponent(ufLabel)
                        .addComponent(estadoClienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        senhaLabel1.setText("Senha");

        senhaClientePasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });

        cadastrarClienteButton.setText("Cadastrar");
        cadastrarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteButtonActionPerformed(evt);
            }
        });

        emailClienteTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cpfLabel1.setText("Nome ");
        cpfLabel1.setToolTipText("");

        nomeClienteTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nomeClienteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeClienteTextFieldActionPerformed(evt);
            }
        });

        emailLabel.setForeground(new java.awt.Color(255, 255, 255));

        telefoneClienteLabel.setText("Telefone");

        telefoneClienteFormattedTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            telefoneClienteFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneClienteFormattedTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        tipoTelefoneLabel.setText("Tipo");

        tipoTelefoneComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celular Pessoal", "Celular Contato", "Telefone Pessoal", "Telefone Contato" }));
        tipoTelefoneComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tipoTelefoneComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                tipoTelefoneComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout dadosPessoaisPanelLayout = new javax.swing.GroupLayout(dadosPessoaisPanel);
        dadosPessoaisPanel.setLayout(dadosPessoaisPanelLayout);
        dadosPessoaisPanelLayout.setHorizontalGroup(
            dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                        .addComponent(endereçoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipoTelefoneLabel)
                                    .addComponent(tipoTelefoneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefoneClienteLabel)
                                    .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cadastrarClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPessoaisPanelLayout.createSequentialGroup()
                        .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                                .addComponent(cpfLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sexoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sexoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                                        .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nomeLabel)
                                            .addComponent(senhaLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(emailLabel))
                                            .addComponent(senhaClientePasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emailClienteTextField)))
                                    .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(cpfLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(cpfClienteFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(telefoneClienteFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(16, 16, 16))))
        );
        dadosPessoaisPanelLayout.setVerticalGroup(
            dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfLabel1)
                    .addComponent(sexoLabel)
                    .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(emailClienteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(senhaLabel1)
                    .addComponent(senhaClientePasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneClienteLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpfClienteFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cpfLabel)
                        .addComponent(telefoneClienteFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(endereçoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoTelefoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoTelefoneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cadastrarClienteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(limparButton)
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dadosPessoaisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dadosPessoaisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoTelefoneComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_tipoTelefoneComboBoxPopupMenuWillBecomeInvisible
        telefoneClienteFormattedTextField.setText("");
        telefoneClienteFormattedTextField.setFormatterFactory(null);
        telefoneClienteFormattedTextField.setValue(null);
        String texto = tipoTelefoneComboBox.getSelectedItem().toString();
        try {
            if (texto.contains("Telefone")) {
                MaskFormatter mascara = new MaskFormatter("(##) ####-####");
                DefaultFormatterFactory formato = new DefaultFormatterFactory(mascara);
                telefoneClienteFormattedTextField.setFormatterFactory(formato);
            } else {
                MaskFormatter mascara = new MaskFormatter("(##) 9####-####");
                DefaultFormatterFactory formato = new DefaultFormatterFactory(mascara);
                telefoneClienteFormattedTextField.setFormatterFactory(formato);
            }
        } catch (ParseException ex) {
            // Arqui vai um erro
        }
    }//GEN-LAST:event_tipoTelefoneComboBoxPopupMenuWillBecomeInvisible

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        nomeClienteTextField.setText("");
        cpfClienteFormattedTextField.setText("");
        sexoComboBox.setSelectedIndex(0);
        ruaClienteTextField.setText("");
        bairroClienteTextField.setText("");
        cidadeClienteTextField.setText("");
        cepClienteFormattedTextField.setText("");
        estadoClienteComboBox.setSelectedIndex(0);
        telefoneClienteFormattedTextField.setText("");
        tipoTelefoneComboBox.setSelectedIndex(0);
        emailClienteTextField.setText("");
        
    }//GEN-LAST:event_limparButtonActionPerformed

    private void cadastrarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteButtonActionPerformed

        String nome = nomeClienteTextField.getText();
        String email = emailClienteTextField.getText();
        //String senha = senhaClientePasswordField1.getText();
        String cpf = cpfClienteFormattedTextField.getText();
        
        
        if (nome.isEmpty() || email.isEmpty() || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Favor preencher todos os campos!");
            return;
        }
        try {
            OutputStream saida = new FileOutputStream("D:\\cliente.txt",true);
            saida.write((nomeClienteTextField.getText()).getBytes());
            saida.write("\r\n".getBytes());
            saida.write((cpfClienteFormattedTextField.getText()).getBytes());
            saida.write("\r\n".getBytes());
            saida.write((sexoComboBox.getSelectedItem().toString()).getBytes());
            saida.write("\r\n".getBytes());
            saida.write((ruaClienteTextField.getText()).getBytes());
            saida.write("\r\n".getBytes());
            saida.write((bairroClienteTextField.getText()).getBytes());
            saida.write("\r\n".getBytes());
            saida.write((cidadeClienteTextField.getText()).getBytes());
            saida.write("\r\n".getBytes());
            saida.write((estadoClienteComboBox.getSelectedItem().toString()).getBytes());
            saida.write("\r\n".getBytes());
            saida.write((cepClienteFormattedTextField.getText()).getBytes());
            saida.write("\r\n".getBytes());
            saida.write((telefoneClienteFormattedTextField.getText()).getBytes());
            saida.write("\r\n".getBytes());
            saida.write((tipoTelefoneComboBox.getSelectedItem().toString()).getBytes());
            saida.write("\r\n".getBytes());
            saida.write((emailClienteTextField.getText()).getBytes());
            saida.write("\r\n".getBytes());

            saida.flush();
            saida.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CadastroClienteInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CadastroClienteInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cadastrarClienteButtonActionPerformed

    private void estadoClienteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoClienteComboBoxActionPerformed

    }//GEN-LAST:event_estadoClienteComboBoxActionPerformed

    private void nomeClienteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeClienteTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeClienteTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroClienteTextField;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JButton cadastrarClienteButton;
    private javax.swing.JFormattedTextField cepClienteFormattedTextField;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JTextField cidadeClienteTextField;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JFormattedTextField cpfClienteFormattedTextField;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JLabel cpfLabel1;
    private javax.swing.JPanel dadosPessoaisPanel;
    private javax.swing.JTextField emailClienteTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel endereçoPanel;
    private javax.swing.JComboBox<String> estadoClienteComboBox;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JButton limparButton;
    private javax.swing.JTextField nomeClienteTextField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField numeroClienteTextField1;
    private javax.swing.JLabel numeroLabel1;
    private javax.swing.JTextField ruaClienteTextField;
    private javax.swing.JLabel ruaLabel;
    private javax.swing.JPasswordField senhaClientePasswordField1;
    private javax.swing.JLabel senhaLabel1;
    private javax.swing.JComboBox<String> sexoComboBox;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JFormattedTextField telefoneClienteFormattedTextField;
    private javax.swing.JLabel telefoneClienteLabel;
    private javax.swing.JComboBox<String> tipoTelefoneComboBox;
    private javax.swing.JLabel tipoTelefoneLabel;
    private javax.swing.JLabel ufLabel;
    // End of variables declaration//GEN-END:variables
}
