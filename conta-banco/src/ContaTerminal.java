import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // TODO: Exibir as mensagens para o nosso usuário 
        System.out.println("Por favor, digite o Nome do Cliente");

        // TODO: Obter pelo Scanner os valores digitados no terminal 
        String nome = scanner.next();
        
        // TODO: Exibir as mensagens para o nosso usuário 
        System.out.println("Por favor, digite o Número da Agência");

        // TODO: Obter pelo Scanner os valores digitados no terminal
        String agencia = scanner.next();

        // TODO: Exibir as mensagens para o nosso usuário 
        System.out.println("Por favor, digite o Número da Conta");

        // TODO: Obter pelo Scanner os valores digitados no terminal
        int conta = scanner.nextInt();
        
        // TODO: Exibir as mensagens para o nosso usuário 
        System.out.println("Por favor, digite o Saldo");

        // TODO: Obter pelo Scanner os valores digitados no terminal
        double saldo = scanner.nextDouble();
        
        // TODO: Exibir a mensagem de conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
