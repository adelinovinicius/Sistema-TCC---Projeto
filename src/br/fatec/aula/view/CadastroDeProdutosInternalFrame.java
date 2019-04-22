package br.fatec.aula.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.DAO.LojaDAO;
import model.DAO.ProdutoDAO;
import model.bean.Loja;
import model.bean.Produto;

public class CadastroDeProdutosInternalFrame extends javax.swing.JInternalFrame {

    public CadastroDeProdutosInternalFrame() {
        initComponents();

        LojaDAO dao = new LojaDAO();

        for (Loja l : dao.read()) {

            cbLoja.addItem(l);

        }

        DefaultTableModel produtos1 = (DefaultTableModel) produtoTable.getModel();
        produtoTable.setRowSorter(new TableRowSorter(produtos1));

        readTable();
    }

    public void readTable() {

        DefaultTableModel produtos1 = (DefaultTableModel) produtoTable.getModel();
        produtos1.setNumRows(0);

        ProdutoDAO pdao = new ProdutoDAO();

        for (Produto p : pdao.read()) {

            produtos1.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getQtd(),
                p.getValor(),
                p.getCodlojaproprietaria()
            });

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeProdutoTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valorProdutoTextField = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cadastrarProdutosButton = new javax.swing.JButton();
        atualizarProdutoButton = new javax.swing.JButton();
        cbLoja = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtoTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Cadastro de Produtos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 167, 38));
        jLabel1.setText("Descrição");

        nomeProdutoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        jLabel2.setForeground(new java.awt.Color(255, 167, 38));
        jLabel2.setText("Valor Unit.");

        jLabel5.setForeground(new java.awt.Color(255, 167, 38));
        jLabel5.setText("Loja Proprietaria");

        jLabel3.setForeground(new java.awt.Color(255, 167, 38));
        jLabel3.setText("Qtde.");

        valorProdutoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        txtQtd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        cadastrarProdutosButton.setBackground(new java.awt.Color(255, 167, 38));
        cadastrarProdutosButton.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarProdutosButton.setText("Cadastrar");
        cadastrarProdutosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProdutosButtonActionPerformed(evt);
            }
        });

        atualizarProdutoButton.setBackground(new java.awt.Color(255, 167, 38));
        atualizarProdutoButton.setForeground(new java.awt.Color(255, 255, 255));
        atualizarProdutoButton.setText("Atualizar");
        atualizarProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarProdutoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastrarProdutosButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(atualizarProdutoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cadastrarProdutosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizarProdutoButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbLoja.setForeground(new java.awt.Color(255, 167, 38));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(nomeProdutoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(cbLoja, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addGap(169, 169, 169))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQtd)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valorProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbLoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        produtoTable.setForeground(new java.awt.Color(255, 167, 38));
        produtoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Qtde.", "Valor Unitario", "Cod. Loja"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        produtoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtoTableMouseClicked(evt);
            }
        });
        produtoTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                produtoTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(produtoTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarProdutosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProdutosButtonActionPerformed

        Produto p = new Produto();
        ProdutoDAO dao = new ProdutoDAO();

        p.setNome(nomeProdutoTextField.getText());
        p.setQtd((Integer.parseInt(txtQtd.getText())));
        p.setValor(Double.parseDouble(valorProdutoTextField.getText()));
        p.setCodlojaproprietaria((Loja) cbLoja.getSelectedItem());

        dao.create(p);
        
        nomeProdutoTextField.setText("");
        txtQtd.setText("");
        cbLoja.setSelectedIndex(0);
        valorProdutoTextField.setText("");
        
        readTable();

    }//GEN-LAST:event_cadastrarProdutosButtonActionPerformed

    private void atualizarProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarProdutoButtonActionPerformed

        if (produtoTable.getSelectedRow() != -1) {

            Produto p = new Produto();
            ProdutoDAO dao = new ProdutoDAO();

            p.setNome(nomeProdutoTextField.getText());
            p.setQtd((Integer.parseInt(txtQtd.getText())));
            p.setValor(Double.parseDouble(valorProdutoTextField.getText()));
            p.setCodlojaproprietaria((Loja) cbLoja.getSelectedItem());
            p.setId((int) produtoTable.getValueAt(produtoTable.getSelectedRow(), 0));

            dao.update(p);

            nomeProdutoTextField.setText("");
            txtQtd.setText("");
            valorProdutoTextField.setText("");
            cbLoja.setSelectedIndex(0);
        
            readTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para atualizar !.");
        }
        
    }//GEN-LAST:event_atualizarProdutoButtonActionPerformed

    private void produtoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtoTableMouseClicked
        if (produtoTable.getSelectedRow() != -1) {

            nomeProdutoTextField.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 1).toString());
            txtQtd.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 2).toString());
            valorProdutoTextField.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 3).toString());
            cbLoja.setSelectedItem(produtoTable.getValueAt(produtoTable.getSelectedRow(), 4).toString());
        }     
    }//GEN-LAST:event_produtoTableMouseClicked

    private void produtoTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_produtoTableKeyReleased
        if (produtoTable.getSelectedRow() != -1) {

            nomeProdutoTextField.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 1).toString());
            txtQtd.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 2).toString());
            valorProdutoTextField.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 3).toString());
            cbLoja.setSelectedItem(produtoTable.getValueAt(produtoTable.getSelectedRow(), 4).toString());
        } 
    }//GEN-LAST:event_produtoTableKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarProdutoButton;
    private javax.swing.JButton cadastrarProdutosButton;
    private javax.swing.JComboBox<Object> cbLoja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeProdutoTextField;
    private javax.swing.JTable produtoTable;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField valorProdutoTextField;
    // End of variables declaration//GEN-END:variables
}
