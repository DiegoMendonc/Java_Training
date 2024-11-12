//Salvar como AtividadePratica14.java
import javax.swing.JOptionPane;

class AtividadePratica14
{
	public static void main (String entrada[])
	{
		//Declarando variáveis
		int n1, n2;
		double quo, pot;
		String msg = "";

		//Entrada de dados
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro"));

		//Processamento
		quo = (int)n1 / (int)n2;
		pot = Math.pow(n1, n2);
		
		//Saída de resultados
		msg = msg + "O quociente de " + n1 + " pelo " + n2 + " = " + (int)quo + "\n";
		msg = msg + "a potência de " + n1 + " pelo " + n2 + " = " + pot + "\n";
		JOptionPane.showMessageDialog(null, msg);

		System.exit(0);
	}
}