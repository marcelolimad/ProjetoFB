package proj;

import javax.swing.JOptionPane;

public class segundo {

	public static void main (String [] args) {
		
		
		String nota1 = JOptionPane.showInputDialog("Informe nota 1");
		String nota2 = JOptionPane.showInputDialog("Informe nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe nota 4");
		
		double dnota1 = Double.parseDouble(nota1);
		double dnota2 = Double.parseDouble(nota2);
		double dnota3 = Double.parseDouble(nota3);
		double dnota4 = Double.parseDouble(nota4);
		
		
		double media = (dnota1 + dnota2 + dnota3 + dnota4) /4;
		
		JOptionPane.showMessageDialog(null, "A media é: " + media);
		
		if (media >= 50) {
			if (media>= 70) {
				
				JOptionPane.showMessageDialog(null, "Aluno aprovado");
				
			}else {
				JOptionPane.showMessageDialog(null,"Aluno recuperação");
				
			}
			
		}else {
			
			JOptionPane.showMessageDialog(null,"Aluno reprovado"); 
		}
		
		
		
		
		
	}
	
}
