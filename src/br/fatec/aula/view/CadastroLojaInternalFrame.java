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
import model.DAO.LojaDAO;
import model.bean.Loja;

public class CadastroLojaInternalFrame extends javax.swing.JInternalFrame {

    public CadastroLojaInternalFrame() {
        initComponents();
        DefaultTableModel clientes1 = (DefaultTableModel) LojaTable.getModel();
        LojaTable.setRowSorter(new TableRowSorter(clientes1));

        readTable();
    }

    public void readTable() {

        DefaultTableModel clientes1 = (DefaultTableModel) LojaTable.getModel();
        clientes1.setNumRows(0);

        LojaDAO pdao = new LojaDAO();

        for (Loja l : pdao.read()) {

            clientes1.addRow(new Object[]{
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

            RuaLojaTextField.setText(rua);
            BairroLojaTextField.setText(bairro);
            cidadeLojaTextField.setText(cidade);
            UFLojaTextField.setText(uf);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        CadastroLojaPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        GravarjButton = new javax.swing.JButton();
        AtualizarButton = new javax.swing.JButton();
        NomeLojaTextField = new javax.swing.JTextField();
        CNPJLojajFormattedTextField = new javax.swing.JFormattedTextField();
        telefoneLojaFormattedTextField = new javax.swing.JFormattedTextField();
        tipoTelefoneLojaComboBox = new javax.swing.JComboBox<>();
        EmailLojaTextField1 = new javax.swing.JTextField();
        RuaLojaTextField = new javax.swing.JTextField();
        numeroLojaFormattedTextField = new javax.swing.JFormattedTextField();
        BairroLojaTextField = new javax.swing.JTextField();
        cidadeLojaTextField = new javax.swing.JTextField();
        taxadeEntregaTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        LojaTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        CEPLojaTextField = new javax.swing.JTextField();
        UFLojaTextField = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setTitle("Cadastro de Loja");

        CadastroLojaPanel.setBackground(new java.awt.Color(255, 255, 255));
        CadastroLojaPanel.setForeground(new java.awt.Color(255, 167, 38));

        jLabel1.setForeground(new java.awt.Color(255, 167, 38));
        jLabel1.setText("Nome ");

        jLabel2.setForeground(new java.awt.Color(255, 167, 38));
        jLabel2.setText("CNPJ");

        jLabel3.setForeground(new java.awt.Color(255, 167, 38));
        jLabel3.setText("Fone");

        jLabel6.setForeground(new java.awt.Color(255, 167, 38));
        jLabel6.setText("Taxa de Entrega (R$)");

        jLabel7.setForeground(new java.awt.Color(255, 167, 38));
        jLabel7.setText("CEP");

        jLabel9.setForeground(new java.awt.Color(255, 167, 38));
        jLabel9.setText("Rua");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 167, 38));
        jLabel10.setText("N °");

        jLabel11.setForeground(new java.awt.Color(255, 167, 38));
        jLabel11.setText("Cidade");

        jLabel12.setForeground(new java.awt.Color(255, 167, 38));
        jLabel12.setText("Bairro");

        jLabel13.setForeground(new java.awt.Color(255, 167, 38));
        jLabel13.setText("E - Mail");

        GravarjButton.setBackground(new java.awt.Color(255, 167, 38));
        GravarjButton.setForeground(new java.awt.Color(255, 255, 255));
        GravarjButton.setText("Cadastrar");
        GravarjButton.setBorder(null);
        GravarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GravarjButtonActionPerformed(evt);
            }
        });

        AtualizarButton.setBackground(new java.awt.Color(255, 167, 38));
        AtualizarButton.setForeground(new java.awt.Color(255, 255, 255));
        AtualizarButton.setText("Atualizar");
        AtualizarButton.setBorder(null);
        AtualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarButtonActionPerformed(evt);
            }
        });

        NomeLojaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        CNPJLojajFormattedTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        try {
            CNPJLojajFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        telefoneLojaFormattedTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        try {
            telefoneLojaFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneLojaFormattedTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        tipoTelefoneLojaComboBox.setForeground(new java.awt.Color(255, 167, 38));
        tipoTelefoneLojaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celular Pessoal", "Celular Contato", "Telefone Pessoal", "Telefone Contato" }));
        tipoTelefoneLojaComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        tipoTelefoneLojaComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                tipoTelefoneLojaComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        EmailLojaTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        EmailLojaTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailLojaTextField1ActionPerformed(evt);
            }
        });

        RuaLojaTextField.setToolTipText("");
        RuaLojaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        RuaLojaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RuaLojaTextFieldActionPerformed(evt);
            }
        });

        numeroLojaFormattedTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        numeroLojaFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.###"))));

        BairroLojaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        cidadeLojaTextField.setEditable(false);
        cidadeLojaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        taxadeEntregaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        taxadeEntregaTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        LojaTable.setForeground(new java.awt.Color(255, 167, 38));
        LojaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CNPJ", "Fone", "E-mail", "Entrega", "CEP", "N°", "Rua", "Bairro", "Cidade", "UF"
            }
        ));
        LojaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LojaTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(LojaTable);

        jLabel14.setForeground(new java.awt.Color(255, 167, 38));
        jLabel14.setText("UF");

        CEPLojaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        CEPLojaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CEPLojaTextFieldKeyReleased(evt);
            }
        });

        UFLojaTextField.setEditable(false);
        UFLojaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        javax.swing.GroupLayout CadastroLojaPanelLayout = new javax.swing.GroupLayout(CadastroLojaPanel);
        CadastroLojaPanel.setLayout(CadastroLojaPanelLayout);
        CadastroLojaPanelLayout.setHorizontalGroup(
            CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                                .addComponent(telefoneLojaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tipoTelefoneLojaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                                .addComponent(EmailLojaTextField1)
                                .addGap(6, 6, 6))))
                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(NomeLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CNPJLojajFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLojaPanelLayout.createSequentialGroup()
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(taxadeEntregaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(BairroLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RuaLojaTextField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLojaPanelLayout.createSequentialGroup()
                                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CEPLojaTextField))
                                .addGap(18, 18, 18)
                                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numeroLojaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(cidadeLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UFLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(34, Short.MAX_VALUE))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLojaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GravarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(AtualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );
        CadastroLojaPanelLayout.setVerticalGroup(
            CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NomeLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroLojaPanelLayout.createSequentialGroup()
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CNPJLojajFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroLojaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CEPLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telefoneLojaFormattedTextField)
                    .addComponent(tipoTelefoneLojaComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(RuaLojaTextField)
                    .addComponent(EmailLojaTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxadeEntregaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BairroLojaTextField)
                    .addComponent(cidadeLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UFLojaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CadastroLojaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GravarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(AtualizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(CadastroLojaPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoTelefoneLojaComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_tipoTelefoneLojaComboBoxPopupMenuWillBecomeInvisible
        telefoneLojaFormattedTextField.setText("");
        telefoneLojaFormattedTextField.setFormatterFactory(null);
        telefoneLojaFormattedTextField.setValue(null);
        
        String texto = tipoTelefoneLojaComboBox.getSelectedItem().toString();
        try {
            if (texto.contains("Telefone")) {
                MaskFormatter mascara = new MaskFormatter("(##) ####-####");
                DefaultFormatterFactory formato = new DefaultFormatterFactory(mascara);
                telefoneLojaFormattedTextField.setFormatterFactory(formato);
            } else {
                MaskFormatter mascara = new MaskFormatter("(##) 9####-####");
                DefaultFormatterFactory formato = new DefaultFormatterFactory(mascara);
                telefoneLojaFormattedTextField.setFormatterFactory(formato);
            }
        } catch (ParseException ex) {

        }
    }//GEN-LAST:event_tipoTelefoneLojaComboBoxPopupMenuWillBecomeInvisible

    private void RuaLojaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RuaLojaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RuaLojaTextFieldActionPerformed

    private void GravarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GravarjButtonActionPerformed

        Loja l = new Loja();
        LojaDAO dao = new LojaDAO();

        l.setNome(NomeLojaTextField.getText());
        l.setCNPJ(CNPJLojajFormattedTextField.getText());
        l.setTelefone(telefoneLojaFormattedTextField.getText());
        l.setEmail(EmailLojaTextField1.getText());
        l.setTaxaentrega(Double.parseDouble(taxadeEntregaTextField.getText()));
        l.setCEP(CEPLojaTextField.getText());
        l.setNumero((Integer.parseInt(numeroLojaFormattedTextField.getText())));
        l.setRua(RuaLojaTextField.getText());
        l.setBairro(BairroLojaTextField.getText());
        l.setCidade(cidadeLojaTextField.getText());
        l.setUF(UFLojaTextField.getText());

        dao.create(l);

        NomeLojaTextField.setText("");
        CNPJLojajFormattedTextField.setText("");
        telefoneLojaFormattedTextField.setText("");
        tipoTelefoneLojaComboBox.setSelectedIndex(0);
        EmailLojaTextField1.setText("");
        taxadeEntregaTextField.setText("");
        CEPLojaTextField.setText("");
        numeroLojaFormattedTextField.setText("");
        RuaLojaTextField.setText("");
        BairroLojaTextField.setText("");
        cidadeLojaTextField.setText("");
        UFLojaTextField.setText("");
        
        readTable();
    }//GEN-LAST:event_GravarjButtonActionPerformed

    private void EmailLojaTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailLojaTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailLojaTextField1ActionPerformed

    private void LojaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LojaTableMouseClicked

        if (LojaTable.getSelectedRow() != -1) {

            NomeLojaTextField.setText(LojaTable.getValueAt(LojaTable.getSelectedRow(), 1).toString());
            CNPJLojajFormattedTextField.setText(LojaTable.getValueAt(LojaTable.getSelectedRow(), 2).toString());
            telefoneLojaFormattedTextField.setText(LojaTable.getValueAt(LojaTable.getSelectedRow(), 3).toString());
            EmailLojaTextField1.setText(LojaTable.getValueAt(LojaTable.getSelectedRow(), 4).toString());
            taxadeEntregaTextField.setText(LojaTable.getValueAt(LojaTable.getSelectedRow(), 5).toString());
            CEPLojaTextField.setText(LojaTable.getValueAt(LojaTable.getSelectedRow(), 6).toString());
            numeroLojaFormattedTextField.setText(LojaTable.getValueAt(LojaTable.getSelectedRow(), 7).toString());
            RuaLojaTextField.setText(LojaTable.getValueAt(LojaTable.getSelectedRow(), 8).toString());
            BairroLojaTextField.setText(LojaTable.getValueAt(LojaTable.getSelectedRow(), 9).toString());
            cidadeLojaTextField.setText(LojaTable.getValueAt(LojaTable.getSelectedRow(), 10).toString());
            UFLojaTextField.setText(LojaTable.getValueAt(LojaTable.getSelectedRow(), 11).toString());
        }
    }//GEN-LAST:event_LojaTableMouseClicked

    private void AtualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarButtonActionPerformed
        
        if (LojaTable.getSelectedRow() != -1) {

            Loja l = new Loja();
            LojaDAO dao = new LojaDAO();

            l.setNome(NomeLojaTextField.getText());
            l.setCNPJ(CNPJLojajFormattedTextField.getText());
            l.setTelefone(telefoneLojaFormattedTextField.getText());
            l.setEmail(EmailLojaTextField1.getText());
            l.setTaxaentrega(Double.parseDouble(taxadeEntregaTextField.getText()));
            l.setCEP(CEPLojaTextField.getText());
            l.setNumero((Integer.parseInt(numeroLojaFormattedTextField.getText())));
            l.setRua(RuaLojaTextField.getText());
            l.setBairro(BairroLojaTextField.getText());
            l.setCidade(cidadeLojaTextField.getText());
            l.setUF(UFLojaTextField.getText());
            l.setId((int) LojaTable.getValueAt(LojaTable.getSelectedRow(), 0));

            dao.update(l);

        NomeLojaTextField.setText("");
        CNPJLojajFormattedTextField.setText("");
        telefoneLojaFormattedTextField.setText("");
        tipoTelefoneLojaComboBox.setSelectedIndex(0);
        EmailLojaTextField1.setText("");
        taxadeEntregaTextField.setText("");
        CEPLojaTextField.setText("");
        numeroLojaFormattedTextField.setText("");
        RuaLojaTextField.setText("");
        BairroLojaTextField.setText("");
        cidadeLojaTextField.setText("");
        UFLojaTextField.setText("");

            readTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para atualizar !.");
        }

    }//GEN-LAST:event_AtualizarButtonActionPerformed

    private void CEPLojaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CEPLojaTextFieldKeyReleased
        RuaLojaTextField.setText("Aguarde...");
        BairroLojaTextField.setText("Aguarde...");
        cidadeLojaTextField.setText("Aguarde...");
        UFLojaTextField.setText("Aguarde...");
        
        if (CEPLojaTextField.getText().length() == 8) {
            buscarCep(CEPLojaTextField.getText());
        }
    }//GEN-LAST:event_CEPLojaTextFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtualizarButton;
    private javax.swing.JTextField BairroLojaTextField;
    private javax.swing.JTextField CEPLojaTextField;
    private javax.swing.JFormattedTextField CNPJLojajFormattedTextField;
    private javax.swing.JPanel CadastroLojaPanel;
    private javax.swing.JTextField EmailLojaTextField1;
    private javax.swing.JButton GravarjButton;
    private javax.swing.JTable LojaTable;
    private javax.swing.JTextField NomeLojaTextField;
    private javax.swing.JTextField RuaLojaTextField;
    private javax.swing.JTextField UFLojaTextField;
    private javax.swing.JTextField cidadeLojaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JFormattedTextField numeroLojaFormattedTextField;
    private javax.swing.JTextField taxadeEntregaTextField;
    private javax.swing.JFormattedTextField telefoneLojaFormattedTextField;
    private javax.swing.JComboBox<String> tipoTelefoneLojaComboBox;
    // End of variables declaration//GEN-END:variables
}
