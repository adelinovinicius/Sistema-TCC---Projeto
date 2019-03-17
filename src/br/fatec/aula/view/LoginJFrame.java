package br.fatec.aula.view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.DAO.loginDAO;

public class LoginJFrame extends javax.swing.JFrame {

    public LoginJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalJPanel = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        usuarioTextField = new javax.swing.JTextField();
        usuarioLabel = new javax.swing.JLabel();
        senhaLabe2 = new javax.swing.JLabel();
        senhaTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("loginJFrame"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        principalJPanel.setBackground(new java.awt.Color(255, 153, 51));
        principalJPanel.setForeground(new java.awt.Color(255, 255, 255));

        imageLabel.setBackground(new java.awt.Color(255, 153, 0));
        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tituloLabel.setBackground(new java.awt.Color(255, 153, 51));
        tituloLabel.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("Sistema de Compras de Produtos de Construção Civil");

        usuarioTextField.setBorder(null);

        usuarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        usuarioLabel.setText("Usuario");

        senhaLabe2.setForeground(new java.awt.Color(255, 255, 255));
        senhaLabe2.setText("Senha");

        senhaTextField.setBorder(null);

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        loginButton.setMnemonic('l');
        loginButton.setText("Login !");
        loginButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginButtonKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/fatec/aula/photo/app logo 6.png"))); // NOI18N

        javax.swing.GroupLayout principalJPanelLayout = new javax.swing.GroupLayout(principalJPanel);
        principalJPanel.setLayout(principalJPanelLayout);
        principalJPanelLayout.setHorizontalGroup(
            principalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalJPanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addGroup(principalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalJPanelLayout.createSequentialGroup()
                        .addComponent(usuarioLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(principalJPanelLayout.createSequentialGroup()
                        .addComponent(senhaLabe2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(principalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(182, 182, 182)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(principalJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(364, 364, 364))
        );
        principalJPanelLayout.setVerticalGroup(
            principalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalJPanelLayout.createSequentialGroup()
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(principalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(imageLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalJPanelLayout.createSequentialGroup()
                            .addGroup(principalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(usuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(principalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(senhaLabe2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(475, 475, 475))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginButtonKeyPressed

        /*int tecla  = evt.getKeyCode();
        if (tecla == KeyEvent.VK_ENTER) {
            loginDAO dao = new loginDAO();

            if (dao.checkLogin(usuarioTextField.getText(), senhaTextField.getText())) {

                new PrincipalFrame().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválido,"
                    + "Contate ao Administrador!");
            }

        }*/
    }//GEN-LAST:event_loginButtonKeyPressed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        getRootPane().setDefaultButton(loginButton);

        loginDAO dao = new loginDAO();

        if (dao.checkLogin(usuarioTextField.getText(), senhaTextField.getText())) {

            new PrincipalFrame().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválido,"
                + "Contate ao Administrador!");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel principalJPanel;
    private javax.swing.JLabel senhaLabe2;
    private javax.swing.JTextField senhaTextField;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables
}
