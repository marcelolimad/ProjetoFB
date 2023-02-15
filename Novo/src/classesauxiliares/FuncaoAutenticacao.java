package classesauxiliares;

import interfaces.Acesso;

/*Só quem tem acesso interface acesso*/
public class FuncaoAutenticacao {
	
	
	private Acesso acesso;
	
	public boolean autenticar() {
		return acesso.autenticar();
	}
	
	public FuncaoAutenticacao (Acesso acesso) {
		this.acesso = acesso;
	}
	
	}


