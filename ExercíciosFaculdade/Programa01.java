package ExercíciosFaculdade;
//Salvar como programa01.jav
class Programa01
{
    public static void main (String entrada[])
    {
        //Declaração de variáveis]
        int numint;
        double numreal, soma;
        char caracter;

        //Entrada de dados
        numint = Integer.parseInt((entrada[0]));
        numreal = Double.parseDouble(entrada[1]);
        caracter = (entrada[2]).charAt(0);
        //Processamento

        soma = (double)numint + numreal;
        //Saída de resultados

        System.out.println((double) numint + " + " + numreal + " = " + soma + " sinal " + caracter);

        System.exit(0);
    }
}