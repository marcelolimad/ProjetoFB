package primeiro_classe_pack;

import java.util.ArrayList;
import java.util.Objects;
import java.util.*;

public class Alu {
	
	/* atributos*/
	public String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatricula;
	
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	/*private Disciplina disciplina = new Disciplina();
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}*/	
	

	public Alu() { /*Cria os dados na memoria*/
		// TODO Auto-generated constructor stub
		
		
	}
	
	public Alu(String nomePadrao ) {
		nome = nomePadrao;	
	
	}
	
	public Alu(String nomePadrao, int idadePadrao ) {
		nome = nomePadrao;
		idade = idadePadrao;
		
		
	}
	
	
	
	

	/* Recebe dados*/
	public void setNome (String nome) {
		this.nome = nome;
		
	}
	
	public String getNome() {
		return nome;
		
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatricula() {
		return serieMatricula;
	}

	public void setSerieMatricula(String serieMatricula) {
		this.serieMatricula = serieMatricula;
	}
	
	/*public double getMediaNota() {
		return ((disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.nota4) /4);
	}*/
	
	public double getMediaNota() {
		double somaNotas = 0.0;
		
		for (Disciplina disciplina: disciplinas) {
			somaNotas += disciplina.getNota(); 
		}
		
	return somaNotas / disciplinas.size();
	}
	
	public boolean getAluAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		}else {
			return false;
		}
	}
		public String getAluAprovado2() {
			double media = this.getMediaNota();
			if (media >= 70) {
				return "Aprovado";
			}else {
				return "Reprovado";
			}
		
	}

	

	
		/*@Override
		public String toString() {
			return "Alu [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
					+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
					+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatricula="
					+ serieMatricula + ", disciplina=" + disciplina + "]";
		}*/
		
		@Override
		public String toString() {
			return "Alu [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
					+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
					+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatricula="
					+ serieMatricula + "]";
		}
		
		
		@Override
		public int hashCode() {
			return Objects.hash(nome, numeroCpf);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Alu other = (Alu) obj;
			return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
		}

		public void RemoverDisciplina (String d ) {
			for (int i=0; i<this.disciplinas.size(); i++) {
	            Disciplina disciplina=this.disciplinas.get(i);
	            if(disciplina.getDisciplina().equals(d)) {
	            	disciplinas.remove(i);
	            }
	            
		
			}
			
		}
		
}
