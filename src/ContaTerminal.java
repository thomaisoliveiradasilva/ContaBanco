import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner =  new Scanner(System.in);

        // solicitanod o número da conta
        System.out.println("Digite o número da sua conta!");
        int numero =scanner.nextInt();

        // Limpar o buffer do scanner
        scanner.nextLine();

        // Solicitando o número da agência
        System.out.println("Agora Digite o número da sua ag?ência");
        String agencia = scanner.nextLine();

        // solicitando o nome do cliente
        System.out.println("Digite seu nome!");
        String nome = scanner.nextLine();

        // solicitando o saldo da conta
        System.out.println("por favor, Digite o quanto você que depositar!");
        double saldo = scanner.nextDouble();

        // Fechando o scanner
        scanner.close();

        //Exibindo a mensagem Final
        System.out.println("Olá senhor " + nome + " Obrigado por criar uma conta em nossso banco, sua agência é " + agencia + " sua conta é " + numero + " e seu saldo é " + saldo + " seu primeiro sague já está disponivel!");
        


    }
}
