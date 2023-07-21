package edu.chayonn.primeiroModulo;

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

        double A, B, media;
        
        System.out.println("Digte a primeira nota:");
        A = sc.nextDouble();
        System.out.println("Digte a segunda nota:");
        B = sc.nextDouble();

 
        media = (A* 3.5 +B* 7.5)/11; 

        System.out.printf("MEDIA = %.5f", media);
        System.out.println();

        sc.close();

    }
    
}
