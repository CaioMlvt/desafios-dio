import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Por favor, digite o número da conta desejada.\n");
            Integer conta = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer após ler

            System.out.println("Por favor, digite o número da Agência desejada.\n");
            String agencia = scanner.nextLine();
        
            System.out.println("Por favor, digite o seu nome completo.\n");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite a quantidade desejada a depositar.\n");
            Double saldo = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer após ler


            System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + 
            " ,conta" + conta + " e seu saldo "+ saldo + " já está disponível para saque");

        }
    }
}
