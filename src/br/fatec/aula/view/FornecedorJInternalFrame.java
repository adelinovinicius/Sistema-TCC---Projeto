
package br.fatec.aula.view;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import model.DAO.FornecedorDAO;
import model.bean.Fornecedor;

public class FornecedorJInternalFrame extends javax.swing.JInternalFrame {

    public FornecedorJInternalFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FornecedorPanel = new javax.swing.JPanel();
        telefoneClienteLabel = new javax.swing.JLabel();
        tipoTelefoneLabel = new javax.swing.JLabel();
        tipoTelefoneProdutoComboBox = new javax.swing.JComboBox<>();
        telefoneFornecedorFormattedTextField = new javax.swing.JFormattedTextField();
        nomefornecedorTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        estadoLojaComboBox = new javax.swing.JComboBox<>();
        BairroFornecedorTextField = new javax.swing.JTextField();
        RuaFornecedorTextField = new javax.swing.JTextField();
        cidadeFornecedorTextField = new javax.swing.JTextField();
        numeroFornecedorFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        CEPFornecedorFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cadastrarButton = new javax.swing.JButton();
        excluirButton = new javax.swing.JButton();
        produtosScrollPane = new javax.swing.JScrollPane();
        produtosTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        emailFornecedorTextField = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Fornecedor");

        telefoneClienteLabel.setText("Telefone");

        tipoTelefoneLabel.setText("Tipo");

        tipoTelefoneProdutoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celular Pessoal", "Celular Contato", "Telefone Pessoal", "Telefone Contato" }));
        tipoTelefoneProdutoComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tipoTelefoneProdutoComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                tipoTelefoneProdutoComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        telefoneFornecedorFormattedTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            telefoneFornecedorFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneFornecedorFormattedTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        jLabel3.setText("Nome");

