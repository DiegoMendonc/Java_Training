
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String linha = "_";

        System.out.println(linha.repeat(60));
        System.out.println("Processo seletivo\n");
        //analisarCandidato(1899.0);
        //analisarCandidato(2500.0);
        //analisarCandidato(2000.0);
        selecaoCandidatos();

        System.out.println(linha.repeat(60));
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
