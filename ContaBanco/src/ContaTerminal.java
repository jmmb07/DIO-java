import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    
    public static void main (String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome completo: ")
        String nomeCliente = scanner.next();

        System.out.println("Digite o numero da sua agencia: ")
        int agencia = scanner.next();

        System.out.println("Digite o numero da sua conta: ")
        int numeroConta = scanner.next();

        System.out.println("Digite o saldo da sua conta: ")
        double saldo = scanner.next();


        System.out.println("\nOlá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + 
        " e seu saldo R$" + saldo + " já está disponível para saque");

    }

}
