package br.fatec.aula.view;

import javax.swing.JOptionPane;
import model.DAO.loginDAO;
import model.DAO.tipoUsuarioDAO;
import model.bean.Login;
import model.bean.TipoUsuario;

public class CadastroUsuarioFrame extends javax.swing.JFrame {

    public CadastroUsuarioFrame() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        tipoUsuarioDAO dao = new tipoUsuarioDAO();

        for (TipoUsuario t : dao.read()) {

            tipoComboBox.addItem(t);

        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuarioTextField = new javax.swing.JTextField();
        cadastrarLabel = new javax.swing.JLabel();
        voltarLabel = new javax.swing.JLabel();
        senhaText = new javax.swing.JTextField();
        tipoComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 167, 38), 1, true));
        jPanel1.setForeground(new java.awt.Color(255, 167, 38));
        jPanel1.setToolTipText("");

        jLabel1.setForeground(new java.awt.Color(255, 167, 38));
        jLabel1.setText("Usuario (E-mail)");

        jLabel2.setForeground(new java.awt.Color(255, 167, 38));
        jLabel2.setText("Senha");

        usuarioTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuarioTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        cadastrarLabel.setForeground(new java.awt.Color(255, 167, 38));
        cadastrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cadastrarLabel.setText("Cadastrar");
        cadastrarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarLabelMouseClicked(evt);
            }
        });

        voltarLabel.setForeground(new java.awt.Color(255, 167, 38));
        voltarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        voltarLabel.setText("Voltar");
        voltarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarLabelMouseClicked(evt);
            }
        });

        senhaText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        senhaText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        tipoComboBox.setForeground(new java.awt.Color(255, 167, 38));
        tipoComboBox.setBorder(null);

        jLabel4.setForeground(new java.awt.Color(255, 167, 38));
        jLabel4.setText("Tipo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(usuarioTextField)
                        .addComponent(senhaText, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(voltarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cadastrarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(senhaText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarLabelMouseClicked
        if ((usuarioTextField.getText().isEmpty()) || (senhaText.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios");
        } else {
            Login l = new Login();
            loginDAO dao = new loginDAO();

            l.setUsuario(usuarioTextField.getText());
            l.setSenha(senhaText.getText());
            l.setTipo((TipoUsuario) tipoComboBox.getSelectedItem());
            

            dao.create(l);

            new LoginFrame().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_cadastrarLabelMouseClicked

    private void voltarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarLabelMouseClicked
        new LoginFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarLabelMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuarioFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadastrarLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField senhaText;
    private javax.swing.JComboBox<Object> tipoComboBox;
    private javax.swing.JTextField usuarioTextField;
    private javax.swing.JLabel voltarLabel;
    // End of variables declaration//GEN-END:variables
}
