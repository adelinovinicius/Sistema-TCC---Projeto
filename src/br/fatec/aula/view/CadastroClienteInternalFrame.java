package br.fatec.aula.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import model.DAO.ClienteDAO;
import model.bean.Cliente;

public class CadastroClienteInternalFrame extends javax.swing.JInternalFrame {

    public CadastroClienteInternalFrame() {
        initComponents();
        DefaultTableModel clientes1 = (DefaultTableModel) clienteTable.getModel();
        clienteTable.setRowSorter(new TableRowSorter(clientes1));

        readTable();
    }

    public void buscarCep(String cep) {
        String json;

        try {
            URL url = new URL("http://viacep.com.br/ws/" + cep + "/json");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));
            json = jsonSb.toString();

            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");
            String array[] = new String[30];
            array = json.split("\n");

            String rua = array[7];
            String bairro = array[15];
            String cidade = array[19];
            String uf = array[23];

            ruaClienteTextField.setText(rua);
            bairroClienteTextField.setText(bairro);
            cidadeClienteTextField.setText(cidade);
            UFClienteTextField.setText(uf);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readTable() {

        DefaultTableModel clientes1 = (DefaultTableModel) clienteTable.getModel();
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

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dadosPessoaisPanel = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        cpfLabel = new javax.swing.JLabel();
        sexoLabel = new javax.swing.JLabel();
        sexoComboBox = new javax.swing.JComboBox<>();
        cpfClienteFormattedTextField = new javax.swing.JFormattedTextField();
        emailClienteTextField = new javax.swing.JTextField();
        cpfLabel1 = new javax.swing.JLabel();
        nomeClienteTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        telefoneClienteLabel = new javax.swing.JLabel();
        telefoneClienteFormattedTextField = new javax.swing.JFormattedTextField();
        tipoTelefoneLabel = new javax.swing.JLabel();
        tipoTelefoneComboBox = new javax.swing.JComboBox<>();
        ruaLabel = new javax.swing.JLabel();
        ruaClienteTextField = new javax.swing.JTextField();
        numeroLabel1 = new javax.swing.JLabel();
        numeroClienteTextField1 = new javax.swing.JTextField();
        bairroLabel = new javax.swing.JLabel();
        bairroClienteTextField = new javax.swing.JTextField();
        cidadeLabel = new javax.swing.JLabel();
        cidadeClienteTextField = new javax.swing.JTextField();
        ufLabel = new javax.swing.JLabel();
        cepLabel = new javax.swing.JLabel();
        cadastrarClienteButton = new javax.swing.JButton();
        atualizarButton = new javax.swing.JButton();
        UFClienteTextField = new javax.swing.JTextField();
        CEPClienteTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        clienteTable = new javax.swing.JTable();

        setClosable(true);
        setTitle("Cliente");

        dadosPessoaisPanel.setBackground(new java.awt.Color(255, 255, 255));
        dadosPessoaisPanel.setForeground(new java.awt.Color(255, 255, 255));
        dadosPessoaisPanel.setToolTipText("");

        nomeLabel.setForeground(new java.awt.Color(255, 167, 38));
        nomeLabel.setText("E - Mail");

        cpfLabel.setForeground(new java.awt.Color(255, 167, 38));
        cpfLabel.setText("CPF");
        cpfLabel.setToolTipText("");

        sexoLabel.setForeground(new java.awt.Color(255, 167, 38));
        sexoLabel.setText("Sexo");

        sexoComboBox.setForeground(new java.awt.Color(255, 167, 38));
        sexoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Feminino", "Masculino", "Outro" }));
        sexoComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        sexoComboBox.setFocusable(false);
        sexoComboBox.setOpaque(false);

        cpfClienteFormattedTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        try {
            cpfClienteFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        emailClienteTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        cpfLabel1.setForeground(new java.awt.Color(255, 167, 38));
        cpfLabel1.setText("Nome ");
        cpfLabel1.setToolTipText("");

        nomeClienteTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        nomeClienteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeClienteTextFieldActionPerformed(evt);
            }
        });

        emailLabel.setForeground(new java.awt.Color(255, 255, 255));

        telefoneClienteLabel.setForeground(new java.awt.Color(255, 167, 38));
        telefoneClienteLabel.setText("Telefone");

        telefoneClienteFormattedTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        try {
            telefoneClienteFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneClienteFormattedTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        tipoTelefoneLabel.setForeground(new java.awt.Color(255, 167, 38));
        tipoTelefoneLabel.setText("Tipo");

        tipoTelefoneComboBox.setForeground(new java.awt.Color(255, 167, 38));
        tipoTelefoneComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celular Pessoal", "Celular Contato", "Telefone Pessoal", "Telefone Contato" }));
        tipoTelefoneComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        tipoTelefoneComboBox.setFocusable(false);
        tipoTelefoneComboBox.setOpaque(false);
        tipoTelefoneComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                tipoTelefoneComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        ruaLabel.setForeground(new java.awt.Color(255, 167, 38));
        ruaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ruaLabel.setText("Rua");

        ruaClienteTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        numeroLabel1.setForeground(new java.awt.Color(255, 167, 38));
        numeroLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numeroLabel1.setText("N°");

        numeroClienteTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        bairroLabel.setForeground(new java.awt.Color(255, 167, 38));
        bairroLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bairroLabel.setText("Bairro");

        bairroClienteTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        cidadeLabel.setForeground(new java.awt.Color(255, 167, 38));
        cidadeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cidadeLabel.setText("Cidade");

        cidadeClienteTextField.setEditable(false);
        cidadeClienteTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        ufLabel.setForeground(new java.awt.Color(255, 167, 38));
        ufLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ufLabel.setText("UF");

        cepLabel.setForeground(new java.awt.Color(255, 167, 38));
        cepLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cepLabel.setText("CEP");

        cadastrarClienteButton.setBackground(new java.awt.Color(255, 153, 51));
        cadastrarClienteButton.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarClienteButton.setText("Cadastrar");
        cadastrarClienteButton.setBorder(null);
        cadastrarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteButtonActionPerformed(evt);
            }
        });

        atualizarButton.setBackground(new java.awt.Color(255, 153, 51));
        atualizarButton.setForeground(new java.awt.Color(255, 255, 255));
        atualizarButton.setText("Atualizar");
        atualizarButton.setBorder(null);
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        UFClienteTextField.setEditable(false);
        UFClienteTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        CEPClienteTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        CEPClienteTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CEPClienteTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout dadosPessoaisPanelLayout = new javax.swing.GroupLayout(dadosPessoaisPanel);
        dadosPessoaisPanel.setLayout(dadosPessoaisPanelLayout);
        dadosPessoaisPanelLayout.setHorizontalGroup(
            dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefoneClienteFormattedTextField)
                    .addComponent(cpfClienteFormattedTextField)
                    .addComponent(emailClienteTextField)
                    .addComponent(nomeClienteTextField)
                    .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                        .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLabel)
                            .addComponent(cpfLabel)
                            .addComponent(telefoneClienteLabel)
                            .addComponent(cpfLabel1)
                            .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                                .addComponent(tipoTelefoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(sexoLabel))
                            .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                                .addComponent(tipoTelefoneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPessoaisPanelLayout.createSequentialGroup()
                                .addComponent(cadastrarClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPessoaisPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cidadeLabel)
                            .addComponent(ufLabel)
                            .addComponent(ruaLabel)
                            .addComponent(bairroLabel)
                            .addComponent(cidadeClienteTextField)
                            .addComponent(bairroClienteTextField)
                            .addComponent(ruaClienteTextField)
                            .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailLabel)
                                    .addComponent(cepLabel)
                                    .addComponent(CEPClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numeroLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numeroClienteTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(UFClienteTextField))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        dadosPessoaisPanelLayout.setVerticalGroup(
            dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                        .addComponent(emailLabel)
                        .addGap(2, 2, 2)
                        .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpfLabel1)
                            .addComponent(cepLabel)))
                    .addComponent(numeroLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomeClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CEPClienteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(numeroClienteTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailClienteTextField)
                    .addComponent(ruaClienteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cpfClienteFormattedTextField)
                    .addComponent(bairroClienteTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneClienteLabel)
                    .addComponent(cidadeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneClienteFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeClienteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                        .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sexoLabel)
                            .addComponent(ufLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UFClienteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadastrarClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
                    .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                        .addComponent(tipoTelefoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoTelefoneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        clienteTable.setForeground(new java.awt.Color(255, 167, 38));
        clienteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Email", "CPF", "Tel.", "Sexo", "Rua", "N°", "Bairro", "Cidade", "CEP", "UF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clienteTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clienteTableMouseClicked(evt);
            }
        });
        clienteTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                clienteTableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(clienteTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dadosPessoaisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dadosPessoaisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoTelefoneComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_tipoTelefoneComboBoxPopupMenuWillBecomeInvisible
        telefoneClienteFormattedTextField.setText("");
        telefoneClienteFormattedTextField.setFormatterFactory(null);
        telefoneClienteFormattedTextField.setValue(null);
        String texto = tipoTelefoneComboBox.getSelectedItem().toString();
        try {
            if (texto.contains("Telefone")) {
                MaskFormatter mascara = new MaskFormatter("(##) ####-####");
                DefaultFormatterFactory formato = new DefaultFormatterFactory(mascara);
                telefoneClienteFormattedTextField.setFormatterFactory(formato);
            } else {
                MaskFormatter mascara = new MaskFormatter("(##) 9####-####");
                DefaultFormatterFactory formato = new DefaultFormatterFactory(mascara);
                telefoneClienteFormattedTextField.setFormatterFactory(formato);
            }
        } catch (ParseException ex) {
            // Arqui vai um erro
        }
    }//GEN-LAST:event_tipoTelefoneComboBoxPopupMenuWillBecomeInvisible

    private void nomeClienteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeClienteTextFieldActionPerformed

    }//GEN-LAST:event_nomeClienteTextFieldActionPerformed

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed

        if (clienteTable.getSelectedRow() != -1) {

            Cliente c = new Cliente();
            ClienteDAO dao = new ClienteDAO();

            c.setNome(nomeClienteTextField.getText());
            c.setEmail(emailClienteTextField.getText());
            c.setCPF(cpfClienteFormattedTextField.getText());
            c.setTelefone(telefoneClienteFormattedTextField.getText());
            c.setSexo((String) sexoComboBox.getSelectedItem());
            c.setRua(ruaClienteTextField.getText());
            c.setNumero((Integer.parseInt(numeroClienteTextField1.getText())));
            c.setBairro(bairroClienteTextField.getText());
            c.setCidade(cidadeClienteTextField.getText());
            c.setCEP(CEPClienteTextField.getText());
            c.setUF(UFClienteTextField.getText());
            c.setId((int) clienteTable.getValueAt(clienteTable.getSelectedRow(), 0));

            dao.update(c);

            nomeClienteTextField.setText("");
            emailClienteTextField.setText("");
            cpfClienteFormattedTextField.setText("");
            sexoComboBox.setSelectedIndex(0);
            ruaClienteTextField.setText("");
            bairroClienteTextField.setText("");
            cidadeClienteTextField.setText("");
            CEPClienteTextField.setText("");
            UFClienteTextField.setText("");
            telefoneClienteFormattedTextField.setText("");
            tipoTelefoneComboBox.setSelectedIndex(0);
            numeroClienteTextField1.setText("");

            readTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para atualizar !.");
        }

    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void clienteTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteTableMouseClicked

        if (clienteTable.getSelectedRow() != -1) {

            nomeClienteTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 1).toString());
            emailClienteTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 2).toString());
            cpfClienteFormattedTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 3).toString());
            telefoneClienteFormattedTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 4).toString());
            sexoComboBox.setSelectedItem(clienteTable.getValueAt(clienteTable.getSelectedRow(), 5).toString());
            ruaClienteTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 6).toString());
            numeroClienteTextField1.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 7).toString());
            bairroClienteTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 8).toString());
            cidadeClienteTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 9).toString());
            CEPClienteTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 10).toString());
            UFClienteTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 11).toString());
        }
    }//GEN-LAST:event_clienteTableMouseClicked

    private void clienteTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clienteTableKeyReleased

        if (clienteTable.getSelectedRow() != -1) {

            nomeClienteTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 1).toString());
            emailClienteTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 2).toString());
            cpfClienteFormattedTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 3).toString());
            telefoneClienteFormattedTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 4).toString());
            sexoComboBox.setSelectedItem(clienteTable.getValueAt(clienteTable.getSelectedRow(), 5).toString());
            ruaClienteTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 6).toString());
            numeroClienteTextField1.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 7).toString());
            bairroClienteTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 8).toString());
            cidadeClienteTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 9).toString());
            CEPClienteTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 10).toString());
            UFClienteTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 11).toString());
        }
    }//GEN-LAST:event_clienteTableKeyReleased

    private void cadastrarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteButtonActionPerformed

        Cliente c = new Cliente();
        ClienteDAO dao = new ClienteDAO();

        c.setNome(nomeClienteTextField.getText());
        c.setEmail(emailClienteTextField.getText());
        c.setCPF(cpfClienteFormattedTextField.getText());
        c.setTelefone(telefoneClienteFormattedTextField.getText());
        c.setSexo((String) sexoComboBox.getSelectedItem());
        c.setRua(ruaClienteTextField.getText());
        c.setNumero((Integer.parseInt(numeroClienteTextField1.getText())));
        c.setBairro(bairroClienteTextField.getText());
        c.setCidade(cidadeClienteTextField.getText());
        c.setCEP(CEPClienteTextField.getText());
        c.setUF(UFClienteTextField.getText());

        dao.create(c);

        nomeClienteTextField.setText("");
        emailClienteTextField.setText("");
        cpfClienteFormattedTextField.setText("");
        sexoComboBox.setSelectedIndex(0);
        ruaClienteTextField.setText("");
        bairroClienteTextField.setText("");
        cidadeClienteTextField.setText("");
        CEPClienteTextField.setText("");
        UFClienteTextField.setText("");
        telefoneClienteFormattedTextField.setText("");
        tipoTelefoneComboBox.setSelectedIndex(0);
        numeroClienteTextField1.setText("");

        readTable();
    }//GEN-LAST:event_cadastrarClienteButtonActionPerformed

    private void CEPClienteTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CEPClienteTextFieldKeyReleased
        ruaClienteTextField.setText("Aguarde...");
        bairroClienteTextField.setText("Aguarde...");
        cidadeClienteTextField.setText("Aguarde...");
        UFClienteTextField.setText("Aguarde...");
        
        if (CEPClienteTextField.getText().length() == 8) {
            buscarCep(CEPClienteTextField.getText());
        }
    }//GEN-LAST:event_CEPClienteTextFieldKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CEPClienteTextField;
    private javax.swing.JTextField UFClienteTextField;
    private javax.swing.JButton atualizarButton;
    private javax.swing.JTextField bairroClienteTextField;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JButton cadastrarClienteButton;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JTextField cidadeClienteTextField;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JTable clienteTable;
    private javax.swing.JFormattedTextField cpfClienteFormattedTextField;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JLabel cpfLabel1;
    private javax.swing.JPanel dadosPessoaisPanel;
    private javax.swing.JTextField emailClienteTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomeClienteTextField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField numeroClienteTextField1;
    private javax.swing.JLabel numeroLabel1;
    private javax.swing.JTextField ruaClienteTextField;
    private javax.swing.JLabel ruaLabel;
    private javax.swing.JComboBox<String> sexoComboBox;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JFormattedTextField telefoneClienteFormattedTextField;
    private javax.swing.JLabel telefoneClienteLabel;
    private javax.swing.JComboBox<String> tipoTelefoneComboBox;
    private javax.swing.JLabel tipoTelefoneLabel;
    private javax.swing.JLabel ufLabel;
    // End of variables declaration//GEN-END:variables

}
