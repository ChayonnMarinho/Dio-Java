package com.teste.clinical.model;

public class Clinica {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente("Chayonn","Marinho",32);
        paciente1.setCpf("401.875.858-81"); 
        paciente1.setRg("51.255.916-19");
        paciente1.setTelefone(996248725);

        System.out.println("A paciente " + paciente1.getNome() + " " + paciente1.getSobrenome() + 
        " de " + paciente1.getIdade() + " anos foi cadastrada.");
        
        System.out.println("CPF: " + paciente1.getCpf());
        System.out.println("RG: " + paciente1.getRg());
        System.out.println("Telefone: " + paciente1.getTelefone());
        
        System.out.println("Modalidades de atendimento e número do cadastro: ");
        for(EnumPaciente e: EnumPaciente.values()){
            System.out.println(e.getModalidade());
            System.out.println(e.getNumeroCadastro());
        }      
        
        EnumPaciente particular = EnumPaciente.PARTICULAR;
        System.out.println(particular.getModalidade());
        System.out.println(particular.getNumeroCadastro());
    }    
}
