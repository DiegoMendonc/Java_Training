import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        try{
        Scanner scanner = new Scanner(System.in);
        String linha = "-";
        //String nome = args [0];
        //String sobrenome = args [1];
        //int idade = Integer.valueOf(args[2]);
        //double altura = Double.valueOf(args[3]);

        System.out.println("\nQual é o seu nome? ");
        String nome = scanner.next();

        System.out.println("\nQual é o seu sobrenome? ");
        String sobrenome = scanner.next();

        System.out.println("\nQual é a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("\nQual é sua altura? ");
        double altura = scanner.nextDouble();

        System.out.println("\n" + linha.repeat(50) + "\n");

        System.out.println("Olá " + nome + " " + sobrenome + "\n");
        System.out.println("Você tem " + idade + " anos\n");
        System.out.println("E possui uma altura de " + altura+ "cm\n");
    }
    catch(InputMismatchException e) {
        System.out.println("\nO campo idade e altura precisam ser numéricos!");
    }
    }
}
