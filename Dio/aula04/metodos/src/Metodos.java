import java.util.Scanner;

public class Metodos {

    public int somar(int num1, int num2){ //Método de soma
        return  num1 + num2;
    }
    public static void main(String[] args) { //Programa principal
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.println("\nDigite o segundo número: ");
        int n2 = scanner.nextInt();
        Metodos calc = new Metodos();
        int resultadoSomar = calc.somar(n1, n2);

        System.out.println("Deseja realizar a soma dos valores? \n");
        String choice = scanner.nextLine();

        if (choice == "SIM"){
            System.out.println("O resultado da soma é de: " + resultadoSomar);
        }
        else{
            System.out.println("Ação cancelada...\n");
        }
    }
}
