package edu.chayonn.primeiroModulo;

public class SobreMim {

    public static void main(String[] args) {

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
        
        
        System.out.println("Eu me chamo " + nome + " " + sobrenome + ".");
        System.out.println("Minha idade é " + idade + " anos.");
        System.out.println("Tenho " + altura + "m.");

        
    }
     
}
