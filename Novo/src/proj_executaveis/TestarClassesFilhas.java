package proj_executaveis;

import primeiro_classe_pack.Alu;
import primeiro_classe_pack.Diretor;
import primeiro_classe_pack.Pessoa;
import primeiro_classe_pack.Secretario;

public class TestarClassesFilhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Alu aluno = new Alu();
		aluno.setNome("Marcelo");
		aluno.setIdade(21);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("541561654");
		diretor.setNome("Priscila");
		diretor.setIdade(20);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Adm");
		secretario.setNome("Bernardo");
		secretario.setIdade(15);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.maioIdade());
		System.out.println(diretor.maioIdade());
		System.out.println(secretario.maioIdade() + "-" + secretario.msg());
		
		System.out.println("Cor do uniforme aluno é  "  + aluno.cor_uniforme());
		System.out.println("Cor do uniforme Diretor é  " + diretor.cor_uniforme());
		System.out.println("Cor do uniforme Secretario é  " + secretario.cor_uniforme());
	
	
		tela(aluno);
		tela(diretor);
		tela(secretario);
	
	}

	public static void tela (Pessoa pessoa) {
		System.out.println("Obrigado " + pessoa.getNome() + " cor da roupa" + pessoa.cor_uniforme() + "Sua Idade " + pessoa.getIdade() );
		
	}
	
}
