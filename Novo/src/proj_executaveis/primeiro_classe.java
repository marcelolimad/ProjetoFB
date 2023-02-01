package proj_executaveis;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import classesauxiliares.FuncaoAutenticacao;
import interfaces.Acesso;
import primeiro_classe_pack.Alu;
import primeiro_classe_pack.Diretor;
import primeiro_classe_pack.Disciplina;
import primeiro_classe_pack.Secretario;
import primeiro_classe_pack.constantes.StatusAlu;

public class primeiro_classe {
	
	public static void main (String[]args) {
		
		try {
		
		String login = JOptionPane.showInputDialog( "Qual � o Login");
		
		String senha = JOptionPane.showInputDialog( "Qual � a Senha");
		
		String logind = JOptionPane.showInputDialog( "Qual � o Login dir");
		
		String senhad = JOptionPane.showInputDialog( "Qual � a Senha dir ");
		
		
		
		Acesso acesso = new Secretario(login, senha);
		Acesso acessod = new Diretor (logind, senhad);
		
		FuncaoAutenticacao autenticacao = new FuncaoAutenticacao(acesso);
		FuncaoAutenticacao autenticacaod = new FuncaoAutenticacao(acessod);
		
		/*if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin"))*/
		
		if(autenticacao.autenticar() || autenticacaod.autenticar() ){
	
		
		List<Alu> alunos = new ArrayList<Alu>();
		
		HashMap<String, List<Alu>> maps = new HashMap<String, List<Alu>>();
		
		
		/*List<Alu> alunosAprovados = new ArrayList<Alu>();
		List<Alu> alunosReprovado = new ArrayList<Alu>();
		List<Alu> alunosRecuperacao = new ArrayList<Alu>();*/
		
		
		for (int qtd = 1 ; qtd <=3; qtd++) {
 		
		/*objeto ainda n�o existe na memoria*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+" ?");
		/*String idade = JOptionPane.showInputDialog("Qual o idade?");
		String nascimento = JOptionPane.showInputDialog("Qual a sua data de nascimento?");
		String matricula = JOptionPane.showInputDialog("Qual � a sua matricula ?");
		String nota1 = JOptionPane.showInputDialog("Qual � a sua nota1 ?");
		String disciplina1 = JOptionPane.showInputDialog("Qual � a sua disciplina1 ?");
		String nota2 = JOptionPane.showInputDialog("Qual � a sua nota2 ?");
		String disciplina2 = JOptionPane.showInputDialog("Qual � a sua disciplina2 ?");
		String nota3 = JOptionPane.showInputDialog("Qual � a sua nota3 ?");
		String disciplina3 = JOptionPane.showInputDialog("Qual � a sua disciplina3 ?");
		String nota4 = JOptionPane.showInputDialog("Qual � a sua nota4 ?");
		String disciplina4 = JOptionPane.showInputDialog("Qual � a sua disciplina4 ?");*/
		
		Alu alu1;
		
		/*Agora temos objeto real na memoria*/
		Alu alu2 = new Alu();
		alu2.setNome("Marc");  
		
		alu2.setNome(nome);
		/*alu2.setIdade(Integer.valueOf(idade));
		alu2.setDataNascimento(nascimento);
		alu2.setDataMatricula(matricula);
		
		alu2.getDisciplina().setNota1(Double.valueOf(nota1));
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
		System.out.println(alu2.getAluAprovado() ? "valeu" :  " n�o valeu");
		System.out.println(alu2.getAluAprovado2());*/
		
		
		/*Disciplina disciplina11 = new Disciplina();
		disciplina11.setDisciplina(disciplina1);
		disciplina11.setNota(Integer.valueOf(nota1));
		
		alu2.getDisciplinas().add(disciplina11);
		
		Disciplina disciplina22 = new Disciplina();
		disciplina22.setDisciplina(disciplina2);
		disciplina22.setNota(Integer.valueOf(nota2));
		
		alu2.getDisciplinas().add(disciplina22);*/
		
		for (int num = 1; num <= 2; num++) {
			
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
			
			int continuarRemover = 0;
			
			while (continuarRemover == 0) {
			
			String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3, 4 ?");
			alu2.RemoverDisciplina(disciplinaRemover);
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
			/*alu2.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -1);*/
			}
		}
		
		alunos.add(alu2);
	}
		
		maps.put(StatusAlu.APROVADO,new ArrayList<Alu>());
		maps.put(StatusAlu.RECUPERACAO,new ArrayList<Alu>());
		maps.put(StatusAlu.REPROVADO,new ArrayList<Alu>());
		
		for (Alu alu2 : alunos) {
			
			if (alu2.getAluAprovado2().equalsIgnoreCase(StatusAlu.APROVADO)) {
				maps.get(StatusAlu.APROVADO).add(alu2);
				
			}else if (alu2.getAluAprovado2().equalsIgnoreCase(StatusAlu.RECUPERACAO)) {
				maps.get(StatusAlu.RECUPERACAO).add(alu2);
				
			}else  {
				maps.get(StatusAlu.REPROVADO).add(alu2); /*Alunos reprovados*/
			}
		}
		
		System.out.println("-----------------Lista dos Aprovados------------------");
		for (Alu alu2 : maps.get(StatusAlu.APROVADO)) {
			System.out.println("Nome "+ alu2.getNome() + " Resultado = " + alu2.getAluAprovado2() + " com m�dia de " + alu2.getMediaNota());
		}
		
		System.out.println("-----------------Lista dos Recupera��o------------------");
		for (Alu alu2 : maps.get(StatusAlu.RECUPERACAO)) {
			System.out.println("Nome "+ alu2.getNome() + " Resultado = " + alu2.getAluAprovado2() + " com m�dia de " + alu2.getMediaNota());
		}
		
		System.out.println("-----------------Lista dos Reprovados------------------");
		for (Alu alu2 : maps.get(StatusAlu.REPROVADO)) {
			System.out.println("Nome "+ alu2.getNome() + " Resultado = " + alu2.getAluAprovado2() + " com m�dia de " + alu2.getMediaNota());
		}
		
		/*for (int pos = 0; pos < alunos.size(); pos ++) {
			
			Alu alu2 = alunos.get(pos);
		
			if(alu2.getNome().equalsIgnoreCase("Marcelo")) {
				
				Alu trocar = new Alu();
				trocar.setNome("Aluno trocado para: Fulano");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("css");
				disciplina.setNota(70);
				
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(pos, trocar);
				alu2 = alunos.get(pos);
				
			}
			
			System.out.println(pos);
			System.out.println("Aluno = " + alu2.getNome());
			System.out.println("Media do aluno =" + alu2.getMediaNota());
			System.out.println("Resultado = " + alu2.getAluAprovado2());
			System.out.println("--------------------------------------------");
			
			for(int posd = 0; posd < alu2.getDisciplinas().size(); posd ++) {
				
				Disciplina disc = alu2.getDisciplinas().get(posd);
				System.out.println (" Materia " + disc.getDisciplina() + " Nota = " + disc.getNota());
			}
			
			
		}
		
		
		/*for (Alu alu2 : alunos) {
			
			if (alu2.getNome().equalsIgnoreCase("priscila")) {
	          alunos.remove(alu2);
			break;
			}else {
				System.out.println(alu2); 
				System.out.println("Media do aluno =" + alu2.getMediaNota());
				System.out.println("Resultado = " + alu2.getAluAprovado2());
				System.out.println(alu2.getDisciplinas()); 
				System.out.println("--------------------------------------------");
				
			}
			
			}
		
		for (Alu alu2 : alunos) {
			System.out.println("Aluno que sobraram na lista");
			System.out.println(alu2.getNome());
			System.out.println("Suas meterias s�o");
			
			for (Disciplina disciplina : alu2.getDisciplinas()){
				System.out.println(disciplina.getDisciplina());
			}
			}
		
		/*System.out.println(alu2);
		System.out.println(alu2.getDisciplinas());
		System.out.println(alu2); 
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
		
		
		}else {
			
			JOptionPane.showMessageDialog(null, "Acesso negado");		}
	
		} catch (Exception e) {
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace();
			System.out.println("Mensagem" + e.getMessage());
			
			for (int i = 0; i < e.getStackTrace().length; i++) {
				saida.append(" \n Classe erro" + e.getStackTrace()[i].getClassName());
				saida.append ("\n  Metodo erro"+ e.getStackTrace()[i].getMethodName());	
				saida.append ("\n Linha erro"+ e.getStackTrace()[i].getLineNumber());
			}  
			JOptionPane.showMessageDialog(null, "Erro" + saida.toString());
		}
		
		
	}	
}
