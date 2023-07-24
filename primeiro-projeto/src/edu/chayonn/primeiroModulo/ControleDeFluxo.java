package edu.chayonn.primeiroModulo;

import java.util.Locale;
import java.util.Scanner;

public class ControleDeFluxo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu saldo atual: ");
        double saldoAtual = scanner.nextDouble();
        System.out.println("Digite o valor a ser sacado: ");
        double valorSaque = scanner.nextDouble();

        if (saldoAtual >= valorSaque){

            double saldo = saldoAtual - valorSaque;
            System.out.println("Você sacou " + valorSaque + " reais. Seu saldo atual é " + saldo + " reais.");
        } else{
            System.out.println("Saldo indisponível para saque.");
        }      
    }    
}
