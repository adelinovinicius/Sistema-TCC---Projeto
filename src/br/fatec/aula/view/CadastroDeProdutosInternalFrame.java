
package br.fatec.aula.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DAO.ProdutoDAO;
import model.bean.Produto;

public class CadastroDeProdutosInternalFrame extends javax.swing.JInternalFrame {

    public CadastroDeProdutosInternalFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeProdutoTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        produtosScrollPane2 = new javax.swing.JScrollPane();
        produtosTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cadastrarProdutosButton = new javax.swing.JButton();
        atualizarProdutoButton = new javax.swing.JButton();
        excluirProdutoButton = new javax.swing.JButton();
        limparProdutoButton = new javax.swing.JButton();
        valorProdutoTextField = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        codigoLojaProprietariaTextField = new javax.swing.JTextField();
        codigoFornecedorTextField = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Cadastro de Produtos");

        jLabel1.setText("Nome");

        jLabel2.setText("Valor");

        jLabel5.setText("Codigo da Loja Proprietaria");

        jLabel9.setText("Codigo da Fornec. Proprietaria");

        produtosTable2.setBackground(new java.awt.Color(44, 62, 80));
        produtosTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        produtosTable2.setForeground(new java.awt.Color(255, 255, 255));
        produtosTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Produto", "Qtde.", "V. Unit. (R$)", "Cod. Loja", "Cod. Fornecedor", "V. Total (R$)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        produtosTable2.getTableHeader().setReorderingAllowed(false);
        produtosTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtosTable2MouseClicked(evt);
            }
        });
        produtosScrollPane2.setViewportView(produtosTable2);

        jLabel3.setText("Qtde.");

        cadastrarProdutosButton.setText("Cadastrar");
        cadastrarProdutosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProdutosButtonActionPerformed(evt);
            }
        });

        atualizarProdutoButton.setText("Atualizar");

        excluirProdutoButton.setText("Excluir");

        limparProdutoButton.setText("Limpar");
        limparProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparProdutoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(produtosScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codigoLojaProprietariaTextField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codigoFornecedorTextField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(valorProdutoTextField)
                            .addComponent(txtQtd, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atualizarProdutoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(excluirProdutoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(limparProdutoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadastrarProdutosButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(atualizarProdutoButton)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(limparProdutoButton)
                    .addComponent(cadastrarProdutosButton)
                    .addComponent(valorProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLojaProprietariaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(excluirProdutoButton)
                    .addComponent(codigoFornecedorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(produtosScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void produtosTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtosTable2MouseClicked

        int linhaSelecionada = produtosTable2.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha!");
            return;
        }

        DefaultTableModel tabela = (DefaultTableModel) produtosTable2.getModel();
        // Retirar da tabela
        Object nomeObj = tabela.getValueAt(linhaSelecionada, 0);
        Object quantidadeObj = tabela.getValueAt(linhaSelecionada, 1);
        Object valorUnitObj = tabela.getValueAt(linhaSelecionada, 2);
        // Colocar nos campos
        //escricaoTextField1.setText(String.valueOf(descricaoObj));
        //qtdeFormattedTextField.setText(String.valueOf(quantidadeObj));
        //valorFormattedTextField.setText(String.valueOf(valorObj));
    }//GEN-LAST:event_produtosTable2MouseClicked

    private void cadastrarProdutosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProdutosButtonActionPerformed
      
        Produto p = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
        
        p.setNome(nomeProdutoTextField.getText());
        p.setQtd((Integer.parseInt(txtQtd.getText())));
        p.setValor(Double.parseDouble(valorProdutoTextField.getText()));
        //p.setCodfornecedorproprietario((Integer.parseInt(codigoFornecedorTextField.getText())));
       // p.setCodlojaproprietaria((Integer.parseInt(codigoLojaProprietariaTextField.getText())));
        
        dao.create(p);

    }//GEN-LAST:event_cadastrarProdutosButtonActionPerformed

    private void limparProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparProdutoButtonActionPerformed
       /* nomeClienteTextField.setText("");
        cpfClienteFormattedTextField.setText("");
        sexoComboBox.setSelectedIndex(0);
        ruaClienteTextField.setText("");
        bairroClienteTextField.setText("");
        cidadeClienteTextField.setText("");
        cepClienteFormattedTextField.setText("");
        estadoClienteComboBox.setSelectedIndex(0);
        telefoneClienteFormattedTextField.setText("");
        tipoTelefoneComboBox.setSelectedIndex(0);
        emailClienteTextField.setText("");*/
    }//GEN-LAST:event_limparProdutoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarProdutoButton;
    private javax.swing.JButton cadastrarProdutosButton;
    private javax.swing.JTextField codigoFornecedorTextField;
    private javax.swing.JTextField codigoLojaProprietariaTextField;
    private javax.swing.JButton excluirProdutoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limparProdutoButton;
    private javax.swing.JTextField nomeProdutoTextField;
    private javax.swing.JScrollPane produtosScrollPane2;
    private javax.swing.JTable produtosTable2;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField valorProdutoTextField;
    // End of variables declaration//GEN-END:variables

}
