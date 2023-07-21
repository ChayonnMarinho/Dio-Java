package edu.chayonn.primeiroModulo;
import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {        
        
        Scanner sc = new Scanner(System.in);
                
        int A, B, PROD;

        System.out.println("Digite o primeiro número");                
        A = sc.nextInt();
        System.out.println("Digite o segundo número");
        B = sc.nextInt(); 
        
        PROD = calcularProduto(A, B);     
        System.out.println("PROD = " + PROD); 
        
        sc.close();
    

    }
    public static int calcularProduto(int A,int B){        
        return A*B;
    }     
}
