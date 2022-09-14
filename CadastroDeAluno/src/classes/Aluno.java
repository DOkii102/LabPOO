/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author joovitor
 */
public class Aluno implements Comparable<Aluno>{
    private static int contador=0;
    private int id;
    private String nome;
    private String endereco;
    private String sexo;
    private String cidade;
    private String estado;
    private ArrayList<String> interesses;
    private String observacoes;

    public Aluno(String nome, String endereco, String sexo, String cidade, String estado, ArrayList<String> interesses, String observacoes) {
        contador++;
        this.id = contador;
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.cidade = cidade;
        this.estado = estado;
        this.interesses = interesses;
        this.observacoes = observacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<String> getInteresses() {
        return interesses;
    }

    public void setInteresses(ArrayList<String> interesses) {
        this.interesses = interesses;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    
    
    
    public int compareTo(Aluno o) {
        return this.nome.compareTo(o.nome);
    }

    
    
    
    
}
