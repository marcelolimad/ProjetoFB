
import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {

		String num1 = JOptionPane.showInputDialog("qual seu numero");
		String simbolo = JOptionPane.showInputDialog("qual operador");
		String num2 = JOptionPane.showInputDialog("qual seu numero2");

		double numero = Double.parseDouble(num1); // Integer.parseInt(num1);
		double numero2 = Double.parseDouble(num2);

		if (simbolo.equals("+")) {
			System.out.println("Resultado da soma: " + numero + simbolo + numero2 + " = " + (numero + numero2));
		} else if (simbolo.equals("*")) {
			System.out
					.println("Resultado da Multiplicação: " + numero + simbolo + numero2 + " = " + (numero * numero2));
		} else if (simbolo.equals("-")) {
			System.out.println("Resultado da subtração:" + numero + simbolo + numero2 + " = " + (numero - numero2));
		} else if (simbolo.equals("/")) {
			System.out.println("Resultado da divisão: " + numero + simbolo + numero2 + " = " + (numero / numero2));

		}
	}

}