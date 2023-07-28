package com.teste.clinical.model;

public class Paciente {

    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;
    private String rg;
    

    public Paciente() {
    }


    public Paciente(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;       

    }

    
    public String getNome() {
        return nome;
    }    
       
    public String getSobrenome() {
        return sobrenome;
    }    

    public int getIdade() {
        return idade;
    } 

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }  

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
}
