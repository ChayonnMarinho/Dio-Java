package edu.chayonn.primeiroModulo;

import java.util.Locale;
import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //System.out.println("Digite a nota do aluno: ");
        //double nota = scanner.nextDouble();

       // if(nota>=7){
            //System.out.println("Aluno aprovado.");
        //}else if (nota >=5 && nota<7){
            //System.out.println("Aluno em recuperação");
        //}else{
            //System.out.println("Aluno reprovado");
        //}

     //scanner.close();   
     
     
     // refatoração com condicional ternario

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a nota do aluno: ");
        double nota1 = scanner.nextDouble();
        String resultado = nota1>=7.0 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        scanner.close();
    }
    
}
