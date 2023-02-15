package proj_executaveis;

import java.lang.reflect.Array;
import java.util.stream.DoubleStream;

import primeiro_classe_pack.Alu;
import primeiro_classe_pack.Disciplina;

public class ArrayVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		double[] notas = {1.5,6.8,8.7,3.4};
		double[] notasL = {3.5,7.4,5.7,9.4};
		
		Alu aluno = new Alu();
		aluno.setNome("Marcelo");
		aluno.setNomeEscola("AFA");
		
		
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("CSS");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("HTML");
		disciplina2.setNota(notasL);
		
		aluno.getDisciplinas().add(disciplina2);
		
		
		System.out.println("Nome do Aluno : " + aluno.getNome() + "Curso" + aluno.getNomeEscola());
		
		System.out.println("------------Disciplinas------------");
		for (Disciplina d : aluno.getDisciplinas()) {
			System.out.println("Disciplina "+d.getDisciplina());
			System.out.println(" As notas da disciplina");
			for(int p =0; p < d.getNota().length; p++) {
				System.out.println("Nota " + p + " é igual " + d.getNota()[p]);
			}
		}
		/*double[] notas = new double[5];
		
		notas[0] = 2.9;
		notas[1] = 7.0;
		notas[2] = 4.5;
		notas[3] = 1.0;
		notas[4] = 3.5;
		
	
		
		for (int i = 0; i < 5; i++) {
			
			if(notas[i] < 3.0) {
				double sum1 = DoubleStream.of(i).sum();
				System.out.println(" parte 1: "+notas[i] );
				System.out.println(" soma parte 1: "+ sum1 );


			
			}if(notas[i] > 3.0) {
				double sum2 = DoubleStream.of(i).sum();
				System.out.println(" parte 2: " +notas[i]);
				System.out.println(" soma parte 2: "+ sum2 );

			}else
				
			
		
		System.out.println(" valeu: " );
		
		}*/
	}
	
	
	
	
	}


