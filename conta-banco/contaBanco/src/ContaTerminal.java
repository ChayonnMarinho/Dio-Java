import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();
        System.out.println("Por favor, digite seu nome completo:");
        String nomeCliente = scanner.next();
        String sobrenomeCliente = scanner.next();
        //String sobrenomeCliente = scanner.next();
        System.out.println("Seu saldo é:");
        Double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + " conta " + numeroConta + " e o seu saldo " + saldo + ".");

        scanner.close();

    }   

}
