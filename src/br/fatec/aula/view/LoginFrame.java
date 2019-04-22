package br.fatec.aula.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.DAO.loginDAO;

public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")

    private CadastroUsuarioFrame telaCadastroUsuario = null;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalJPanel = new javax.swing.JPanel();
        usuarioTextField = new javax.swing.JTextField();
        usuarioLabel = new javax.swing.JLabel();
        senhaLabe2 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        senhaPasswordField = new javax.swing.JPasswordField();
        loginButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("loginJFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        principalJPanel.setBackground(new java.awt.Color(255, 152, 0));
        principalJPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        principalJPanel.setForeground(new java.awt.Color(255, 255, 255));
        principalJPanel.setLayout(null);

        usuarioTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuarioTextField.setToolTipText("Digite seu Usuario");
        usuarioTextField.setBorder(null);
        principalJPanel.add(usuarioTextField);
        usuarioTextField.setBounds(10, 34, 233, 28);

        usuarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        usuarioLabel.setText("Usuario");
        principalJPanel.add(usuarioLabel);
        usuarioLabel.setBounds(10, 5, 60, 30);

        senhaLabe2.setForeground(new java.awt.Color(255, 255, 255));
        senhaLabe2.setText("Senha");
        principalJPanel.add(senhaLabe2);
        senhaLabe2.setBounds(10, 62, 90, 30);

        loginButton.setBackground(new java.awt.Color(255, 152, 0));
        loginButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/fatec/aula/photo/login-square-arrow-button-outline_icon-icons.com_73220.png"))); // NOI18N
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
        principalJPanel.add(loginButton);
        loginButton.setBounds(133, 120, 110, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/fatec/aula/photo/app logo 6.png"))); // NOI18N
        principalJPanel.add(jLabel1);
        jLabel1.setBounds(50, 190, 143, 85);

        senhaPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        senhaPasswordField.setToolTipText("Digite sua Senha");
        senhaPasswordField.setBorder(null);
        principalJPanel.add(senhaPasswordField);
        senhaPasswordField.setBounds(10, 88, 233, 26);

        loginButton1.setBackground(new java.awt.Color(255, 152, 0));
        loginButton1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        loginButton1.setForeground(new java.awt.Color(255, 255, 255));
        loginButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/fatec/aula/photo/exit_icon-icons.com_48304.png"))); // NOI18N
        loginButton1.setText("Sair");
        loginButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });
        loginButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginButton1KeyPressed(evt);
            }
        });
        principalJPanel.add(loginButton1);
        loginButton1.setBounds(10, 120, 105, 35);

        jLabel2.setBackground(new java.awt.Color(255, 152, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Crie uma conta ");
        jLabel2.setToolTipText("");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        principalJPanel.add(jLabel2);
        jLabel2.setBounds(40, 170, 170, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(principalJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
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
            
            if (dao.checkLogin(usuarioTextField.getText(), new String(senhaPasswordField.getPassword()))) {
                
                JFrame frame = new PrincipalFrame();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
                this.dispose();}
            else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválido,"
                    + "Contate ao Administrador!");}
            
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_loginButton1ActionPerformed

    private void loginButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton1KeyPressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        if (telaCadastroUsuario != null && telaCadastroUsuario.isVisible()) {
            return;
        }
        telaCadastroUsuario = new CadastroUsuarioFrame();
        telaCadastroUsuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginButton1;
    private javax.swing.JPanel principalJPanel;
    private javax.swing.JLabel senhaLabe2;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables
}
