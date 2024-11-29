import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String linha = "-";
        //Todo: Conhecer e importar a classe scanner
        
        //Exibir as mensagens para o usuário:

        //Obter pela classe scanner os valores digitados no terminal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPor favor, digite o número da agência");
        int numero = scanner.nextInt();

        System.out.println("\nFavor digite a agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Conta criada com sucesso! Favor digite o o valor para depósito: ");
        double saldo = scanner.nextDouble();

        System.out.println("\n\n" + linha.repeat(50));
        System.out.println("\nOlá " + nomeCliente + "\nObrigado por criar em nosso banco, segue seus dados:\nAgência: " + agencia + "\nConta: " + numero + "\nSaldo disponível para saque: " + saldo);
        System.out.println("\n\n" + linha.repeat(50) + "\n\n");
    }
}
