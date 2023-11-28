import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pela Scanner os valores digitados no termimnal

        // Exibir a mensagem da conta criada.

        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número do Usuário!");
        String Usuario = scanner.next();
        
        System.out.println("Por favor, digite o número da Agência!");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente!");
        String NomeDoCliente = scanner.next();

        System.out.println("Por favor, digite o saldo!");
        String Saldo = scanner.next(); 
        

        System.out.println("Olá"+", " + NomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +   Agencia +", Conta " + Usuario + " e seu saldo de "  + Saldo + " já está disponível para saque.");





        

    }
}
