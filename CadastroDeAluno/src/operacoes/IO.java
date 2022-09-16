/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import classes.Aluno;
import classes.Estados;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.tools.FileObject;

/**
 *
 * @author joovitor
 */
public class IO {
    
    public static ArrayList<String> carregarEstado(String arquivo)
    {
        File estado = new File("./estados/"+arquivo);
        ArrayList<String> municipios = new ArrayList<String>();
        
        Scanner scanner = null;
        try{
            
            scanner = new Scanner(estado);
            while(scanner.hasNext())
            {
                municipios.add(scanner.nextLine());
            }
            
        }catch(IOException ex){
        }finally{
            try{
                scanner.close();
            }catch(NullPointerException ex){
            }
        }
        return municipios;
    }
    
    public static void carregarEstados(Estados estados)
    {
        estados.setAc(carregarEstado("AC.txt"));
        estados.setAl(carregarEstado("AL.txt"));
        estados.setAp(carregarEstado("AP.txt"));
        estados.setAm(carregarEstado("AM.txt"));
        estados.setBa(carregarEstado("BA.txt"));
        estados.setCe(carregarEstado("CE.txt"));
        estados.setDf(carregarEstado("DF.txt"));
        estados.setEs(carregarEstado("ES.txt"));
        estados.setGo(carregarEstado("GO.txt"));
        estados.setMa(carregarEstado("MA.txt"));
        estados.setMt(carregarEstado("MT.txt"));
        estados.setMs(carregarEstado("MS.txt"));
        estados.setMg(carregarEstado("MG.txt"));
        estados.setPa(carregarEstado("PA.txt"));
        estados.setPb(carregarEstado("PB.txt"));
        estados.setPr(carregarEstado("PR.txt"));
        estados.setPe(carregarEstado("PE.txt"));
        estados.setPi(carregarEstado("PI.txt"));
        estados.setRj(carregarEstado("RJ.txt"));
        estados.setRn(carregarEstado("RN.txt"));
        estados.setRs(carregarEstado("RS.txt"));
        estados.setRo(carregarEstado("RO.txt"));
        estados.setRr(carregarEstado("RR.txt"));
        estados.setSc(carregarEstado("SC.txt"));
        estados.setSp(carregarEstado("SP.txt"));
        estados.setSe(carregarEstado("SE.txt"));
        estados.setTo(carregarEstado("TO.txt"));
        
    }
    
    public static void salvarAlunos(ArrayList<Aluno> alunos)
    {
        File file = new File("./alunos.bin");
        
        ObjectOutputStream arquivo = null;
        
        try{
            arquivo = new ObjectOutputStream(new FileOutputStream(file));
            arquivo.writeObject(alunos);
        }catch(IOException ex){
        }finally{
            try{
                arquivo.close();
            }catch(IOException | NullPointerException ex){
            }
        }
    
    }
    
    public static void salvarCountAlunos(int contadorAlunos)
    {
        String arquivo = "./contadorAlunos.txt";


        ObjectOutputStream file = null;

        try
        {
            file = new ObjectOutputStream(new FileOutputStream(arquivo));
            file.writeObject(contadorAlunos);
            System.out.println("Contador de produtos gravado com sucesso!");
        } catch (IOException ex) {
        }finally{
            try
            {
                file.close();
            }catch(IOException | NullPointerException ex){               
            }
        }
    }
    
    public static int leituraContadorAlunos()
    {
        int contadorAlunos;
        
        String arq = "./contadorAlunos.txt";
        
        if(verificaArquivo(arq))
        {
            ObjectInputStream file = null;
            try
            {
                file = new ObjectInputStream(new FileInputStream(arq));
                contadorAlunos = (Integer) file.readObject();
                System.out.println("Contador de alunos recuperado com sucesso!");
            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
                return 0;
            }
            return contadorAlunos;
        }
        return 0;
    
    }
    
    public static boolean verificaArquivo(String arquivo)
    {
        File file = new File(arquivo);
        
        if(file.exists())
            return true;
        else
            return false;
    }
    
    public static ArrayList<Aluno> lerAlunos()
    {
        String arquivo = "./alunos.bin";
        ArrayList<Aluno> alunos = null;
        
        if(verificaArquivo(arquivo))
        {
            File file = new File(arquivo);
            ObjectInputStream arq = null;
            
            try{
                arq = new ObjectInputStream(new FileInputStream(file));
                alunos = (ArrayList<Aluno>) arq.readObject();
                System.out.println("Alunos recuperados com sucesso!");
                return alunos;
            }catch(IOException ex){
            }catch(ClassNotFoundException ex){
            }finally{
                try{
                    arq.close();
                }catch(IOException | NullPointerException ex){
                }
            }
        }
        return new ArrayList<Aluno>();
        
    }
}
