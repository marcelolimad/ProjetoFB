package proj_executaveis;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import primeiro_classe_pack.Alu;
import primeiro_classe_pack.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
	
	
		double[] notas = {5.6,6.8,8.9,9.4};
		double[] notasLogica = {1.6,3.8,6.9,7.4};
		double[] notas2 = {4.6,1.7,8.7,4.4};
		double[] notasLogica2 = {3.6,7.8,9.9,3.4};
		
		Alu aluno = new Alu();
		aluno.setNome("Mark");
		aluno.setNomeEscola("JAVA");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Html");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		Alu aluno2 = new Alu();
		aluno2.setNome("Marcelo");
		aluno2.setNomeEscola("JAVA");
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Java");
		disciplina3.setNota(notas2);
		
		aluno2.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Html");
		disciplina4.setNota(notasLogica2);
		
		aluno2.getDisciplinas().add(disciplina4);
		
		//------------------------------------------------------
		
		Alu[] arrayAlunos = new Alu[3];
		
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		for (int p = 0; p < arrayAlunos.length; p++) {
			System.out.println("Nome do Aluno " + arrayAlunos[p].getNome());
			
			for(Disciplina d: arrayAlunos[p].getDisciplinas()) {
					System.out.println("Nome da disciplina " + d.getDisciplina());
					
					for( int pnota = 0; pnota < d.getNota().length; pnota ++) {
						System.out.println("A nota número " + pnota + " é igual "+ d.getNota()[pnota]);
						
					}
			
			}
		
		
		}
			
		
		
		
		/*System.out.println("Nome do aluno " + aluno.getNome()+ " Curso "+ aluno.getNomeEscola() );
		System.out.println("-------------Disciplina-----------");
		
		for (Disciplina d: aluno.getDisciplinas() ) {
			System.out.println("Disciplina " + d.getDisciplina() );
			
			  double notaMax = 0;
			  double notaMin = 0;
			for( int p = 0; p < d.getNota().length; p++) {
				System.out.println("Notas "+ p + " é igual =" + d.getNota()[p]);
				/*if(p == 0) {
					notaMin = d.getNota()[p];
				}else {
					if(d.getNota()[p] < notaMin) {
						notaMin = d.getNota()[p];
					}
				}
				if(p == 0) {
					notaMax = d.getNota()[p];
					notaMin = d.getNota()[p];
				}else {
					if(d.getNota()[p] > notaMax) {
						notaMax = d.getNota()[p];
					}if(d.getNota()[p] < notaMin) {
						notaMin = d.getNota()[p];
						
					}
				}
			}
			
			System.out.println("Nota maxima " + notaMax + " " + d.getDisciplina());
			System.out.println("Nota minima " + notaMin + " " + d.getDisciplina());
		}*/
		
		
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
