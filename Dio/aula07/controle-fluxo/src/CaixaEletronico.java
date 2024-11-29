
import java.util.Scanner;

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

            System.out.println("\n" + "O retorno da condicional é: " + saldo + "\n");
        }

        System.out.println(linha.repeat(50));
    }
}
