import java.util.Scanner;
//Aula condicional Simples
public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linha = "-";

        System.out.println("\nFavor digite o primeiro número: ");
        double saldo = scanner.nextDouble();

        System.out.println("\nDigite o segundo número: ");
        double valorSolicitado = scanner.nextDouble();
        

        System.out.println("\n\n" + linha.repeat(50));

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;

            System.out.println("\nNovo saldo: " + saldo + "\n");
        }
        else if (valorSolicitado > saldo){
            System.out.println("Saldo insuficiente...");
            System.out.println("\nVocê tem saldo de apenas: " + saldo + "\n");
            System.out.println("Saldo solicitado: " + valorSolicitado + "\n");
        }
        else{
            System.out.println("Você vai zerar sua conta, deseja prosseguir? 1(sim)/0(não): ");
            
            int choice = scanner.nextInt();

            if (choice == 1){
                saldo = saldo - valorSolicitado;
                System.out.println("Saque efetuado!\nSaldo Total: " + saldo + "\n");
            }
            else if (choice == 2){
                System.out.println("Obrigado por utilizar a aplicação!");
            }

        }

        System.out.println(linha.repeat(50));
    }
}
