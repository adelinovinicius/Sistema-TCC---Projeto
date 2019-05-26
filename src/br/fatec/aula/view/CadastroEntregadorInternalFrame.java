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
import model.DAO.EntregadorDAO;
import model.bean.Entregador;

public class CadastroEntregadorInternalFrame extends javax.swing.JInternalFrame {

    public CadastroEntregadorInternalFrame() {
        initComponents();
        DefaultTableModel entregadores1 = (DefaultTableModel) entregadorTable.getModel();
        entregadorTable.setRowSorter(new TableRowSorter(entregadores1));
        readTable();

    }

    public void readTable() {

        DefaultTableModel entregadores1 = (DefaultTableModel) entregadorTable.getModel();
        entregadores1.setNumRows(0);

        EntregadorDAO pdao = new EntregadorDAO();

        for (Entregador e : pdao.read()) {

            entregadores1.addRow(new Object[]{
                e.getId(),
                e.getNome(),
                e.getEmail(),
                e.getCNH(),
                e.getTelefone(),
                e.getCEP(),
                e.getNumero(),
                e.getRua(),
                e.getBairro(),
                e.getCidade(),
                e.getUF()

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

            RuaEntregadorTextField.setText(rua);
            BairroEntregadorTextField.setText(bairro);
            cidadeEntregadorTextField.setText(cidade);
            UFEntregadorTextField.setText(uf);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        numeroEntregadorFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cadastrarButtonEntregadr = new javax.swing.JButton();
        atualizarButtonEntregador = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        telefoneClienteLabel2 = new javax.swing.JLabel();
        emailEntregadorTextField = new javax.swing.JTextField();
        tipoTelefoneLabel2 = new javax.swing.JLabel();
        tipoTelefoneEntregadorComboBox2 = new javax.swing.JComboBox<>();
        telefoneEntregadordorFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();
        CEPEntregadorTextField2 = new javax.swing.JTextField();
        CNHTextField = new javax.swing.JTextField();
        nomeEntregadorTextField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        BairroEntregadorTextField = new javax.swing.JTextField();
        RuaEntregadorTextField = new javax.swing.JTextField();
        cidadeEntregadorTextField = new javax.swing.JTextField();
        UFEntregadorTextField = new javax.swing.JTextField();
        produtosScrollPane = new javax.swing.JScrollPane();
        entregadorTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Entregador");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        numeroEntregadorFormattedTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        numeroEntregadorFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.###"))));

        jLabel19.setForeground(new java.awt.Color(255, 167, 38));
        jLabel19.setText("CEP");

        jLabel20.setForeground(new java.awt.Color(255, 167, 38));
        jLabel20.setText("N° ");

        jLabel21.setForeground(new java.awt.Color(255, 167, 38));
        jLabel21.setText("Rua");

        jLabel22.setForeground(new java.awt.Color(255, 167, 38));
        jLabel22.setText("Bairro");

        jLabel23.setForeground(new java.awt.Color(255, 167, 38));
        jLabel23.setText("Cidade");

        jLabel24.setForeground(new java.awt.Color(255, 167, 38));
        jLabel24.setText("UF");

