public class Operadores {
    public static void main(String[] args) throws Exception {
        //Operadores Aritméticos:
        
        double soma = 1 + 2;
        int subtracao = 2 - 1;
        int multi = 2 * 5;
        int divisao = 10 / 2;
        int modulo = 18 % 3; //Resto da divisão
        double resultado = (10 * 7) + (20 / 4);

        // Para a operação + para valores do tipo String o valor será CONCATENADO;

        String nomeAnimal = "Capivara";
        String tipoAnimal = "Mamífero";

        System.out.println("O tipo do animal " + nomeAnimal + " é " + tipoAnimal + "\n");

        //Operadores unários: aplicado com outro operador aritmético:

        int n1 = +5;
        
        n1 = - n1;
        System.out.println(n1);

        n1 = n1 * -1;
        System.out.println(n1 + "\n");

        //Operadores de Incremento: 
        int numero = 5;
        //x repetição:
        //numero = numero + 2;
        //System.out.println(numero);

        System.out.println(numero ++);
        System.out.println(numero);
        System.out.println(numero ++);
        System.out.println(numero);

        // A lógica de Decremento é a mesma só muda o operador para --:

        int numero2 = 5;
        System.out.println("\n" + numero2 --);
        System.out.println(numero2 + "\n");

        // Negação de valores booleanos:
        boolean verdade = true; //valor estipulado na variavel

        System.out.println(!verdade); //variável em memória (apenas uma inversão na impressão)

        System.out.println(verdade);

        //para inverter de forma permanente:

        verdade = !verdade;
        System.out.println("\n\n" + verdade);
    }
}
