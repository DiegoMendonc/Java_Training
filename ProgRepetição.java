import javax.swing.JOptionPane;

class ProgRepetição
{
    public static void main (String entrada[])
    {
        //Declaração de variáveis
        int Tabuada;
        char op=0;
        String msg = " ", msgEntr = "Digite 1 para repetição FOR\nDigite 2 para repetição WHILE\nDigite 3 para repetição DO/WHILE";

        //Entrada de dados
        Tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

        //Processamento

        switch(op)
        {
            case '1':
            {
                msg = msg + "Tabuada do " + Tabuada + " pelo FOR: \n";
                for(int i = 1; i <= 10; i = i + 1)
                {
                    msg = msg + Tabuada + " x " + i + " = " + Tabuada * i + "\n";
                }
                break;
            }
            case '2':
            {
                msg = msg + "Tabuada do " + Tabuada + " pelo WHILE: \n";
                int i = 1;
                while(i <= 10)
                {
                    msg = msg + Tabuada + " x " + i + " = " + Tabuada * i + "\n";
                    i = i + 1;
                }
                break;
            }
            case '3':
            {
                msg = msg + "Tabuada do " + Tabuada + " pelo DO/WHILE: \n";
                int i = 1;
                do
                {
                    msg = msg + Tabuada + " x " + i + " = " + Tabuada * i + "\n";
                    i = i + 1;
                } while (i <= 10);
                break;
            }
        }
        //Saída de resultados
        if (op >= '1' && op <= '3')
        {
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
    }
}