        cadastrarButtonEntregadr.setBackground(new java.awt.Color(255, 167, 38));
        cadastrarButtonEntregadr.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarButtonEntregadr.setText("Cadastrar");
        cadastrarButtonEntregadr.setBorder(null);
        cadastrarButtonEntregadr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonEntregadrcadastrarButtonActionPerformed(evt);
            }
        });

        atualizarButtonEntregador.setBackground(new java.awt.Color(255, 167, 38));
        atualizarButtonEntregador.setForeground(new java.awt.Color(255, 255, 255));
        atualizarButtonEntregador.setText("Atualizar");
        atualizarButtonEntregador.setBorder(null);
        atualizarButtonEntregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonEntregadorexcluirButtonActionPerformed(evt);
            }
        });

        jLabel25.setForeground(new java.awt.Color(255, 167, 38));
        jLabel25.setText(" Email");

        telefoneClienteLabel2.setForeground(new java.awt.Color(255, 167, 38));
        telefoneClienteLabel2.setText("Tel.");

        emailEntregadorTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        tipoTelefoneLabel2.setForeground(new java.awt.Color(255, 167, 38));
        tipoTelefoneLabel2.setText("Tipo Tel.");

        tipoTelefoneEntregadorComboBox2.setForeground(new java.awt.Color(255, 167, 38));
        tipoTelefoneEntregadorComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celular ", "Telefone " }));
        tipoTelefoneEntregadorComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        tipoTelefoneEntregadorComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                tipoTelefoneEntregadorComboBox2tipoTelefoneProdutoComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        telefoneEntregadordorFormattedTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        try {
            telefoneEntregadordorFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneEntregadordorFormattedTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        jLabel26.setForeground(new java.awt.Color(255, 167, 38));
        jLabel26.setText("CNH");

        CEPEntregadorTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));
        CEPEntregadorTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CEPEntregadorTextField2KeyReleased(evt);
            }
        });

        CNHTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        nomeEntregadorTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        jLabel27.setForeground(new java.awt.Color(255, 167, 38));
        jLabel27.setText("Nome");

        BairroEntregadorTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        RuaEntregadorTextField.setToolTipText("");
        RuaEntregadorTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        cidadeEntregadorTextField.setEditable(false);
        cidadeEntregadorTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        UFEntregadorTextField.setEditable(false);
        UFEntregadorTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 167, 38)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefoneEntregadordorFormattedTextField)
                            .addComponent(tipoTelefoneLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefoneClienteLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CNHTextField)
                            .addComponent(emailEntregadorTextField)
                            .addComponent(nomeEntregadorTextField)
                            .addComponent(tipoTelefoneEntregadorComboBox2, 0, 294, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RuaEntregadorTextField)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CEPEntregadorTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(numeroEntregadorFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel22)
                                    .addComponent(BairroEntregadorTextField)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UFEntregadorTextField)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cidadeEntregadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(cadastrarButtonEntregadr, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                        .addComponent(atualizarButtonEntregador, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeEntregadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CEPEntregadorTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroEntregadorFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailEntregadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RuaEntregadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CNHTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BairroEntregadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tipoTelefoneLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoTelefoneEntregadorComboBox2)
                    .addComponent(cidadeEntregadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneClienteLabel2)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneEntregadordorFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UFEntregadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarButtonEntregadr, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarButtonEntregador, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        entregadorTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        entregadorTable.setForeground(new java.awt.Color(255, 167, 38));
        entregadorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Email", "CNH", "Telefone", "CEP", "Rua", "N°", "Bairro", "Cidade", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        entregadorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entregadorTableMouseClicked(evt);
            }
        });
        produtosScrollPane.setViewportView(entregadorTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(produtosScrollPane)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(produtosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entregadorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entregadorTableMouseClicked

        if (entregadorTable.getSelectedRow() != -1) {

            nomeEntregadorTextField.setText(entregadorTable.getValueAt(entregadorTable.getSelectedRow(), 1).toString());
            emailEntregadorTextField.setText(entregadorTable.getValueAt(entregadorTable.getSelectedRow(), 2).toString());
            CNHTextField.setText(entregadorTable.getValueAt(entregadorTable.getSelectedRow(), 3).toString());
            telefoneEntregadordorFormattedTextField.setText(entregadorTable.getValueAt(entregadorTable.getSelectedRow(), 4).toString());
            CEPEntregadorTextField2.setText(entregadorTable.getValueAt(entregadorTable.getSelectedRow(), 5).toString());
            numeroEntregadorFormattedTextField2.setText(entregadorTable.getValueAt(entregadorTable.getSelectedRow(), 6).toString());
            RuaEntregadorTextField.setText(entregadorTable.getValueAt(entregadorTable.getSelectedRow(), 7).toString());
            BairroEntregadorTextField.setText(entregadorTable.getValueAt(entregadorTable.getSelectedRow(), 8).toString());
            cidadeEntregadorTextField.setText(entregadorTable.getValueAt(entregadorTable.getSelectedRow(), 9).toString());
            UFEntregadorTextField.setText(entregadorTable.getValueAt(entregadorTable.getSelectedRow(), 10).toString());
        }
    }//GEN-LAST:event_entregadorTableMouseClicked

    private void cadastrarButtonEntregadrcadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonEntregadrcadastrarButtonActionPerformed

        Entregador e = new Entregador();
        EntregadorDAO dao = new EntregadorDAO();

        e.setNome(nomeEntregadorTextField.getText());
        e.setEmail(emailEntregadorTextField.getText());
        e.setCNH(CNHTextField.getText());
        e.setTelefone(telefoneEntregadordorFormattedTextField.getText());
        e.setCEP(CEPEntregadorTextField2.getText());
        e.setNumero((Integer.parseInt(numeroEntregadorFormattedTextField2.getText())));
        e.setRua(RuaEntregadorTextField.getText());
        e.setBairro(BairroEntregadorTextField.getText());
        e.setCidade(cidadeEntregadorTextField.getText());
        e.setUF(UFEntregadorTextField.getText());

        dao.create(e);

        nomeEntregadorTextField.setText("");
        emailEntregadorTextField.setText("");
        CNHTextField.setText("");
        tipoTelefoneEntregadorComboBox2.setSelectedIndex(0);
        RuaEntregadorTextField.setText("");
        BairroEntregadorTextField.setText("");
        cidadeEntregadorTextField.setText("");
        CEPEntregadorTextField2.setText("");
        UFEntregadorTextField.setText("");
        telefoneEntregadordorFormattedTextField.setText("");
        numeroEntregadorFormattedTextField2.setText("");

        readTable();
        
    }//GEN-LAST:event_cadastrarButtonEntregadrcadastrarButtonActionPerformed

    private void atualizarButtonEntregadorexcluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonEntregadorexcluirButtonActionPerformed

        if (entregadorTable.getSelectedRow() != -1) {

            Entregador e = new Entregador();
            EntregadorDAO dao = new EntregadorDAO();

            e.setNome(nomeEntregadorTextField.getText());
            e.setEmail(emailEntregadorTextField.getText());
            e.setCNH(CNHTextField.getText());
            e.setTelefone(telefoneEntregadordorFormattedTextField.getText());
            e.setCEP(CEPEntregadorTextField2.getText());
            e.setNumero((Integer.parseInt(numeroEntregadorFormattedTextField2.getText())));
            e.setRua(RuaEntregadorTextField.getText());
            e.setBairro(BairroEntregadorTextField.getText());
            e.setCidade(cidadeEntregadorTextField.getText());
            e.setUF(UFEntregadorTextField.getText());
            e.setId((int) entregadorTable.getValueAt(entregadorTable.getSelectedRow(), 0));

            dao.update(e);

            nomeEntregadorTextField.setText("");
            emailEntregadorTextField.setText("");
            CNHTextField.setText("");
            tipoTelefoneEntregadorComboBox2.setSelectedIndex(0);
            RuaEntregadorTextField.setText("");
            BairroEntregadorTextField.setText("");
            cidadeEntregadorTextField.setText("");
            CEPEntregadorTextField2.setText("");
            UFEntregadorTextField.setText("");
            telefoneEntregadordorFormattedTextField.setText("");
            numeroEntregadorFormattedTextField2.setText("");

            readTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para atualizar !.");
        }
    }//GEN-LAST:event_atualizarButtonEntregadorexcluirButtonActionPerformed

    private void tipoTelefoneEntregadorComboBox2tipoTelefoneProdutoComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_tipoTelefoneEntregadorComboBox2tipoTelefoneProdutoComboBoxPopupMenuWillBecomeInvisible
        telefoneEntregadordorFormattedTextField.setText("");
        telefoneEntregadordorFormattedTextField.setFormatterFactory(null);
        telefoneEntregadordorFormattedTextField.setValue(null);
        String texto = tipoTelefoneEntregadorComboBox2.getSelectedItem().toString();
        try {
            if (texto.contains("Telefone")) {
                MaskFormatter mascara = new MaskFormatter("(##) ####-####");
                DefaultFormatterFactory formato = new DefaultFormatterFactory(mascara);
                telefoneEntregadordorFormattedTextField.setFormatterFactory(formato);
            } else {
                MaskFormatter mascara = new MaskFormatter("(##) 9####-####");
                DefaultFormatterFactory formato = new DefaultFormatterFactory(mascara);
                telefoneEntregadordorFormattedTextField.setFormatterFactory(formato);
            }
        } catch (ParseException ex) {
            // Arqui vai um erro
        }
    }//GEN-LAST:event_tipoTelefoneEntregadorComboBox2tipoTelefoneProdutoComboBoxPopupMenuWillBecomeInvisible

    private void CEPEntregadorTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CEPEntregadorTextField2KeyReleased
        RuaEntregadorTextField.setText("Aguarde...");
        BairroEntregadorTextField.setText("Aguarde...");
        cidadeEntregadorTextField.setText("Aguarde...");
        UFEntregadorTextField.setText("Aguarde...");

        if (CEPEntregadorTextField2.getText().length() == 8) {
            buscarCep(CEPEntregadorTextField2.getText());
        }
    }//GEN-LAST:event_CEPEntregadorTextField2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BairroEntregadorTextField;
    private javax.swing.JTextField CEPEntregadorTextField2;
    private javax.swing.JTextField CNHTextField;
    private javax.swing.JTextField RuaEntregadorTextField;
    private javax.swing.JTextField UFEntregadorTextField;
    private javax.swing.JButton atualizarButtonEntregador;
    private javax.swing.JButton cadastrarButtonEntregadr;
    private javax.swing.JTextField cidadeEntregadorTextField;
    private javax.swing.JTextField emailEntregadorTextField;
    private javax.swing.JTable entregadorTable;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeEntregadorTextField;
    private javax.swing.JFormattedTextField numeroEntregadorFormattedTextField2;
    private javax.swing.JScrollPane produtosScrollPane;
    private javax.swing.JLabel telefoneClienteLabel2;
    private javax.swing.JFormattedTextField telefoneEntregadordorFormattedTextField;
    private javax.swing.JComboBox<String> tipoTelefoneEntregadorComboBox2;
    private javax.swing.JLabel tipoTelefoneLabel2;
    // End of variables declaration//GEN-END:variables
}
