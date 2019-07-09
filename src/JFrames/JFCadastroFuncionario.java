/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import dao.FuncionarioDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.FuncionarioCaixa;
import model.FuncionarioPadaria;

import model.Pessoa;

/**
 *
 * @author curso
 */
public class JFCadastroFuncionario extends javax.swing.JFrame {

    FuncionarioDAO funciDAO = new FuncionarioDAO();
    List<Pessoa> listFuncionario;

    /**
     * Creates new form JFCadastroFuncionario
     */
    public JFCadastroFuncionario() {
        initComponents();
        listFuncionario = new ArrayList<>();
        listarFuncionarios();
    }

    public LocalDate conversorDate(String date) {
        String dataString = date;
        String[] daSeparada = dataString.split("/");
        LocalDate localDate = LocalDate.of(Integer.parseInt(daSeparada[2]), Integer.parseInt(daSeparada[1]), Integer.parseInt(daSeparada[0]));
        return localDate;
    }

    public void limparCampos() {
        TextNomeFunc.setText("");
        TextSalarioFunc.setText("");
        insalubridadetext.setText("");
        quebracaixatext.setText("");
        textCpf.setText("");
        textoNascimento.setText("");
    }

    private void listarFuncionarios() {
        DefaultTableModel model = (DefaultTableModel) TabelaFuncionario.getModel();
        model.setNumRows(0);
        funciDAO.listarFuncionarios().stream().forEach((p) -> {
            model.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getSexo(),
                p.getFuncaoFuncionario(),
                p.getSalario()
            });
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextSalarioFunc = new javax.swing.JTextField();
        TextNomeFunc = new javax.swing.JTextField();
        ButtonSalvarCadastroFunc = new javax.swing.JButton();
        ButtonVoltarJFCadastroFunc = new javax.swing.JButton();
        ComboBoxSexoFunc = new javax.swing.JComboBox<String>();
        insalubridadetext = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        quebracaixatext = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textoNascimento = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        textCpf = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaFuncionario = new javax.swing.JTable();
        botaoDeletarId = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        ComboBoxFuncao = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Funcionário");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Sexo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Data Nascimento:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Salário:");

        TextSalarioFunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextSalarioFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSalarioFuncActionPerformed(evt);
            }
        });

        TextNomeFunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ButtonSalvarCadastroFunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonSalvarCadastroFunc.setText("Salvar");
        ButtonSalvarCadastroFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarCadastroFuncActionPerformed(evt);
            }
        });

        ButtonVoltarJFCadastroFunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonVoltarJFCadastroFunc.setText("Voltar");
        ButtonVoltarJFCadastroFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarJFCadastroFuncActionPerformed(evt);
            }
        });

        ComboBoxSexoFunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBoxSexoFunc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:", "Feminino", "Masculino" }));
        ComboBoxSexoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxSexoFuncActionPerformed(evt);
            }
        });

        insalubridadetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insalubridadetextActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Insalubridade:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Quebra de caixa:");

        try {
            textoNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoNascimento.setToolTipText("");
        textoNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNascimentoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Função:");

        try {
            textCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        TabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Sexo", "Cargo", "Salário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaFuncionarioMouseClicked(evt);
            }
        });
        TabelaFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaFuncionarioKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaFuncionario);
        if (TabelaFuncionario.getColumnModel().getColumnCount() > 0) {
            TabelaFuncionario.getColumnModel().getColumn(0).setResizable(false);
            TabelaFuncionario.getColumnModel().getColumn(0).setPreferredWidth(2);
        }

        botaoDeletarId.setText("Deletar");
        botaoDeletarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarIdActionPerformed(evt);
            }
        });

        botaoAtualizar.setText("Atualizar");
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        ComboBoxFuncao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBoxFuncao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:", "CAIXA", "PADEIRO" }));
        ComboBoxFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFuncaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(ButtonSalvarCadastroFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(botaoAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextNomeFunc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(quebracaixatext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ComboBoxSexoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextSalarioFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(botaoDeletarId, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(ButtonVoltarJFCadastroFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(textoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(90, 90, 90)
                                        .addComponent(textCpf))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(insalubridadetext, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ComboBoxFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(72, 72, 72))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ComboBoxFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(insalubridadetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48))
                                    .addComponent(ComboBoxSexoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(TextSalarioFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(quebracaixatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonSalvarCadastroFunc)
                        .addComponent(botaoAtualizar)
                        .addComponent(ButtonVoltarJFCadastroFunc))
                    .addComponent(botaoDeletarId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxSexoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxSexoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSexoFuncActionPerformed

    private void ButtonVoltarJFCadastroFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarJFCadastroFuncActionPerformed
        JFSegundaTela JFSegundaT = new JFSegundaTela();
        JFSegundaT.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonVoltarJFCadastroFuncActionPerformed

    private void ButtonSalvarCadastroFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarCadastroFuncActionPerformed
        // TODO add your handling code here:
        if (ComboBoxFuncao.getSelectedItem() == "CAIXA") {
            FuncionarioCaixa fc = new FuncionarioCaixa();
            fc.setNome(TextNomeFunc.getText());
            fc.setCpf(textCpf.getText());
            LocalDate data = conversorDate(textoNascimento.getText());
            fc.setNascimento(data);
            fc.setSexo(String.valueOf(ComboBoxSexoFunc.getSelectedItem()));
            fc.setSalario(Double.valueOf(TextSalarioFunc.getText()));
            fc.setFuncaoFuncionario((String) ComboBoxFuncao.getSelectedItem());
            fc.setQuebraCaixa(Double.valueOf(quebracaixatext.getText()));
            funciDAO.insertFuncCaixa(fc);
            limparCampos();
            listarFuncionarios();

        } else {
            FuncionarioPadaria fp = new FuncionarioPadaria();
            fp.setNome(TextNomeFunc.getText());
            fp.setCpf(textCpf.getText());
            LocalDate data = conversorDate(textoNascimento.getText());
            fp.setNascimento(data);
            fp.setSexo(String.valueOf(ComboBoxSexoFunc.getSelectedItem()));
            fp.setSalario(Double.valueOf(TextSalarioFunc.getText()));
            fp.setFuncaoFuncionario((String) ComboBoxFuncao.getSelectedItem());
            fp.setInsalubridade(Double.valueOf(insalubridadetext.getText()));
            funciDAO.insertFuncPadaria(fp);
            limparCampos();
            listarFuncionarios();
        }
    }//GEN-LAST:event_ButtonSalvarCadastroFuncActionPerformed

    private void TextSalarioFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSalarioFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSalarioFuncActionPerformed

    private void textoNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNascimentoActionPerformed

    private void botaoDeletarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarIdActionPerformed
        // TODO add your handling code here:
        if (TabelaFuncionario.getSelectedRow() != -1) {
            Pessoa p = new Pessoa();
            p.setId((Integer) TabelaFuncionario.getValueAt(TabelaFuncionario.getSelectedRow(), 0));
            funciDAO.delete(p);
            limparCampos();
            listarFuncionarios();
        }      
    }//GEN-LAST:event_botaoDeletarIdActionPerformed

    private void ComboBoxFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFuncaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxFuncaoActionPerformed

    private void insalubridadetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insalubridadetextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insalubridadetextActionPerformed

    private void TabelaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaFuncionarioMouseClicked
        // TODO add your handling code here:
        if (TabelaFuncionario.getSelectedRow() != -1) {
            TextNomeFunc.setText(TabelaFuncionario.getValueAt(TabelaFuncionario.getSelectedRow(), 1).toString());
            TextSalarioFunc.setText(TabelaFuncionario.getValueAt(TabelaFuncionario.getSelectedRow(), 4).toString());
        }

    }//GEN-LAST:event_TabelaFuncionarioMouseClicked

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        // TODO add your handling code here:
        if (TabelaFuncionario.getSelectedRow() != -1) {

            if (ComboBoxFuncao.getSelectedItem() == "CAIXA") {
                FuncionarioCaixa fc = new FuncionarioCaixa();
                fc.setNome(TextNomeFunc.getText());
                fc.setCpf(textCpf.getText());
                LocalDate data = conversorDate(textoNascimento.getText());
                fc.setNascimento(data);
                fc.setSexo(String.valueOf(ComboBoxSexoFunc.getSelectedItem()));
                fc.setSalario(Double.valueOf(TextSalarioFunc.getText()));
                fc.setFuncaoFuncionario((String) ComboBoxFuncao.getSelectedItem());
                fc.setQuebraCaixa(Double.valueOf(quebracaixatext.getText()));
                fc.setId((Integer) TabelaFuncionario.getValueAt(TabelaFuncionario.getSelectedRow(), 0));
                funciDAO.updateCaixa(fc);
                limparCampos();
                listarFuncionarios();

            } else {
                FuncionarioPadaria fp = new FuncionarioPadaria();
                fp.setNome(TextNomeFunc.getText());
                fp.setCpf(textCpf.getText());
                LocalDate data = conversorDate(textoNascimento.getText());
                fp.setNascimento(data);
                fp.setSexo(String.valueOf(ComboBoxSexoFunc.getSelectedItem()));
                fp.setSalario(Double.valueOf(TextSalarioFunc.getText()));
                fp.setFuncaoFuncionario((String) ComboBoxFuncao.getSelectedItem());
                fp.setInsalubridade(Double.valueOf(insalubridadetext.getText()));
                fp.setId((Integer) TabelaFuncionario.getValueAt(TabelaFuncionario.getSelectedRow(), 0));
                funciDAO.updatePadaria(fp);
                limparCampos();
                listarFuncionarios();
            }
        }
    }//GEN-LAST:event_botaoAtualizarActionPerformed

    private void TabelaFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaFuncionarioKeyReleased
        // TODO add your handling code here:
        if (TabelaFuncionario.getSelectedRow() != -1) {
            TextNomeFunc.setText(TabelaFuncionario.getValueAt(TabelaFuncionario.getSelectedRow(), 1).toString());
            TextSalarioFunc.setText(TabelaFuncionario.getValueAt(TabelaFuncionario.getSelectedRow(), 4).toString());
        }

    }//GEN-LAST:event_TabelaFuncionarioKeyReleased

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
            java.util.logging.Logger.getLogger(JFCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSalvarCadastroFunc;
    private javax.swing.JButton ButtonVoltarJFCadastroFunc;
    private javax.swing.JComboBox<String> ComboBoxFuncao;
    private javax.swing.JComboBox<String> ComboBoxSexoFunc;
    private javax.swing.JTable TabelaFuncionario;
    private javax.swing.JTextField TextNomeFunc;
    private javax.swing.JTextField TextSalarioFunc;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoDeletarId;
    private javax.swing.JTextField insalubridadetext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField quebracaixatext;
    private javax.swing.JFormattedTextField textCpf;
    private javax.swing.JFormattedTextField textoNascimento;
    // End of variables declaration//GEN-END:variables
}
