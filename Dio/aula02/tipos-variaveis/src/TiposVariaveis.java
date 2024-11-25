public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //double salarioMinimo = 2500;
        //double atencaoNumero = 2.500; -> não é 2500 e sim 2,5
        
        //Variáveis podem ter sua alteração:

        //Tipos primitivos

        String meuNome = "fulano";
        int numero = 5;
        numero = 10;

        System.out.println("\n" + numero + "\n");

        //Constante não se alteram e sua escrita é em CAIXA ALTA;

        final double VALOR_DE_PI = 3.14;

        //VALOR_DE_PI = 3.10;

        System.out.println(VALOR_DE_PI);

    }
}
