package ExercíciosFaculdade;

import javax.swing.JOptionPane;

class AtividadePratica16
{
    public static void soma (int vet[])
    {
        int s = 0;
        for (int i = 0; i < vet.length; i++)
        {
            s = s + vet[i];
        }
        JOptionPane.showMessageDialog(null, "A somatória é de " + s );
    }
    public static int produto (int vet[])
    {
        int p = 1;
        for (int i = 0; i < vet.length; i++)
        {
            p = p * vet[i];
        }
        return p;
    }
    public static void main (String entrada[])
    {
        int s = 0;
        int r;
        int vetor[] = {2, 4, 6, 8, 10};

        soma(vetor);
        r = produto(vetor);
        JOptionPane.showMessageDialog(null, "A produtoria é de: " + r);
        System.exit(0);
    }
}
