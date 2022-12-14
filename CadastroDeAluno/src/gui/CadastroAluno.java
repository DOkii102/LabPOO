/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import classes.Aluno;
import classes.Estados;
import classes.Filtro;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.table.DefaultTableModel;
import operacoes.IO;
import operacoes.OperacoesTabela;

/**
 *
 * @author joovitor
 */
public class CadastroAluno extends javax.swing.JFrame {

    private ArrayList<Aluno> listaAlunos;
    private int indexRow;
    private Filtro filtro = new Filtro();
    private Estados estados = new Estados();
    
    /**
     * Creates new form CadastroAluno
     */
    public CadastroAluno(ArrayList<Aluno> listaAlunos) {
        initComponents();
        IO.carregarEstados(this.estados);
        this.listaAlunos = listaAlunos;
        Aluno.setContador(IO.leituraContadorAlunos());
        
        
        carregaEstados();
        OperacoesTabela.atualizarTabela(this.listaAlunos, this.tabelaAlunos, this.filtro);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAlunos = new javax.swing.JTable();
        bRemover = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        tCidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rFeminino = new javax.swing.JRadioButton();
        rMasculino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cEstado = new javax.swing.JComboBox<>();
        bNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Sexo", "Cidade", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAlunos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAlunos);

        bRemover.setFont(new java.awt.Font("Fira Sans", 0, 13)); // NOI18N
        bRemover.setText("Remover");
        bRemover.setEnabled(false);
        bRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverActionPerformed(evt);
            }
        });

        bEditar.setFont(new java.awt.Font("Fira Sans", 0, 13)); // NOI18N
        bEditar.setText("Editar");
        bEditar.setEnabled(false);
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bSair.setFont(new java.awt.Font("Fira Sans", 0, 13)); // NOI18N
        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSair)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEditar)
                    .addComponent(bRemover)
                    .addComponent(bSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 0, 13))); // NOI18N

        jLabel2.setText("Nome:");

        tNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNomeActionPerformed(evt);
            }
        });

        tCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCidadeActionPerformed(evt);
            }
        });

        jLabel3.setText("Cidade:");

        jLabel4.setText("Sexo:");

        rFeminino.setText("Feminino");
        rFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rFemininoActionPerformed(evt);
            }
        });

        rMasculino.setText("Masculino");
        rMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rMasculinoActionPerformed(evt);
            }
        });

        jLabel5.setText("Estado");

        cEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cEstadoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(rMasculino)
                    .addComponent(rFeminino))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rFeminino)
                                .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rMasculino)
                .addGap(15, 15, 15))
        );

        bNovo.setFont(new java.awt.Font("Fira Sans", 1, 13)); // NOI18N
        bNovo.setText("Novo aluno");
        bNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de alunos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bNovo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bNovo))
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rMasculinoActionPerformed
        if(this.rMasculino.isSelected())
            this.filtro.setMasculino(true);
        else
            this.filtro.setMasculino(false);
        
        OperacoesTabela.atualizarTabela(this.listaAlunos, this.tabelaAlunos, this.filtro);
        
        this.jPanel2.requestFocus();
        this.bRemover.setEnabled(false);
        this.bEditar.setEnabled(false);
    }//GEN-LAST:event_rMasculinoActionPerformed

    private void bNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoActionPerformed
        
        new CadastroNovoAluno(this.listaAlunos, null, this.tabelaAlunos, this.filtro, this.estados);

        

        OperacoesTabela.atualizarTabela(this.listaAlunos, this.tabelaAlunos, this.filtro);


    }//GEN-LAST:event_bNovoActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        this.dispose();
        IO.salvarAlunos(this.listaAlunos);
        IO.salvarCountAlunos(Aluno.getContador());
    }//GEN-LAST:event_bSairActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        
        
        Aluno aluno = OperacoesTabela.getAlunoTabela(this.listaAlunos,this.tabelaAlunos, this.indexRow);
        new CadastroNovoAluno(this.listaAlunos, aluno, this.tabelaAlunos, this.filtro, this.estados);
        
        OperacoesTabela.atualizarTabela(this.listaAlunos, this.tabelaAlunos, this.filtro);
        
        
        this.jPanel2.requestFocus();
        this.bRemover.setEnabled(false);
        this.bEditar.setEnabled(false);
        
        
    }//GEN-LAST:event_bEditarActionPerformed

    private void bRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverActionPerformed

        
        Aluno aluno = OperacoesTabela.getAlunoTabela(this.listaAlunos,this.tabelaAlunos, this.indexRow);
        this.listaAlunos.remove(aluno);
        
        
        OperacoesTabela.atualizarTabela(this.listaAlunos, this.tabelaAlunos, this.filtro);
        
        
        this.jPanel2.requestFocus();
        this.bRemover.setEnabled(false);
        this.bEditar.setEnabled(false);
    }//GEN-LAST:event_bRemoverActionPerformed

    private void tabelaAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAlunosMouseClicked
        this.indexRow = this.tabelaAlunos.getSelectedRow();
        
        this.bRemover.setEnabled(true);
        this.bEditar.setEnabled(true);
    }//GEN-LAST:event_tabelaAlunosMouseClicked

    private void rFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rFemininoActionPerformed
        if(this.rFeminino.isSelected())
            this.filtro.setFeminino(true);
        else
            this.filtro.setFeminino(false);
        
        
        OperacoesTabela.atualizarTabela(this.listaAlunos, this.tabelaAlunos, this.filtro);
        
        this.jPanel2.requestFocus();
        this.bRemover.setEnabled(false);
        this.bEditar.setEnabled(false);
    }//GEN-LAST:event_rFemininoActionPerformed

    private void tNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNomeActionPerformed
        this.filtro.setNome(this.tNome.getText());
        
        OperacoesTabela.atualizarTabela(this.listaAlunos, this.tabelaAlunos, this.filtro);
        
        this.jPanel2.requestFocus();
        this.bRemover.setEnabled(false);
        this.bEditar.setEnabled(false);
    }//GEN-LAST:event_tNomeActionPerformed

    private void tCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCidadeActionPerformed
        
        this.filtro.setCidade(this.tCidade.getText());
        
        OperacoesTabela.atualizarTabela(this.listaAlunos, this.tabelaAlunos, this.filtro);
        
        this.jPanel2.requestFocus();
        this.bRemover.setEnabled(false);
        this.bEditar.setEnabled(false);
    }//GEN-LAST:event_tCidadeActionPerformed

    private void cEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cEstadoItemStateChanged
        
        this.filtro.setEstado(this.cEstado.getSelectedItem().toString());
        
        OperacoesTabela.atualizarTabela(this.listaAlunos, this.tabelaAlunos, this.filtro);
        
        this.jPanel2.requestFocus();
        this.bRemover.setEnabled(false);
        this.bEditar.setEnabled(false);
    }//GEN-LAST:event_cEstadoItemStateChanged

    
    public void carregaEstados()
    {
        this.cEstado.addItem("Todos");
        this.cEstado.addItem("AC");
        this.cEstado.addItem("AL");
        this.cEstado.addItem("AP");
        this.cEstado.addItem("AM");
        this.cEstado.addItem("BA");
        this.cEstado.addItem("CE");
        this.cEstado.addItem("DF");
        this.cEstado.addItem("ES");
        this.cEstado.addItem("GO");
        this.cEstado.addItem("MA");
        this.cEstado.addItem("MT");
        this.cEstado.addItem("MS");
        this.cEstado.addItem("MG");
        this.cEstado.addItem("PA");
        this.cEstado.addItem("PB");
        this.cEstado.addItem("PR");
        this.cEstado.addItem("PE");
        this.cEstado.addItem("PI");
        this.cEstado.addItem("RJ");
        this.cEstado.addItem("RN");
        this.cEstado.addItem("RS");
        this.cEstado.addItem("RO");
        this.cEstado.addItem("RR");
        this.cEstado.addItem("SC");
        this.cEstado.addItem("SP");
        this.cEstado.addItem("SE");
        this.cEstado.addItem("TO");
        
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bNovo;
    private javax.swing.JButton bRemover;
    private javax.swing.JButton bSair;
    private javax.swing.JComboBox<String> cEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rFeminino;
    private javax.swing.JRadioButton rMasculino;
    private javax.swing.JTextField tCidade;
    private javax.swing.JTextField tNome;
    private javax.swing.JTable tabelaAlunos;
    // End of variables declaration//GEN-END:variables
}
