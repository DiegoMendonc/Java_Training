import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        String linha = "-";
        //String nome = args [0];
        //String sobrenome = args [1];
        //int idade = Integer.valueOf(args[2]);
        //double altura = Double.valueOf(args[3]);

        System.out.println("\n\nQual é o seu nome e sobrenome?");
        String nome = scanner.next();

        System.out.println("Qual é a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Qual é sua altura? ");
        double altura = scanner.nextDouble();

        System.out.println("\n\n" + linha.repeat(50) + "\n");

        System.out.println("Olá " + nome);
        System.out.println("Você tem " + idade + " anos");
        System.out.println("E possui uma altura de " + altura+ "cm");
        
    }
}
