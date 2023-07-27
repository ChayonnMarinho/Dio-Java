import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        try{
            contar(numero1,numero2);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
        scanner.close();
    }

    static void contar (int numero1, int numero2) throws ParametrosInvalidosException{
        if(numero1 > numero2){ 
            throw new ParametrosInvalidosException();           

        }else{
            int contagem = numero2 - numero1;
            for(int i = 1; i<=contagem; i++){               
                System.out.println("Imprimindo o número " + i + ".");
            }            
        }    

    }
}
