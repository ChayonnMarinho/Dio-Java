package com.teste.equipamentos.estabelecimento;
import com.teste.equipamentos.equipamentos.copiadora.Xerox;
import com.teste.equipamentos.equipamentos.digitalizadora.Scanner;
import com.teste.equipamentos.equipamentos.impressora.Deskjet;
import com.teste.equipamentos.equipamentos.impressora.Impressora;
import com.teste.equipamentos.equipamentos.impressora.Laserjet;
import com.teste.equipamentos.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {

    
    public static void main(String[] args) {

        EquipamentoMultifuncional deskjet = new EquipamentoMultifuncional();
        deskjet.imprimir();
        deskjet.copiar();
        deskjet.digitalizar();

        Impressora impressora = new EquipamentoMultifuncional();
        impressora.imprimir();

         
    
    
    }
    
}
