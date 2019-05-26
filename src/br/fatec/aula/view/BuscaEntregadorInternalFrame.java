
package br.fatec.aula.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.DAO.EntregadorDAO;
import model.bean.Entregador;

public class BuscaEntregadorInternalFrame extends javax.swing.JInternalFrame {

    public BuscaEntregadorInternalFrame() {
        initComponents();
        DefaultTableModel entregadores1 = (DefaultTableModel) entregadorTable2.getModel();
        entregadorTable2.setRowSorter(new TableRowSorter(entregadores1));

        readTable();
    }
    public void readTable() {

        DefaultTableModel entregadores1 = (DefaultTableModel) entregadorTable2.getModel();
        entregadores1.setNumRows(0);

        EntregadorDAO pdao = new EntregadorDAO();

        for (Entregador e : pdao.read()) {

            entregadores1.addRow(new Object[]{
                e.getId(),
                e.getNome(),
                e.getEmail(),
                e.getCNH(),
                e.getTelefone(),
                e.getCEP(),
                e.getNumero(),
                e.getRua(),
                e.getBairro(),
                e.getCidade(),
                e.getUF()
                
            });
        }
    }
    
    public void burcarpornome(String nome) {

        DefaultTableModel entregadores = (DefaultTableModel) entregadorTable2.getModel();
        entregadores.setNumRows(0);

        EntregadorDAO pdao = new EntregadorDAO();

        for (Entregador e : pdao.buscar(nome)) {

            entregadores.addRow(new Object[]{
                e.getId(),
                e.getNome(),
                e.getEmail(),
                e.getTelefone(),
                e.getCNH(),
                e.getCidade(),
                e.getUF(),
                e.getCEP(),
                e.getRua(),
                e.getNumero()
                              
            });

        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscaPanel = new javax.swing.JPanel();
        buscaTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buscarLabel = new javax.swing.JLabel();
        deletarLabel = new javax.swing.JLabel();
        produtosScrollPane = new javax.swing.JScrollPane();
        entregadorTable2 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Buscar/Deletar Entregador");

        buscaPanel.setBackground(new java.awt.Color(255, 255, 255));
        buscaPanel.setForeground(new java.awt.Color(255, 255, 255));

        buscaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        buscaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 167, 38));
        jLabel1.setText("Nome Entregador");

        buscarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/fatec/aula/photo/findtheuser_search_search_theuser_4518.png"))); // NOI18N
        buscarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarLabelMouseClicked(evt);
            }
        });

        deletarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deletarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/fatec/aula/photo/close_icon-icons.com_50420.png"))); // NOI18N
        deletarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletarLabelMouseClicked(evt);
            }
        });

        entregadorTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        entregadorTable2.setForeground(new java.awt.Color(255, 167, 38));
        entregadorTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Email", "CNH", "Telefone", "CEP", "N°", "Rua", "Bairro", "Cidade", "Estado"
            }
        ));
        entregadorTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entregadorTable2MouseClicked(evt);
            }
        });
        produtosScrollPane.setViewportView(entregadorTable2);

        javax.swing.GroupLayout buscaPanelLayout = new javax.swing.GroupLayout(buscaPanel);
        buscaPanel.setLayout(buscaPanelLayout);
        buscaPanelLayout.setHorizontalGroup(
            buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscaTextField)
                    .addGroup(buscaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 474, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(produtosScrollPane)
        );
        buscaPanelLayout.setVerticalGroup(
            buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buscarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(buscaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deletarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(produtosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(buscaPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaTextFieldActionPerformed

    private void buscarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarLabelMouseClicked
        String busca = buscaTextField.getText();

        if (busca.isEmpty()) {

            readTable();
            JOptionPane.showMessageDialog(null, "Digite um nome para buscar ! ");

        } else {

            burcarpornome(buscaTextField.getText());
        }
        
    }//GEN-LAST:event_buscarLabelMouseClicked

    private void deletarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletarLabelMouseClicked
        if (entregadorTable2.getSelectedRow() != -1) {

            Entregador e = new Entregador();
            EntregadorDAO dao = new EntregadorDAO();

            e.setId((int) entregadorTable2.getValueAt(entregadorTable2.getSelectedRow(), 0));

            dao.delete(e);
            
            readTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um entregador para excluir.");
        }
    }//GEN-LAST:event_deletarLabelMouseClicked

    private void entregadorTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entregadorTable2MouseClicked
      
    }//GEN-LAST:event_entregadorTable2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buscaPanel;
    private javax.swing.JTextField buscaTextField;
    private javax.swing.JLabel buscarLabel;
    private javax.swing.JLabel deletarLabel;
    private javax.swing.JTable entregadorTable2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane produtosScrollPane;
    // End of variables declaration//GEN-END:variables

}