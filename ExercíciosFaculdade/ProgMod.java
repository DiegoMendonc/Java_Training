package ExercíciosFaculdade;
import javax.swing.JOptionPane;

class progressiveMode
{
    public static void soma()
    {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        JOptionPane.showMessageDialog(null,"A soma é de: " + (n1 + n2));
    }
    public static void subtracao (int x, int y)
    {
        int s;
        s = x - y;

        JOptionPane.showMessageDialog(null, "A diferença entre " + x + " e " + y + " = " + s);
    }
    public static int produto()
    {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite o segundo número:"));

        return (n1 * n2);
    }
    public static double divisao (int x, int y)
    {
        double d;

        d = (double)x / (double)y;
        return d;
    }
    public static void main (String entrada[])
    {
        int n1, n2, s;
        double r;
        String nome;

        soma();
        s = produto();
        JOptionPane.showMessageDialog(null,"O produto é " + s);
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        JOptionPane.showMessageDialog(null, "Muito obrigado pela colaboração " + nome);
        JOptionPane.showMessageDialog(null, "Vamos finalizar com mais uma operação");

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        r = divisao(n1,  n2);
        JOptionPane.showMessageDialog(null,"A divisão é : " + r);
        System.exit(0);
    }
}