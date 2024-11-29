import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma sigla: \n[M]\n[P]\n[G]\n");
        String sigla = scanner.next();

        switch (sigla) {
            case "P":
                
                break;
            default:
                throw new AssertionError();
        }
    }    
}
