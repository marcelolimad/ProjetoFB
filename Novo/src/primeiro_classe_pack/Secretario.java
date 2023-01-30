package primeiro_classe_pack;

import interfaces.acesso;

/* Classo filho de Pessoa*/
public class Secretario extends Pessoa implements acesso {

	private String registro;
	private String nivelCargo;
	private String experiencia ;
	
	private String login;
	private String senha;
	
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
 
 
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
@Override
public String cor_uniforme() {
	// TODO Auto-generated method stub
	return "Verde";
}
@Override
public boolean autenticar() {
	// TODO Auto-generated method stub
	return login.equals("admin") && senha.equals("admin");
}
}


