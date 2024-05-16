import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o Nome do Cliente");
        String nome = scanner.next();
        
        System.out.println("Por favor, digite o Número da Agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o Número da Conta");
        int conta = scanner.nextInt();
        
        System.out.println("Por favor, digite o Saldo");
        double saldo = scanner.nextDouble();
        
        //imprimindo os dados obtidos pelo usuário
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
