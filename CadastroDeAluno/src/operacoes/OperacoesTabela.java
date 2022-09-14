/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import classes.Aluno;
import classes.Filtro;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joovitor
 */
public class OperacoesTabela {
    
    public static void atualizarTabela(ArrayList<Aluno> listaAlunos, JTable tabelaAlunos, Filtro filtro) {
        DefaultTableModel tableModel = (DefaultTableModel) tabelaAlunos.getModel();
        tableModel.setRowCount(0);

        String id;
        String nome;
        String sexo;
        String cidade;
        String estado;
        
        int imprime = 0;

        Collections.sort(listaAlunos);
        for (Aluno aluno : listaAlunos) {
            
            if(filtro.getNome()!= null && !aluno.getNome().contains(filtro.getNome()))
                imprime++;
            
            if(filtro.isFeminino() ^ filtro.isMasculino())
            {
                if(filtro.isFeminino() && !aluno.getSexo().contains("Feminino"))
                    imprime++;
                else if(!aluno.getSexo().contains("Masculino"))
                    imprime++;
            }
            
            if(filtro.getCidade()!= null && !aluno.getCidade().contains(filtro.getCidade()))
                imprime++;
            
            if(filtro.getEstado()!=null && !filtro.getEstado().equals("Todos"))
            {
                if(!aluno.getEstado().contains(filtro.getEstado()))
                    imprime++;
            }
            
            if(imprime == 0)
            {
                id = aluno.getId()+"";
                nome = aluno.getNome();
                sexo = aluno.getSexo();
                cidade = aluno.getCidade();
                estado = aluno.getEstado();

                Object[] dado = {id, nome, sexo, cidade, estado};
                tableModel.addRow(dado);
            }
            
            imprime = 0;
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
