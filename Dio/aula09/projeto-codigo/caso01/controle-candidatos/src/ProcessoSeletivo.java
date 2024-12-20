
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String linha = "_";
        String [] candidatos = {"FELIPE", "JOSÉ", "MARCIA", "PAULO", "HELIANA"};

        System.out.println(linha.repeat(60));
        System.out.println("Processo seletivo\n");
        //analisarCandidato(1899.0);
        //analisarCandidato(2500.0);
        //analisarCandidato(2000.0);
        //selecaoCandidatos();
        System.out.println(linha.repeat(60));
        
        //imprimirSelecionados();
        for (String candidato: candidatos) {
            System.out.println("\n");
            entrandoEmContado(candidato);
        }

        System.out.println(linha.repeat(60));
    }

    static void entrandoEmContado (String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }
            else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        }
        while (continuarTentando && tentativasRealizadas < 3);
        
        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA\n");
        }
        else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " , NÚMERO MÁXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADAS\n");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "JOSÉ", "MARCIA", "PAULO", "HELIANA"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento: ");

        //for (int indice = 0; indice < candidatos.length; indice++) {
        //    System.out.println("O candidato de nº" + (indice + 1) + " é " + candidatos[indice]);
        //}

        for (String candidato: candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }

    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "JOSÉ", "MARCIA", "PAULO", "HELIANA", "HELENA", "ROMUALDO", "BRUNO", "MIRELA", "DANIEL", "JONATAN", "DANIELA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O cadidato " + candidato + " solicitou este valor de salário: R$" + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga\n");
                candidatosSelecionados++;
            }
            else {
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga\n");
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDAATOS");
        }
    }
}
