package edu.chayonn.segundoModulo;

import java.util.concurrent.ThreadLocalRandom;

public class While {

    public static void main(String[] args) {
        
        double mesada = 50.0;
        double soma = 0.0;
        
        while (mesada > 0){

            double valorDoce = valorAleatorio();

            if(valorDoce > mesada)
                valorDoce = mesada;
            
            System.out.println("Doce do valor " + valorDoce + " foi adicionado ao carrinho.");
            mesada = mesada - valorDoce; 
            soma = soma + valorDoce; 
            System.out.println(soma);                               
        }    
        System.out.println("Mesada: " + mesada);  
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(5,20);
    }    
}
