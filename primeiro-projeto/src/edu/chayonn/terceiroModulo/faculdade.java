package edu.chayonn.terceiroModulo;
import java.util.Locale;
import java.util.Scanner;

public class faculdade {

    public static void main(String[] args) {

        double nota1, nota2,nota3,nota4,media; 
        int n,i;
        String nome;    
        

        Scanner scanner = new java.util.Scanner(System.in).useLocale(Locale.US); 

        System.out.println("Digite o número de alunos: ");
        n = scanner.nextInt(); 
            
       

        for(i=0;i<n;i++){            
            System.out.println("Digite o nome do aluno " + (i+1) + ":");
            nome = scanner.next();
            System.out.println("Digite a primeira nota do aluno " + (i+1) + ":");
            nota1 = scanner.nextDouble();
            System.out.println("Digite a segunda nota do aluno " + (i+1) + ":");
            nota2 = scanner.nextDouble();
            System.out.println("Digite a terceira nota do aluno " + (i+1) + ":");
            nota3 = scanner.nextDouble();
            System.out.println("Digite a quarta nota do aluno " + (i+1) + ":");
            nota4 = scanner.nextDouble();
            media = (nota1+nota2+nota3+nota4)/4;           
                        
            if(media>=7.0){
                System.out.println("Aluno aprovado");
            }else if(media<7.0 & media>=5.0){
                System.out.println("Aluno em recuperação");
            }else{
                System.out.println("Aluno reprovado");
            }  
            
            System.out.println(" ");
            System.out.println("O aluno " + nome + " obteve as notas " + nota1 + (", ") + nota2 + (", ") 
            + nota3 + ", " + nota4 + (". Com média final ") + (media) + "." );
            System.out.println(" ");
            System.out.println("Nome: " + nome );
            System.out.println("Primeira nota: " + nota1);
            System.out.println("Segunda nota: " + nota2);
            System.out.println("Terceira nota: " + nota3);
            System.out.println("Quarta nota: " + nota4);
            System.out.println("Média final: " + media);  
        }                 
        
    }    
}
