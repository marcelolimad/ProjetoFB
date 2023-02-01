package primeiro_classe_pack;

import interfaces.Acesso;

/* Classo filho de Pessoa*/
public class Secretario extends Pessoa implements Acesso {

	private String registro;
	private String nivelCargo;
	private String experiencia ;
	
	private String login;
	private String senha;
	
	
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Secretario() {
		// TODO Auto-generated constructor stub
	}
	 
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	
 @Override
	public boolean maioIdade() {
		// TODO Auto-generated method stub
		return idade <=15;
          
		
 }
	
  public String msg() {
	   return this.maioIdade() ? "Valeu" : "Nao Valeu";
   
  }
 
 

@Override
public String cor_uniforme() {
	// TODO Auto-generated method stub
	return "Verde";
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
	return login.equals("admin") && senha.equals("admin");
}
}


