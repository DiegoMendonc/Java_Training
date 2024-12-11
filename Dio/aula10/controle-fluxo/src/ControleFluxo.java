
import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String linha = "_";

        System.out.println(linha.repeat(50));
        System.out.println("Aula sobre estrutura de repetição\n\n");

        System.out.println("Digite o primeiro valor: ");
        int valor01 = scanner.nextInt();

        System.out.println("\nDigite o segundo valor: ");
        int valor02 = scanner.nextInt();

        System.out.println(linha.repeat(50));

        while (true) {
            
            System.out.println("\nDeseja realizar a operação?\n1-SIM\n2-NÃO\n\nResposta: ");
            int choice = scanner.nextInt();

            if (choice == 1){
                int valorResultado = valor01 - valor02;

                System.out.println(linha.repeat(50));
                System.out.println("\nO valor resultado é de: " + valorResultado);
                break;
            }
            else if (choice == 2){
                System.out.println(linha.repeat(50));
                System.out.println("\nMuito obrigado por utilizar a aplicação!!\n");
                break;
            }
            else{
                System.out.println(linha.repeat(50));
                System.out.println("\n\nComando não reconhecido, favor responder novamente...\n\n");
                System.out.println(linha.repeat(50));
            }
        }

        System.out.println(linha.repeat(50));
    }
}
