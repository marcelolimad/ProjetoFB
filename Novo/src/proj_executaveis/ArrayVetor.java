package proj_executaveis;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import primeiro_classe_pack.Alu;
import primeiro_classe_pack.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
	
	
		double[] notas = {5.6,6.8,8.9,9.4};
		double[] notasLogica = {1.6,3.8,6.9,7.4};
		Alu aluno = new Alu();
		
		aluno.setNome("Mark");
		aluno.setNomeEscola("JAVA");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Curso Html");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		/*String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter");
		
		double notas[] = new double[Integer.parseInt(posicoes)];
		
		int continua = 0; 
		
		while ( continua == 0) {
		String palavra = JOptionPane.showInputDialog("Qual e a palavra");
		String[] texto = {palavra};
		
		continua = JOptionPane.showConfirmDialog(null, "Continuar");
		
	for (int str = 0; str < texto.length; str++) {
			str =+ 1;
			System.out.println("texto: "+ palavra +" palavra "+ str);
		}
		}
		
		/*notas[1] = 2.0;
		notas[2] = 1.3;
		notas[3] = 5.9;
		notas[4] = 6.3;
		
		
		for (int i = 0; i < notas.length; i++) {
			String valor = JOptionPane.showInputDialog("Valor da nota");
			notas[i] = Double.valueOf(valor);
			
		
		System.out.println("Notas: "+ notas[i]+" numero "+ i);
		
		
		}*/
		
	

	}

}
