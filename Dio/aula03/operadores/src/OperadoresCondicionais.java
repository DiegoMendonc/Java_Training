import java.util.Scanner;

public class OperadoresCondicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.println("O número 1 digitado: " + n1 + "\n" + "O número 2 digitado: "  + n2 + "\n");
        if (n1 == n2){
            System.out.println("Os números digitados são IGUAIS\n");
        }
        else if (n1 > n2){
            System.out.println("O primeiro valor é MAIOR que o segundo valor\n");
        }
        else if (n1 < n2){
            System.out.println("O primeiro valor é MENOR que o segundo valor\n");
        }
        else{
            System.out.println("Condicional não encontrada...\n");
        }
    }
    
}
