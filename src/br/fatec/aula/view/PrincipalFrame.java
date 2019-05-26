package br.fatec.aula.view;

public class PrincipalFrame extends javax.swing.JFrame {

    public PrincipalFrame() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")

    private CadastroClienteInternalFrame telaCliente = null;
    private CadastroLojaInternalFrame telacadastroloja = null;
    private CadastroDeProdutosInternalFrame telacadastroProduto = null;
    private comprasInternalFrame telaEvento = null;
    private CadastroEntregadorInternalFrame telaFornecedor = null;
    private BuscaClienteInternalFrame telaBuscaCliente = null;
    private BuscaLojaInternalFrame telaBuscaLoja = null;
    private BuscaEntregadorInternalFrame telaBuscaEntregador = null;
    private BuscaProdutoInternalFrame telaBuscaProduto = null;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        funçoesMenuBar = new javax.swing.JMenuBar();
        clienteMenu = new javax.swing.JMenu();
        cadastroclienteMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        buscaclienteMenuItem = new javax.swing.JMenuItem();
        LojaMenu = new javax.swing.JMenu();
        cadastroLojaMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        buscarLojaMenuItem = new javax.swing.JMenuItem();
        produtoMenu = new javax.swing.JMenu();
        cadastroProdutoMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        buscaProdutoMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        cadastroEntregadorMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        BuscaEntregadorMenuItem = new javax.swing.JMenuItem();
        comprasMenu = new javax.swing.JMenu();
        cadastrocomprasMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Compras");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        principalPanel.setBackground(new java.awt.Color(255, 255, 255));
        principalPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/fatec/aula/photo/app logo 6.png"))); // NOI18N

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addContainerGap(515, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        principalPanelLayout.setVerticalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        funçoesMenuBar.setBackground(new java.awt.Color(255, 167, 38));
        funçoesMenuBar.setBorder(null);
        funçoesMenuBar.setForeground(new java.awt.Color(255, 255, 255));

        clienteMenu.setForeground(new java.awt.Color(255, 255, 255));
        clienteMenu.setText("Clientes");

        cadastroclienteMenuItem.setBackground(new java.awt.Color(255, 255, 255));
        cadastroclienteMenuItem.setForeground(new java.awt.Color(255, 167, 38));
        cadastroclienteMenuItem.setText("Cadastro de Clientes");
        cadastroclienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroclienteMenuItemActionPerformed(evt);
            }
        });
        clienteMenu.add(cadastroclienteMenuItem);
        clienteMenu.add(jSeparator1);

        buscaclienteMenuItem.setBackground(new java.awt.Color(255, 255, 255));
        buscaclienteMenuItem.setForeground(new java.awt.Color(255, 167, 38));
        buscaclienteMenuItem.setText("Buscar/ Deletar Clientes");
        buscaclienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaclienteMenuItemActionPerformed(evt);
            }
        });
        clienteMenu.add(buscaclienteMenuItem);

        funçoesMenuBar.add(clienteMenu);

        LojaMenu.setForeground(new java.awt.Color(255, 255, 255));
        LojaMenu.setText("Loja");

        cadastroLojaMenuItem.setBackground(java.awt.Color.white);
        cadastroLojaMenuItem.setForeground(new java.awt.Color(255, 167, 38));
        cadastroLojaMenuItem.setText("Loja");
        cadastroLojaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroLojaMenuItemActionPerformed(evt);
            }
        });
        LojaMenu.add(cadastroLojaMenuItem);
        LojaMenu.add(jSeparator2);

        buscarLojaMenuItem.setBackground(new java.awt.Color(255, 255, 255));
        buscarLojaMenuItem.setForeground(new java.awt.Color(255, 167, 38));
        buscarLojaMenuItem.setText("Buscar / Deletar Loja");
        buscarLojaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarLojaMenuItemActionPerformed(evt);
            }
        });
        LojaMenu.add(buscarLojaMenuItem);

        funçoesMenuBar.add(LojaMenu);

        produtoMenu.setForeground(new java.awt.Color(255, 255, 255));
        produtoMenu.setText("Produto");

        cadastroProdutoMenuItem.setBackground(new java.awt.Color(255, 255, 255));
        cadastroProdutoMenuItem.setForeground(new java.awt.Color(255, 167, 38));
        cadastroProdutoMenuItem.setText("Cadastro Produto");
        cadastroProdutoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroProdutoMenuItemActionPerformed(evt);
            }
        });
        produtoMenu.add(cadastroProdutoMenuItem);
        produtoMenu.add(jSeparator4);

        buscaProdutoMenuItem.setBackground(new java.awt.Color(255, 255, 255));
        buscaProdutoMenuItem.setForeground(new java.awt.Color(255, 167, 38));
        buscaProdutoMenuItem.setText("Busca / Delete Produto");
        buscaProdutoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaProdutoMenuItemActionPerformed(evt);
            }
        });
        produtoMenu.add(buscaProdutoMenuItem);

        funçoesMenuBar.add(produtoMenu);

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Entregador");

        cadastroEntregadorMenuItem.setBackground(new java.awt.Color(255, 255, 255));
        cadastroEntregadorMenuItem.setForeground(new java.awt.Color(255, 167, 38));
        cadastroEntregadorMenuItem.setText("Entregador");
        cadastroEntregadorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroEntregadorMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(cadastroEntregadorMenuItem);
        jMenu1.add(jSeparator3);

        BuscaEntregadorMenuItem.setBackground(new java.awt.Color(255, 255, 255));
        BuscaEntregadorMenuItem.setForeground(new java.awt.Color(255, 167, 38));
        BuscaEntregadorMenuItem.setText("Busca  / Delete Entregador");
        BuscaEntregadorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaEntregadorMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(BuscaEntregadorMenuItem);

        funçoesMenuBar.add(jMenu1);

        comprasMenu.setForeground(new java.awt.Color(255, 255, 255));
        comprasMenu.setText("Compras");

        cadastrocomprasMenuItem.setBackground(new java.awt.Color(255, 255, 255));
        cadastrocomprasMenuItem.setForeground(new java.awt.Color(255, 167, 38));
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

    private void cadastroEntregadorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroEntregadorMenuItemActionPerformed
        if (telaFornecedor != null && telaFornecedor.isVisible()) {
            return;
        }
        telaFornecedor = new CadastroEntregadorInternalFrame();
        telaFornecedor.setVisible(true);
        principalPanel.add(telaFornecedor);
    }//GEN-LAST:event_cadastroEntregadorMenuItemActionPerformed

    private void buscaclienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaclienteMenuItemActionPerformed
        if (telaBuscaCliente != null && telaBuscaCliente.isVisible()) {
            return;
        }
        telaBuscaCliente = new BuscaClienteInternalFrame();
        telaBuscaCliente.setVisible(true);
        principalPanel.add(telaBuscaCliente);
    }//GEN-LAST:event_buscaclienteMenuItemActionPerformed

    private void buscarLojaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarLojaMenuItemActionPerformed
        if (telaBuscaLoja != null && telaBuscaLoja.isVisible()) {
            return;
        }
        telaBuscaLoja = new BuscaLojaInternalFrame();
        telaBuscaLoja.setVisible(true);
        principalPanel.add(telaBuscaLoja);
    }//GEN-LAST:event_buscarLojaMenuItemActionPerformed

    private void BuscaEntregadorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaEntregadorMenuItemActionPerformed
        if (telaBuscaEntregador != null && telaBuscaEntregador.isVisible()) {
            return;
        }
        telaBuscaEntregador = new BuscaEntregadorInternalFrame();
        telaBuscaEntregador.setVisible(true);
        principalPanel.add(telaBuscaEntregador);
    }//GEN-LAST:event_BuscaEntregadorMenuItemActionPerformed

    private void buscaProdutoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaProdutoMenuItemActionPerformed
        if (telaBuscaProduto != null && telaBuscaProduto.isVisible()) {
            return;
        }
        telaBuscaProduto= new BuscaProdutoInternalFrame();
        telaBuscaProduto.setVisible(true);
        principalPanel.add(telaBuscaProduto);
    }//GEN-LAST:event_buscaProdutoMenuItemActionPerformed

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
    private javax.swing.JMenuItem BuscaEntregadorMenuItem;
    private javax.swing.JMenu LojaMenu;
    private javax.swing.JMenuItem buscaProdutoMenuItem;
    private javax.swing.JMenuItem buscaclienteMenuItem;
    private javax.swing.JMenuItem buscarLojaMenuItem;
    private javax.swing.JMenuItem cadastroEntregadorMenuItem;
    private javax.swing.JMenuItem cadastroLojaMenuItem;
    private javax.swing.JMenuItem cadastroProdutoMenuItem;
    private javax.swing.JMenuItem cadastroclienteMenuItem;
    private javax.swing.JMenuItem cadastrocomprasMenuItem;
    private javax.swing.JMenu clienteMenu;
    private javax.swing.JMenu comprasMenu;
    private javax.swing.JMenuBar funçoesMenuBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JMenu produtoMenu;
    // End of variables declaration//GEN-END:variables
}
