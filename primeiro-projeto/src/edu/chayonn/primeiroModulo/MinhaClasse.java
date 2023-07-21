package edu.chayonn.primeiroModulo;
public class MinhaClasse {

    public static void main(String[] args) {

        String nome = "Chayonn";
        nome = "Amanda";
        System.out.println(nome);

        String primeiroNome = "Chayonn";
        String segundoNome = "Marinho";

        String nomeFinal = nomeCompeto(primeiroNome, segundoNome);
        System.out.println(nomeFinal);

        int a = 5;
        int b = 6;

        //String resultado = "";

        //if(a==b)
           //resultado = "Verdadeiro";
        //else
            //resultado = "falso";

        //System.out.println(resultado);


        // Operadores ternários: mesmo comportamento de uma condição if/else
        String resultado = (a==b) ? "Verdadeiro" : "Falso";
        System.out.println(resultado);  

    }

    public static String nomeCompeto (String primeiroNome, String segundoNome){
        //return "Resultado do método " + primeiroNome + " " + segundoNome;
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
