package br.fatec.aula.view;

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

    public void burcarpornome(String nome) {

        DefaultTableModel clientes1 = (DefaultTableModel) clienteTable.getModel();
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
        enderecoPanel = new javax.swing.JPanel();
        ruaClienteTextField = new javax.swing.JTextField();
        ruaLabel = new javax.swing.JLabel();
        bairroLabel = new javax.swing.JLabel();
        cidadeLabel = new javax.swing.JLabel();
        cidadeClienteTextField = new javax.swing.JTextField();
        bairroClienteTextField = new javax.swing.JTextField();
        cepClienteFormattedTextField = new javax.swing.JFormattedTextField();
        estadoClienteComboBox = new javax.swing.JComboBox<>();
        ufLabel = new javax.swing.JLabel();
        cepLabel = new javax.swing.JLabel();
        numeroLabel1 = new javax.swing.JLabel();
        numeroClienteTextField1 = new javax.swing.JTextField();
        buttonPanel = new javax.swing.JPanel();
        cadastrarClienteButton = new javax.swing.JButton();
        excluirButton = new javax.swing.JButton();
        atualizarButton = new javax.swing.JButton();
        buscaPanel = new javax.swing.JPanel();
        buscaTextField = new javax.swing.JTextField();
        buscaButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        clienteTable = new javax.swing.JTable();

        setClosable(true);
        setTitle("Cliente");

        dadosPessoaisPanel.setBackground(new java.awt.Color(255, 153, 51));
        dadosPessoaisPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dadosPessoaisPanel.setForeground(new java.awt.Color(255, 255, 255));
        dadosPessoaisPanel.setToolTipText("");

        nomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        nomeLabel.setText("E - Mail");

        cpfLabel.setForeground(new java.awt.Color(255, 255, 255));
        cpfLabel.setText("CPF");
        cpfLabel.setToolTipText("");

        sexoLabel.setForeground(new java.awt.Color(255, 255, 255));
        sexoLabel.setText("Sexo");

        sexoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Feminino", "Masculino", "Outro" }));
        sexoComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cpfClienteFormattedTextField.setBorder(null);
        try {
            cpfClienteFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        emailClienteTextField.setBorder(null);

        cpfLabel1.setForeground(new java.awt.Color(255, 255, 255));
        cpfLabel1.setText("Nome ");
        cpfLabel1.setToolTipText("");

        nomeClienteTextField.setBorder(null);
        nomeClienteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeClienteTextFieldActionPerformed(evt);
            }
        });

        emailLabel.setForeground(new java.awt.Color(255, 255, 255));

        telefoneClienteLabel.setForeground(new java.awt.Color(255, 255, 255));
        telefoneClienteLabel.setText("Telefone");

        telefoneClienteFormattedTextField.setBorder(null);
        try {
            telefoneClienteFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneClienteFormattedTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        tipoTelefoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        tipoTelefoneLabel.setText("Tipo");

        tipoTelefoneComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celular Pessoal", "Celular Contato", "Telefone Pessoal", "Telefone Contato" }));
        tipoTelefoneComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tipoTelefoneComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                tipoTelefoneComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        enderecoPanel.setBackground(new java.awt.Color(255, 153, 51));
        enderecoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        enderecoPanel.setForeground(new java.awt.Color(255, 255, 255));

        ruaClienteTextField.setBorder(null);

        ruaLabel.setForeground(new java.awt.Color(255, 255, 255));
        ruaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ruaLabel.setText("Rua");

        bairroLabel.setForeground(new java.awt.Color(255, 255, 255));
        bairroLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bairroLabel.setText("Bairro");

        cidadeLabel.setForeground(new java.awt.Color(255, 255, 255));
        cidadeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cidadeLabel.setText("Cidade");

        cidadeClienteTextField.setBorder(null);

        bairroClienteTextField.setBorder(null);

        cepClienteFormattedTextField.setBorder(null);
        try {
            cepClienteFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        estadoClienteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        estadoClienteComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        estadoClienteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoClienteComboBoxActionPerformed(evt);
            }
        });

        ufLabel.setForeground(new java.awt.Color(255, 255, 255));
        ufLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ufLabel.setText("UF");

        cepLabel.setForeground(new java.awt.Color(255, 255, 255));
        cepLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cepLabel.setText("CEP");

        numeroLabel1.setForeground(new java.awt.Color(255, 255, 255));
        numeroLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numeroLabel1.setText("N°");

        numeroClienteTextField1.setBorder(null);

        javax.swing.GroupLayout enderecoPanelLayout = new javax.swing.GroupLayout(enderecoPanel);
        enderecoPanel.setLayout(enderecoPanelLayout);
        enderecoPanelLayout.setHorizontalGroup(
            enderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enderecoPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(enderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(enderecoPanelLayout.createSequentialGroup()
                        .addGroup(enderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ufLabel)
                            .addComponent(cepLabel)
                            .addComponent(bairroLabel)
                            .addComponent(ruaLabel)
                            .addComponent(numeroLabel1)
                            .addComponent(cidadeLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cepClienteFormattedTextField)
                    .addComponent(estadoClienteComboBox, 0, 264, Short.MAX_VALUE)
                    .addComponent(cidadeClienteTextField)
                    .addComponent(bairroClienteTextField)
                    .addComponent(numeroClienteTextField1)
                    .addComponent(ruaClienteTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        enderecoPanelLayout.setVerticalGroup(
            enderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enderecoPanelLayout.createSequentialGroup()
                .addComponent(ruaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ruaClienteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroClienteTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bairroLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bairroClienteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cidadeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cidadeClienteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ufLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estadoClienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cepLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cepClienteFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonPanel.setBackground(new java.awt.Color(255, 153, 51));

        cadastrarClienteButton.setBackground(new java.awt.Color(255, 153, 51));
        cadastrarClienteButton.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarClienteButton.setText("Cadastrar");
        cadastrarClienteButton.setBorder(null);
        cadastrarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteButtonActionPerformed(evt);
            }
        });

        excluirButton.setBackground(new java.awt.Color(255, 153, 51));
        excluirButton.setForeground(new java.awt.Color(255, 255, 255));
        excluirButton.setText("Excluir");
        excluirButton.setBorder(null);
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
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

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastrarClienteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(cadastrarClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        buscaPanel.setBackground(new java.awt.Color(255, 153, 51));
        buscaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        buscaPanel.setForeground(new java.awt.Color(255, 255, 255));

        buscaTextField.setBorder(null);

        buscaButton.setBackground(new java.awt.Color(255, 153, 51));
        buscaButton.setForeground(new java.awt.Color(255, 255, 255));
        buscaButton.setText("Buscar");
        buscaButton.setBorder(null);
        buscaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buscaPanelLayout = new javax.swing.GroupLayout(buscaPanel);
        buscaPanel.setLayout(buscaPanelLayout);
        buscaPanelLayout.setHorizontalGroup(
            buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(buscaPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(buscaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buscaPanelLayout.setVerticalGroup(
            buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscaPanelLayout.createSequentialGroup()
                .addComponent(buscaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dadosPessoaisPanelLayout = new javax.swing.GroupLayout(dadosPessoaisPanel);
        dadosPessoaisPanel.setLayout(dadosPessoaisPanelLayout);
        dadosPessoaisPanelLayout.setHorizontalGroup(
            dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeLabel)
                    .addComponent(cpfLabel)
                    .addComponent(cpfClienteFormattedTextField)
                    .addComponent(emailClienteTextField)
                    .addComponent(telefoneClienteLabel)
                    .addComponent(telefoneClienteFormattedTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cpfLabel1)
                    .addComponent(nomeClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                        .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoTelefoneLabel)
                            .addComponent(sexoLabel)
                            .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tipoTelefoneComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 131, Short.MAX_VALUE)
                                .addComponent(sexoComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(emailLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enderecoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(buscaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        dadosPessoaisPanelLayout.setVerticalGroup(
            dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enderecoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                                .addComponent(cpfLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefoneClienteFormattedTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPessoaisPanelLayout.createSequentialGroup()
                                        .addComponent(nomeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(emailClienteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpfClienteFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telefoneClienteLabel)
                                        .addGap(33, 33, 33)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoTelefoneLabel)
                                .addGap(17, 17, 17)
                                .addComponent(tipoTelefoneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(sexoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(dadosPessoaisPanelLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(buscaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(emailLabel))
        );

        clienteTable.setBackground(new java.awt.Color(255, 153, 51));
        clienteTable.setForeground(new java.awt.Color(255, 255, 255));
        clienteTable.setModel(new javax.swing.table.DefaultTableModel(
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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dadosPessoaisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dadosPessoaisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed

        if (clienteTable.getSelectedRow() != -1) {

            Cliente c = new Cliente();
            ClienteDAO dao = new ClienteDAO();

            c.setId((int) clienteTable.getValueAt(clienteTable.getSelectedRow(), 0));

            dao.delete(c);

            nomeClienteTextField.setText("");
            emailClienteTextField.setText("");
            cpfClienteFormattedTextField.setText("");
            sexoComboBox.setSelectedIndex(0);
            ruaClienteTextField.setText("");
            bairroClienteTextField.setText("");
            cidadeClienteTextField.setText("");
            cepClienteFormattedTextField.setText("");
            estadoClienteComboBox.setSelectedIndex(0);
            telefoneClienteFormattedTextField.setText("");
            tipoTelefoneComboBox.setSelectedIndex(0);
            numeroClienteTextField1.setText("");

            readTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }

    }//GEN-LAST:event_excluirButtonActionPerformed

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
        c.setCEP(cepClienteFormattedTextField.getText());
        c.setUF((String) estadoClienteComboBox.getSelectedItem());

        dao.create(c);

        nomeClienteTextField.setText("");
        emailClienteTextField.setText("");
        cpfClienteFormattedTextField.setText("");
        sexoComboBox.setSelectedIndex(0);
        ruaClienteTextField.setText("");
        bairroClienteTextField.setText("");
        cidadeClienteTextField.setText("");
        cepClienteFormattedTextField.setText("");
        estadoClienteComboBox.setSelectedIndex(0);
        telefoneClienteFormattedTextField.setText("");
        tipoTelefoneComboBox.setSelectedIndex(0);
        numeroClienteTextField1.setText("");

        readTable();

    }//GEN-LAST:event_cadastrarClienteButtonActionPerformed

    private void estadoClienteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoClienteComboBoxActionPerformed

    }//GEN-LAST:event_estadoClienteComboBoxActionPerformed

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
            c.setCEP(cepClienteFormattedTextField.getText());
            c.setUF((String) estadoClienteComboBox.getSelectedItem());
            c.setId((int) clienteTable.getValueAt(clienteTable.getSelectedRow(), 0));

            dao.update(c);

            nomeClienteTextField.setText("");
            emailClienteTextField.setText("");
            cpfClienteFormattedTextField.setText("");
            sexoComboBox.setSelectedIndex(0);
            ruaClienteTextField.setText("");
            bairroClienteTextField.setText("");
            cidadeClienteTextField.setText("");
            cepClienteFormattedTextField.setText("");
            estadoClienteComboBox.setSelectedIndex(0);
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
            cepClienteFormattedTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 10).toString());
            estadoClienteComboBox.setSelectedItem(clienteTable.getValueAt(clienteTable.getSelectedRow(), 11).toString());
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
            cepClienteFormattedTextField.setText(clienteTable.getValueAt(clienteTable.getSelectedRow(), 10).toString());
            estadoClienteComboBox.setSelectedItem(clienteTable.getValueAt(clienteTable.getSelectedRow(), 11).toString());
        }
    }//GEN-LAST:event_clienteTableKeyReleased

    private void buscaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaButtonActionPerformed

        String busca = buscaTextField.getText();

        if (busca.isEmpty()) {
            
            readTable();
            JOptionPane.showMessageDialog(null, "Digite um nome para buscar ! ");
            

        } else {

            burcarpornome(buscaTextField.getText());
        }
        
        
    }//GEN-LAST:event_buscaButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButton;
    private javax.swing.JTextField bairroClienteTextField;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JButton buscaButton;
    private javax.swing.JPanel buscaPanel;
    private javax.swing.JTextField buscaTextField;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cadastrarClienteButton;
    private javax.swing.JFormattedTextField cepClienteFormattedTextField;
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
    private javax.swing.JPanel enderecoPanel;
    private javax.swing.JComboBox<String> estadoClienteComboBox;
    private javax.swing.JButton excluirButton;
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
