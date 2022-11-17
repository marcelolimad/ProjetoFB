package proj;

import javax.swing.JOptionPane;

import primeiro_classe_pack.Alu;
import primeiro_classe_pack.Disciplina;

public class primeiro_classe {
	
	public static void main (String[]args) {
		
		/*objeto ainda não existe na memoria*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual o idade?");
		String nascimento = JOptionPane.showInputDialog("Qual a sua data de nascimento?");
		String matricula = JOptionPane.showInputDialog("Qual é a sua matricula ?");
		/*String nota1 = JOptionPane.showInputDialog("Qual é a sua nota1 ?");
		String disciplina1 = JOptionPane.showInputDialog("Qual é a sua disciplina1 ?");
		String nota2 = JOptionPane.showInputDialog("Qual é a sua nota2 ?");
		String disciplina2 = JOptionPane.showInputDialog("Qual é a sua disciplina2 ?");
		String nota3 = JOptionPane.showInputDialog("Qual é a sua nota3 ?");
		String disciplina3 = JOptionPane.showInputDialog("Qual é a sua disciplina3 ?");
		String nota4 = JOptionPane.showInputDialog("Qual é a sua nota4 ?");
		String disciplina4 = JOptionPane.showInputDialog("Qual é a sua disciplina4 ?");*/
		
		Alu alu1;
		
		/*Agora temos objeto real na memoria*/
		Alu alu2 = new Alu();
		alu2.nome = "Marc"; 
		
		alu2.setNome(nome);
		alu2.setIdade(Integer.valueOf(idade));
		alu2.setDataNascimento(nascimento);
		alu2.setDataMatricula(matricula);
		
		/*alu2.getDisciplina().setNota1(Double.valueOf(nota1));
		alu2.getDisciplina().setDisciplina1(disciplina1);
		alu2.getDisciplina().setNota2(Double.valueOf(nota2));
		alu2.getDisciplina().setDisciplina2(disciplina2);
		alu2.getDisciplina().setNota3(Double.valueOf(nota3));
		alu2.getDisciplina().setDisciplina3(disciplina3);
		alu2.getDisciplina().setNota4(Double.valueOf(nota4));
		alu2.getDisciplina().setDisciplina4(disciplina4);*/
		
		/*System.out.println(alu2.getNome());
		System.out.println(alu2.getIdade());
		System.out.println(alu2.getDataNascimento());
		System.out.println(alu2.getDataMatricula());
		System.out.println(alu2.getMediaNota());
		System.out.println(alu2.getAluAprovado() ? "valeu" :  " não valeu");
		System.out.println(alu2.getAluAprovado2());*/
		
		
		/*Disciplina disciplina11 = new Disciplina();
		disciplina11.setDisciplina(disciplina1);
		disciplina11.setNota(Integer.valueOf(nota1));
		
		alu2.getDisciplinas().add(disciplina11);
		
		Disciplina disciplina22 = new Disciplina();
		disciplina22.setDisciplina(disciplina2);
		disciplina22.setNota(Integer.valueOf(nota2));
		
		alu2.getDisciplinas().add(disciplina22);*/
		
		for (int num = 1; num <= 4; num++) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina"+num+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina"+num+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
		
			
			alu2.getDisciplinas().add(disciplina);
		
			System.out.print("Disciplina ="+nomeDisciplina+", ");
			System.out.println("Nota ="+notaDisciplina);
		
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Remover alguma disciplina?");
		
		if (escolha == 0) {
			
			String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3, 4 ?");
			alu2.RemoverDisciplina(disciplinaRemover);
			/*alu2.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -1);*/
			 
		}
		
		
		/*System.out.println(alu2);
		System.out.println(alu2.getDisciplinas());*/
		System.out.println("Media do aluno =" + alu2.getMediaNota());
		System.out.println("Resultado = " + alu2.getAluAprovado2());
		System.out.println(alu2.getDisciplinas()); 
		/*System.out.println("1--------------------------------------------");
		
		System.out.println(alu2.toString());
		System.out.println("Media do aluno " + alu2.getMediaNota());
		System.out.println("Resultado " + alu2.getAluAprovado2());
		
		Alu alu6 = new Alu();
		
		System.out.println(alu6.toString());
		
		System.out.println("2--------------------------------------------");
		
		Alu alu3 = new Alu();
		
		alu3.setNome("Fulano");
		alu3.setIdade(10);
		alu3.setDataNascimento("11/01/2011");
		alu3.setDataMatricula("1111111111");
		
		System.out.println(alu3.getNome());
		System.out.println(alu3.getIdade());
		System.out.println(alu3.getDataNascimento());
		System.out.println(alu3.getDataMatricula());
		
		
		Alu alu4 = new Alu("Bernardo"); 
		
		Alu alu5 = new Alu("Bernardo");*/
		
		/*Alu alu6 = new Alu();
		alu6.setNome("Marcelo");
		alu6.setNumeroCpf("123");
		
		Alu alu7 = new Alu();
		alu7.setNome("Marcelo");
		alu7.setNumeroCpf("1234");
		
		
		if (alu6.equals(alu7)){
			System.out.println("iguais");
		}else {
			System.out.println("diferente");
		}*/
		
		
		
	}

}
