public class ResultadoEscolar {
    public static void main(String[] args) {
        String linha = "-";
        int nota = 8;

        System.out.println(linha.repeat(50) + "\n");

        if (nota >= 7){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }

        System.out.println("\n" + linha.repeat(50));
    }   
}
