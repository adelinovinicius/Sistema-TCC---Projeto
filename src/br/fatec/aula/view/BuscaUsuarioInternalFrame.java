package br.fatec.aula.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.DAO.loginDAO;
import model.bean.Login;

public class BuscaUsuarioInternalFrame extends javax.swing.JInternalFrame {

    public BuscaUsuarioInternalFrame() {
        initComponents();
        DefaultTableModel loja1 = (DefaultTableModel) UsuarioTable.getModel();
        UsuarioTable.setRowSorter(new TableRowSorter(loja1));

        readTable();
    }

    public void readTable() {

        DefaultTableModel login1 = (DefaultTableModel) UsuarioTable.getModel();
        login1.setNumRows(0);

        loginDAO pdao = new loginDAO();

        for (Login l : pdao.read()) {

            login1.addRow(new Object[]{
                l.getId(),
                l.getUsuario(),
                l.getSenha(),
                l.getTipo()
                    
            });
        }
    }
    
    public void burcarpornome(String nome) {

        DefaultTableModel login1 = (DefaultTableModel) UsuarioTable.getModel();
        login1.setNumRows(0);

        loginDAO pdao = new loginDAO();

        for (Login l : pdao.buscar(nome)) {

            login1.addRow(new Object[]{
                l.getId(),
                l.getUsuario(),
                l.getSenha(),
                l.getTipo()
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
        UsuarioTable = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);
        setTitle("Buscar  / Deletar Usuario");

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
        jLabel1.setText("E-Mail (Usuario)");

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

        UsuarioTable.setForeground(new java.awt.Color(255, 167, 38));
        UsuarioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Senha", "Tipo Cliente"
            }
        ));
        UsuarioTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuarioTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UsuarioTable);

        javax.swing.GroupLayout buscaPanelLayout = new javax.swing.GroupLayout(buscaPanel);
        buscaPanel.setLayout(buscaPanelLayout);
        buscaPanelLayout.setHorizontalGroup(
            buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(buscaTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
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
                .addGap(18, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buscaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
        if (UsuarioTable.getSelectedRow() != -1) {

            Login c = new Login();
            loginDAO dao = new loginDAO();

            c.setId((int) UsuarioTable.getValueAt(UsuarioTable.getSelectedRow(), 0));

            dao.delete(c);

            readTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Usuario para excluir.");
        }
    }//GEN-LAST:event_deletarLabelMouseClicked

    private void UsuarioTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioTableMouseClicked

    }//GEN-LAST:event_UsuarioTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UsuarioTable;
    private javax.swing.JPanel buscaPanel;
    private javax.swing.JTextField buscaTextField;
    private javax.swing.JLabel buscarLabel;
    private javax.swing.JLabel deletarLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
