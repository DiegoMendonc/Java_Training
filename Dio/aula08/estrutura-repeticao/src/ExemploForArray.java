public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] =  {"Felipe", "Jonas", "Julia", "Marcos"};
        String linha = "_";

        System.out.println(linha.repeat(60));

        for (int x = 0; x < alunos.length; x++){  //PRIMEIRA USABILIDADE
            System.out.println("O aluno do índice x= " + x + " é: " + alunos[x]);
        }

        System.out.println(linha.repeat(60));
        
        for (String aluno : alunos){ //SEGUNDA USABILIDADE
            System.out.println("Nome do aluno é: " + aluno);
        }
        System.out.println(linha.repeat(60));
        
    }
}
