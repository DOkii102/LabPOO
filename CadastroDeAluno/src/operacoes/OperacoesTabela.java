/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import classes.Aluno;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joovitor
 */
public class OperacoesTabela {
    
    public static void atualizarTabela(ArrayList<Aluno> listaAlunos, JTable tabelaAlunos) {
        DefaultTableModel tableModel = (DefaultTableModel) tabelaAlunos.getModel();
        tableModel.setRowCount(0);

        String id;
        String nome;
        String sexo;
        String cidade;
        String estado;

        Collections.sort(listaAlunos);
        for (Aluno aluno : listaAlunos) {
            id = aluno.getId()+"";
            nome = aluno.getNome();
            sexo = aluno.getSexo();
            cidade = aluno.getCidade();
            estado = aluno.getEstado();

            Object[] dado = {id, nome, sexo, cidade, estado};
            tableModel.addRow(dado);
        }
    }
    
    public static Aluno getAlunoTabela(ArrayList<Aluno> listaAlunos, JTable tabelaAlunos, int index)
    {
        String id = (String)tabelaAlunos.getValueAt(index, 0);
        Aluno aluno = null;
        
        for (Aluno listaAluno : listaAlunos) 
        {
            if(listaAluno.getId() == Integer.parseInt(id))
            {   
               aluno = listaAluno;
                break;
            }                 
        }
    
        return aluno;
    }
    
}
