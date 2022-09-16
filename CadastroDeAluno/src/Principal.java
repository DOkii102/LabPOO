
import classes.Aluno;
import classes.Estados;
import gui.CadastroAluno;
import java.io.File;
import java.util.ArrayList;
import operacoes.IO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author joovitor
 */
public class Principal {

    public static ArrayList<Aluno> alunos = IO.lerAlunos();
    
    
    public static void main(String[] args) {
        criarGUI();
    }
    
    public static void criarGUI()
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAluno(alunos).setVisible(true);
            }
        });
    }
}
