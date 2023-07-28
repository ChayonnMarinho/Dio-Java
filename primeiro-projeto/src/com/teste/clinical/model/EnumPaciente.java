package com.teste.clinical.model;

public enum EnumPaciente {

    SUS ("Sistema Único de Saúde",1),
    PLANO("Plano de Saúde",2),
    PARTICULAR("Particular",3);

    private String modalidade; 
    private int numeroCadastro;   

    
    private EnumPaciente(String modalidade, int numeroCadastro){
        this.modalidade = modalidade;
        this.numeroCadastro = numeroCadastro;
    }

    public String getModalidade() {
        return modalidade;
    } 

    public int getNumeroCadastro() {
        return numeroCadastro;
    }     
}
