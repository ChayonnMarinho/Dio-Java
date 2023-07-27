package edu.chayonn.segundoModulo;

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		int C = leitor.nextInt();
		String nome;
		int N;

		for (int i = 0; i < C ; i++) {
			nome = leitor.next();
			N = leitor.nextInt();
            if (nome.equals("Thor") && (N==50)) System.out.println("N");
			    else System.out.println("Y");
			
		}
        

        leitor.close();
    }
    
    
}
