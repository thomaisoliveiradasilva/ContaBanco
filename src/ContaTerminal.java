import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner =  new Scanner(System.in);

        // solicitanod o número da conta
        System.out.println("Digite o número da sua conta!");

        // Limpar o buffer do scanner
        scanner.nextLine();

        // Solicitando o número da agência
        System.out.println("Agora Digite o número da sua ag?ência");
        String agencia = scanner.nextLine();

        // solicitando o nome do cliente
        System.out.println("Digite seu nome!");
        String nome = scanner.nextLine();

    }
}
