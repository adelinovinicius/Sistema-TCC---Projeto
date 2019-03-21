
package br.fatec.aula.view;

public class PrincipalFrame extends javax.swing.JFrame {

    public PrincipalFrame() {
        initComponents();
   
    }

    @SuppressWarnings("unchecked")

    private CadastroClienteInternalFrame telaCliente = null;
    private CadastroLojaInternalFrame telacadastroloja = null;
    private CadastroDeProdutosInternalFrame telacadastroProduto = null;
    private comprasInternalFrame telaEvento = null;
    private EntregadorInternalFrame telaFornecedor = null;
    private BuscaClienteInternalFrame telaBuscaCliente = null;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        principalPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        funçoesMenuBar = new javax.swing.JMenuBar();
        clienteMenu = new javax.swing.JMenu();
        cadastroclienteMenuItem = new javax.swing.JMenuItem();
        cadastroclienteMenuItem1 = new javax.swing.JMenuItem();
        LojaMenu = new javax.swing.JMenu();
        cadastroLojaMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        cadastroFornecedorMenuItem = new javax.swing.JMenuItem();
        produtoMenu = new javax.swing.JMenu();
        cadastroProdutoMenuItem = new javax.swing.JMenuItem();
        comprasMenu = new javax.swing.JMenu();
        cadastrocomprasMenuItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Compras");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        principalPanel.setBackground(new java.awt.Color(255, 145, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/fatec/aula/photo/app logo 6.png"))); // NOI18N

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                .addContainerGap(449, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        principalPanelLayout.setVerticalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        funçoesMenuBar.setBackground(new java.awt.Color(255, 255, 255));
        funçoesMenuBar.setBorder(null);

        clienteMenu.setText("Clientes");

        cadastroclienteMenuItem.setText("CadastroCliente");
        cadastroclienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroclienteMenuItemActionPerformed(evt);
            }
        });
        clienteMenu.add(cadastroclienteMenuItem);

        cadastroclienteMenuItem1.setText("Busca de Clientes");
        cadastroclienteMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroclienteMenuItem1ActionPerformed(evt);
            }
        });
        clienteMenu.add(cadastroclienteMenuItem1);

        funçoesMenuBar.add(clienteMenu);

        LojaMenu.setText("Loja");

        cadastroLojaMenuItem.setText("Loja");
        cadastroLojaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroLojaMenuItemActionPerformed(evt);
            }
        });
        LojaMenu.add(cadastroLojaMenuItem);

        funçoesMenuBar.add(LojaMenu);

        jMenu1.setText("Fonecedor");

        cadastroFornecedorMenuItem.setText(" Fornecedor");
        cadastroFornecedorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFornecedorMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(cadastroFornecedorMenuItem);

        funçoesMenuBar.add(jMenu1);

        produtoMenu.setText("Produto");

        cadastroProdutoMenuItem.setText("Cadastro Produto");
        cadastroProdutoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroProdutoMenuItemActionPerformed(evt);
            }
        });
        produtoMenu.add(cadastroProdutoMenuItem);

        funçoesMenuBar.add(produtoMenu);

        comprasMenu.setText("Compras");

        cadastrocomprasMenuItem.setText("Cadastro Compra");
        cadastrocomprasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrocomprasMenuItemActionPerformed(evt);
            }
        });
        comprasMenu.add(cadastrocomprasMenuItem);

        funçoesMenuBar.add(comprasMenu);

        setJMenuBar(funçoesMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrocomprasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrocomprasMenuItemActionPerformed
        if (telaEvento != null && telaEvento.isVisible()) {
            return;
        }
        telaEvento = new comprasInternalFrame();
        telaEvento.setVisible(true);
        principalPanel.add(telaEvento);
    }//GEN-LAST:event_cadastrocomprasMenuItemActionPerformed

    private void cadastroclienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroclienteMenuItemActionPerformed
        if (telaCliente != null && telaCliente.isVisible()) {
            return;
        }
        telaCliente = new CadastroClienteInternalFrame();
        telaCliente.setVisible(true);
        principalPanel.add(telaCliente);
    }//GEN-LAST:event_cadastroclienteMenuItemActionPerformed

    private void cadastroLojaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroLojaMenuItemActionPerformed
        if (telacadastroloja != null && telacadastroloja.isVisible()) {
            return;
        }
        telacadastroloja = new CadastroLojaInternalFrame();
        telacadastroloja.setVisible(true);
        principalPanel.add(telacadastroloja);
    }//GEN-LAST:event_cadastroLojaMenuItemActionPerformed

    private void cadastroProdutoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroProdutoMenuItemActionPerformed
        if (telacadastroProduto != null && telacadastroProduto.isVisible()) {
            return;
        }
        telacadastroProduto = new CadastroDeProdutosInternalFrame();
        telacadastroProduto.setVisible(true);
        principalPanel.add(telacadastroProduto);
    }//GEN-LAST:event_cadastroProdutoMenuItemActionPerformed

    private void cadastroFornecedorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFornecedorMenuItemActionPerformed
        if (telaFornecedor != null && telaFornecedor.isVisible()) {
            return;
        }
        telaFornecedor = new EntregadorInternalFrame();
        telaFornecedor.setVisible(true);
        principalPanel.add(telaFornecedor);
    }//GEN-LAST:event_cadastroFornecedorMenuItemActionPerformed

    private void cadastroclienteMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroclienteMenuItem1ActionPerformed
        if (telaBuscaCliente != null && telaBuscaCliente.isVisible()) {
            return;
        }
        telaBuscaCliente = new BuscaClienteInternalFrame();
        telaBuscaCliente.setVisible(true);
        principalPanel.add(telaBuscaCliente);
    }//GEN-LAST:event_cadastroclienteMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu LojaMenu;
    private javax.swing.JMenuItem cadastroFornecedorMenuItem;
    private javax.swing.JMenuItem cadastroLojaMenuItem;
    private javax.swing.JMenuItem cadastroProdutoMenuItem;
    private javax.swing.JMenuItem cadastroclienteMenuItem;
    private javax.swing.JMenuItem cadastroclienteMenuItem1;
    private javax.swing.JMenuItem cadastrocomprasMenuItem;
    private javax.swing.JMenu clienteMenu;
    private javax.swing.JMenu comprasMenu;
    private javax.swing.JMenuBar funçoesMenuBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JMenu produtoMenu;
    // End of variables declaration//GEN-END:variables
}
