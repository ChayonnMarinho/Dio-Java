package edu.chayonn.primeiroModulo;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A, B,soma;

        System.out.println("Digte o primeiro número:");
        A=scanner.nextInt();
        System.out.println("Digite o segundo número");
        B=scanner.nextInt();

        soma=calcularSoma(A, B);

        System.out.println("SOMA = " + soma);

        scanner.close();
        
    }

    public static int calcularSoma(int A,int B){
        return A+B;
      }    

}
