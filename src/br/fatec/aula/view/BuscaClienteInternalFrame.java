
package br.fatec.aula.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.DAO.ClienteDAO;
import model.bean.Cliente;

public class BuscaClienteInternalFrame extends javax.swing.JInternalFrame {

    public BuscaClienteInternalFrame() {
        initComponents();
        DefaultTableModel clientes1 = (DefaultTableModel) clienteTable2.getModel();
        clienteTable2.setRowSorter(new TableRowSorter(clientes1));

        readTable();
    }
    public void readTable() {

        DefaultTableModel clientes1 = (DefaultTableModel) clienteTable2.getModel();
        clientes1.setNumRows(0);

        ClienteDAO pdao = new ClienteDAO();

        for (Cliente c : pdao.read()) {

            clientes1.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getEmail(),
                c.getCPF(),
                c.getTelefone(),
                c.getSexo(),
                c.getRua(),
                c.getNumero(),
                c.getBairro(),
                c.getCidade(),
                c.getCEP(),
                c.getUF()
            });

        }}
    
    public void burcarpornome(String nome) {

        DefaultTableModel clientes1 = (DefaultTableModel) clienteTable2.getModel();
        clientes1.setNumRows(0);

        ClienteDAO pdao = new ClienteDAO();

        for (Cliente c : pdao.buscar(nome)) {

            clientes1.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getEmail(),
                c.getCPF(),
                c.getTelefone(),
                c.getSexo(),
                c.getRua(),
                c.getNumero(),
                c.getBairro(),
                c.getCidade(),
                c.getCEP(),
                c.getUF()
            });

        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscaPanel = new javax.swing.JPanel();
        buscaTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        clienteTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        buscarLabel = new javax.swing.JLabel();
        deletarLabel = new javax.swing.JLabel();

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

        jScrollPane2.setBackground(new java.awt.Color(255, 152, 0));

        clienteTable2.setForeground(new java.awt.Color(255, 167, 38));
        clienteTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Email", "CPF", "Telefone", "Sexo", "Rua", "Numero", "Bairro", "Cidade", "CEP", "UF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(clienteTable2);

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

        javax.swing.GroupLayout buscaPanelLayout = new javax.swing.GroupLayout(buscaPanel);
        buscaPanel.setLayout(buscaPanelLayout);
        buscaPanelLayout.setHorizontalGroup(
            buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(buscaTextField))
                .addGap(10, 10, 10)
                .addComponent(buscarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if (clienteTable2.getSelectedRow() != -1) {

            Cliente c = new Cliente();
            ClienteDAO dao = new ClienteDAO();

            c.setId((int) clienteTable2.getValueAt(clienteTable2.getSelectedRow(), 0));

            dao.delete(c);
            
            readTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_deletarLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buscaPanel;
    private javax.swing.JTextField buscaTextField;
    private javax.swing.JLabel buscarLabel;
    private javax.swing.JTable clienteTable2;
    private javax.swing.JLabel deletarLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}