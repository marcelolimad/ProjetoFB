package primeiro_classe_pack;

import interfaces.Acesso;

/* Classo filho de Pessoa*/
public class Diretor extends Pessoa implements Acesso{
	
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	
	private String login;
	private String senha;
	
	
	public Diretor (String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Diretor() {
		// TODO Auto-generated constructor stub
	}
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	@Override
	public String cor_uniforme() {
		// TODO Auto-generated method stub
		return "Preto";
	}
	
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return login.equals("dir") && senha.equals("dir");
	}
	

}
