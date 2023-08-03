package com.teste.equipamentos.equipamentos.multifuncional;

import com.teste.equipamentos.equipamentos.copiadora.Copiadora;
import com.teste.equipamentos.equipamentos.digitalizadora.Digitalizadora;
import com.teste.equipamentos.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {

   
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");       
    }

   
    public void imprimir() {   
        System.out.println("Imprimindo via equipamento multifuncional");           
    }

   
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");       
    }      
    
}
