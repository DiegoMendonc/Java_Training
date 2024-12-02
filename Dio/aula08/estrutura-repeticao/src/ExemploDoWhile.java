import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        String linha = "_";
        
        System.out.println(linha.repeat(60));
        System.out.println("\nJoãozinho resolve ligar para o seu coleguinha...");
        System.out.println("O danado vai avisar o coleguinha que se entupiu de doces!\n\n");

        System.out.println(linha.repeat(60));

        System.out.println("\nJoãozinho pega o telefone...\n");

        do {
            System.out.println("Discando...");
        } while (tocando());
        System.out.println("Coleguinha atendeu\nColeguinha ficou bravo com Joãozinho\n");
        System.out.println(linha.repeat(60));
    }
    private static boolean tocando(){
        Boolean atendeu = new Random().nextInt(3) == 1;
        //Negando  o ato de continuar tocando;
        return ! atendeu;
    }
}
