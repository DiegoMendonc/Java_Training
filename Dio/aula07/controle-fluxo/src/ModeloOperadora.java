import java.util.Scanner;

public class ModeloOperadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linha = "___";

        System.out.println("\nDigite o seu plano para consultar: ");
        System.out.println(linha.repeat(50));
        System.out.println("\nPlano B\nPlano M\nPlano T\n");
        String plano = scanner.next();
        System.out.println(linha.repeat(50));

        switch (plano) {
            case "T":{
                System.out.println("\n- 5GB Youtube");
            }
            case "M":{
                System.out.println("\n- Whatsapp e Instagram grátis");
            }
            case "B": {
                System.out.println("\n- 100 minutos de ligação");
            }
            default:
            System.out.println("\n" + linha.repeat(50));
        }
    }
}
