
package br.fatec.aula.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.DAO.LojaDAO;
import model.bean.Loja;

public class BuscaLojaInternalFrame extends javax.swing.JInternalFrame {

    public BuscaLojaInternalFrame() {
        initComponents();
        DefaultTableModel loja1 = (DefaultTableModel) LojaTable2.getModel();
        LojaTable2.setRowSorter(new TableRowSorter(loja1));

        readTable();
    }
    public void readTable() {

        DefaultTableModel loja1 = (DefaultTableModel) LojaTable2.getModel();
        loja1.setNumRows(0);

        LojaDAO pdao = new LojaDAO();

        for (Loja l : pdao.read()) {

            loja1.addRow(new Object[]{
                l.getId(),
                l.getNome(),
                l.getCNPJ(),
                l.getTelefone(),
                l.getEmail(),
                l.getTaxaentrega(),
                l.getCEP(),
                l.getNumero(),
                l.getRua(),
                l.getBairro(),
                l.getCidade(),
                l.getUF()
            });

        }

    }
    
    public void burcarpornome(String nome) {

        DefaultTableModel loja1 = (DefaultTableModel) LojaTable2.getModel();
        loja1.setNumRows(0);

        LojaDAO pdao = new LojaDAO();

        for (Loja l : pdao.buscar(nome)) {

            loja1.addRow(new Object[]{
                l.getId(),
                l.getNome(),
                l.getCNPJ(),
                l.getTelefone(),
                l.getEmail(),
                l.getTaxaentrega(),
                l.getCEP(),
                l.getNumero(),
                l.getRua(),
                l.getBairro(),
                l.getCidade(),
                l.getUF()
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
        jScrollPane1 = new javax.swing.JScrollPane();
        LojaTable2 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Buscar/Deletar Cliente");

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
        jLabel1.setText("Nome Cliente");

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

        LojaTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CNPJ", "Fone", "E-mail", "Entrega", "CEP", "N°", "Rua", "Bairro", "Cidade", "UF"
            }
        ));
        LojaTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LojaTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(LojaTable2);

        javax.swing.GroupLayout buscaPanelLayout = new javax.swing.GroupLayout(buscaPanel);
        buscaPanel.setLayout(buscaPanelLayout);
        buscaPanelLayout.setHorizontalGroup(
            buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 504, Short.MAX_VALUE))
                    .addComponent(buscaTextField))
                .addGap(10, 10, 10)
                .addComponent(buscarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        buscaPanelLayout.setVerticalGroup(
            buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscaPanelLayout.createSequentialGroup()
                .addGroup(buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscaPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(buscarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buscaPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buscaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(deletarLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if (LojaTable2.getSelectedRow() != -1) {

            Loja c = new Loja();
            LojaDAO dao = new LojaDAO();

            c.setId((int) LojaTable2.getValueAt(LojaTable2.getSelectedRow(), 0));

            dao.delete(c);
            
            readTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_deletarLabelMouseClicked

    private void LojaTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LojaTable2MouseClicked

    }//GEN-LAST:event_LojaTable2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable LojaTable2;
    private javax.swing.JPanel buscaPanel;
    private javax.swing.JTextField buscaTextField;
    private javax.swing.JLabel buscarLabel;
    private javax.swing.JLabel deletarLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}