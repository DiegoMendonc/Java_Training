package ExercíciosFaculdade;
//Salvar como Programa03.java
import javax.swing.*;

class Programa03
{
	public static void main (String entrada[])
	{
		//Declarando variáveis
		int n1, n2, mod;
		double raiz1, raiz2;
		String msg = "";

		//Entrada de dados
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));

		//Processamento
		mod = n1 % n2;
		raiz1 = Math.sqrt(n1);
		raiz2 = Math.sqrt(n2);
		
		//Saída de resultados
		msg = msg + "Resto da divisão de " + n1 + " por " + n2 + " = " + mod + "\n";
		msg = msg + "Raiz quadrada de " + n1 + " = " + raiz1 + "\n";
		msg = msg + "Raiz quadrada de " + n2 + " = " + raiz2 + "\n";
		JOptionPane.showMessageDialog(null, msg);

		System.exit(0);
	}
}