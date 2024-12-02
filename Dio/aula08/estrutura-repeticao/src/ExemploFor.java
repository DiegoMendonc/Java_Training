import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String linha = "-";

        System.out.println(linha.repeat(60));
        System.out.println("\nJoão precisa contar carneirinhos para dormir...\n");
        System.out.println(linha.repeat(60));

        while (true) {
            System.out.println("\n\nVocê deseja iniciar a contagem? [1(SIM)/0(NÃO)] ");
        
            int choice = scanner.nextInt();
    
                if (choice == 1) {
                    System.out.println("Vamos contar os carneirinhos!\n");
                    for (int carneirinhos = 0; carneirinhos <= 20; carneirinhos ++){
                        System.out.println(carneirinhos + " Carneirinho(s)");
                    }
                    
                    System.out.println("\n\nMuito obrigado por contar os carneirinhos!\n");
                    System.out.println(linha.repeat(60));
                }
                else if (choice == 0) {
                    System.out.println("\nMuito obrigado por usar a aplicação!\n");
                    System.out.println(linha.repeat(60));
                    break;
                }
                else {
                    System.out.println("\nNão entendi sua pergunta..\n");
                    System.out.println(linha.repeat(60));
                }
        }
    }
}