        estadoLojaComboBox.setBackground(new java.awt.Color(44, 62, 80));
        estadoLojaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        estadoLojaComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        estadoLojaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoLojaComboBoxActionPerformed(evt);
            }
        });

        RuaFornecedorTextField.setToolTipText("");
        RuaFornecedorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RuaFornecedorTextFieldActionPerformed(evt);
            }
        });

        numeroFornecedorFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.###"))));

        jLabel4.setText("CEP");

        try {
            CEPFornecedorFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("N° ");

        jLabel7.setText("Rua");

        jLabel8.setText("Bairro");

        jLabel1.setText("Cidade");

        jLabel2.setText("   UF");

        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        excluirButton.setText("Excluir");
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });

        produtosTable.setBackground(new java.awt.Color(44, 62, 80));
        produtosTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        produtosTable.setForeground(new java.awt.Color(255, 255, 255));
        produtosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "CEP", "N°", "Rua", "Bairro", "Cidade", "Estado", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        produtosTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtosTableMouseClicked(evt);
            }
        });
        produtosScrollPane.setViewportView(produtosTable);
        if (produtosTable.getColumnModel().getColumnCount() > 0) {
            produtosTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel5.setText(" Email");

        javax.swing.GroupLayout FornecedorPanelLayout = new javax.swing.GroupLayout(FornecedorPanel);
        FornecedorPanel.setLayout(FornecedorPanelLayout);
        FornecedorPanelLayout.setHorizontalGroup(
            FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FornecedorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FornecedorPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomefornecedorTextField))
                    .addGroup(FornecedorPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(RuaFornecedorTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FornecedorPanelLayout.createSequentialGroup()
                        .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FornecedorPanelLayout.createSequentialGroup()
                                .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefoneClienteLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CEPFornecedorFormattedTextField)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FornecedorPanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(telefoneFornecedorFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tipoTelefoneLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipoTelefoneProdutoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numeroFornecedorFormattedTextField)))
                    .addGroup(FornecedorPanelLayout.createSequentialGroup()
                        .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FornecedorPanelLayout.createSequentialGroup()
                                .addComponent(cadastrarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addComponent(BairroFornecedorTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estadoLojaComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cidadeFornecedorTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailFornecedorTextField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(produtosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FornecedorPanelLayout.setVerticalGroup(
            FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FornecedorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FornecedorPanelLayout.createSequentialGroup()
                        .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nomefornecedorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tipoTelefoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(telefoneFornecedorFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tipoTelefoneProdutoComboBox)
                            .addComponent(telefoneClienteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CEPFornecedorFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(numeroFornecedorFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(RuaFornecedorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BairroFornecedorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cidadeFornecedorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estadoLojaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(5, 5, 5)
                        .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(emailFornecedorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FornecedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cadastrarButton)
                            .addComponent(excluirButton)))
                    .addComponent(produtosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FornecedorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FornecedorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoTelefoneProdutoComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_tipoTelefoneProdutoComboBoxPopupMenuWillBecomeInvisible
        telefoneFornecedorFormattedTextField.setText("");
        telefoneFornecedorFormattedTextField.setFormatterFactory(null);
        telefoneFornecedorFormattedTextField.setValue(null);
        String texto = tipoTelefoneProdutoComboBox.getSelectedItem().toString();
        try {
            if (texto.contains("Telefone")) {
                MaskFormatter mascara = new MaskFormatter("(##) ####-####");
                DefaultFormatterFactory formato = new DefaultFormatterFactory(mascara);
                telefoneFornecedorFormattedTextField.setFormatterFactory(formato);
            } else {
                MaskFormatter mascara = new MaskFormatter("(##) 9####-####");
                DefaultFormatterFactory formato = new DefaultFormatterFactory(mascara);
                telefoneFornecedorFormattedTextField.setFormatterFactory(formato);
            }
        } catch (ParseException ex) {
            // Arqui vai um erro
        }
    }//GEN-LAST:event_tipoTelefoneProdutoComboBoxPopupMenuWillBecomeInvisible

    private void estadoLojaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoLojaComboBoxActionPerformed

    }//GEN-LAST:event_estadoLojaComboBoxActionPerformed

    private void RuaFornecedorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RuaFornecedorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RuaFornecedorTextFieldActionPerformed

    private void produtosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtosTableMouseClicked

        int linhaSelecionada = produtosTable.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha!");
            return;
        }

        DefaultTableModel tabela = (DefaultTableModel) produtosTable.getModel();
        // Retirar da tabela
        Object descricaoObj = tabela.getValueAt(linhaSelecionada, 0);
        Object quantidadeObj = tabela.getValueAt(linhaSelecionada, 1);
        Object valorObj = tabela.getValueAt(linhaSelecionada, 2);
        // Colocar nos campos
        //descricaoTextField1.setText(String.valueOf(descricaoObj));
        //qtdeFormattedTextField.setText(String.valueOf(quantidadeObj));
        //valorFormattedTextField.setText(String.valueOf(valorObj));
    }//GEN-LAST:event_produtosTableMouseClicked

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        
        Fornecedor f = new Fornecedor();
        FornecedorDAO dao = new FornecedorDAO();
        
        f.setNome(nomefornecedorTextField.getText());
        f.setEmail(emailFornecedorTextField.getText());
        f.setTelefone(telefoneFornecedorFormattedTextField.getText());
        f.setCEP(CEPFornecedorFormattedTextField.getText());
        f.setNumero((Integer.parseInt(numeroFornecedorFormattedTextField.getText())));
        f.setRua(RuaFornecedorTextField.getText());
        f.setBairro(BairroFornecedorTextField.getText());
        f.setCidade(cidadeFornecedorTextField.getText());
        //f.setUFFornecedor(estadoLojaComboBox.getText());        
        
        dao.create(f);
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BairroFornecedorTextField;
    private javax.swing.JFormattedTextField CEPFornecedorFormattedTextField;
    private javax.swing.JPanel FornecedorPanel;
    private javax.swing.JTextField RuaFornecedorTextField;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JTextField cidadeFornecedorTextField;
    private javax.swing.JTextField emailFornecedorTextField;
    private javax.swing.JComboBox<String> estadoLojaComboBox;
    private javax.swing.JButton excluirButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nomefornecedorTextField;
    private javax.swing.JFormattedTextField numeroFornecedorFormattedTextField;
    private javax.swing.JScrollPane produtosScrollPane;
    private javax.swing.JTable produtosTable;
    private javax.swing.JLabel telefoneClienteLabel;
    private javax.swing.JFormattedTextField telefoneFornecedorFormattedTextField;
    private javax.swing.JLabel tipoTelefoneLabel;
    private javax.swing.JComboBox<String> tipoTelefoneProdutoComboBox;
    // End of variables declaration//GEN-END:variables
}
