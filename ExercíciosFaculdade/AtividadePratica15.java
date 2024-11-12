package ExercíciosFaculdade;

import javax.swing.JOptionPane;


class AtividadePratica15
{
    public static void main (String entrada[])
    {
        //Declaração de variáveis
        int n1, n2, p = 1;
        char op = 0;
        String msg = "", msgEntr = "Digite 1 para produto\n Digite 2 para produtoria \n";
        String nome = "";
        
        //Entrada de Dados
        nome = JOptionPane.showInputDialog("Olá!\nQual é o seu nome? ");
        JOptionPane.showMessageDialog(null, "Olá, " + nome + " seja bem vindo(a)\n");
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

        //Processamento

        switch(op)
        {
            case '1':
            {
                if (n1 > 0 && n1>0)
                {
                    p = n1 * n2;
                    msg = msg + "Produto de " + n1 + " por " + n2 + " = " + p + " \n\n";
                }
                break;
            }
            case '2':
            {
                for (int i = 1; i <= n2; i = i + 1)
                {
                    p = p * n1;
                }
                msg = msg + "Produtoria de " + n1 + "!\n" + n2 + " vezes é de: " + p + "\n\n";
            }
        }
        //Saída de Dados
        if (op >='1' && op <= '3')
        {
            JOptionPane.showMessageDialog(null,msg);
        }
        System.exit(0);
    }
}